/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.Revision;
import com.google.code.stackoverflow.schema.RevisionType;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class RevisionImpl extends BaseJsonAdapter implements Revision, Adaptable<Revision, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3250755748395530450L;
	
	private String comment;
	private Date creationDate;
	private boolean isQuestion;
	private boolean isRollback;
	private List<String> lastTags = new ArrayList<String>();
	private String revisionGuid;
	private long revisionNumber;
	private List<String> tags = new ArrayList<String>();
	private RevisionType revisionType;
	private boolean setCommunityWiki;
	private long userId;
	private String body;
	private String title;
	private String lastBody;
	private String lastTitle;
	
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	/**
	 * @return the isQuestion
	 */
	public boolean isQuestion() {
		return isQuestion;
	}
	/**
	 * @param isQuestion the isQuestion to set
	 */
	public void setQuestion(boolean isQuestion) {
		this.isQuestion = isQuestion;
	}
	/**
	 * @return the isRollback
	 */
	public boolean isRollback() {
		return isRollback;
	}
	/**
	 * @param isRollback the isRollback to set
	 */
	public void setRollback(boolean isRollback) {
		this.isRollback = isRollback;
	}
	/**
	 * @return the lastTags
	 */
	public List<String> getLastTags() {
		return lastTags;
	}
	/**
	 * @param lastTags the lastTags to set
	 */
	public void setLastTags(List<String> lastTags) {
		this.lastTags = lastTags;
	}
	/**
	 * @return the revisionGuid
	 */
	public String getRevisionGuid() {
		return revisionGuid;
	}
	/**
	 * @param revisionGuid the revisionGuid to set
	 */
	public void setRevisionGuid(String revisionGuid) {
		this.revisionGuid = revisionGuid;
	}
	/**
	 * @return the revisionNumber
	 */
	public long getRevisionNumber() {
		return revisionNumber;
	}
	/**
	 * @param revisionNumber the revisionNumber to set
	 */
	public void setRevisionNumber(long revisionNumber) {
		this.revisionNumber = revisionNumber;
	}
	/**
	 * @return the tags
	 */
	public List<String> getTags() {
		return tags;
	}
	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	/**
	 * @return the revisionType
	 */
	public RevisionType getRevisionType() {
		return revisionType;
	}
	/**
	 * @param revisionType the revisionType to set
	 */
	public void setRevisionType(RevisionType revisionType) {
		this.revisionType = revisionType;
	}
	/**
	 * @return the setCommunityWiki
	 */
	public boolean isSetCommunityWiki() {
		return setCommunityWiki;
	}
	/**
	 * @param setCommunityWiki the setCommunityWiki to set
	 */
	public void setSetCommunityWiki(boolean setCommunityWiki) {
		this.setCommunityWiki = setCommunityWiki;
	}
	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}
	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}
	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the lastBody
	 */
	public String getLastBody() {
		return lastBody;
	}
	/**
	 * @param lastBody the lastBody to set
	 */
	public void setLastBody(String lastBody) {
		this.lastBody = lastBody;
	}
	/**
	 * @return the lastTitle
	 */
	public String getLastTitle() {
		return lastTitle;
	}
	/**
	 * @param lastTitle the lastTitle to set
	 */
	public void setLastTitle(String lastTitle) {
		this.lastTitle = lastTitle;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
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
