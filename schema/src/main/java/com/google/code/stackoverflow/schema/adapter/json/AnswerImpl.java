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
 * @author nmukhtar
 *
 */
public class AnswerImpl extends BaseJsonAdapter implements Answer, Adaptable<Answer, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2188321598388034039L;
	
	private long answerId;
	private boolean accepted;
	private long questionId;
	private long ownerUserId;
	private String ownerDisplayName;
	private Date creationDate;
	private Date lastEditDate;
	private Date lastActivityDate;
	private long upVoteCount;
	private long downVoteCount;
	private long favoriteCount;
	private long viewCount;
	private long score;
	private boolean communityOwned;
	private String title;
	private String body;
	private List<Comment> comments = new ArrayList<Comment>();
	private String ownerEmailHash;
	private String answerCommentsUrl;
	
	
	@Override
	public long getAnswerId() {
		return answerId;
	}

	@Override
	public void setAnswerId(long answerId) {
		this.answerId = answerId;
	}

	@Override
	public boolean isAccepted() {
		return accepted;
	}

	@Override
	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	@Override
	public long getQuestionId() {
		return questionId;
	}

	@Override
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
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
	public String getOwnerDisplayName() {
		return ownerDisplayName;
	}

	@Override
	public void setOwnerDisplayName(String ownerDisplayName) {
		this.ownerDisplayName = ownerDisplayName;
	}

	@Override
	public Date getCreationDate() {
		return creationDate;
	}

	@Override
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public long getUpVoteCount() {
		return upVoteCount;
	}

	@Override
	public void setUpVoteCount(long upVoteCount) {
		this.upVoteCount = upVoteCount;
	}

	@Override
	public long getDownVoteCount() {
		return downVoteCount;
	}

	@Override
	public void setDownVoteCount(long downVoteCount) {
		this.downVoteCount = downVoteCount;
	}

	@Override
	public long getFavoriteCount() {
		return favoriteCount;
	}

	@Override
	public void setFavoriteCount(long favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	@Override
	public long getViewCount() {
		return viewCount;
	}

	@Override
	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}

	@Override
	public long getScore() {
		return score;
	}

	@Override
	public void setScore(long score) {
		this.score = score;
	}

	@Override
	public boolean isCommunityOwned() {
		return communityOwned;
	}

	@Override
	public void setCommunityOwned(boolean communityOwned) {
		this.communityOwned = communityOwned;
	}
	
	@Override
	public String getTitle() {
		return title;
	}
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	
	@Override
	public String getBody() {
		return body;
	}

	@Override
	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public List<Comment> getComments() {
		return comments;
	}

	@Override
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public Date getLastEditDate() {
		return lastEditDate;
	}
	
	@Override
	public void setLastEditDate(Date lastEditDate) {
		this.lastEditDate = lastEditDate;
	}
	
	@Override
	public Date getLastActivityDate() {
		return lastActivityDate;
	}
	
	@Override
	public void setLastActivityDate(Date lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}
	
	@Override
	public String getOwnerEmailHash() {
		return ownerEmailHash;
	}

	@Override
	public void setOwnerEmailHash(String ownerEmailHash) {
		this.ownerEmailHash = ownerEmailHash;
	}

	@Override
	public String getAnswerCommentsUrl() {
		return answerCommentsUrl;
	}

	@Override
	public void setAnswerCommentsUrl(String answerCommentsUrl) {
		this.answerCommentsUrl = answerCommentsUrl;
	}

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
