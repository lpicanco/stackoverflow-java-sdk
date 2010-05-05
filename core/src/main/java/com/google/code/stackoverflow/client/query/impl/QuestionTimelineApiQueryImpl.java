/**
 * 
 */
package com.google.code.stackoverflow.client.query.impl;

import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.query.QuestionTimelineApiQuery;
import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.adapter.json.PostTimelinesImpl;

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
	 * @see com.google.code.stackoverflow.client.query.QuestionTimelineApiQuery#withQuestionIds(long[])
	 */
	@Override
	public QuestionTimelineApiQuery withQuestionIds(long... questionIds) {
		apiUrlBuilder.withIds(questionIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.QuestionTimelineApiQuery#withTimePeriod(com.google.code.stackoverflow.schema.TimePeriod)
	 */
	@Override
	public QuestionTimelineApiQuery withTimePeriod(TimePeriod timePeriod) {
		apiUrlBuilder.withTimePeriod(timePeriod);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected List<PostTimeline> unmarshall(JSONObject json) {
		PostTimelinesImpl adapter = new PostTimelinesImpl();
		adapter.adaptFrom(json);
		return adapter.getTimelines();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_QUESTION_TIMELINE, getApplicationKey(), getApiVersion());
	}
}
