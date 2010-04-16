/**
 * 
 */
package com.google.code.stackoverflow.client.provider;

import com.google.code.stackoverflow.client.provider.url.ApiUrlBuilder;
import com.google.code.stackoverflow.client.provider.url.StackOverflowApiUrlBuilder;

/**
 * @author nmukhtar
 *
 */
public class StackOverflowApiProvider implements ApiProvider {
	private static final String HOST_NAME = "api.stackoverflow.com";
	
	@Override
	public ApiUrlBuilder createApiUrlBuilder(String urlFormat,String applicationKey, String apiVersion) {
		return new StackOverflowApiUrlBuilder(urlFormat, applicationKey, HOST_NAME, apiVersion);
	}
}
