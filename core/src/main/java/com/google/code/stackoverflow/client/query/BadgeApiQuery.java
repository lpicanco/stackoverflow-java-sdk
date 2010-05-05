/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.schema.Badge;

/**
 * The Interface BadgeApiQuery.
 */
public interface BadgeApiQuery extends StackOverflowApiQuery<Badge> {
	
	/**
	 * The Enum Classification.
	 */
	public enum Classification {
		
		/** The NONE. */
		NONE, 
 /** The B y_ name. */
 BY_NAME, 
 /** The B y_ tags. */
 BY_TAGS;
	}
	
	/**
	 * With user ids.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the badge api query
	 */
	public BadgeApiQuery withUserIds(long... userIds);

	/**
	 * With classification.
	 * 
	 * @param classification the classification
	 * 
	 * @return the badge api query
	 */
	public BadgeApiQuery withClassification(Classification classification);
}
