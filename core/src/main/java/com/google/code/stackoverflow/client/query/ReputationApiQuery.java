/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * @author nmukhtar
 *
 */
public interface ReputationApiQuery extends StackOverflowApiQuery<Reputation> {
	
	/**
	 * 
	 */
	public ReputationApiQuery withUserIds(long... userIds);
	
	/**
	 * 
	 */
	public ReputationApiQuery withPaging(Paging paging);

	/**
	 * 
	 */
	public ReputationApiQuery withTimePeriod(TimePeriod timePeriod);
}
