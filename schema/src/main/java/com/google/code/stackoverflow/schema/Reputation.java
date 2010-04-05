package com.google.code.stackoverflow.schema;

import java.util.Date;


public interface Reputation extends SchemaEntity {

	/**
	 * @return the onDate
	 */
	public Date getOnDate();

	/**
	 * @param onDate the creationDate to set
	 */
	public void setOnDate(Date onDate);

	/**
	 * @return the postId
	 */
	public long getPostId();

	/**
	 * @param postId the postId to set
	 */
	public void setPostId(long postId);

	/**
	 * @return the postType
	 */
	public PostType getPostType();

	/**
	 * @param postType the postType to set
	 */
	public void setPostType(PostType postType);

	/**
	 * @return the body
	 */
	public String getTitle();

	/**
	 * @param title the body to set
	 */
	public void setTitle(String title);

	/**
	 * @return the positiveRep
	 */
	public long getPositiveRep();

	/**
	 * @param positiveRep the score to set
	 */
	public void setPositiveRep(long positiveRep);

	/**
	 * @return the negativeRep
	 */
	public long getNegativeRep();

	/**
	 * @param negativeRep the negativeRep to set
	 */
	public void setNegativeRep(long negativeRep);

}