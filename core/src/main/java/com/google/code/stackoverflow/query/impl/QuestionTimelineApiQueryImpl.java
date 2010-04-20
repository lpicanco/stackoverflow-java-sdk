/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import com.google.code.stackoverflow.query.QuestionTimelineApiQuery;
import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.TimePeriod;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionTimelineApiQuery withTimePeriod(TimePeriod timePeriod) {
		// TODO Auto-generated method stub
		return null;
	}
}
