package com.google.code.stackoverflow.client.query.impl;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.code.stackoverflow.client.exception.StackOverflowApiClientException;
import com.google.code.stackoverflow.client.impl.StackOverflowApiGateway;
import com.google.code.stackoverflow.client.provider.url.ApiUrlBuilder;
import com.google.code.stackoverflow.client.query.StackOverflowApiQuery;
import com.google.code.stackoverflow.schema.adapter.json.ErrorImpl;

public abstract class BaseStackOverflowApiQuery<T> extends StackOverflowApiGateway implements StackOverflowApiQuery<T> {
	
	protected ApiUrlBuilder apiUrlBuilder;
    private final JSONParser parser = new JSONParser();
	
	public BaseStackOverflowApiQuery(String applicationId) {
		super.setApplicationKey(applicationId);
        requestHeaders = new HashMap<String, String>();

        // by default we compress contents
        requestHeaders.put("Accept-Encoding", "gzip, deflate");
        this.reset();
	}

	public BaseStackOverflowApiQuery(String applicationId, String apiVersion) {
		this(applicationId);
		super.setApiVersion(apiVersion);
	}
	
	@Override
	public List<T> list() {
        try {
        	InputStream jsonContent = callApiMethod(apiUrlBuilder.buildUrl());
        	Object response = parser.parse(new InputStreamReader(jsonContent));
        	if (response instanceof JSONObject) {
        		return unmarshall((JSONObject) response);
        	}
        	throw new StackOverflowApiClientException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new StackOverflowApiClientException(e);
        }
	}

	@Override
	public T singleResult() {
        try {
        	InputStream jsonContent = callApiMethod(apiUrlBuilder.buildUrl());
        	Object response = parser.parse(new InputStreamReader(jsonContent));
        	if (response instanceof JSONObject) {
        		return getFirstElement(unmarshall((JSONObject) response));
        	}
        	throw new StackOverflowApiClientException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new StackOverflowApiClientException(e);
        }
	}
	
    /**
     *
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

    /**
     * Method description
     *
     *
     * @param element
     *
     * @return
     */
    protected String marshallObject(Object element) {
    	return null;
    }
	
	protected abstract List<T> unmarshall(JSONObject json);
	
	private T getFirstElement(List<T> list) {
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
}
