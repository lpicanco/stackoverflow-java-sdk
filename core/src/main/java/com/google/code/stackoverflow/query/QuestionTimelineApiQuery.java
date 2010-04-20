/**
 * 
 */
package com.google.code.stackoverflow.query;

import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * @author nmukhtar
 *
 */
public interface QuestionTimelineApiQuery extends StackOverflowApiQuery<PostTimeline> {
	
	/**
	 * 
	 */
	public QuestionTimelineApiQuery withQuestionIds(long... questionIds);
	
	/**
	 * 
	 */
	public QuestionTimelineApiQuery withTimePeriod(TimePeriod timePeriod);
}
