package com.google.code.stackexchange.schema;

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
	 * Gets the user.
	 * 
	 * @return the user
	 */
	public User getUser();

	/**
	 * Sets the user.
	 * 
	 * @param user the new user
	 */
	public void setUser(User user);

	/**
	 * Gets the owner.
	 * 
	 * @return the owner
	 */
	public User getOwner();

	/**
	 * Sets the owner.
	 * 
	 * @param owner the new owner
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
	 * Gets the post comment url.
	 * 
	 * @return the post comment url
	 */
	public String getPostCommentUrl();

	/**
	 * Sets the post comment url.
	 * 
	 * @param postCommentUrl the new post comment url
	 */
	public void setPostCommentUrl(String postCommentUrl);

	/**
	 * Gets the post url.
	 * 
	 * @return the post url
	 */
	public String getPostUrl();

	/**
	 * Sets the post url.
	 * 
	 * @param postUrl the new post url
	 */
	public void setPostUrl(String postUrl);
	
	/**
	 * Gets the post revision url.
	 * 
	 * @return the post revision url
	 */
	public String getPostRevisionUrl();

	/**
	 * Sets the post revision url.
	 * 
	 * @param postRevisionUrl the new post revision url
	 */
	public void setPostRevisionUrl(String postRevisionUrl);
	
}