/**
 * 
 */
package com.google.code.stackexchange.client.query;


import com.google.code.stackexchange.client.AsyncResponseHandler;
import com.google.code.stackexchange.client.StackExchangeAuthenticationClient;
import com.google.code.stackexchange.common.PagedList;

/**
 * The Interface StackExchangeApiQuery.
 */
public interface StackExchangeApiQuery<T> extends StackExchangeAuthenticationClient {
	
	/**
	 * Single result.
	 * 
	 * @return the t
	 */
	public T singleResult();

	/**
	 * List.
	 * 
	 * @return the paged list< t>
	 */
	public PagedList<T> list();
	
	/**
	 * Adds the resonse handler.
	 * 
	 * @param handler the handler
	 */
	public void addResonseHandler(AsyncResponseHandler<PagedList<T>> handler);
	
	/**
	 * Reset.
	 */
	public void reset();
}
