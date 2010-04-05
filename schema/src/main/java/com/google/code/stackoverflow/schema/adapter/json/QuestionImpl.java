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
import com.google.code.stackoverflow.schema.Question;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class QuestionImpl extends BaseJsonAdapter implements Question, Adaptable<Question, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8343229589647315647L;
	
	private long answerCount;
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
	private List<String> tags = new ArrayList<String>();
	private List<Answer> answers = new ArrayList<Answer>();
	

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public long getAnswerCount() {
		return answerCount;
	}

	public void setAnswerCount(long answerCount) {
		this.answerCount = answerCount;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public long getOwnerUserId() {
		return ownerUserId;
	}

	public void setOwnerUserId(long ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public String getOwnerDisplayName() {
		return ownerDisplayName;
	}

	public void setOwnerDisplayName(String ownerDisplayName) {
		this.ownerDisplayName = ownerDisplayName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastEditDate() {
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate) {
		this.lastEditDate = lastEditDate;
	}

	public Date getLastActivityDate() {
		return lastActivityDate;
	}

	public void setLastActivityDate(Date lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}

	public long getUpVoteCount() {
		return upVoteCount;
	}

	public void setUpVoteCount(long upVoteCount) {
		this.upVoteCount = upVoteCount;
	}

	public long getDownVoteCount() {
		return downVoteCount;
	}

	public void setDownVoteCount(long downVoteCount) {
		this.downVoteCount = downVoteCount;
	}

	public long getFavoriteCount() {
		return favoriteCount;
	}

	public void setFavoriteCount(long favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	public long getViewCount() {
		return viewCount;
	}

	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	public boolean isCommunityOwned() {
		return communityOwned;
	}

	public void setCommunityOwned(boolean communityOwned) {
		this.communityOwned = communityOwned;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
		JSONArray answers = (JSONArray) adaptee.get("answers");
		if (answers != null) {
			for (Object o : answers) {			
				AnswerImpl answer = new AnswerImpl();
				answer.adaptFrom((JSONObject) o);
				getAnswers().add(answer);
			}
		}
		JSONArray tags = (JSONArray) adaptee.get("tags");
		if (tags != null) {
			for (String tag : (Iterable<String>) tags) {
				getTags().add(tag);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		JSONArray answers = new JSONArray();
		for (Answer answer : getAnswers()) {
			answers.add(((AnswerImpl) answer).adaptTo());
		}
		adapter.put("answers", answers);
		
		JSONArray tags = new JSONArray();
		for (String tag : getTags()) {
			tags.add(tag);
		}
		adapter.put("tags", tags);
		return adapter;
	}
}
