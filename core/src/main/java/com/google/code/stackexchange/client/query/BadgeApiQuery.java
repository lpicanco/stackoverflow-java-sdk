/**
 * 
 */
package com.google.code.stackexchange.client.query;

import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Badge;

/**
 * The Interface BadgeApiQuery.
 */
public interface BadgeApiQuery extends StackExchangeApiQuery<Badge> {
	
	/**
	 * List by name.
	 * 
	 * @return the paged list< badge>
	 */
	public PagedList<Badge> listByName();
	
	/**
	 * List by tags.
	 * 
	 * @return the paged list< badge>
	 */
	public PagedList<Badge> listByTags();
	
	/**
	 * List by users.
	 * 
	 * @return the paged list< badge>
	 */
	public PagedList<Badge> listByUsers();
	
	/**
	 * With user ids.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the badge api query
	 */
	public BadgeApiQuery withUserIds(long... userIds);
}
