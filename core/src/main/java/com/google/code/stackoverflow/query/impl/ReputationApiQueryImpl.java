/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.query.ReputationApiQuery;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.adapter.json.ReputationsImpl;

/**
 * @author nmukhtar
 *
 */
public class ReputationApiQueryImpl extends BaseStackOverflowApiQuery<Reputation> implements ReputationApiQuery {

	public ReputationApiQueryImpl(String applicationId) {
		super(applicationId);
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_USER_REPUTATIONS, getApplicationKey(), getApiVersion());
	}

	@Override
	public ReputationApiQuery withPaging(Paging paging) {
		apiUrlBuilder.withPaging(paging);
		return this;
	}

	@Override
	public ReputationApiQuery withTimePeriod(TimePeriod timePeriod) {
		apiUrlBuilder.withTimePeriod(timePeriod);
		return this;
	}

	@Override
	public ReputationApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	@Override
	protected List<Reputation> unmarshall(JSONObject json) {
		ReputationsImpl adapter = new ReputationsImpl();
		adapter.adaptFrom(json);
		return adapter.getReputations();
	}
}
