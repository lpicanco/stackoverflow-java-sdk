package com.google.code.stackoverflow.query.impl;

import java.util.List;

import com.google.code.stackoverflow.client.constant.ApplicationConstants;
import com.google.code.stackoverflow.client.provider.ApiProvider;
import com.google.code.stackoverflow.client.provider.StackOverflowApiProvider;
import com.google.code.stackoverflow.query.StackOverflowApiQuery;

public class BaseStackOverflowApiQuery<T> implements StackOverflowApiQuery<T> {
	
	private ApiProvider apiProvider = new StackOverflowApiProvider();
	private String applicationId;
	private String apiVersion = ApplicationConstants.DEFAULT_API_VERSION;
	
	public BaseStackOverflowApiQuery(String applicationId) {
		this.applicationId = applicationId;
	}

	public BaseStackOverflowApiQuery(String applicationId, String apiVersion) {
		this.applicationId = applicationId;
		this.apiVersion = apiVersion;
	}
	
	@Override
	public List<T> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@Override
	public T singleResult() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the apiProvider
	 */
	public ApiProvider getApiProvider() {
		return apiProvider;
	}

	/**
	 * @param apiProvider the apiProvider to set
	 */
	public void setApiProvider(ApiProvider apiProvider) {
		this.apiProvider = apiProvider;
	}

	/**
	 * @return the applicationId
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * @param applicationId the applicationId to set
	 */
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	
	/**
	 * @return the apiVersion
	 */
	public String getApiVersion() {
		return apiVersion;
	}

	/**
	 * @param apiVersion the apiVersion to set
	 */
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}
}
