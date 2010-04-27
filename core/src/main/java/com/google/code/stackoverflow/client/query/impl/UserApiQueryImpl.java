/**
 * 
 */
package com.google.code.stackoverflow.client.query.impl;

import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.provider.url.DefaultApiUrlBuilder;
import com.google.code.stackoverflow.client.query.UserApiQuery;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.adapter.json.UsersImpl;

/**
 * @author nmukhtar
 *
 */
public class UserApiQueryImpl extends BaseStackOverflowApiQuery<User> implements UserApiQuery {

	public UserApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	@Override
	public UserApiQuery withFilter(String filter) {
		apiUrlBuilder.withParameter("filter", filter);
		return this;
	}

	@Override
	public UserApiQuery withPaging(Paging paging) {
		apiUrlBuilder.withPaging(paging);
		return this;
	}

	@Override
	public UserApiQuery withSort(User.SortOrder sort) {
		apiUrlBuilder.withSort(sort);
		return this;
	}

	@Override
	public UserApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	@Override
	protected List<User> unmarshall(JSONObject json) {
		UsersImpl adapter = new UsersImpl();
		adapter.adaptFrom(json);
		return adapter.getUsers();
	}

	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_USERS, getApplicationKey(), getApiVersion());
	}

	@Override
	public UserApiQuery withBadgeIds(long... badgeIds) {
		apiUrlBuilder.withIds(badgeIds);
		return this;
	}

	@Override
	public UserApiQuery withClassification(Classification classification) {
		switch (classification) {
		case BY_BADGE:
			((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_BADGE_RECIPIENTS);
			
			break;

		default:
			((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_USERS);
		
			break;
		}
		return this;
	}
}
