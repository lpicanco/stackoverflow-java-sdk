package com.google.code.stackexchange.client.query.impl;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.code.stackexchange.client.AsyncResponseHandler;
import com.google.code.stackexchange.client.exception.StackExchangeApiException;
import com.google.code.stackexchange.client.impl.StackExchangeApiGateway;
import com.google.code.stackexchange.client.provider.url.ApiUrlBuilder;
import com.google.code.stackexchange.client.query.StackExchangeApiQuery;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Error;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * The Class BaseStackOverflowApiQuery.
 */
public abstract class BaseStackOverflowApiQuery<T> extends StackExchangeApiGateway implements StackExchangeApiQuery<T> {
	
	/** The api url builder. */
	protected ApiUrlBuilder apiUrlBuilder;
    
    /** The parser. */
    private final JsonParser parser = new JsonParser();
    
    /** The handlers. */
    private List<AsyncResponseHandler<PagedList<T>>> handlers = new ArrayList<AsyncResponseHandler<PagedList<T>>>();
	
	/**
	 * Instantiates a new base stack overflow api query.
	 * 
	 * @param applicationId the application id
	 */
	public BaseStackOverflowApiQuery(String applicationId) {
		super.setApplicationKey(applicationId);
        requestHeaders = new HashMap<String, String>();

        // by default we compress contents
        requestHeaders.put("Accept-Encoding", "gzip, deflate");
        this.reset();
	}

	/**
	 * Instantiates a new base stack overflow api query.
	 * 
	 * @param applicationId the application id
	 * @param apiVersion the api version
	 */
	public BaseStackOverflowApiQuery(String applicationId, String apiVersion) {
		this(applicationId);
		super.setApiVersion(apiVersion);
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackOverflowApiQuery#list()
	 */
	@Override
	public PagedList<T> list() {
		InputStream jsonContent = null;
        try {
        	jsonContent = callApiMethod(apiUrlBuilder.buildUrl());
        	JsonElement response = parser.parse(new InputStreamReader(jsonContent));
        	if (response.isJsonObject()) {
        		PagedList<T> responseList = unmarshall(response.getAsJsonObject());
        		notifyObservers(responseList);
				return responseList;
        	}
        	throw new StackExchangeApiException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new StackExchangeApiException(e);
        } finally {
	        closeStream(jsonContent);
	    }
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackOverflowApiQuery#singleResult()
	 */
	@Override
	public T singleResult() {
		InputStream jsonContent = null;
        try {
        	jsonContent = callApiMethod(apiUrlBuilder.buildUrl());
        	JsonElement response = parser.parse(new InputStreamReader(jsonContent));
        	if (response.isJsonObject()) {
        		PagedList<T> responseList = unmarshall(response.getAsJsonObject());
        		notifyObservers(responseList);
				return getFirstElement(responseList);
        	}
        	throw new StackExchangeApiException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new StackExchangeApiException(e);
        } finally {
	        closeStream(jsonContent);
	    }
	}
	
	/**
	 * Notify observers.
	 * 
	 * @param response the response
	 */
	protected void notifyObservers(PagedList<T> response) {
		for(AsyncResponseHandler<PagedList<T>> handler : handlers) {
			handler.handleResponse(response);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackExchangeApiQuery#addResonseHandler(com.google.code.stackexchange.client.AsyncResponseHandler)
	 */
	public void addResonseHandler(AsyncResponseHandler<PagedList<T>> handler) {
		handlers.add(handler);
	}
	
	
    /* (non-Javadoc)
     * @see com.google.code.stackexchange.client.impl.StackOverflowApiGateway#unmarshallObject(java.lang.Class, java.io.InputStream)
     */
    @SuppressWarnings("unchecked")
	protected <A> A unmarshallObject(Class<A> clazz, InputStream jsonContent) {
    	if (clazz.equals(Error.class)) {
            try {
            	JsonElement response = parser.parse(new InputStreamReader(jsonContent));
            	if (response.isJsonObject()) {
            		return (A) new Gson().fromJson(response, Error.class);
            	}
            } catch (Exception e) {
                throw new StackExchangeApiException(e);
            }
    	}
    	return null;
    }

    /* (non-Javadoc)
     * @see com.google.code.stackexchange.client.impl.StackOverflowApiGateway#marshallObject(java.lang.Object)
     */
    protected String marshallObject(Object element) {
    	return null;
    }
	
	/**
	 * Unmarshall.
	 * 
	 * @param json the json
	 * 
	 * @return the paged list< t>
	 */
	protected abstract PagedList<T> unmarshall(JsonObject json);
	
	/**
	 * Gets the first element.
	 * 
	 * @param list the list
	 * 
	 * @return the first element
	 */
	private T getFirstElement(List<T> list) {
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
}
