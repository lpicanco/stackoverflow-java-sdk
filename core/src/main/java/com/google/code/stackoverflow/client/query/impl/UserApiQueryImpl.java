/**
 * 
 */
package com.google.code.stackoverflow.client.query.impl;


import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.common.PagedList;
import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.provider.url.DefaultApiUrlBuilder;
import com.google.code.stackoverflow.client.query.UserApiQuery;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Range;
import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.adapter.json.UsersImpl;

/**
 * The Class UserApiQueryImpl.
 */
public class UserApiQueryImpl extends BaseStackOverflowApiQuery<User> implements UserApiQuery {

	/**
	 * Instantiates a new user api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public UserApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.UserApiQuery#withFilter(java.lang.String)
	 */
	@Override
	public UserApiQuery withFilter(String filter) {
		apiUrlBuilder.withParameter("filter", filter);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.UserApiQuery#withPaging(com.google.code.stackoverflow.schema.Paging)
	 */
	@Override
	public UserApiQuery withPaging(Paging paging) {
		apiUrlBuilder.withPaging(paging);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.UserApiQuery#withSort(com.google.code.stackoverflow.schema.User.SortOrder)
	 */
	@Override
	public UserApiQuery withSort(User.SortOrder sort) {
		apiUrlBuilder.withSort(sort);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.UserApiQuery#withUserIds(long[])
	 */
	@Override
	public UserApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected PagedList<User> unmarshall(JSONObject json) {
		UsersImpl adapter = new UsersImpl();
		adapter.adaptFrom(json);
		return adapter.getUsers();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_USERS, getApplicationKey(), getApiVersion());
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.UserApiQuery#withBadgeIds(long[])
	 */
	@Override
	public UserApiQuery withBadgeIds(long... badgeIds) {
		apiUrlBuilder.withIds(badgeIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.UserApiQuery#withClassification(com.google.code.stackoverflow.client.query.UserApiQuery.Classification)
	 */
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

	@Override
	public UserApiQuery withRange(Range range) {
		apiUrlBuilder.withRange(range);
		return this;
	}
}
