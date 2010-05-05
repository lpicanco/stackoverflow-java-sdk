/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.Answer;
import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class AnswerImpl.
 */
public class AnswerImpl extends BaseJsonAdapter implements Answer, Adaptable<Answer, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2188321598388034039L;
	
	/** The answer id. */
	private long answerId;
	
	/** The accepted. */
	private boolean accepted;
	
	/** The question id. */
	private long questionId;
	
	/** The owner user id. */
	private long ownerUserId;
	
	/** The owner display name. */
	private String ownerDisplayName;
	
	/** The creation date. */
	private Date creationDate;
	
	/** The last edit date. */
	private Date lastEditDate;
	
	/** The last activity date. */
	private Date lastActivityDate;
	
	/** The up vote count. */
	private long upVoteCount;
	
	/** The down vote count. */
	private long downVoteCount;
	
	/** The favorite count. */
	private long favoriteCount;
	
	/** The view count. */
	private long viewCount;
	
	/** The score. */
	private long score;
	
	/** The community owned. */
	private boolean communityOwned;
	
	/** The title. */
	private String title;
	
	/** The body. */
	private String body;
	
	/** The comments. */
	private List<Comment> comments = new ArrayList<Comment>();
	
	/** The owner email hash. */
	private String ownerEmailHash;
	
	/** The answer comments url. */
	private String answerCommentsUrl;
	
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getAnswerId()
	 */
	@Override
	public long getAnswerId() {
		return answerId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setAnswerId(long)
	 */
	@Override
	public void setAnswerId(long answerId) {
		this.answerId = answerId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#isAccepted()
	 */
	@Override
	public boolean isAccepted() {
		return accepted;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setAccepted(boolean)
	 */
	@Override
	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getQuestionId()
	 */
	@Override
	public long getQuestionId() {
		return questionId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setQuestionId(long)
	 */
	@Override
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getOwnerUserId()
	 */
	@Override
	public long getOwnerUserId() {
		return ownerUserId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setOwnerUserId(long)
	 */
	@Override
	public void setOwnerUserId(long ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getOwnerDisplayName()
	 */
	@Override
	public String getOwnerDisplayName() {
		return ownerDisplayName;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setOwnerDisplayName(java.lang.String)
	 */
	@Override
	public void setOwnerDisplayName(String ownerDisplayName) {
		this.ownerDisplayName = ownerDisplayName;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getCreationDate()
	 */
	@Override
	public Date getCreationDate() {
		return creationDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setCreationDate(java.util.Date)
	 */
	@Override
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getUpVoteCount()
	 */
	@Override
	public long getUpVoteCount() {
		return upVoteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setUpVoteCount(long)
	 */
	@Override
	public void setUpVoteCount(long upVoteCount) {
		this.upVoteCount = upVoteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getDownVoteCount()
	 */
	@Override
	public long getDownVoteCount() {
		return downVoteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setDownVoteCount(long)
	 */
	@Override
	public void setDownVoteCount(long downVoteCount) {
		this.downVoteCount = downVoteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getFavoriteCount()
	 */
	@Override
	public long getFavoriteCount() {
		return favoriteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setFavoriteCount(long)
	 */
	@Override
	public void setFavoriteCount(long favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getViewCount()
	 */
	@Override
	public long getViewCount() {
		return viewCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setViewCount(long)
	 */
	@Override
	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getScore()
	 */
	@Override
	public long getScore() {
		return score;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setScore(long)
	 */
	@Override
	public void setScore(long score) {
		this.score = score;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#isCommunityOwned()
	 */
	@Override
	public boolean isCommunityOwned() {
		return communityOwned;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setCommunityOwned(boolean)
	 */
	@Override
	public void setCommunityOwned(boolean communityOwned) {
		this.communityOwned = communityOwned;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setTitle(java.lang.String)
	 */
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getBody()
	 */
	@Override
	public String getBody() {
		return body;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setBody(java.lang.String)
	 */
	@Override
	public void setBody(String body) {
		this.body = body;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getComments()
	 */
	@Override
	public List<Comment> getComments() {
		return comments;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setComments(java.util.List)
	 */
	@Override
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getLastEditDate()
	 */
	@Override
	public Date getLastEditDate() {
		return lastEditDate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setLastEditDate(java.util.Date)
	 */
	@Override
	public void setLastEditDate(Date lastEditDate) {
		this.lastEditDate = lastEditDate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getLastActivityDate()
	 */
	@Override
	public Date getLastActivityDate() {
		return lastActivityDate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setLastActivityDate(java.util.Date)
	 */
	@Override
	public void setLastActivityDate(Date lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getOwnerEmailHash()
	 */
	@Override
	public String getOwnerEmailHash() {
		return ownerEmailHash;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setOwnerEmailHash(java.lang.String)
	 */
	@Override
	public void setOwnerEmailHash(String ownerEmailHash) {
		this.ownerEmailHash = ownerEmailHash;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#getAnswerCommentsUrl()
	 */
	@Override
	public String getAnswerCommentsUrl() {
		return answerCommentsUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answer#setAnswerCommentsUrl(java.lang.String)
	 */
	@Override
	public void setAnswerCommentsUrl(String answerCommentsUrl) {
		this.answerCommentsUrl = answerCommentsUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
		JSONArray comments = (JSONArray) adaptee.get("comments");
		if (comments != null) {
			for (Object o : comments) {			
				CommentImpl comment = new CommentImpl();
				comment.adaptFrom((JSONObject) o);
				getComments().add(comment);
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptTo()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		JSONArray comments = new JSONArray();
		for (Comment comment : getComments()) {
			comments.add(((CommentImpl) comment).adaptTo());
		}
		adapter.put("comments", comments);
		return adapter;
	}
}
