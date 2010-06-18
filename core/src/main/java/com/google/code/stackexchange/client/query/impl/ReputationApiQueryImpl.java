/**
 * 
 */
package com.google.code.stackexchange.client.query.impl;


import com.google.code.stackexchange.client.constant.StackExchangeApiMethods;
import com.google.code.stackexchange.client.query.ReputationApiQuery;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.Reputation;
import com.google.code.stackexchange.schema.Reputations;
import com.google.code.stackexchange.schema.TimePeriod;
import com.google.gson.JsonObject;

/**
 * The Class ReputationApiQueryImpl.
 */
public class ReputationApiQueryImpl extends BaseStackOverflowApiQuery<Reputation> implements ReputationApiQuery {

	/**
	 * Instantiates a new reputation api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public ReputationApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.ReputationApiQuery#withPaging(com.google.code.stackexchange.schema.Paging)
	 */
	@Override
	public ReputationApiQuery withPaging(Paging paging) {
		apiUrlBuilder.withPaging(paging);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.ReputationApiQuery#withTimePeriod(com.google.code.stackexchange.schema.TimePeriod)
	 */
	@Override
	public ReputationApiQuery withTimePeriod(TimePeriod timePeriod) {
		apiUrlBuilder.withTimePeriod(timePeriod);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.ReputationApiQuery#withUserIds(long[])
	 */
	@Override
	public ReputationApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected PagedList<Reputation> unmarshall(JsonObject json) {
		Reputations adapter = new Reputations();
		adapter.adaptFrom(json);
		return adapter.getReputations();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackExchangeApiMethods.GET_USER_REPUTATIONS, getApplicationKey(), getApiVersion());
	}
}
