/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * The Interface ReputationApiQuery.
 */
public interface ReputationApiQuery extends StackOverflowApiQuery<Reputation> {
	
	/**
	 * With user ids.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the reputation api query
	 */
	public ReputationApiQuery withUserIds(long... userIds);
	
	/**
	 * With paging.
	 * 
	 * @param paging the paging
	 * 
	 * @return the reputation api query
	 */
	public ReputationApiQuery withPaging(Paging paging);

	/**
	 * With time period.
	 * 
	 * @param timePeriod the time period
	 * 
	 * @return the reputation api query
	 */
	public ReputationApiQuery withTimePeriod(TimePeriod timePeriod);
}
