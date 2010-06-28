/**
 *
 */
package com.google.code.stackexchange.client.impl;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.google.code.stackexchange.client.exception.StackExchangeApiException;
import com.google.code.stackexchange.client.provider.url.ApiUrlBuilder;
import com.google.code.stackexchange.schema.Answers;
import com.google.code.stackexchange.schema.Badges;
import com.google.code.stackexchange.schema.Comments;
import com.google.code.stackexchange.schema.Error;
import com.google.code.stackexchange.schema.PostTimelines;
import com.google.code.stackexchange.schema.Questions;
import com.google.code.stackexchange.schema.Reputations;
import com.google.code.stackexchange.schema.Revisions;
import com.google.code.stackexchange.schema.SchemaEntity;
import com.google.code.stackexchange.schema.Statistics;
import com.google.code.stackexchange.schema.Tags;
import com.google.code.stackexchange.schema.UserTimelines;
import com.google.code.stackexchange.schema.Users;
import com.google.code.stackexchange.schema.adapter.Adaptable;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


/**
 * The Class StackExchangeApiJsonClient.
 */
public class StackExchangeApiJsonClient extends BaseStackExchangeApiClient {
	
    /** The parser. */
    private final JsonParser parser = new JsonParser();
    
    /** The Constant ADAPTER_CLASSES_MAP. */
	private static final Map<Class<? extends SchemaEntity>, Class<? extends Adaptable<?, JsonObject>>> ADAPTER_CLASSES_MAP = new HashMap<Class<? extends SchemaEntity>, Class<? extends Adaptable<?, JsonObject>>>();
	
	static {
		ADAPTER_CLASSES_MAP.put(Answers.class, Answers.class);
		ADAPTER_CLASSES_MAP.put(Badges.class, Badges.class);
		ADAPTER_CLASSES_MAP.put(Comments.class, Comments.class);
		ADAPTER_CLASSES_MAP.put(Error.class, Error.class);
		ADAPTER_CLASSES_MAP.put(Questions.class, Questions.class);
		ADAPTER_CLASSES_MAP.put(PostTimelines.class, PostTimelines.class);
		ADAPTER_CLASSES_MAP.put(Reputations.class, Reputations.class);
		ADAPTER_CLASSES_MAP.put(Statistics.class, Statistics.class);
		ADAPTER_CLASSES_MAP.put(Tags.class, Tags.class);
		ADAPTER_CLASSES_MAP.put(Users.class, Users.class);
		ADAPTER_CLASSES_MAP.put(UserTimelines.class, UserTimelines.class);
		ADAPTER_CLASSES_MAP.put(Revisions.class, Revisions.class);
	}
	

    /**
     * Instantiates a new stack exchange api json client.
     * 
     * @param applicationKey the application key
     */
    public StackExchangeApiJsonClient(String applicationKey) {
        super(applicationKey);
    }

    /**
     * Instantiates a new stack exchange api json client.
     * 
     * @param applicationKey the application key
     * @param apiVersion the api version
     */
    public StackExchangeApiJsonClient(String applicationKey, String apiVersion) {
        super(applicationKey, apiVersion);
    }
    
    /* (non-Javadoc)
     * @see com.google.code.stackexchange.client.impl.StackOverflowApiGateway#unmarshallObject(java.lang.Class, java.io.InputStream)
     */
    @SuppressWarnings("unchecked")
    protected <T> T unmarshallObject(Class<?> clazz, InputStream jsonContent) {
        try {
        	JsonElement response = parser.parse(new InputStreamReader(jsonContent));
        	if (response.isJsonObject()) {
        		Adaptable<?, JsonObject> adaptable = ADAPTER_CLASSES_MAP.get(clazz).newInstance();
        		return (T) adaptable.adaptFrom(response.getAsJsonObject());
        	}
        	throw new StackExchangeApiException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new StackExchangeApiException(e);
        }
    }

    /* (non-Javadoc)
     * @see com.google.code.stackexchange.client.impl.StackOverflowApiGateway#marshallObject(java.lang.Object)
     */
    protected String marshallObject(Object element) {
        try {
            StringWriter writer = new StringWriter();

            return writer.toString();
        } catch (Exception e) {
            throw new StackExchangeApiException(e);
        }
    }

    /* (non-Javadoc)
     * @see com.google.code.stackexchange.client.impl.BaseStackOverflowApiClient#createStackOverflowApiUrlBuilder(java.lang.String)
     */
    protected ApiUrlBuilder createStackOverflowApiUrlBuilder(String methodName) {
        return getApiProvider().createApiUrlBuilder(methodName, getApplicationKey(), getApiVersion());
    }
}
