/**
 * 
 */
package com.google.code.stackexchange.client.query;

import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.PostTimeline;
import com.google.code.stackexchange.schema.TimePeriod;

/**
 * The Interface QuestionTimelineApiQuery.
 */
public interface QuestionTimelineApiQuery extends StackExchangeApiQuery<PostTimeline> {
	
	/**
	 * With question ids.
	 * 
	 * @param questionIds the question ids
	 * 
	 * @return the question timeline api query
	 */
	public QuestionTimelineApiQuery withQuestionIds(long... questionIds);
	
	/**
	 * With time period.
	 * 
	 * @param timePeriod the time period
	 * 
	 * @return the question timeline api query
	 */
	public QuestionTimelineApiQuery withTimePeriod(TimePeriod timePeriod);
	
	public QuestionTimelineApiQuery withPaging(Paging paging);
}
