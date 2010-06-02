package com.google.code.stackexchange.schema;


import com.google.code.stackexchange.common.PagedList;

/**
 * The Interface Badges.
 */
public interface Badges extends SchemaEntity {

	/**
	 * Gets the badges.
	 * 
	 * @return the badges
	 */
	public PagedList<Badge> getBadges();

	/**
	 * Sets the badges.
	 * 
	 * @param badges the new badges
	 */
	public void setBadges(PagedList<Badge> badges);

}