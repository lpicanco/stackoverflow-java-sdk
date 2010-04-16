package com.google.code.stackoverflow.client.provider.url;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.code.stackoverflow.client.StackOverflowApiClient.Paging;
import com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod;
import com.google.code.stackoverflow.client.constant.ApplicationConstants;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.SortEnum;
import com.google.code.stackoverflow.schema.ValueEnum;

/**
 * The Class StackOverflowApiUrlBuilder.
 */
public class BaseApiUrlBuilder implements ApiUrlBuilder {

	/** The Constant API_URLS_FILE. */
	public static final String API_URLS_FILE = "StackOverflowApiUrls.properties";
	
    /** The static logger. */
    private static final Logger logger = Logger.getLogger(BaseApiUrlBuilder.class.getCanonicalName());
	
	/** The Constant API_URLS_PLACEHOLDER_START. */
	private static final char API_URLS_PLACEHOLDER_START = '{';

	/** The Constant API_URLS_PLACEHOLDER_END. */
	private static final char API_URLS_PLACEHOLDER_END = '}';

	/** The Constant API_URLS_PLACEHOLDER_END. */
	private static final String DEFAULT_VERSION = ApplicationConstants.DEFAULT_API_VERSION;

	/** The url format. */
	private String urlFormat;

	/** The parameters map. */
	private Map<String, String> parametersMap = new HashMap<String, String>();

	/** The fields map. */
	private Map<String, String> fieldsMap = new HashMap<String, String>();
	
    /** The Constant stackOverflowApiUrls. */
    private static final Properties stackOverflowApiUrls = new Properties();

    static {
        try {
            stackOverflowApiUrls.load(BaseApiUrlBuilder.class.getResourceAsStream(API_URLS_FILE));
        } catch (IOException e) {
        	logger.log(Level.SEVERE, "An error occurred while loading urls.", e);
        }
    }

	/**
	 * Instantiates a new stack overflow api url builder.
	 * 
	 * @param urlFormat
	 *            the url format
	 * @param urlType
	 *            the url type
	 */
	public BaseApiUrlBuilder(String methodName, String applicationId, String providerHost) {
		if (stackOverflowApiUrls.containsKey(methodName)) {
			this.urlFormat = stackOverflowApiUrls.getProperty(methodName);
			parametersMap.put("key", applicationId);
			fieldsMap.put("host", providerHost);
			fieldsMap.put("version", DEFAULT_VERSION);
		} else {
			throw new UnsupportedOperationException("Method '" + methodName + "' not supported.");
		}
	}

	/**
	 * Instantiates a new stack overflow api url builder.
	 * 
	 * @param urlFormat
	 *            the url format
	 */
	public BaseApiUrlBuilder(String methodName, String applicationId, String providerHost,
			String apiVersion) {
		if (stackOverflowApiUrls.containsKey(methodName)) {
			this.urlFormat = stackOverflowApiUrls.getProperty(methodName);
			parametersMap.put("key", applicationId);
			fieldsMap.put("host", providerHost);
			fieldsMap.put("version", apiVersion);
		} else {
			throw new UnsupportedOperationException("Method '" + methodName + "' not supported.");
		}
	}

	/**
	 * With parameter.
	 * 
	 * @param name
	 *            the name
	 * @param value
	 *            the value
	 * 
	 * @return the stack overflow api url builder
	 */
	public ApiUrlBuilder withParameter(String name, String value) {
		if (value != null && value.length() > 0) {
			parametersMap.put(name, encodeUrl(value));
		}

		return this;
	}

	/**
	 * With parameters.
	 * 
	 * @param name
	 *            the name
	 * @param values
	 *            the values
	 * 
	 * @return the stack overflow api url builder
	 */
	public ApiUrlBuilder withParameters(String name,
			Collection<String> values) {
		StringBuilder builder = new StringBuilder();
		for (Iterator<String> iterator = values.iterator(); iterator.hasNext();) {
			builder.append(iterator.next());
			if (iterator.hasNext()) {
				builder.append(" ");
			}
		}
		parametersMap.put(name, encodeUrl(builder.toString()));

		return this;
	}

	/**
	 * With parameter enum.
	 * 
	 * @param name
	 *            the name
	 * @param value
	 *            the value
	 * 
	 * @return the stack overflow api url builder
	 */
	public ApiUrlBuilder withParameterEnum(String name,
			ValueEnum value) {
		withParameter(name, value.value());

		return this;
	}

	/**
	 * With parameter enum.
	 * 
	 * @param name
	 *            the name
	 * @param value
	 *            the value
	 * 
	 * @return the stack overflow api url builder
	 */
	public ApiUrlBuilder withPaging(Paging paging) {
		if (paging != null) {
			if (paging.getPageNumber() > 0) {
				withParameter("page", String.valueOf(paging.getPageNumber()));
			}
			if (paging.getPageSize() > 0) {
				withParameter("pagesize", String.valueOf(paging.getPageSize()));
			}
		}

		return this;
	}

	/**
	 * With parameter enum.
	 * 
	 * @param name
	 *            the name
	 * @param value
	 *            the value
	 * 
	 * @return the stack overflow api url builder
	 */
	public ApiUrlBuilder withTimePeriod(TimePeriod timePeriod) {
		if (timePeriod != null) {
			if (timePeriod.getStartDate() != null) {
				withParameter("fromdate", String.valueOf(timePeriod
						.getStartDate().getTime() / 1000));
			}
			if (timePeriod.getEndDate() != null) {
				withParameter("todate", String.valueOf(timePeriod.getEndDate()
						.getTime() / 1000));
			}
		}

		return this;
	}

