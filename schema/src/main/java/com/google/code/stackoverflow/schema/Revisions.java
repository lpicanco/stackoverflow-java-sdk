package com.google.code.stackoverflow.schema;

import java.util.List;

public interface Revisions extends SchemaEntity {

	/**
	 * @return the revisions
	 */
	public List<Revision> getRevisions();

	/**
	 * @param revisions the reputations to set
	 */
	public void setRevisions(List<Revision> revisions);
}