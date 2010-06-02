/**
 * 
 */
package com.google.code.stackexchange.client.query;

import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.Range;
import com.google.code.stackexchange.schema.User;

/**
 * The Interface UserApiQuery.
 */
public interface UserApiQuery extends StackExchangeApiQuery<User> {
	
	/**
	 * List by badge.
	 * 
	 * @return the paged list< user>
	 */
	public PagedList<User> listByBadge();
	
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
	 * With range.
	 * 
	 * @param range the range
	 * 
	 * @return the user api query
	 */
	public UserApiQuery withRange(Range range);
}
