/**
 *
 */
package com.google.code.stackoverflow.client.constant;

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
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.SortEnum;
import com.google.code.stackoverflow.schema.ValueEnum;

/**
 * The Class StackOverflowApiUrls.
 */
public final class StackOverflowApiUrls {

    /** The Constant API_URLS_FILE. */
    public static final String API_URLS_FILE = "StackOverflowApiUrls.properties";

    /** The static logger. */
    private static final Logger LOG = Logger.getLogger(StackOverflowApiUrls.class.getCanonicalName());
    
    /** The Constant stackOverflowApiUrls. */
    private static final Properties stackOverflowApiUrls = new Properties();

    static {
        try {
            stackOverflowApiUrls.load(StackOverflowApiUrls.class.getResourceAsStream(API_URLS_FILE));
        } catch (IOException e) {
        	LOG.log(Level.SEVERE, "An error occurred while loading urls.", e);
        }
    }

    public static final String GET_QUESTIONS =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getQuestions");
    public static final String GET_QUESTIONS_SORTED =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getQuestionsSorted");
    public static final String GET_UN_ANSWERED_QUESTIONS =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getUnAnsweredQuestions");
    public static final String GET_UN_ANSWERED_QUESTIONS_SORTED =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getUnAnsweredQuestionsSorted");
    public static final String GET_QUESTIONS_BY_USER =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getQuestionsByUser");
    public static final String GET_QUESTIONS_BY_USER_SORTED =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getQuestionsByUserSorted");
    public static final String GET_FAVORITE_QUESTIONS =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getFavoriteQuestions");
    public static final String GET_FAVORITE_QUESTIONS_SORTED =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getFavoriteQuestionsSorted");
    public static final String GET_QUESTION =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getQuestion");
    public static final String GET_QUESTION_TIMELINE =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getQuestionTimeline");
    public static final String GET_TAGGED_QUESTIONS =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getTaggedQuestions");
    public static final String GET_USERS =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getUsers");
    public static final String GET_USERS_SORTED =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getUsersSorted");
    public static final String GET_USER_TIMELINE =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getUserTimeline");
    public static final String GET_USER_MENTIONS =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getUserMentions");
    public static final String GET_USER_REPUTATIONS =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getUserReputations");
    public static final String GET_USER =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getUser");
    public static final String GET_BADGES =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getBadges");
    public static final String GET_BADGES_SORTED =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getBadgesSorted");
    public static final String GET_BADGES_FOR_USER =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getBadgesForUser");
    public static final String GET_TAGS =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getTags");
    public static final String GET_TAGS_SORTED =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getTagsSorted");
    public static final String GET_TAGS_FOR_USER =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getTagsForUser");
    public static final String GET_ANSWERS_BY_USER =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getAnswersByUser");
    public static final String GET_ANSWERS_BY_USER_SORTED =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getAnswersByUserSorted");
    public static final String GET_ANSWER =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getAnswer");
    public static final String GET_STATISTICS =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getStatistics");
    public static final String GET_COMMENTS_BY_USER =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getCommentsByUser");
    public static final String GET_COMMENTS_BY_USER_SORTED =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getCommentsByUserSorted");
    public static final String GET_COMMENTS_BY_USER_TO_USER =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getCommentsByUserToUser");
    public static final String GET_COMMENTS_BY_USER_TO_USER_SORTED =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getCommentsByUserToUserSorted");
    public static final String GET_COMMENT =
        stackOverflowApiUrls.getProperty("com.google.code.stackoverflow.client.getComment");
    
    /**
     * Instantiates a new stackoverflow in api urls.
     */
    private StackOverflowApiUrls() {}

    /**
     * The Class StackOverflowApiUrlBuilder.
     */
    public static class StackOverflowApiUrlBuilder {
        
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
    	
    	/**
	     * Instantiates a new stack overflow api url builder.
	     * 
	     * @param urlFormat the url format
	     * @param urlType the url type
	     */
	    public StackOverflowApiUrlBuilder(String urlFormat, String applicationId) {
    		this.urlFormat = urlFormat;
    		parametersMap.put("key", applicationId);
    		fieldsMap.put("version", DEFAULT_VERSION);
    	}
    	
    	/**
	     * Instantiates a new stack overflow api url builder.
	     * 
	     * @param urlFormat the url format
	     */
	    public StackOverflowApiUrlBuilder(String urlFormat, String applicationId, String apiVersion) {
    		this.urlFormat = urlFormat;    		
    		parametersMap.put("key", applicationId);
    		fieldsMap.put("version", apiVersion);
    	}
    	
    	/**
	     * With parameter.
	     * 
	     * @param name the name
	     * @param value the value
	     * 
	     * @return the stack overflow api url builder
	     */
	    public StackOverflowApiUrlBuilder withParameter(String name, String value) {
	    	if (value != null && value.length() > 0) {
	    		parametersMap.put(name, encodeUrl(value));
	    	}
    		
    		return this;
    	}
    	
