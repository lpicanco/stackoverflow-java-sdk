/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.PostType;
import com.google.code.stackoverflow.schema.UserTimeline;
import com.google.code.stackoverflow.schema.UserTimelineType;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class UserTimelineImpl.
 */
public class UserTimelineImpl extends BaseJsonAdapter implements UserTimeline, Adaptable<UserTimeline, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1401085998475480138L;
	
	/** The timeline type. */
	private UserTimelineType timelineType;
	
	/** The post id. */
	private long postId;
	
	/** The user id. */
	private long userId;
	
	/** The action. */
	private String action;
	
	/** The creation date. */
	private Date creationDate;
	
	/** The description. */
	private String description;
	
	/** The detail. */
	private String detail;
	
	/** The comment id. */
	private long commentId;
	
	/** The post type. */
	private PostType postType;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#getTimelineType()
	 */
	public UserTimelineType getTimelineType() {
		return timelineType;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#setTimelineType(com.google.code.stackoverflow.schema.UserTimelineType)
	 */
	public void setTimelineType(UserTimelineType timelineType) {
		this.timelineType = timelineType;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#getPostId()
	 */
	public long getPostId() {
		return postId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#setPostId(long)
	 */
	public void setPostId(long postId) {
		this.postId = postId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#getAction()
	 */
	public String getAction() {
		return action;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#setAction(java.lang.String)
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#getCreationDate()
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#setCreationDate(java.util.Date)
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#getDescription()
	 */
	public String getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#setDescription(java.lang.String)
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#getDetail()
	 */
	public String getDetail() {
		return detail;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#setDetail(java.lang.String)
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#getUserId()
	 */
	public long getUserId() {
		return userId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#setUserId(long)
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#getCommentId()
	 */
	@Override
	public long getCommentId() {
		return commentId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#setCommentId(long)
	 */
	@Override
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#getPostType()
	 */
	@Override
	public PostType getPostType() {
		return postType;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimeline#setPostType(com.google.code.stackoverflow.schema.PostType)
	 */
	@Override
	public void setPostType(PostType postType) {
		this.postType = postType;
	}
}
