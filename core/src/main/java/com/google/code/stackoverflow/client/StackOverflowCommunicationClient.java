/**
 *
 */
package com.google.code.stackoverflow.client;

import java.util.Map;

import com.google.code.stackoverflow.client.provider.ApiProvider;

/**
 * The Interface StackOverflowCommunicationClient.
 *
 * @author Nabeel Mukhtar
 */
public interface StackOverflowCommunicationClient {

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
     * Method description
     *
     *
     * @param apiProvider
     */
    public void setApiProvider(ApiProvider apiProvider);
    
    /**
     * Method description
     *
     *
     * @return
     */
    public ApiProvider getApiProvider();
    
    /**
     * Method description
     *
     *
     * @return
     */
    public int getMaxRateLimit();
    
    /**
     * Method description
     *
     *
     * @return
     */
    public int getCurrentRateLimit();
}
