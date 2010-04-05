/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.BadgeClass;
import com.google.code.stackoverflow.schema.PostType;
import com.google.code.stackoverflow.schema.TimelineType;
import com.google.code.stackoverflow.schema.UserType;
import com.google.code.stackoverflow.schema.adapter.Converter;

/**
 * @author nmukhtar
 * 
 */
public abstract class BaseJsonAdapter implements Serializable {

	/**
	 * 
	 */
	private static Map<Class<?>, PropertyDescriptor[]> descriptorsCache = new HashMap<Class<?>, PropertyDescriptor[]>();
	
	/**
	 * 
	 */
    protected final Logger logger = Logger.getLogger(getClass().getCanonicalName());
	
	/**
	 * 
	 */
	protected Map<Class<?>, Converter<?, ?>> converters = new HashMap<Class<?>, Converter<? , ?>>();

	/**
	 * 
	 */
	private static final long serialVersionUID = 250056223059654638L;
	
	{
		converters.put(Date.class, new Converter<Long, Date>() {
			@Override
			public Date convert(Long source) {
				return (source == null)? null : new Date(source.longValue() * 1000);
			}
		});
		converters.put(BadgeClass.class, new Converter<String, BadgeClass>() {
			@Override
			public BadgeClass convert(String source) {
				return BadgeClass.fromValue(source);
			}
		});
		converters.put(PostType.class, new Converter<String, PostType>() {
			@Override
			public PostType convert(String source) {
				return PostType.fromValue(source);
			}
		});
		converters.put(TimelineType.class, new Converter<String, TimelineType>() {
			@Override
			public TimelineType convert(String source) {
				return TimelineType.fromValue(source);
			}
		});
		converters.put(UserType.class, new Converter<String, UserType>() {
			@Override
			public UserType convert(String source) {
				return UserType.fromValue(source);
			}
		});
	}

	@SuppressWarnings("unchecked")
	protected void copyProperties(Object dest, JSONObject src) {
		try {
			for (Map.Entry<String, Object> entry : (Iterable<Map.Entry<String, Object>>) src.entrySet()) {
				PropertyDescriptor descriptor = getPropertyDescriptor(dest, convertToCamelCase(entry.getKey()));
				Object value = entry.getValue();
				if (descriptor != null && descriptor.getWriteMethod() != null) {
					if (includeProperty(descriptor.getName(), value)) {
						if (converters.containsKey(descriptor.getPropertyType())) {
							value = ((Converter<Object, Object>) converters.get(descriptor.getPropertyType())).convert(value);
						}
						descriptor.getWriteMethod().invoke(dest, value);
					}
				}
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error while setting properties.", e);
		}
	}

	@SuppressWarnings("unchecked")
	protected void copyProperties(JSONObject dest, Object src) {
		try {
			PropertyDescriptor[] descriptors = getPropertyDescriptors(src.getClass());
			for (PropertyDescriptor descriptor : descriptors) {
				if (!descriptor.getName().equals("class") && descriptor.getReadMethod() != null) {
					Object value = descriptor.getReadMethod().invoke(dest);
					if (includeProperty(descriptor.getName(), value)) {
						dest.put(convertToUnderscores(descriptor.getName()), value);
					}
				}
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error while setting properties.", e);
		}
	}

	protected String convertToCamelCase(String original) {
		StringBuilder builder = new StringBuilder();
		boolean upperCase = false;
		for (int i = 0; i < original.length(); i++) {
			if (original.charAt(i) == '_') {
				upperCase = true;
			} else {
				if (upperCase) {
					builder.append(Character.toUpperCase(original.charAt(i)));
					upperCase = false;
				} else {
					builder.append(original.charAt(i));
				}
			}
		}

		return builder.toString();
	}

	protected String convertToUnderscores(String original) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < original.length(); i++) {
			if (Character.isUpperCase(original.charAt(i))) {
				builder.append('_');
				builder.append(Character.toLowerCase(original.charAt(i)));
			} else {
				builder.append(original.charAt(i));
			}
		}

		return builder.toString();
	}

	/*
	 * Stolen liberally from commons-beanutils.
	 */
	public PropertyDescriptor[] getPropertyDescriptors(Class<?> beanClass) {

		if (beanClass == null) {
			throw new IllegalArgumentException("No bean class specified");
		}

		// Look up any cached descriptors for this bean class
		PropertyDescriptor[] descriptors = null;
		descriptors = (PropertyDescriptor[]) descriptorsCache.get(beanClass);
		if (descriptors != null) {
			return (descriptors);
		}

		// Introspect the bean and cache the generated descriptors
		BeanInfo beanInfo = null;
		try {
			beanInfo = Introspector.getBeanInfo(beanClass);
		} catch (IntrospectionException e) {
			return (new PropertyDescriptor[0]);
		}
		descriptors = beanInfo.getPropertyDescriptors();
		if (descriptors == null) {
			descriptors = new PropertyDescriptor[0];
		}

		descriptorsCache.put(beanClass, descriptors);
		return (descriptors);
	}

	/*
	 * Stolen liberally from commons-beanutils.
	 */
	public PropertyDescriptor getPropertyDescriptor(Object bean, String name)
			throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {

		if (bean == null) {
			throw new IllegalArgumentException("No bean specified");
		}
		if (name == null) {
			throw new IllegalArgumentException(
					"No name specified for bean class '" + bean.getClass()
							+ "'");
		}

		// Resolve nested references
		PropertyDescriptor[] descriptors = getPropertyDescriptors(bean
				.getClass());
		if (descriptors != null) {
			for (int i = 0; i < descriptors.length; i++) {
				if (name.equals(descriptors[i].getName())) {
					return (descriptors[i]);
				}
			}
		}

		return null;
	}
	
	protected boolean includeProperty(String name, Object value) {
		if (value != null) {
			return value.getClass().equals(String.class)
					|| value.getClass().isPrimitive()
					|| value.getClass().isEnum()
					|| value.getClass().equals(String.class)
					|| Number.class.isAssignableFrom(value.getClass());
		}
		return true;
	}
}
