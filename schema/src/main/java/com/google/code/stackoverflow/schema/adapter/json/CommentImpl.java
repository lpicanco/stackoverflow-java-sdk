/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.PostType;
import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class CommentImpl.
 */
public class CommentImpl extends BaseJsonAdapter implements Comment, Adaptable<Comment, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 9211122295203879070L;
	
	/** The comment id. */
	private long commentId;
	
	/** The creation date. */
	private Date creationDate;
	
	/** The owner display name. */
	private UserImpl owner;
	
	/** The post id. */
	private long postId;
	
	/** The post type. */
	private PostType postType;
	
	/** The body. */
	private String body;
	
	/** The reply to user id. */
	private UserImpl replyToUser;
	
	/** The score. */
	private long score;
	
	/** The edit count. */
	private long editCount;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#getCommentId()
	 */
	public long getCommentId() {
		return commentId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#setCommentId(long)
	 */
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#getCreationDate()
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#setCreationDate(java.util.Date)
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#getOwnerUserId()
	 */
	public User getOwner() {
		return owner;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#setOwnerUserId(long)
	 */
	public void setOwner(User owner) {
		this.owner = (UserImpl) owner;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#getPostId()
	 */
	public long getPostId() {
		return postId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#setPostId(long)
	 */
	public void setPostId(long postId) {
		this.postId = postId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#getPostType()
	 */
	public PostType getPostType() {
		return postType;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#setPostType(com.google.code.stackoverflow.schema.PostType)
	 */
	public void setPostType(PostType postType) {
		this.postType = postType;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#getBody()
	 */
	public String getBody() {
		return body;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#setBody(java.lang.String)
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#getReplyToUserId()
	 */
	public User getReplyToUser() {
		return replyToUser;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#setReplyToUserId(long)
	 */
	public void setReplyToUser(User replyToUser) {
		this.replyToUser = (UserImpl) replyToUser;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#getScore()
	 */
	public long getScore() {
		return score;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#setScore(long)
	 */
	public void setScore(long score) {
		this.score = score;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#getEditCount()
	 */
	public long getEditCount() {
		return editCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comment#setEditCount(long)
	 */
	public void setEditCount(long editCount) {
		this.editCount = editCount;
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
		JSONObject replyToUserJson = (JSONObject) adaptee.get("reply_to_user");
		if (replyToUserJson != null) {
			this.replyToUser = new UserImpl();
			replyToUser.adaptFrom(replyToUserJson);
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
}
