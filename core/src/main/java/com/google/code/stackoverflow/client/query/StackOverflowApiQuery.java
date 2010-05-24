/**
 * 
 */
package com.google.code.stackoverflow.client.query;


import com.google.code.stackoverflow.client.StackOverflowAuthenticationClient;
import com.google.code.stackoverflow.common.PagedList;

/**
 * The Interface StackOverflowApiQuery.
 */
public interface StackOverflowApiQuery<T> extends StackOverflowAuthenticationClient {
	
	/**
	 * Single result.
	 * 
	 * @return the t
	 */
	public T singleResult();

	/**
	 * List.
	 * 
	 * @return the list< t>
	 */
	public PagedList<T> list();
	
	/**
	 * Reset.
	 */
	public void reset();
}
