/**
 * 
 */
package com.google.code.stackoverflow.client.query.impl;


import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.common.PagedList;
import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.provider.url.DefaultApiUrlBuilder;
import com.google.code.stackoverflow.client.query.BadgeApiQuery;
import com.google.code.stackoverflow.schema.Badge;
import com.google.code.stackoverflow.schema.adapter.json.BadgesImpl;

/**
 * The Class BadgeApiQueryImpl.
 */
public class BadgeApiQueryImpl extends BaseStackOverflowApiQuery<Badge> implements BadgeApiQuery {

	/**
	 * Instantiates a new badge api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public BadgeApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.BadgeApiQuery#withUserIds(long[])
	 */
	@Override
	public BadgeApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected PagedList<Badge> unmarshall(JSONObject json) {
		BadgesImpl adapter = new BadgesImpl();
		adapter.adaptFrom(json);
		return adapter.getBadges();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_BADGES, getApplicationKey(), getApiVersion());
	}

	@Override
	public PagedList<Badge> listByName() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_BADGES_BY_NAME);
		return super.list();
	}

	@Override
	public PagedList<Badge> listByTags() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_BADGES_BY_TAGS);
		return super.list();
	}
	
	@Override
	public PagedList<Badge> list() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_BADGES);
		return super.list();
	}

	@Override
	public PagedList<Badge> listByUsers() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_BADGES_FOR_USER);
		return super.list();
	}
}
