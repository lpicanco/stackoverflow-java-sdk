/**
 * 
 */
package com.google.code.stackexchange.client.query.impl;


import com.google.code.stackexchange.client.constant.StackExchangeApiMethods;
import com.google.code.stackexchange.client.provider.url.DefaultApiUrlBuilder;
import com.google.code.stackexchange.client.query.BadgeApiQuery;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Badge;
import com.google.code.stackexchange.schema.Badges;
import com.google.gson.JsonObject;

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
	 * @see com.google.code.stackexchange.client.query.BadgeApiQuery#withUserIds(long[])
	 */
	@Override
	public BadgeApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected PagedList<Badge> unmarshall(JsonObject json) {
		Badges adapter = new Badges();
		return adapter.adaptFrom(json);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackExchangeApiMethods.GET_BADGES, getApplicationKey(), getApiVersion());
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.BadgeApiQuery#listByName()
	 */
	@Override
	public PagedList<Badge> listByName() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackExchangeApiMethods.GET_BADGES_BY_NAME);
		return super.list();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.BadgeApiQuery#listByTags()
	 */
	@Override
	public PagedList<Badge> listByTags() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackExchangeApiMethods.GET_BADGES_BY_TAGS);
		return super.list();
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.impl.BaseStackOverflowApiQuery#list()
	 */
	@Override
	public PagedList<Badge> list() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackExchangeApiMethods.GET_BADGES);
		return super.list();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.BadgeApiQuery#listByUsers()
	 */
	@Override
	public PagedList<Badge> listByUsers() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackExchangeApiMethods.GET_BADGES_FOR_USER);
		return super.list();
	}
}
