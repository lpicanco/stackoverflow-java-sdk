package com.google.code.stackoverflow.schema;

import java.util.List;

public interface Comments extends SchemaEntity {

	/**
	 * @return the comments
	 */
	public List<Comment> getComments();

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<Comment> comments);

}