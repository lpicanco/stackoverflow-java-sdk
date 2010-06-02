/*
 * 
 */
package com.google.code.stackexchange.common;

import java.util.List;

/**
 * The Interface PagedList.
 */
public interface PagedList<E> extends List<E> {
	
	/**
	 * Gets the total.
	 * 
	 * @return the total
	 */
	public long getTotal();
	
	/**
	 * Sets the total.
	 * 
	 * @param total the new total
	 */
	public void setTotal(long total);
	
	/**
	 * Gets the page.
	 * 
	 * @return the page
	 */
	public int getPage();
	
	/**
	 * Sets the page.
	 * 
	 * @param page the new page
	 */
	public void setPage(int page);
	
	/**
	 * Gets the page size.
	 * 
	 * @return the page size
	 */
	public int getPageSize();
	
	/**
	 * Sets the page size.
	 * 
	 * @param pageSize the new page size
	 */
	public void setPageSize(int pageSize);
}
