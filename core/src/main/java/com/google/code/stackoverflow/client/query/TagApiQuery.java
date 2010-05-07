/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Range;
import com.google.code.stackoverflow.schema.Tag;

/**
 * The Interface TagApiQuery.
 */
public interface TagApiQuery extends StackOverflowApiQuery<Tag> {
	
	/**
	 * The Enum Classification.
	 */
	public enum Classification {
		
		/** The NONE. */
		NONE, 
 /** The B y_ user. */
 BY_USER;
	}
	
	/**
	 * With user ids.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the tag api query
	 */
	public TagApiQuery withUserIds(long... userIds);
	
	/**
	 * With paging.
	 * 
	 * @param paging the paging
	 * 
	 * @return the tag api query
	 */
	public TagApiQuery withPaging(Paging paging);

	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the tag api query
	 */
	public TagApiQuery withSort(Tag.SortOrder sort);
	
	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the tag api query
	 */
	public TagApiQuery withRange(Range range);
	
	/**
	 * With classification.
	 * 
	 * @param classification the classification
	 * 
	 * @return the tag api query
	 */
	public TagApiQuery withClassification(Classification classification);
}
