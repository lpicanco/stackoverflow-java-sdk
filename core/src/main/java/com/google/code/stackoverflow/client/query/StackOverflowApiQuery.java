/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import java.util.List;

import com.google.code.stackoverflow.client.StackOverflowAuthenticationClient;

/**
 * @author nmukhtar
 *
 */
public interface StackOverflowApiQuery<T> extends StackOverflowAuthenticationClient {
	/**
	 *
	 */
	public T singleResult();

	/**
	 *
	 */
	public List<T> list();
	
	/**
	 *
	 */
	public void reset();
}
