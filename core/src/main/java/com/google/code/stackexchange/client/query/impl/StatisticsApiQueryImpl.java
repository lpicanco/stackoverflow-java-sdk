/**
 * 
 */
package com.google.code.stackexchange.client.query.impl;

import com.google.code.stackexchange.client.constant.StackExchangeApiMethods;
import com.google.code.stackexchange.client.query.StatisticsApiQuery;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Statistics;
import com.google.gson.JsonObject;

/**
 * The Class StatisticsApiQueryImpl.
 */
public class StatisticsApiQueryImpl extends BaseStackOverflowApiQuery<Statistics> implements StatisticsApiQuery {

	/**
	 * Instantiates a new statistics api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public StatisticsApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected PagedList<Statistics> unmarshall(JsonObject json) {
		Statistics adapter = new Statistics();
		return adapter.adaptFrom(json);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackExchangeApiMethods.GET_STATISTICS, getApplicationKey(), getApiVersion());
	}
}
