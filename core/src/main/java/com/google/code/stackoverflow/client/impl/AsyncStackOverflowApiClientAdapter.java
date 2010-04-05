/**
 *
 */
package com.google.code.stackoverflow.client.impl;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import com.google.code.stackoverflow.client.AsyncStackOverflowApiClient;
import com.google.code.stackoverflow.client.StackOverflowApiClient;

/**
 * @author Nabeel Mukhtar
 *
 */
public class AsyncStackOverflowApiClientAdapter implements AsyncStackOverflowApiClient {

    /** Field description */
    private StackOverflowApiClient client;
    
    /** Field description */
    private ExecutorService taskExecutor;

    /** Field description */

    /**
     * Constructs ...
     *
     *
     * @param client
     */
    public AsyncStackOverflowApiClientAdapter(StackOverflowApiClient client, ExecutorService taskExecutor) {
        this.client  = client;
        this.taskExecutor = taskExecutor;
    }

    /**
     * Method description
     *
     *
     * @param task
     *
     * @return
     */
    protected Future<?> execute(Runnable task) {
        return taskExecutor.submit(task);
    }

    /**
     * Method description
     *
     *
     * @param task
     * @param <T>
     *
     * @return
     */
    protected <T> Future<T> execute(Callable<T> task) {
        return taskExecutor.submit(task);
    }
    
    /**
     * Sets the request headers.
     *
     * @param requestHeaders the request headers
     */
    public void setRequestHeaders(Map<String, String> requestHeaders) {
    	client.setRequestHeaders(requestHeaders);
    }

    /**
     * Gets the request headers.
     *
     * @return the request headers
     */
    public Map<String, String> getRequestHeaders() {
        return client.getRequestHeaders();
    }

    /**
     * Adds the request header.
     *
     * @param headerName the header name
     * @param headerValue the header value
     */
    public void addRequestHeader(String headerName, String headerValue) {
        client.addRequestHeader(headerName, headerValue);
    }

    /**
     * Removes the request header.
     *
     * @param headerName the header name
     */
    public void removeRequestHeader(String headerName) {
        client.removeRequestHeader(headerName);
    }

	@Override
	public String getApplicationKey() {
		return client.getApplicationKey();
	}

	@Override
	public void setApplicationKey(String applicationKey) {
		client.setApplicationKey(applicationKey);
	}
}
