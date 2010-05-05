/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.schema.Revision;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * The Interface RevisionApiQuery.
 */
public interface RevisionApiQuery extends StackOverflowApiQuery<Revision> {
	
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
