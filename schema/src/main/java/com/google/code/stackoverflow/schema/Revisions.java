package com.google.code.stackoverflow.schema;


import com.google.code.stackoverflow.client.common.PagedList;

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