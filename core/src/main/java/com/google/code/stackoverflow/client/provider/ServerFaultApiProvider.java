/**
 * 
 */
package com.google.code.stackoverflow.client.provider;

import com.google.code.stackoverflow.client.provider.url.ApiUrlBuilder;
import com.google.code.stackoverflow.client.provider.url.DefaultApiUrlBuilder;

/**
 * @author nmukhtar
 *
 */
public class ServerFaultApiProvider implements ApiProvider {
	private static final String HOST_NAME = "api.serverfault.com";
	
	@Override
	public ApiUrlBuilder createApiUrlBuilder(String methodName, String applicationKey, String apiVersion) {
		return new DefaultApiUrlBuilder(methodName, applicationKey, HOST_NAME, apiVersion);
	}
}
