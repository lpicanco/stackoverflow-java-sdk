/**
 * 
 */
package com.google.code.stackoverflow.client.provider;

import com.google.code.stackoverflow.client.provider.url.ApiUrlBuilder;
import com.google.code.stackoverflow.client.provider.url.SuperUserApiUrlBuilder;

/**
 * @author nmukhtar
 *
 */
public class SuperUserApiProvider implements ApiProvider {
	private static final String HOST_NAME = "api.superuser.com";
	
	@Override
	public ApiUrlBuilder createApiUrlBuilder(String urlFormat,String applicationKey, String apiVersion) {
		return new SuperUserApiUrlBuilder(urlFormat, applicationKey, HOST_NAME, apiVersion);
	}
}
