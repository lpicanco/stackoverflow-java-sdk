/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.PostTimelineType;
import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class PostTimelineImpl.
 */
public class PostTimelineImpl extends BaseJsonAdapter implements PostTimeline, Adaptable<PostTimeline, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1401085998475480138L;
	
	/** The timeline type. */
	private PostTimelineType timelineType;
	
	/** The post id. */
	private long postId;
	
	/** The user id. */
	private UserImpl user;
	
	/** The owner user id. */
	private UserImpl owner;
	
	/** The action. */
	private String action;
	
	/** The creation date. */
	private Date creationDate;
	
	/** The revision guid. */
	private String revisionGuid;
	
	/** The comment id. */
	private long commentId;
	
	private String displayName;
	private String postCommentUrl;
	private String emailHash;
	private String postUrl;
	private String postRevisionUrl;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#getTimelineType()
	 */
	public PostTimelineType getTimelineType() {
		return timelineType;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#setTimelineType(com.google.code.stackoverflow.schema.PostTimelineType)
	 */
	public void setTimelineType(PostTimelineType timelineType) {
		this.timelineType = timelineType;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#getPostId()
	 */
	public long getPostId() {
		return postId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#setPostId(long)
	 */
	public void setPostId(long postId) {
		this.postId = postId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#getAction()
	 */
	public String getAction() {
		return action;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#setAction(java.lang.String)
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#getCreationDate()
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#setCreationDate(java.util.Date)
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#getUserId()
	 */
	public User getUser() {
		return user;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#setUserId(long)
	 */
	public void setUser(User user) {
		this.user = (UserImpl) user;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
		JSONObject ownerJson = (JSONObject) adaptee.get("owner");
		if (ownerJson != null) {
			this.owner = new UserImpl();
			owner.adaptFrom(ownerJson);
		}
		JSONObject userJson = (JSONObject) adaptee.get("user");
		if (userJson != null) {
			this.user = new UserImpl();
			user.adaptFrom(userJson);
		}
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
	 * @see com.google.code.stackoverflow.schema.PostTimeline#getOwnerUserId()
	 */
	@Override
	public User getOwner() {
		return owner;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#setOwnerUserId(long)
	 */
	@Override
	public void setOwner(User owner) {
		this.owner = (UserImpl) owner;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#getRevisionGuid()
	 */
	@Override
	public String getRevisionGuid() {
		return revisionGuid;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#setRevisionGuid(java.lang.String)
	 */
	@Override
	public void setRevisionGuid(String revisionGuid) {
		this.revisionGuid = revisionGuid;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#getCommentId()
	 */
	@Override
	public long getCommentId() {
		return commentId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimeline#setCommentId(long)
	 */
	@Override
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the postCommentUrl
	 */
	public String getPostCommentUrl() {
		return postCommentUrl;
	}

	/**
	 * @param postCommentUrl the postCommentUrl to set
	 */
	public void setPostCommentUrl(String postCommentUrl) {
		this.postCommentUrl = postCommentUrl;
	}

	/**
	 * @return the emailHash
	 */
	public String getEmailHash() {
		return emailHash;
	}

	/**
	 * @param emailHash the emailHash to set
	 */
	public void setEmailHash(String emailHash) {
		this.emailHash = emailHash;
	}

	/**
	 * @return the postUrl
	 */
	public String getPostUrl() {
		return postUrl;
	}

	/**
	 * @param postUrl the postUrl to set
	 */
	public void setPostUrl(String postUrl) {
		this.postUrl = postUrl;
	}

	/**
	 * @return the postRevisionUrl
	 */
	public String getPostRevisionUrl() {
		return postRevisionUrl;
	}

	/**
	 * @param postRevisionUrl the postRevisionUrl to set
	 */
	public void setPostRevisionUrl(String postRevisionUrl) {
		this.postRevisionUrl = postRevisionUrl;
	}
}
