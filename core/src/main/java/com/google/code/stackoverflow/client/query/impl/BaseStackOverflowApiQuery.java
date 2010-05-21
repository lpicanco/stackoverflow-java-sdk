package com.google.code.stackoverflow.client.query.impl;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.code.stackoverflow.client.common.PagedList;
import com.google.code.stackoverflow.client.exception.StackOverflowApiClientException;
import com.google.code.stackoverflow.client.impl.StackOverflowApiGateway;
import com.google.code.stackoverflow.client.provider.url.ApiUrlBuilder;
import com.google.code.stackoverflow.client.query.StackOverflowApiQuery;
import com.google.code.stackoverflow.schema.adapter.json.ErrorImpl;

/**
 * The Class BaseStackOverflowApiQuery.
 */
public abstract class BaseStackOverflowApiQuery<T> extends StackOverflowApiGateway implements StackOverflowApiQuery<T> {
	
	/** The api url builder. */
	protected ApiUrlBuilder apiUrlBuilder;
    
    /** The parser. */
    private final JSONParser parser = new JSONParser();
	
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
	 * @see com.google.code.stackoverflow.client.query.StackOverflowApiQuery#list()
	 */
	@Override
	public PagedList<T> list() {
		InputStream jsonContent = null;
        try {
        	jsonContent = callApiMethod(apiUrlBuilder.buildUrl());
        	Object response = parser.parse(new InputStreamReader(jsonContent));
        	if (response instanceof JSONObject) {
        		return unmarshall((JSONObject) response);
        	}
        	throw new StackOverflowApiClientException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new StackOverflowApiClientException(e);
        } finally {
	        closeStream(jsonContent);
	    }
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.StackOverflowApiQuery#singleResult()
	 */
	@Override
	public T singleResult() {
		InputStream jsonContent = null;
        try {
        	jsonContent = callApiMethod(apiUrlBuilder.buildUrl());
        	Object response = parser.parse(new InputStreamReader(jsonContent));
        	if (response instanceof JSONObject) {
        		return getFirstElement(unmarshall((JSONObject) response));
        	}
        	throw new StackOverflowApiClientException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new StackOverflowApiClientException(e);
        } finally {
	        closeStream(jsonContent);
	    }
	}
	
    /* (non-Javadoc)
     * @see com.google.code.stackoverflow.client.impl.StackOverflowApiGateway#unmarshallObject(java.lang.Class, java.io.InputStream)
     */
    @SuppressWarnings("unchecked")
	protected <A> A unmarshallObject(Class<A> clazz, InputStream jsonContent) {
    	if (clazz.equals(Error.class)) {
            try {
            	Object response = parser.parse(new InputStreamReader(jsonContent));
            	if (response instanceof JSONObject) {
            		ErrorImpl error = new ErrorImpl();
            		error.adaptFrom((JSONObject)response);
            		return (A) error;
            	}
            } catch (Exception e) {
                throw new StackOverflowApiClientException(e);
            }
    	}
    	return null;
    }

    /* (non-Javadoc)
     * @see com.google.code.stackoverflow.client.impl.StackOverflowApiGateway#marshallObject(java.lang.Object)
     */
    protected String marshallObject(Object element) {
    	return null;
    }
	
	/**
	 * Unmarshall.
	 * 
	 * @param json the json
	 * 
	 * @return the list< t>
	 */
	protected abstract PagedList<T> unmarshall(JSONObject json);
	
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
