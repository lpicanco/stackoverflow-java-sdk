package com.google.code.stackoverflow.schema;


import com.google.code.stackoverflow.client.common.PagedList;

/**
 * The Interface Comments.
 */
public interface Comments extends SchemaEntity {

	/**
	 * Gets the comments.
	 * 
	 * @return the comments
	 */
	public PagedList<Comment> getComments();

	/**
	 * Sets the comments.
	 * 
	 * @param comments the new comments
	 */
	public void setComments(PagedList<Comment> comments);

}