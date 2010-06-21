/**
 * 
 */
package com.google.code.stackexchange.client.provider;

import com.google.code.stackexchange.client.provider.url.ApiUrlBuilder;
import com.google.code.stackexchange.client.provider.url.DefaultApiUrlBuilder;

/**
 * The Class StackOverflowApiProvider.
 */
public class MetaStackOverflowApiProvider implements ApiProvider {
	
	/** The Constant HOST_NAME. */
	private static final String HOST_NAME = "api.meta.stackoverflow.com";
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.provider.ApiProvider#createApiUrlBuilder(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public ApiUrlBuilder createApiUrlBuilder(String methodName, String applicationKey, String apiVersion) {
		return new DefaultApiUrlBuilder(methodName, applicationKey, HOST_NAME, apiVersion);
	}
}
