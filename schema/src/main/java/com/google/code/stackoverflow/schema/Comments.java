package com.google.code.stackoverflow.schema;

import java.util.List;

/**
 * The Interface Comments.
 */
public interface Comments extends SchemaEntity {

	/**
	 * Gets the comments.
	 * 
	 * @return the comments
	 */
	public List<Comment> getComments();

	/**
	 * Sets the comments.
	 * 
	 * @param comments the new comments
	 */
	public void setComments(List<Comment> comments);

}