/**
 * 
 */
package com.google.code.stackoverflow.client.query.impl;


import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.query.ReputationApiQuery;
import com.google.code.stackoverflow.common.PagedList;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.adapter.json.ReputationsImpl;

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
	 * @see com.google.code.stackoverflow.client.query.ReputationApiQuery#withPaging(com.google.code.stackoverflow.schema.Paging)
	 */
	@Override
	public ReputationApiQuery withPaging(Paging paging) {
		apiUrlBuilder.withPaging(paging);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.ReputationApiQuery#withTimePeriod(com.google.code.stackoverflow.schema.TimePeriod)
	 */
	@Override
	public ReputationApiQuery withTimePeriod(TimePeriod timePeriod) {
		apiUrlBuilder.withTimePeriod(timePeriod);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.ReputationApiQuery#withUserIds(long[])
	 */
	@Override
	public ReputationApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected PagedList<Reputation> unmarshall(JSONObject json) {
		ReputationsImpl adapter = new ReputationsImpl();
		adapter.adaptFrom(json);
		return adapter.getReputations();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_USER_REPUTATIONS, getApplicationKey(), getApiVersion());
	}
}
