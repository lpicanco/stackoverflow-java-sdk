/**
 * 
 */
package com.google.code.stackoverflow.client.provider.url;

/**
 * @author nmukhtar
 *
 */
public class StackOverflowApiUrlBuilder extends BaseApiUrlBuilder {

	/**
	 * @param methodName
	 * @param applicationId
	 * @param providerHost
	 */
	public StackOverflowApiUrlBuilder(String methodName, String applicationId, String providerHost) {
		super(methodName, applicationId, providerHost);
	}

	/**
	 * @param methodName
	 * @param applicationId
	 * @param providerHost
	 * @param apiVersion
	 */
	public StackOverflowApiUrlBuilder(String methodName, String applicationId, String providerHost, String apiVersion) {
		super(methodName, applicationId, providerHost, apiVersion);
	}
}
