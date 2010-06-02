package com.google.code.stackexchange.schema;

import java.util.Date;


/**
 * The Interface Reputation.
 */
public interface Reputation extends SchemaEntity {

	/**
	 * Gets the on date.
	 * 
	 * @return the on date
	 */
	public Date getOnDate();

	/**
	 * Sets the on date.
	 * 
	 * @param onDate the new on date
	 */
	public void setOnDate(Date onDate);

	/**
	 * Gets the post id.
	 * 
	 * @return the post id
	 */
	public long getPostId();

	/**
	 * Sets the post id.
	 * 
	 * @param postId the new post id
	 */
	public void setPostId(long postId);

	/**
	 * Gets the post type.
	 * 
	 * @return the post type
	 */
	public PostType getPostType();

	/**
	 * Sets the post type.
	 * 
	 * @param postType the new post type
	 */
	public void setPostType(PostType postType);

	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle();

	/**
	 * Sets the title.
	 * 
	 * @param title the new title
	 */
	public void setTitle(String title);

	/**
	 * Gets the positive rep.
	 * 
	 * @return the positive rep
	 */
	public long getPositiveRep();

	/**
	 * Sets the positive rep.
	 * 
	 * @param positiveRep the new positive rep
	 */
	public void setPositiveRep(long positiveRep);

	/**
	 * Gets the negative rep.
	 * 
	 * @return the negative rep
	 */
	public long getNegativeRep();

	/**
	 * Sets the negative rep.
	 * 
	 * @param negativeRep the new negative rep
	 */
	public void setNegativeRep(long negativeRep);

	/**
	 * Gets the user id.
	 * 
	 * @return the user id
	 */
	public long getUserId();

	/**
	 * Sets the user id.
	 * 
	 * @param userId the new user id
	 */
	public void setUserId(long userId);
}