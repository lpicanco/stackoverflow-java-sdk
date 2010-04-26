/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.PostTimelineType;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class PostTimelineImpl extends BaseJsonAdapter implements PostTimeline, Adaptable<PostTimeline, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1401085998475480138L;
	
	private PostTimelineType timelineType;
	private long postId;
	private long userId;
	private long ownerUserId;
	private String action;
	private Date creationDate;
	private String revisionGuid;
	private long commentId;
	
	public PostTimelineType getTimelineType() {
		return timelineType;
	}
	
	public void setTimelineType(PostTimelineType timelineType) {
		this.timelineType = timelineType;
	}
	
	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
	}

	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public long getOwnerUserId() {
		return ownerUserId;
	}

	@Override
	public void setOwnerUserId(long ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	@Override
	public String getRevisionGuid() {
		return revisionGuid;
	}

	@Override
	public void setRevisionGuid(String revisionGuid) {
		this.revisionGuid = revisionGuid;
	}

	@Override
	public long getCommentId() {
		return commentId;
	}

	@Override
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
}