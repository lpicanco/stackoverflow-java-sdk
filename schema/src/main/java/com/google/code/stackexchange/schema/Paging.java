/**
 * 
 */
package com.google.code.stackexchange.schema;

/**
 * The Class Paging.
 */
public final class Paging {
	
	/** The page number. */
	private int pageNumber;
	
	/** The page size. */
	private int pageSize;
	
	/**
	 * Instantiates a new paging.
	 * 
	 * @param pageNumber the page number
	 * @param pageSize the page size
	 */
	public Paging(int pageNumber, int pageSize) {
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}
	
	/**
	 * Gets the page number.
	 * 
	 * @return the page number
	 */
	public int getPageNumber() {
		return pageNumber;
	}
	
	/**
	 * Gets the page size.
	 * 
	 * @return the page size
	 */
	public int getPageSize() {
		return pageSize;
	}
}