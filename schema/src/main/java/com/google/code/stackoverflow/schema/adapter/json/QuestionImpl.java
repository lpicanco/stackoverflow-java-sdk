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
import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class QuestionImpl.
 */
public class QuestionImpl extends BaseJsonAdapter implements Question, Adaptable<Question, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8343229589647315647L;
	
	/** The answer count. */
	private long answerCount;
	
	/** The question id. */
	private long questionId;
	
	/** The owner user id. */
	private UserImpl owner;
	
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
	
	/** The tags. */
	private List<String> tags = new ArrayList<String>();
	
	/** The answers. */
	private List<Answer> answers = new ArrayList<Answer>();
	
	/** The comments. */
	private List<Comment> comments = new ArrayList<Comment>();
	
	/** The accepted answer id. */
	private long acceptedAnswerId;
	
	/** The body. */
	private String body;
	
	/** The closed date. */
	private Date closedDate;
	
	/** The closed reason. */
	private String closedReason;
	
	/** The locked date. */
	private Date lockedDate;
	
	/** The bounty closes date. */
	private Date bountyClosesDate;
	
	/** The bounty amount. */
	private long bountyAmount;
	
	/** The question timeline url. */
	private String questionTimelineUrl;
	
	/** The question comments url. */
	private String questionCommentsUrl;
	
	/** The question answers url. */
	private String questionAnswersUrl;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getAnswers()
	 */
	public List<Answer> getAnswers() {
		return answers;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setAnswers(java.util.List)
	 */
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getAnswerCount()
	 */
	public long getAnswerCount() {
		return answerCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setAnswerCount(long)
	 */
	public void setAnswerCount(long answerCount) {
		this.answerCount = answerCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getQuestionId()
	 */
	public long getQuestionId() {
		return questionId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setQuestionId(long)
	 */
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getOwnerUserId()
	 */
	public User getOwner() {
		return owner;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setOwnerUserId(long)
	 */
	public void setOwner(User owner) {
		this.owner = (UserImpl) owner;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getCreationDate()
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setCreationDate(java.util.Date)
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getLastEditDate()
	 */
	public Date getLastEditDate() {
		return lastEditDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setLastEditDate(java.util.Date)
	 */
	public void setLastEditDate(Date lastEditDate) {
		this.lastEditDate = lastEditDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getLastActivityDate()
	 */
	public Date getLastActivityDate() {
		return lastActivityDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setLastActivityDate(java.util.Date)
	 */
	public void setLastActivityDate(Date lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getUpVoteCount()
	 */
	public long getUpVoteCount() {
		return upVoteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setUpVoteCount(long)
	 */
	public void setUpVoteCount(long upVoteCount) {
		this.upVoteCount = upVoteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getDownVoteCount()
	 */
	public long getDownVoteCount() {
		return downVoteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setDownVoteCount(long)
	 */
	public void setDownVoteCount(long downVoteCount) {
		this.downVoteCount = downVoteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getFavoriteCount()
	 */
	public long getFavoriteCount() {
		return favoriteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setFavoriteCount(long)
	 */
	public void setFavoriteCount(long favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getViewCount()
	 */
	public long getViewCount() {
		return viewCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setViewCount(long)
	 */
	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getScore()
	 */
	public long getScore() {
		return score;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setScore(long)
	 */
	public void setScore(long score) {
		this.score = score;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#isCommunityOwned()
	 */
	public boolean isCommunityOwned() {
		return communityOwned;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setCommunityOwned(boolean)
	 */
	public void setCommunityOwned(boolean communityOwned) {
		this.communityOwned = communityOwned;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getTitle()
	 */
	public String getTitle() {
		return title;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setTitle(java.lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getTags()
	 */
	public List<String> getTags() {
		return tags;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setTags(java.util.List)
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getComments()
	 */
	@Override
	public List<Comment> getComments() {
		return comments;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setComments(java.util.List)
	 */
	@Override
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getAcceptedAnswerId()
	 */
	@Override
	public long getAcceptedAnswerId() {
		return acceptedAnswerId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setAcceptedAnswerId(long)
	 */
	@Override
	public void setAcceptedAnswerId(long acceptedAnswerId) {
		this.acceptedAnswerId = acceptedAnswerId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getBody()
	 */
	@Override
	public String getBody() {
		return body;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setBody(java.lang.String)
	 */
	@Override
	public void setBody(String body) {
		this.body = body;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getClosedDate()
	 */
	@Override
	public Date getClosedDate() {
		return closedDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setClosedDate(java.util.Date)
	 */
	@Override
	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getClosedReason()
	 */
	@Override
	public String getClosedReason() {
		return closedReason;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setClosedReason(java.lang.String)
	 */
	@Override
	public void setClosedReason(String closedReason) {
		this.closedReason = closedReason;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getLockedDate()
	 */
	@Override
	public Date getLockedDate() {
		return lockedDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setLockedDate(java.util.Date)
	 */
	@Override
	public void setLockedDate(Date lockedDate) {
		this.lockedDate = lockedDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getBountyClosesDate()
	 */
	@Override
	public Date getBountyClosesDate() {
		return bountyClosesDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setBountyClosesDate(java.util.Date)
	 */
	@Override
	public void setBountyClosesDate(Date bountyClosesDate) {
		this.bountyClosesDate = bountyClosesDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getBountyAmount()
	 */
	@Override
	public long getBountyAmount() {
		return bountyAmount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setBountyAmount(long)
	 */
	@Override
	public void setBountyAmount(long bountyAmount) {
		this.bountyAmount = bountyAmount;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getQuestionTimelineUrl()
	 */
	@Override
	public String getQuestionTimelineUrl() {
		return questionTimelineUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setQuestionTimelineUrl(java.lang.String)
	 */
	@Override
	public void setQuestionTimelineUrl(String questionTimelineUrl) {
		this.questionTimelineUrl = questionTimelineUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getQuestionCommentsUrl()
	 */
	@Override
	public String getQuestionCommentsUrl() {
		return questionCommentsUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setQuestionCommentsUrl(java.lang.String)
	 */
	@Override
	public void setQuestionCommentsUrl(String questionCommentsUrl) {
		this.questionCommentsUrl = questionCommentsUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#getQuestionAnswersUrl()
	 */
	@Override
	public String getQuestionAnswersUrl() {
		return questionAnswersUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Question#setQuestionAnswersUrl(java.lang.String)
	 */
	@Override
	public void setQuestionAnswersUrl(String questionAnswersUrl) {
		this.questionAnswersUrl = questionAnswersUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
		JSONObject ownerJson = (JSONObject) adaptee.get("owner");
		if (ownerJson != null) {
			this.owner = new UserImpl();
			owner.adaptFrom(ownerJson);
		}
		JSONArray answersJson = (JSONArray) adaptee.get("answers");
		if (answersJson != null) {
			for (Object o : answersJson) {			
				AnswerImpl answer = new AnswerImpl();
				answer.adaptFrom((JSONObject) o);
				getAnswers().add(answer);
			}
		}
		JSONArray tagsJson = (JSONArray) adaptee.get("tags");
		if (tagsJson != null) {
			for (String tag : (Iterable<String>) tagsJson) {
				getTags().add(tag);
			}
		}
		JSONArray commentsJson = (JSONArray) adaptee.get("comments");
		if (commentsJson != null) {
			for (Object o : commentsJson) {			
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
