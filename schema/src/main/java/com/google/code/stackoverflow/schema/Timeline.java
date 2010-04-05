package com.google.code.stackoverflow.schema;

import java.util.Date;


public interface Timeline extends SchemaEntity {

	/**
	 * @return the timeline_type
	 */
	public TimelineType getTimelineType();

	/**
	 * @param timeline_type the timeline_type to set
	 */
	public void setTimelineType(TimelineType timelineType);

	/**
	 * @return the post_id
	 */
	public long getPostId();

	/**
	 * @param post_id the post_id to set
	 */
	public void setPostId(long postId);

	/**
	 * @return the action
	 */
	public String getAction();

	/**
	 * @param action the action to set
	 */
	public void setAction(String action);

	/**
	 * @return the creation_date
	 */
	public Date getCreationDate();

	/**
	 * @param creation_date the creation_date to set
	 */
	public void setCreationDate(Date creationDate);

	/**
	 * @return the description
	 */
	public String getDescription();

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description);

	/**
	 * @return the detail
	 */
	public String getDetail();

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail);

	/**
	 * @return the actionUserId
	 */
	public long getActionUserId();

	/**
	 * @param actionUserId the actionUserId to set
	 */
	public void setActionUserId(long actionUserId);

}