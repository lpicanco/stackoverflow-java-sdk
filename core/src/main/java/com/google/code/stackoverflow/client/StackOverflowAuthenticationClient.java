/**
 *
 */
package com.google.code.stackoverflow.client;

/**
 * @author Nabeel Mukhtar
 *
 */
public interface StackOverflowAuthenticationClient extends StackOverflowCommunicationClient {

    /**
     * Method description
     *
     *
     * @param apiConsumer
     */
    public void setApplicationKey(String applicationKey);

    /**
     * Method description
     *
     *
     * @return
     */
    public String getApplicationKey();
}
