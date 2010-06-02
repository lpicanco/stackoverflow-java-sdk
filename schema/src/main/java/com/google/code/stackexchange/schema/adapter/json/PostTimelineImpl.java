/**
 * 
 */
package com.google.code.stackexchange.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.stackexchange.schema.PostTimeline;
import com.google.code.stackexchange.schema.PostTimelineType;
import com.google.code.stackexchange.schema.User;
import com.google.code.stackexchange.schema.adapter.Adaptable;

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
	
	/** The user. */
	private UserImpl user;
	
	/** The owner. */
	private UserImpl owner;
	
	/** The action. */
	private String action;
	
	/** The creation date. */
	private Date creationDate;
	
	/** The revision guid. */
	private String revisionGuid;
	
	/** The comment id. */
	private long commentId;
	
	/** The display name. */
	private String displayName;
	
	/** The post comment url. */
	private String postCommentUrl;
	
	/** The email hash. */
	private String emailHash;
	
	/** The post url. */
	private String postUrl;
	
	/** The post revision url. */
	private String postRevisionUrl;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#getTimelineType()
	 */
	public PostTimelineType getTimelineType() {
		return timelineType;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#setTimelineType(com.google.code.stackexchange.schema.PostTimelineType)
	 */
	public void setTimelineType(PostTimelineType timelineType) {
		this.timelineType = timelineType;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#getPostId()
	 */
	public long getPostId() {
		return postId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#setPostId(long)
	 */
	public void setPostId(long postId) {
		this.postId = postId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#getAction()
	 */
	public String getAction() {
		return action;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#setAction(java.lang.String)
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#getCreationDate()
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#setCreationDate(java.util.Date)
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#getUserId()
	 */
	public User getUser() {
		return user;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#setUserId(long)
	 */
	public void setUser(User user) {
		this.user = (UserImpl) user;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
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
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#getOwnerUserId()
	 */
	@Override
	public User getOwner() {
		return owner;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#setOwnerUserId(long)
	 */
	@Override
	public void setOwner(User owner) {
		this.owner = (UserImpl) owner;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#getRevisionGuid()
	 */
	@Override
	public String getRevisionGuid() {
		return revisionGuid;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#setRevisionGuid(java.lang.String)
	 */
	@Override
	public void setRevisionGuid(String revisionGuid) {
		this.revisionGuid = revisionGuid;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#getCommentId()
	 */
	@Override
	public long getCommentId() {
		return commentId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#setCommentId(long)
	 */
	@Override
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}

	/**
	 * Gets the display name.
	 * 
	 * @return the display name
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the display name.
	 * 
	 * @param displayName the new display name
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#getPostCommentUrl()
	 */
	public String getPostCommentUrl() {
		return postCommentUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#setPostCommentUrl(java.lang.String)
	 */
	public void setPostCommentUrl(String postCommentUrl) {
		this.postCommentUrl = postCommentUrl;
	}

	/**
	 * Gets the email hash.
	 * 
	 * @return the email hash
	 */
	public String getEmailHash() {
		return emailHash;
	}

	/**
	 * Sets the email hash.
	 * 
	 * @param emailHash the new email hash
	 */
	public void setEmailHash(String emailHash) {
		this.emailHash = emailHash;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#getPostUrl()
	 */
	public String getPostUrl() {
		return postUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#setPostUrl(java.lang.String)
	 */
	public void setPostUrl(String postUrl) {
		this.postUrl = postUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#getPostRevisionUrl()
	 */
	public String getPostRevisionUrl() {
		return postRevisionUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimeline#setPostRevisionUrl(java.lang.String)
	 */
	public void setPostRevisionUrl(String postRevisionUrl) {
		this.postRevisionUrl = postRevisionUrl;
	}
}
