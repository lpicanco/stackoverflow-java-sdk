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

import com.google.code.stackoverflow.schema.BadgeRank;
import com.google.code.stackoverflow.schema.PostType;
import com.google.code.stackoverflow.schema.RevisionType;
import com.google.code.stackoverflow.schema.PostTimelineType;
import com.google.code.stackoverflow.schema.UserTimelineType;
import com.google.code.stackoverflow.schema.UserType;
import com.google.code.stackoverflow.schema.adapter.Converter;

/**
 * The Class BaseJsonAdapter.
 */
public abstract class BaseJsonAdapter implements Serializable {

	/** The descriptors cache. */
	private static Map<Class<?>, PropertyDescriptor[]> descriptorsCache = new HashMap<Class<?>, PropertyDescriptor[]>();
	
	/** The logger. */
    protected final Logger logger = Logger.getLogger(getClass().getCanonicalName());
	
	/** The converters. */
	protected Map<Class<?>, Converter<?, ?>> converters = new HashMap<Class<?>, Converter<? , ?>>();

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 250056223059654638L;
	
	{
		converters.put(Date.class, new Converter<Long, Date>() {
			@Override
			public Date convert(Long source) {
				return (source == null)? null : new Date(source.longValue() * 1000);
			}
		});
		converters.put(BadgeRank.class, new Converter<String, BadgeRank>() {
			@Override
			public BadgeRank convert(String source) {
				return BadgeRank.fromValue(source);
			}
		});
		converters.put(PostType.class, new Converter<String, PostType>() {
			@Override
			public PostType convert(String source) {
				return PostType.fromValue(source);
			}
		});
		converters.put(PostTimelineType.class, new Converter<String, PostTimelineType>() {
			@Override
			public PostTimelineType convert(String source) {
				return PostTimelineType.fromValue(source);
			}
		});
		converters.put(UserTimelineType.class, new Converter<String, UserTimelineType>() {
			@Override
			public UserTimelineType convert(String source) {
				return UserTimelineType.fromValue(source);
			}
		});
		converters.put(UserType.class, new Converter<String, UserType>() {
			@Override
			public UserType convert(String source) {
				return UserType.fromValue(source);
			}
		});
		converters.put(RevisionType.class, new Converter<String, RevisionType>() {
			@Override
			public RevisionType convert(String source) {
				return RevisionType.fromValue(source);
			}
		});
	}

	/**
	 * Copy properties.
	 * 
	 * @param dest the dest
	 * @param src the src
	 */
	@SuppressWarnings("unchecked")
	protected void copyProperties(Object dest, JSONObject src) {
		try {
			for (Map.Entry<String, Object> entry : (Iterable<Map.Entry<String, Object>>) src.entrySet()) {
				PropertyDescriptor descriptor = getPropertyDescriptor(dest, convertToCamelCase(entry.getKey()));
				Object value = entry.getValue();
				if (descriptor != null && descriptor.getWriteMethod() != null) {
					if (includeProperty(descriptor.getName(), value)) {
						if (value != null && converters.containsKey(descriptor.getPropertyType())) {
							value = ((Converter<Object, Object>) converters.get(descriptor.getPropertyType())).convert(value);
							if (value == null) {
								logger.warning("Could not convert property '" + entry.getKey() + "' with value:" + entry.getValue());
							}
						}
						descriptor.getWriteMethod().invoke(dest, value);
					}
				} else {
					logger.warning("Additional property '" + entry.getKey() + "' found in response for object." + dest.getClass());
				}
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error while setting properties.", e);
		}
	}

	/**
	 * Copy properties.
	 * 
	 * @param dest the dest
	 * @param src the src
	 */
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

	/**
	 * Convert to camel case.
	 * 
	 * @param original the original
	 * 
	 * @return the string
	 */
	protected String convertToCamelCase(String original) {
		if (original.startsWith("is_")) {
			original = original.substring(3);			
		}
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

	/**
	 * Convert to underscores.
	 * 
	 * @param original the original
	 * 
	 * @return the string
	 */
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
	/**
	 * Gets the property descriptors.
	 * 
	 * @param beanClass the bean class
	 * 
	 * @return the property descriptors
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
	/**
	 * Gets the property descriptor.
	 * 
	 * @param bean the bean
	 * @param name the name
	 * 
	 * @return the property descriptor
	 * 
	 * @throws IllegalAccessException the illegal access exception
	 * @throws InvocationTargetException the invocation target exception
	 * @throws NoSuchMethodException the no such method exception
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
	
	/**
	 * Include property.
	 * 
	 * @param name the name
	 * @param value the value
	 * 
	 * @return true, if successful
	 */
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
