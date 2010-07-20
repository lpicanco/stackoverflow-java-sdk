/**
 * 
 */
package com.google.code.stackexchange.client.query;

import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.TimePeriod;
import com.google.code.stackexchange.schema.UserTimeline;

/**
 * The Interface UserTimelineApiQuery.
 */
public interface UserTimelineApiQuery extends StackExchangeApiQuery<UserTimeline> {

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
	
	public UserTimelineApiQuery withPaging(Paging paging);
}
