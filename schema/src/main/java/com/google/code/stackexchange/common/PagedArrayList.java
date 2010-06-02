/*
 * 
 */
package com.google.code.stackexchange.common;

import java.util.ArrayList;


/**
 * The Class PagedArrayList.
 */
public class PagedArrayList<E> extends ArrayList<E> implements PagedList<E> {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5011544152511118680L;
	
	/** The total. */
	private long total;
	
	/** The page. */
	private int page;
	
	/** The page size. */
	private int pageSize;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.common.PagedList#getTotal()
	 */
	public long getTotal() {
		return total;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.common.PagedList#setTotal(long)
	 */
	public void setTotal(long total) {
		this.total = total;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.common.PagedList#getPage()
	 */
	public int getPage() {
		return page;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.common.PagedList#setPage(int)
	 */
	public void setPage(int page) {
		this.page = page;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.common.PagedList#getPageSize()
	 */
	public int getPageSize() {
		return pageSize;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.common.PagedList#setPageSize(int)
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
