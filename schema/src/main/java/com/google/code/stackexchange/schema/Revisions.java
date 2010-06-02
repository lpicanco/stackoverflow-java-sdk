package com.google.code.stackexchange.schema;


import com.google.code.stackexchange.common.PagedList;

/**
 * The Interface Revisions.
 */
public interface Revisions extends SchemaEntity {

	/**
	 * Gets the revisions.
	 * 
	 * @return the revisions
	 */
	public PagedList<Revision> getRevisions();

	/**
	 * Sets the revisions.
	 * 
	 * @param revisions the new revisions
	 */
	public void setRevisions(PagedList<Revision> revisions);
}