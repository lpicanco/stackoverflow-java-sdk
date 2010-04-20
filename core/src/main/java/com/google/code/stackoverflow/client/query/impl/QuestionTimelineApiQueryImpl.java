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
import com.google.code.stackoverflow.schema.adapter.json.QuestionTimelinesImpl;

/**
 * @author nmukhtar
 *
 */
public class QuestionTimelineApiQueryImpl extends BaseStackOverflowApiQuery<PostTimeline> implements QuestionTimelineApiQuery {

	public QuestionTimelineApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	@Override
	public QuestionTimelineApiQuery withQuestionIds(long... questionIds) {
		apiUrlBuilder.withIds(questionIds);
		return this;
	}

	@Override
	public QuestionTimelineApiQuery withTimePeriod(TimePeriod timePeriod) {
		apiUrlBuilder.withTimePeriod(timePeriod);
		return this;
	}

	@Override
	protected List<PostTimeline> unmarshall(JSONObject json) {
		QuestionTimelinesImpl adapter = new QuestionTimelinesImpl();
		adapter.adaptFrom(json);
		return adapter.getTimelines();
	}

	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_QUESTION_TIMELINE, getApplicationKey(), getApiVersion());
	}
}
