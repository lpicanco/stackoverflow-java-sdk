/**
 * 
 */
package com.google.code.stackoverflow.schema;

public final class Paging {
	private int pageNumber;
	private int pageSize;
	
	public Paging(int pageNumber, int pageSize) {
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}
	
	/**
	 * @return the pageNumber
	 */
	public int getPageNumber() {
		return pageNumber;
	}
	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}
}