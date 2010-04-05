/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.Timeline;
import com.google.code.stackoverflow.schema.TimelineType;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class TimelineImpl extends BaseJsonAdapter implements Timeline, Adaptable<Timeline, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1401085998475480138L;
	
	private TimelineType timelineType;
	private long postId;
	private long actionUserId;
	private String action;
	private Date creationDate;
	private String description;
	private String detail;
	
	public TimelineType getTimelineType() {
		return timelineType;
	}
	
	public void setTimelineType(TimelineType timelineType) {
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
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public long getActionUserId() {
		return actionUserId;
	}

	public void setActionUserId(long actionUserId) {
		this.actionUserId = actionUserId;
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
}
