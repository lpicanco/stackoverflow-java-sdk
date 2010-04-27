/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.User;

/**
 * @author nmukhtar
 *
 */
public interface UserApiQuery extends StackOverflowApiQuery<User> {
	
	public enum Classification {
		NONE, BY_BADGE;
	}
	
	/**
	 * 
	 */
	public UserApiQuery withUserIds(long... userIds);
	
	/**
	 * 
	 */
	public UserApiQuery withBadgeIds(long... badgeIds);
	
	/**
	 * 
	 */
	public UserApiQuery withFilter(String filter);
	
	/**
	 * 
	 */
	public UserApiQuery withPaging(Paging paging);

	/**
	 * 
	 */
	public UserApiQuery withSort(User.SortOrder sort);
	
	/**
	 * 
	 */
	public UserApiQuery withClassification(Classification classification);
}
