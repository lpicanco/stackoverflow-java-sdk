/**
 *
 */
package com.google.code.stackexchange.client;


/**
 * The Interface StackExchangeAuthenticationClient.
 */
public interface StackExchangeAuthenticationClient extends StackExchangeCommunicationClient {

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
