/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import java.util.List;

import com.google.code.stackoverflow.client.StackOverflowAuthenticationClient;

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
	public List<T> list();
	
	/**
	 * Reset.
	 */
	public void reset();
}
