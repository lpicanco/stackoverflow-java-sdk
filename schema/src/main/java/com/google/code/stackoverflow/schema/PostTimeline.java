package com.google.code.stackoverflow.schema;

import java.util.Date;


/**
 * The Interface PostTimeline.
 */
public interface PostTimeline extends SchemaEntity {

	/**
	 * Gets the timeline type.
	 * 
	 * @return the timeline type
	 */
	public PostTimelineType getTimelineType();

	/**
	 * Sets the timeline type.
	 * 
	 * @param timelineType the new timeline type
	 */
	public void setTimelineType(PostTimelineType timelineType);

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
	 * Gets the action.
	 * 
	 * @return the action
	 */
	public String getAction();

	/**
	 * Sets the action.
	 * 
	 * @param action the new action
	 */
	public void setAction(String action);

	/**
	 * Gets the creation date.
	 * 
	 * @return the creation date
	 */
	public Date getCreationDate();

	/**
	 * Sets the creation date.
	 * 
	 * @param creationDate the new creation date
	 */
	public void setCreationDate(Date creationDate);

	/**
	 * Gets the user id.
	 * 
	 * @return the user id
	 */
	public User getUser();

	/**
	 * Sets the user id.
	 * 
	 * @param userId the new user id
	 */
	public void setUser(User user);

	/**
	 * Gets the owner display name.
	 * 
	 * @return the owner display name
	 */
	public User getOwner();

	/**
	 * Sets the owner display name.
	 * 
	 * @param ownerDisplayName the new owner display name
	 */
	public void setOwner(User owner);

	/**
	 * Gets the revision guid.
	 * 
	 * @return the revision guid
	 */
	public String getRevisionGuid();
	
	/**
	 * Sets the revision guid.
	 * 
	 * @param revisionGuid the new revision guid
	 */
	public void setRevisionGuid(String revisionGuid);
	
	/**
	 * Gets the comment id.
	 * 
	 * @return the comment id
	 */
	public long getCommentId();
	
	/**
	 * Sets the comment id.
	 * 
	 * @param commentId the new comment id
	 */
	public void setCommentId(long commentId);
	
	/**
	 * @return the postCommentUrl
	 */
	public String getPostCommentUrl();

	/**
	 * @param postCommentUrl the postCommentUrl to set
	 */
	public void setPostCommentUrl(String postCommentUrl);

	/**
	 * @return the postUrl
	 */
	public String getPostUrl();

	/**
	 * @param postUrl the postUrl to set
	 */
	public void setPostUrl(String postUrl);
	
	/**
	 * @return the postRevisionUrl
	 */
	public String getPostRevisionUrl();

	/**
	 * @param postRevisionUrl the postRevisionUrl to set
	 */
	public void setPostRevisionUrl(String postRevisionUrl);
	
}