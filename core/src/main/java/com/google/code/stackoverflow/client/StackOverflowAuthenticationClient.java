/**
 *
 */
package com.google.code.stackoverflow.client;


/**
 * The Interface StackOverflowAuthenticationClient.
 */
public interface StackOverflowAuthenticationClient extends StackOverflowCommunicationClient {

    /**
     * Sets the application key.
     * 
     * @param applicationKey the new application key
     */
    public void setApplicationKey(String applicationKey);

    /**
     * Gets the application key.
     * 
     * @return the application key
     */
    public String getApplicationKey();
}
