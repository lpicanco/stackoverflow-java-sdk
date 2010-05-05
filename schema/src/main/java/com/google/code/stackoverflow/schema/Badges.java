package com.google.code.stackoverflow.schema;

import java.util.List;

/**
 * The Interface Badges.
 */
public interface Badges extends SchemaEntity {

	/**
	 * Gets the badges.
	 * 
	 * @return the badges
	 */
	public List<Badge> getBadges();

	/**
	 * Sets the badges.
	 * 
	 * @param badges the new badges
	 */
	public void setBadges(List<Badge> badges);

}