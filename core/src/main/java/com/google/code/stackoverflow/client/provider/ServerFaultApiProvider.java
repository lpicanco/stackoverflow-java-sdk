/**
 * 
 */
package com.google.code.stackoverflow.client.provider;

import com.google.code.stackoverflow.client.provider.url.ApiUrlBuilder;
import com.google.code.stackoverflow.client.provider.url.DefaultApiUrlBuilder;

/**
 * The Class ServerFaultApiProvider.
 */
public class ServerFaultApiProvider implements ApiProvider {
	
	/** The Constant HOST_NAME. */
	private static final String HOST_NAME = "api.serverfault.com";
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.provider.ApiProvider#createApiUrlBuilder(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public ApiUrlBuilder createApiUrlBuilder(String methodName, String applicationKey, String apiVersion) {
		return new DefaultApiUrlBuilder(methodName, applicationKey, HOST_NAME, apiVersion);
	}
}
