package com.google.code.stackoverflow.schema;

import java.util.List;

/**
 * The Interface Revisions.
 */
public interface Revisions extends SchemaEntity {

	/**
	 * Gets the revisions.
	 * 
	 * @return the revisions
	 */
	public List<Revision> getRevisions();

	/**
	 * Sets the revisions.
	 * 
	 * @param revisions the new revisions
	 */
	public void setRevisions(List<Revision> revisions);
}