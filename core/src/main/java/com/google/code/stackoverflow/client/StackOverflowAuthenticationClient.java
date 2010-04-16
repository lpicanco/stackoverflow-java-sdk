/**
 *
 */
package com.google.code.stackoverflow.client;

import com.google.code.stackoverflow.client.provider.ApiProvider;

/**
 * @author Nabeel Mukhtar
 *
 */
public interface StackOverflowAuthenticationClient extends StackOverflowCommunicationClient {

    /**
     * Method description
     *
     *
     * @param applicationKey
     */
    public void setApplicationKey(String applicationKey);

    /**
     * Method description
     *
     *
     * @return
     */
    public String getApplicationKey();
    
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
}
