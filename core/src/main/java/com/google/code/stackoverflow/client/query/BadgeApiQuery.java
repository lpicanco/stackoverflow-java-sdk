/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.schema.Badge;

/**
 * @author nmukhtar
 *
 */
public interface BadgeApiQuery extends StackOverflowApiQuery<Badge> {
	
	public enum Classification {
		NONE, BY_NAME, BY_TAGS;
	}
	
	/**
	 * 
	 */
	public BadgeApiQuery withUserIds(long... userIds);

	/**
	 * 
	 */
	public BadgeApiQuery withClassification(Classification classification);
}
