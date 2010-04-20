/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.schema.Revision;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * @author nmukhtar
 *
 */
public interface RevisionApiQuery extends StackOverflowApiQuery<Revision> {
	
	/**
	 * 
	 */
	public RevisionApiQuery withQuestionIds(long... questionIds);
	
	/**
	 * 
	 */
	public RevisionApiQuery withTimePeriod(TimePeriod timePeriod);
	
	/**
	 * 
	 */
	public RevisionApiQuery withRevisionGuid(String revisionGuid);
}
