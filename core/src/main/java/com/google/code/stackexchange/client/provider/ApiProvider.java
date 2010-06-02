/**
 * 
 */
package com.google.code.stackexchange.client.provider;

import com.google.code.stackexchange.client.provider.url.ApiUrlBuilder;

/**
 * The Interface ApiProvider.
 */
public interface ApiProvider {
	
	/**
	 * Creates the api url builder.
	 * 
	 * @param methodName the method name
	 * @param applicationKey the application key
	 * @param apiVersion the api version
	 * 
	 * @return the api url builder
	 */
	public ApiUrlBuilder createApiUrlBuilder(String methodName, String applicationKey, String apiVersion);
}
