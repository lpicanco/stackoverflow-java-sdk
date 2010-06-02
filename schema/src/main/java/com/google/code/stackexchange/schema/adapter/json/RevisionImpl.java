/**
 * 
 */
package com.google.code.stackexchange.schema.adapter.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackexchange.schema.Revision;
import com.google.code.stackexchange.schema.RevisionType;
import com.google.code.stackexchange.schema.User;
import com.google.code.stackexchange.schema.adapter.Adaptable;

/**
 * The Class RevisionImpl.
 */
public class RevisionImpl extends BaseJsonAdapter implements Revision, Adaptable<Revision, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3250755748395530450L;
	
	/** The comment. */
	private String comment;
	
	/** The creation date. */
	private Date creationDate;
	
	/** The is question. */
	private boolean isQuestion;
	
	/** The is rollback. */
	private boolean isRollback;
	
	/** The last tags. */
	private List<String> lastTags = new ArrayList<String>();
	
	/** The revision guid. */
	private String revisionGuid;
	
	/** The revision number. */
	private long revisionNumber;
	
	/** The tags. */
	private List<String> tags = new ArrayList<String>();
	
	/** The revision type. */
	private RevisionType revisionType;
	
	/** The set community wiki. */
	private boolean setCommunityWiki;
	
	/** The user. */
	private UserImpl user;
	
	/** The body. */
	private String body;
	
	/** The title. */
	private String title;
	
	/** The last body. */
	private String lastBody;
	
	/** The last title. */
	private String lastTitle;
	
	/** The post id. */
	private long postId;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#getPostId()
	 */
	public long getPostId() {
		return postId;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setPostId(long)
	 */
	public void setPostId(long postId) {
		this.postId = postId;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#getComment()
	 */
	public String getComment() {
		return comment;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setComment(java.lang.String)
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#getCreationDate()
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setCreationDate(java.util.Date)
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#isQuestion()
	 */
	public boolean isQuestion() {
		return isQuestion;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setQuestion(boolean)
	 */
	public void setQuestion(boolean isQuestion) {
		this.isQuestion = isQuestion;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#isRollback()
	 */
	public boolean isRollback() {
		return isRollback;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setRollback(boolean)
	 */
	public void setRollback(boolean isRollback) {
		this.isRollback = isRollback;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#getLastTags()
	 */
	public List<String> getLastTags() {
		return lastTags;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setLastTags(java.util.List)
	 */
	public void setLastTags(List<String> lastTags) {
		this.lastTags = lastTags;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#getRevisionGuid()
	 */
	public String getRevisionGuid() {
		return revisionGuid;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setRevisionGuid(java.lang.String)
	 */
	public void setRevisionGuid(String revisionGuid) {
		this.revisionGuid = revisionGuid;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#getRevisionNumber()
	 */
	public long getRevisionNumber() {
		return revisionNumber;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setRevisionNumber(long)
	 */
	public void setRevisionNumber(long revisionNumber) {
		this.revisionNumber = revisionNumber;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#getTags()
	 */
	public List<String> getTags() {
		return tags;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setTags(java.util.List)
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#getRevisionType()
	 */
	public RevisionType getRevisionType() {
		return revisionType;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setRevisionType(com.google.code.stackexchange.schema.RevisionType)
	 */
	public void setRevisionType(RevisionType revisionType) {
		this.revisionType = revisionType;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#isSetCommunityWiki()
	 */
	public boolean isSetCommunityWiki() {
		return setCommunityWiki;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setSetCommunityWiki(boolean)
	 */
	public void setSetCommunityWiki(boolean setCommunityWiki) {
		this.setCommunityWiki = setCommunityWiki;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#getUserId()
	 */
	public User getUser() {
		return user;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setUserId(long)
	 */
	public void setUser(User user) {
		this.user = (UserImpl) user;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#getBody()
	 */
	public String getBody() {
		return body;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setBody(java.lang.String)
	 */
	public void setBody(String body) {
		this.body = body;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#getTitle()
	 */
	public String getTitle() {
		return title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setTitle(java.lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#getLastBody()
	 */
	public String getLastBody() {
		return lastBody;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setLastBody(java.lang.String)
	 */
	public void setLastBody(String lastBody) {
		this.lastBody = lastBody;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#getLastTitle()
	 */
	public String getLastTitle() {
		return lastTitle;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revision#setLastTitle(java.lang.String)
	 */
	public void setLastTitle(String lastTitle) {
		this.lastTitle = lastTitle;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
		JSONObject userJson = (JSONObject) adaptee.get("user");
		if (userJson != null) {
			this.user = new UserImpl();
			user.adaptFrom(userJson);
		}
		JSONArray tags = (JSONArray) adaptee.get("tags");
		if (tags != null) {
			for (String tag : (Iterable<String>) tags) {
				getTags().add(tag);
			}
		}
		JSONArray lastTags = (JSONArray) adaptee.get("last_tags");
		if (lastTags != null) {
			for (String tag : (Iterable<String>) lastTags) {
				getLastTags().add(tag);
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		
		JSONArray tags = new JSONArray();
		for (String tag : getTags()) {
			tags.add(tag);
		}
		adapter.put("tags", tags);
		
		JSONArray lastTags = new JSONArray();
		for (String tag : getLastTags()) {
			lastTags.add(tag);
		}
		adapter.put("last_tags", lastTags);
		
		return adapter;
	}

}
