/**
 * 
 */
package com.google.code.stackexchange.client.query;

import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.Reputation;
import com.google.code.stackexchange.schema.TimePeriod;

/**
 * The Interface ReputationApiQuery.
 */
public interface ReputationApiQuery extends StackExchangeApiQuery<Reputation> {
	
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
