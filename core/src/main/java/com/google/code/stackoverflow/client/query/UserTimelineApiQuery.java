/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.UserTimeline;

/**
 * The Interface UserTimelineApiQuery.
 */
public interface UserTimelineApiQuery extends StackOverflowApiQuery<UserTimeline> {

	/**
	 * With user ids.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the user timeline api query
	 */
	public UserTimelineApiQuery withUserIds(long... userIds);
	
	/**
	 * With time period.
	 * 
	 * @param timePeriod the time period
	 * 
	 * @return the user timeline api query
	 */
	public UserTimelineApiQuery withTimePeriod(TimePeriod timePeriod);
}
