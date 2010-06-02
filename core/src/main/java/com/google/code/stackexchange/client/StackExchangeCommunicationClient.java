/**
 *
 */
package com.google.code.stackexchange.client;

import java.util.Map;

import com.google.code.stackexchange.client.provider.ApiProvider;

/**
 * The Interface StackExchangeCommunicationClient.
 */
public interface StackExchangeCommunicationClient {

    /**
     * Sets the request headers.
     * 
     * @param requestHeaders the request headers
     */
    public void setRequestHeaders(Map<String, String> requestHeaders);

    /**
     * Gets the request headers.
     * 
     * @return the request headers
     */
    public Map<String, String> getRequestHeaders();

    /**
     * Adds the request header.
     * 
     * @param headerName the header name
     * @param headerValue the header value
     */
    public void addRequestHeader(String headerName, String headerValue);

    /**
     * Removes the request header.
     * 
     * @param headerName the header name
     */
    public void removeRequestHeader(String headerName);
    
    /**
     * Sets the api provider.
     * 
     * @param apiProvider the new api provider
     */
    public void setApiProvider(ApiProvider apiProvider);
    
    /**
     * Gets the api provider.
     * 
     * @return the api provider
     */
    public ApiProvider getApiProvider();
    
    /**
     * Gets the max rate limit.
     * 
     * @return the max rate limit
     */
    public int getMaxRateLimit();
    
    /**
     * Gets the current rate limit.
     * 
     * @return the current rate limit
     */
    public int getCurrentRateLimit();
}
