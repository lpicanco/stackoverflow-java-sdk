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
	private List<Comment> comments = new ArrayList<Comment>();
	private long acceptedAnswerId;
	private String body;
	private Date closedDate;
	private String closedReason;
	private Date lockedDate;
	private Date bountyClosesDate;
	private long bountyAmount;
	
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
	
	@Override
	public List<Comment> getComments() {
		return comments;
	}

	@Override
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	/**
	 * @return the acceptedAnswerId
	 */
	@Override
	public long getAcceptedAnswerId() {
		return acceptedAnswerId;
	}

	/**
	 * @param acceptedAnswerId the acceptedAnswerId to set
	 */
	@Override
	public void setAcceptedAnswerId(long acceptedAnswerId) {
		this.acceptedAnswerId = acceptedAnswerId;
	}

	/**
	 * @return the body
	 */
	@Override
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	@Override
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * @return the closedDate
	 */
	@Override
	public Date getClosedDate() {
		return closedDate;
	}

	/**
	 * @param closedDate the closedDate to set
	 */
	@Override
	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	/**
	 * @return the closedReason
	 */
	@Override
	public String getClosedReason() {
		return closedReason;
	}

	/**
	 * @param closedReason the closedReason to set
	 */
	@Override
	public void setClosedReason(String closedReason) {
		this.closedReason = closedReason;
	}

	/**
	 * @return the lockedDate
	 */
	@Override
	public Date getLockedDate() {
		return lockedDate;
	}

	/**
	 * @param lockedDate the lockedDate to set
	 */
	@Override
	public void setLockedDate(Date lockedDate) {
		this.lockedDate = lockedDate;
	}

	/**
	 * @return the bountyClosesDate
	 */
	@Override
	public Date getBountyClosesDate() {
		return bountyClosesDate;
	}

	/**
	 * @param bountyClosesDate the bountyClosesDate to set
	 */
	@Override
	public void setBountyClosesDate(Date bountyClosesDate) {
		this.bountyClosesDate = bountyClosesDate;
	}

	/**
	 * @return the bountyAmount
	 */
	@Override
	public long getBountyAmount() {
		return bountyAmount;
	}

	/**
	 * @param bountyAmount the bountyAmount to set
	 */
	@Override
	public void setBountyAmount(long bountyAmount) {
		this.bountyAmount = bountyAmount;
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

		JSONArray comments = new JSONArray();
		for (Comment comment : getComments()) {
			comments.add(((CommentImpl) comment).adaptTo());
		}
		adapter.put("comments", comments);
		return adapter;
	}
}
