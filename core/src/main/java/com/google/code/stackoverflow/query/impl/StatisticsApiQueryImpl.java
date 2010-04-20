/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import java.util.Collections;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.query.StatisticsApiQuery;
import com.google.code.stackoverflow.schema.Statistics;
import com.google.code.stackoverflow.schema.adapter.json.StatisticsImpl;

/**
 * @author nmukhtar
 *
 */
public class StatisticsApiQueryImpl extends BaseStackOverflowApiQuery<Statistics> implements StatisticsApiQuery {

	public StatisticsApiQueryImpl(String applicationId) {
		super(applicationId);
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_STATISTICS, getApplicationKey(), getApiVersion());
	}

	@Override
	protected List<Statistics> unmarshall(JSONObject json) {
		Statistics adapter = new StatisticsImpl();
		((StatisticsImpl) adapter).adaptFrom(json);
		return Collections.singletonList(adapter);
	}
}
