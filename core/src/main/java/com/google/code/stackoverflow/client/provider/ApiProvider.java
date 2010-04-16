/**
 * 
 */
package com.google.code.stackoverflow.client.provider;

import com.google.code.stackoverflow.client.provider.url.ApiUrlBuilder;

/**
 * @author nmukhtar
 *
 */
public interface ApiProvider {
	public ApiUrlBuilder createApiUrlBuilder(String methodName, String applicationKey, String apiVersion);
}
