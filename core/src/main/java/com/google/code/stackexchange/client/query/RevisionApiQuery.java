/**
 * 
 */
package com.google.code.stackexchange.client.query;

import com.google.code.stackexchange.schema.Revision;
import com.google.code.stackexchange.schema.TimePeriod;

/**
 * The Interface RevisionApiQuery.
 */
public interface RevisionApiQuery extends StackExchangeApiQuery<Revision> {
	
	/**
	 * With question ids.
	 * 
	 * @param questionIds the question ids
	 * 
	 * @return the revision api query
	 */
	public RevisionApiQuery withQuestionIds(long... questionIds);
	
	/**
	 * With time period.
	 * 
	 * @param timePeriod the time period
	 * 
	 * @return the revision api query
	 */
	public RevisionApiQuery withTimePeriod(TimePeriod timePeriod);
	
	/**
	 * With revision guid.
	 * 
	 * @param revisionGuid the revision guid
	 * 
	 * @return the revision api query
	 */
	public RevisionApiQuery withRevisionGuid(String revisionGuid);
}
