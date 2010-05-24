/*
 * 
 */
package com.google.code.stackoverflow.common;

import java.util.List;

/**
 * The Interface PagedList.
 */
public interface PagedList<E> extends List<E> {
	
	/**
	 * @return the total
	 */
	public long getTotal();
	
	/**
	 * @param total the total to set
	 */
	public void setTotal(long total);
	
	/**
	 * @return the page
	 */
	public int getPage();
	
	/**
	 * @param page the page to set
	 */
	public void setPage(int page);
	
	/**
	 * @return the pageSize
	 */
	public int getPageSize();
	
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize);
}
