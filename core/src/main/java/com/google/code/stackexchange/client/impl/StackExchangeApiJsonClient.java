/**
 *
 */
package com.google.code.stackexchange.client.impl;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

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
import com.google.code.stackexchange.schema.adapter.json.AnswersImpl;
import com.google.code.stackexchange.schema.adapter.json.BadgesImpl;
import com.google.code.stackexchange.schema.adapter.json.CommentsImpl;
import com.google.code.stackexchange.schema.adapter.json.ErrorImpl;
import com.google.code.stackexchange.schema.adapter.json.PostTimelinesImpl;
import com.google.code.stackexchange.schema.adapter.json.QuestionsImpl;
import com.google.code.stackexchange.schema.adapter.json.ReputationsImpl;
import com.google.code.stackexchange.schema.adapter.json.RevisionsImpl;
import com.google.code.stackexchange.schema.adapter.json.StatisticsImpl;
import com.google.code.stackexchange.schema.adapter.json.TagsImpl;
import com.google.code.stackexchange.schema.adapter.json.UserTimelinesImpl;
import com.google.code.stackexchange.schema.adapter.json.UsersImpl;


/**
 * The Class StackExchangeApiJsonClient.
 */
public class StackExchangeApiJsonClient extends BaseStackExchangeApiClient {
	
    /** The parser. */
    private final JSONParser parser = new JSONParser();
    
    /** The Constant ADAPTER_CLASSES_MAP. */
	private static final Map<Class<? extends SchemaEntity>, Class<? extends Adaptable<?, ?>>> ADAPTER_CLASSES_MAP = new HashMap<Class<? extends SchemaEntity>, Class<? extends Adaptable<?, ?>>>();
	
	static {
		ADAPTER_CLASSES_MAP.put(Answers.class, AnswersImpl.class);
		ADAPTER_CLASSES_MAP.put(Badges.class, BadgesImpl.class);
		ADAPTER_CLASSES_MAP.put(Comments.class, CommentsImpl.class);
		ADAPTER_CLASSES_MAP.put(Error.class, ErrorImpl.class);
		ADAPTER_CLASSES_MAP.put(Questions.class, QuestionsImpl.class);
		ADAPTER_CLASSES_MAP.put(PostTimelines.class, PostTimelinesImpl.class);
		ADAPTER_CLASSES_MAP.put(Reputations.class, ReputationsImpl.class);
		ADAPTER_CLASSES_MAP.put(Statistics.class, StatisticsImpl.class);
		ADAPTER_CLASSES_MAP.put(Tags.class, TagsImpl.class);
		ADAPTER_CLASSES_MAP.put(Users.class, UsersImpl.class);
		ADAPTER_CLASSES_MAP.put(UserTimelines.class, UserTimelinesImpl.class);
		ADAPTER_CLASSES_MAP.put(Revisions.class, RevisionsImpl.class);
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
    protected <T> T unmarshallObject(Class<T> clazz, InputStream jsonContent) {
        try {
        	Object response = parser.parse(new InputStreamReader(jsonContent));
        	if (response instanceof JSONObject) {
        		Adaptable<?, JSONObject> adaptable = (Adaptable<?, JSONObject>) ADAPTER_CLASSES_MAP.get(clazz).newInstance();
        		adaptable.adaptFrom((JSONObject) response);
        		return (T) adaptable;
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
