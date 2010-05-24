/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.client.common.PagedList;
import com.google.code.stackoverflow.schema.Badge;

/**
 * The Interface BadgeApiQuery.
 */
public interface BadgeApiQuery extends StackOverflowApiQuery<Badge> {
	
	/**
	 * @return the list
	 */
	public PagedList<Badge> listByName();
	
	/**
	 * @return the list
	 */
	public PagedList<Badge> listByTags();
	
	/**
	 * With user ids.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the badge api query
	 */
	public BadgeApiQuery withUserIds(long... userIds);
}