	/**
	 * With parameter enum.
	 * 
	 * @param name
	 *            the name
	 * @param value
	 *            the value
	 * 
	 * @return the stack overflow api url builder
	 */
	public ApiUrlBuilder withSort(SortEnum sort) {
		if (sort != null) {
			withParameter("sort", sort.value());
			if (sort.order() != null) {
				withParameter("order", sort.order().value());
			}
		}

		return this;
	}

	public ApiUrlBuilder withFetchOptions(
			Set<FilterOption> fetchOptions) {
		if (fetchOptions != null) {
			for (FilterOption option : fetchOptions) {
				withParameter(option.value(), option.defaultValue());
			}
		}

		return this;
	}

	/**
	 * With parameter enum map.
	 * 
	 * @param enumMap
	 *            the enum map
	 * 
	 * @return the stack overflow api url builder
	 */
	public ApiUrlBuilder withParameterEnumMap(
			Map<? extends ValueEnum, String> enumMap) {
		for (ValueEnum parameter : enumMap.keySet()) {
			withParameter(parameter.value(), enumMap.get(parameter));
		}

		return this;
	}

	/**
	 * With empty field.
	 * 
	 * @param name
	 *            the name
	 * 
	 * @return the stack overflow api url builder
	 */
	public ApiUrlBuilder withEmptyField(String name) {
		fieldsMap.put(name, "");

		return this;
	}

	/**
	 * With field.
	 * 
	 * @param name
	 *            the name
	 * @param value
	 *            the value
	 * 
	 * @return the stack overflow api url builder
	 */
	public ApiUrlBuilder withField(String name, String value) {
		withField(name, value, false);

		return this;
	}

	/**
	 * With field.
	 * 
	 * @param name
	 *            the name
	 * @param value
	 *            the value
	 * 
	 * @return the stack overflow api url builder
	 */
	public ApiUrlBuilder withField(String name, String value,
			boolean escape) {
		if (escape) {
			fieldsMap.put(name, encodeUrl(value));
		} else {
			fieldsMap.put(name, value);
		}

		return this;
	}

	/**
	 * With field enum.
	 * 
	 * @param name
	 *            the name
	 * @param value
	 *            the value
	 * 
	 * @return the stack overflow api url builder
	 */
	public ApiUrlBuilder withFieldEnum(String name, ValueEnum value) {
		if (value.value() == null || value.value().length() == 0) {
			fieldsMap.put(name, "");
		} else {
			fieldsMap.put(name, value.value());
		}

		return this;
	}

	/**
	 * With field enum set.
	 * 
	 * @param name
	 *            the name
	 * @param enumSet
	 *            the enum set
	 * 
	 * @return the stack overflow api url builder
	 */
	public ApiUrlBuilder withFieldEnumSet(String name,
			Set<? extends ValueEnum> enumSet) {
		StringBuilder builder = new StringBuilder();
		if (!enumSet.isEmpty()) {
			builder.append(":");
			Iterator<? extends ValueEnum> iter = enumSet.iterator();
			builder.append("(");
			while (iter.hasNext()) {
				ValueEnum fieldEnum = iter.next();
				builder.append(fieldEnum.value());
				if (iter.hasNext()) {
					builder.append(",");
				}
			}
			builder.append(")");
		}

		fieldsMap.put(name, builder.toString());

		return this;
	}

	/**
	 * Builds the url.
	 * 
	 * @return the string
	 */
	public String buildUrl() {
		StringBuilder urlBuilder = new StringBuilder();
		StringBuilder placeHolderBuilder = new StringBuilder();
		boolean placeHolderFlag = false;
		boolean firstParameter = true;
		for (int i = 0; i < urlFormat.length(); i++) {
			if (urlFormat.charAt(i) == API_URLS_PLACEHOLDER_START) {
				placeHolderBuilder = new StringBuilder();
				placeHolderFlag = true;
			} else if (placeHolderFlag
					&& urlFormat.charAt(i) == API_URLS_PLACEHOLDER_END) {
				String placeHolder = placeHolderBuilder.toString();
				if (fieldsMap.containsKey(placeHolder)) {
					urlBuilder.append(fieldsMap.get(placeHolder));
				} else if (parametersMap.containsKey(placeHolder)) {
					StringBuilder builder = new StringBuilder();
					if (firstParameter) {
						firstParameter = false;
					} else {
						builder.append("&");
					}
					builder.append(placeHolder);
					builder.append("=");
					builder.append(parametersMap.get(placeHolder));
					urlBuilder.append(builder.toString());
				} else {
					// we did not find a binding for the placeholder.
					// skip it.
					// urlBuilder.append(API_URLS_PLACEHOLDER_START);
					// urlBuilder.append(placeHolder);
					// urlBuilder.append(API_URLS_PLACEHOLDER_END);
				}
				placeHolderFlag = false;
			} else if (placeHolderFlag) {
				placeHolderBuilder.append(urlFormat.charAt(i));
			} else {
				urlBuilder.append(urlFormat.charAt(i));
			}
		}

		return urlBuilder.toString();
	}

	/**
	 * Encode url.
	 * 
	 * @param original
	 *            the original
	 * @param encoding
	 *            the encoding
	 * 
	 * @return the string
	 */
	private static String encodeUrl(String original) {
		try {
			return URLEncoder.encode(original,
					ApplicationConstants.CONTENT_ENCODING);
		} catch (UnsupportedEncodingException e) {
			// should never be here..
			return original;
		}
	}
}