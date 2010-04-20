/**
 * 
 */
package com.google.code.stackoverflow.query;

import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.SortEnum;
import com.google.code.stackoverflow.schema.User;

/**
 * @author nmukhtar
 *
 */
public interface UserApiQuery extends StackOverflowApiQuery<User> {
	
	/**
	 * 
	 */
	public UserApiQuery withUserIds(long... userIds);
	
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
	public UserApiQuery withSort(SortEnum sort);
}
