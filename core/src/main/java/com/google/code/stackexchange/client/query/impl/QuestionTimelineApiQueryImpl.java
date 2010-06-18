/**
 * 
 */
package com.google.code.stackexchange.client.query.impl;


import com.google.code.stackexchange.client.constant.StackExchangeApiMethods;
import com.google.code.stackexchange.client.query.QuestionTimelineApiQuery;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.PostTimeline;
import com.google.code.stackexchange.schema.PostTimelines;
import com.google.code.stackexchange.schema.TimePeriod;
import com.google.gson.JsonObject;

/**
 * The Class QuestionTimelineApiQueryImpl.
 */
public class QuestionTimelineApiQueryImpl extends BaseStackOverflowApiQuery<PostTimeline> implements QuestionTimelineApiQuery {

	/**
	 * Instantiates a new question timeline api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public QuestionTimelineApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.QuestionTimelineApiQuery#withQuestionIds(long[])
	 */
	@Override
	public QuestionTimelineApiQuery withQuestionIds(long... questionIds) {
		apiUrlBuilder.withIds(questionIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.QuestionTimelineApiQuery#withTimePeriod(com.google.code.stackexchange.schema.TimePeriod)
	 */
	@Override
	public QuestionTimelineApiQuery withTimePeriod(TimePeriod timePeriod) {
		apiUrlBuilder.withTimePeriod(timePeriod);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected PagedList<PostTimeline> unmarshall(JsonObject json) {
		PostTimelines adapter = new PostTimelines();
		adapter.adaptFrom(json);
		return adapter.getTimelines();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackExchangeApiMethods.GET_QUESTION_TIMELINE, getApplicationKey(), getApiVersion());
	}
}
