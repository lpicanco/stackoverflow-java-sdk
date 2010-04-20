/**
 * 
 */
package com.google.code.stackoverflow.query;

import java.util.List;

/**
 * @author nmukhtar
 *
 */
public interface StackOverflowApiQuery<T> {
	/**
	 *
	 */
	public T singleResult();

	/**
	 *
	 */
	public List<T> list();
}
