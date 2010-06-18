package com.google.code.stackexchange.schema;

import java.util.Date;

import com.google.code.stackexchange.schema.Reputation;

/**
 * The Class ReputationImpl.
 */
public class Reputation extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2066676039083125977L;
	
	/** The negative rep. */
	private long negativeRep;
	
	/** The on date. */
	private Date onDate;
	
	/** The positive rep. */
	private long positiveRep;
	
	/** The post id. */
	private long postId;
	
	/** The post type. */
	private PostType postType;
	
	/** The title. */
	private String title;

	/** The user id. */
	private long userId;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputation#getUserId()
	 */
	
	public long getUserId() {
		return userId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputation#setUserId(long)
	 */
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputation#getNegativeRep()
	 */
	
	public long getNegativeRep() {
		return negativeRep;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputation#getOnDate()
	 */
	
	public Date getOnDate() {
		return onDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputation#getPositiveRep()
	 */
	
	public long getPositiveRep() {
		return positiveRep;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputation#getPostId()
	 */
	
	public long getPostId() {
		return postId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputation#getPostType()
	 */
	
	public PostType getPostType() {
		return postType;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputation#getTitle()
	 */
	
	public String getTitle() {
		return title;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputation#setNegativeRep(long)
	 */
	
	public void setNegativeRep(long negativeRep) {
		this.negativeRep = negativeRep;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputation#setOnDate(java.util.Date)
	 */
	
	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputation#setPositiveRep(long)
	 */
	
	public void setPositiveRep(long positiveRep) {
		this.positiveRep = positiveRep;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputation#setPostId(long)
	 */
	
	public void setPostId(long postId) {
		this.postId = postId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputation#setPostType(com.google.code.stackexchange.schema.PostType)
	 */
	
	public void setPostType(PostType postType) {
		this.postType = postType;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputation#setTitle(java.lang.String)
	 */
	
	public void setTitle(String title) {
		this.title = title;
	}
}