    	/**
	     * With parameters.
	     * 
	     * @param name the name
	     * @param values the values
	     * 
	     * @return the stack overflow api url builder
	     */
	    public StackOverflowApiUrlBuilder withParameters(String name, Collection<String> values) {
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
	     * @param name the name
	     * @param value the value
	     * 
	     * @return the stack overflow api url builder
	     */
	    public StackOverflowApiUrlBuilder withParameterEnum(String name, ValueEnum value) {
	    	withParameter(name, value.value());
    		
    		return this;
    	}
    	
    	/**
	     * With parameter enum.
	     * 
	     * @param name the name
	     * @param value the value
	     * 
	     * @return the stack overflow api url builder
	     */
	    public StackOverflowApiUrlBuilder withPaging(Paging paging) {
	    	if (paging != null) {
		    	withParameter("page", String.valueOf(paging.getPageNumber()));
		    	withParameter("pagesize", String.valueOf(paging.getPageSize()));
	    	}
    		
    		return this;
    	}
	    
    	/**
	     * With parameter enum.
	     * 
	     * @param name the name
	     * @param value the value
	     * 
	     * @return the stack overflow api url builder
	     */
	    public StackOverflowApiUrlBuilder withTimePeriod(TimePeriod timePeriod) {
	    	if (timePeriod != null) {
		    	if (timePeriod.getStartDate() != null) {
			    	withParameter("fromdate", String.valueOf(timePeriod.getStartDate().getTime() / 1000));
		    	}
		    	if (timePeriod.getEndDate() != null) {
			    	withParameter("todate", String.valueOf(timePeriod.getEndDate().getTime() / 1000));
		    	}
	    	}
    		
    		return this;
    	}
	    
    	/**
	     * With parameter enum.
	     * 
	     * @param name the name
	     * @param value the value
	     * 
	     * @return the stack overflow api url builder
	     */
	    public StackOverflowApiUrlBuilder withSort(SortEnum sort) {
	    	if (sort != null) {
		    	withParameter("sort", sort.value());
		    	if (sort.order() != null) {
			    	withParameter("order", sort.order().value());
		    	}
	    	}
    		
    		return this;
    	}
	    
	    public StackOverflowApiUrlBuilder withFetchOptions(Set<FilterOption> fetchOptions) {
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
	     * @param enumMap the enum map
	     * 
	     * @return the stack overflow api url builder
	     */
	    public StackOverflowApiUrlBuilder withParameterEnumMap(Map<? extends ValueEnum, String> enumMap) {
	    	for (ValueEnum parameter : enumMap.keySet()) {
	    		withParameter(parameter.value(), enumMap.get(parameter));
	    	}
    		
    		return this;
    	}
	    
    	/**
	     * With empty field.
	     * 
	     * @param name the name
	     * 
	     * @return the stack overflow api url builder
	     */
	    public StackOverflowApiUrlBuilder withEmptyField(String name) {
    		fieldsMap.put(name, "");
    		
    		return this;
    	}
	    
    	/**
	     * With field.
	     * 
	     * @param name the name
	     * @param value the value
	     * 
	     * @return the stack overflow api url builder
	     */
	    public StackOverflowApiUrlBuilder withField(String name, String value) {
	    	withField(name, value, false);
    		
    		return this;
    	}
	    
    	/**
	     * With field.
	     * 
	     * @param name the name
	     * @param value the value
	     * 
	     * @return the stack overflow api url builder
	     */
	    public StackOverflowApiUrlBuilder withField(String name, String value, boolean escape) {
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
	     * @param name the name
	     * @param value the value
	     * 
	     * @return the stack overflow api url builder
	     */
	    public StackOverflowApiUrlBuilder withFieldEnum(String name, ValueEnum value) {
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
	     * @param name the name
	     * @param enumSet the enum set
	     * 
	     * @return the stack overflow api url builder
	     */
	    public StackOverflowApiUrlBuilder withFieldEnumSet(String name, Set<? extends ValueEnum> enumSet) {
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
        		} else if (placeHolderFlag && urlFormat.charAt(i) == API_URLS_PLACEHOLDER_END) {
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
//        				urlBuilder.append(API_URLS_PLACEHOLDER_START);
//        				urlBuilder.append(placeHolder);
//        				urlBuilder.append(API_URLS_PLACEHOLDER_END);
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
         * @param original the original
         * @param encoding the encoding
         * 
         * @return the string
         */
        private static String encodeUrl(String original) {
        	try {
    			return URLEncoder.encode(original, ApplicationConstants.CONTENT_ENCODING);
    		} catch (UnsupportedEncodingException e) {
    			// should never be here..
    			return original;
    		}
        }
    }
}
