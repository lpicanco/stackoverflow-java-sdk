/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Range;
import com.google.code.stackoverflow.schema.User;

/**
 * The Interface UserApiQuery.
 */
public interface UserApiQuery extends StackOverflowApiQuery<User> {
	
	/**
	 * The Enum Classification.
	 */
	public enum Classification {
		
		/** The NONE. */
		NONE, 
 /** The B y_ badge. */
 BY_BADGE;
	}
	
	/**
	 * With user ids.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the user api query
	 */
	public UserApiQuery withUserIds(long... userIds);
	
	/**
	 * With badge ids.
	 * 
	 * @param badgeIds the badge ids
	 * 
	 * @return the user api query
	 */
	public UserApiQuery withBadgeIds(long... badgeIds);
	
	/**
	 * With filter.
	 * 
	 * @param filter the filter
	 * 
	 * @return the user api query
	 */
	public UserApiQuery withFilter(String filter);
	
	/**
	 * With paging.
	 * 
	 * @param paging the paging
	 * 
	 * @return the user api query
	 */
	public UserApiQuery withPaging(Paging paging);

	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the user api query
	 */
	public UserApiQuery withSort(User.SortOrder sort);
	
	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the user api query
	 */
	public UserApiQuery withRange(Range range);
	
	/**
	 * With classification.
	 * 
	 * @param classification the classification
	 * 
	 * @return the user api query
	 */
	public UserApiQuery withClassification(Classification classification);
}
