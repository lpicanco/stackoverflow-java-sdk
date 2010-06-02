package com.google.code.stackexchange.schema;

import java.util.Date;


/**
 * The Interface UserTimeline.
 */
public interface UserTimeline extends SchemaEntity {

	/**
	 * Gets the timeline type.
	 * 
	 * @return the timeline type
	 */
	public UserTimelineType getTimelineType();

	/**
	 * Sets the timeline type.
	 * 
	 * @param timelineType the new timeline type
	 */
	public void setTimelineType(UserTimelineType timelineType);

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
	 * Gets the description.
	 * 
	 * @return the description
	 */
	public String getDescription();

	/**
	 * Sets the description.
	 * 
	 * @param description the new description
	 */
	public void setDescription(String description);

	/**
	 * Gets the detail.
	 * 
	 * @return the detail
	 */
	public String getDetail();

	/**
	 * Sets the detail.
	 * 
	 * @param detail the new detail
	 */
	public void setDetail(String detail);

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
}