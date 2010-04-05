package com.google.code.stackoverflow.schema;

import java.util.List;

public interface Badges extends SchemaEntity {

	/**
	 * @return the badges
	 */
	public List<Badge> getBadges();

	/**
	 * @param badges the badges to set
	 */
	public void setBadges(List<Badge> badges);

}