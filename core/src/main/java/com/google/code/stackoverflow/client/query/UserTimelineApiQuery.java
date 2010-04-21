/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.UserTimeline;

/**
 * @author nmukhtar
 *
 */
public interface UserTimelineApiQuery extends StackOverflowApiQuery<UserTimeline> {

	/**
	 * 
	 */
	public UserTimelineApiQuery withUserIds(long... userIds);
	
	/**
	 * 
	 */
	public UserTimelineApiQuery withTimePeriod(TimePeriod timePeriod);
}
