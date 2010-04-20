/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * @author nmukhtar
 *
 */
public interface UserTimelineApiQuery extends StackOverflowApiQuery<PostTimeline> {

	/**
	 * 
	 */
	public UserTimelineApiQuery withUserIds(long... userIds);
	
	/**
	 * 
	 */
	public UserTimelineApiQuery withTimePeriod(TimePeriod timePeriod);
}
