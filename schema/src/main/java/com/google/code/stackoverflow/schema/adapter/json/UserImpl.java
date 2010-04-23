/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.UserType;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class UserImpl extends BaseJsonAdapter implements User, Adaptable<User, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5517600617397335450L;
	
	private long userId;
	private UserType userType;
	private Date creationDate;
	private String displayName;
	private long reputation;
	private String emailHash;
	private long age;
	private Date lastAccessDate;
	private String websiteUrl;
	private String location;
	private String aboutMe;
	private long questionCount;
	private long answerCount;
	private long viewCount;
	private long upVoteCount;
	private long downVoteCount;
	private double acceptRate;
	private String userQuestionsUrl;
	private String userAnswersUrl;
	private String userFavoritesUrl;
	private String userTagsUrl;
	private String userBadgesUrl;
	private String userTimelineUrl;
	private String userMentionedUrl;
	private String userCommentsUrl;
	private String userReputationUrl;
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public long getReputation() {
		return reputation;
	}

	public void setReputation(long reputation) {
		this.reputation = reputation;
	}

	public String getEmailHash() {
		return emailHash;
	}

	public void setEmailHash(String emailHash) {
		this.emailHash = emailHash;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public Date getLastAccessDate() {
		return lastAccessDate;
	}

	public void setLastAccessDate(Date lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public long getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(long questionCount) {
		this.questionCount = questionCount;
	}

	public long getAnswerCount() {
		return answerCount;
	}

	public void setAnswerCount(long answerCount) {
		this.answerCount = answerCount;
	}

	public long getViewCount() {
		return viewCount;
	}

	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
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

	public double getAcceptRate() {
		return acceptRate;
	}

	public void setAcceptRate(double acceptRate) {
		this.acceptRate = acceptRate;
	}
	
	/**
	 * @return the userQuestionsUrl
	 */
	public String getUserQuestionsUrl() {
		return userQuestionsUrl;
	}

	/**
	 * @param userQuestionsUrl the userQuestionsUrl to set
	 */
	public void setUserQuestionsUrl(String userQuestionsUrl) {
		this.userQuestionsUrl = userQuestionsUrl;
	}

	/**
	 * @return the userAnswersUrl
	 */
	public String getUserAnswersUrl() {
		return userAnswersUrl;
	}

	/**
	 * @param userAnswersUrl the userAnswersUrl to set
	 */
	public void setUserAnswersUrl(String userAnswersUrl) {
		this.userAnswersUrl = userAnswersUrl;
	}

	/**
	 * @return the userFavoritesUrl
	 */
	public String getUserFavoritesUrl() {
		return userFavoritesUrl;
	}

	/**
	 * @param userFavoritesUrl the userFavoritesUrl to set
	 */
	public void setUserFavoritesUrl(String userFavoritesUrl) {
		this.userFavoritesUrl = userFavoritesUrl;
	}

	/**
	 * @return the userTagsUrl
	 */
	public String getUserTagsUrl() {
		return userTagsUrl;
	}

	/**
	 * @param userTagsUrl the userTagsUrl to set
	 */
	public void setUserTagsUrl(String userTagsUrl) {
		this.userTagsUrl = userTagsUrl;
	}

	/**
	 * @return the userBadgesUrl
	 */
	public String getUserBadgesUrl() {
		return userBadgesUrl;
	}

	/**
	 * @param userBadgesUrl the userBadgesUrl to set
	 */
	public void setUserBadgesUrl(String userBadgesUrl) {
		this.userBadgesUrl = userBadgesUrl;
	}

	/**
	 * @return the userTimelineUrl
	 */
	public String getUserTimelineUrl() {
		return userTimelineUrl;
	}

	/**
	 * @param userTimelineUrl the userTimelineUrl to set
	 */
	public void setUserTimelineUrl(String userTimelineUrl) {
		this.userTimelineUrl = userTimelineUrl;
	}

	/**
	 * @return the userMentionedUrl
	 */
	public String getUserMentionedUrl() {
		return userMentionedUrl;
	}

	/**
	 * @param userMentionedUrl the userMentionedUrl to set
	 */
	public void setUserMentionedUrl(String userMentionedUrl) {
		this.userMentionedUrl = userMentionedUrl;
	}

	/**
	 * @return the userCommentsUrl
	 */
	public String getUserCommentsUrl() {
		return userCommentsUrl;
	}

	/**
	 * @param userCommentsUrl the userCommentsUrl to set
	 */
	public void setUserCommentsUrl(String userCommentsUrl) {
		this.userCommentsUrl = userCommentsUrl;
	}

	/**
	 * @return the userReputationUrl
	 */
	public String getUserReputationUrl() {
		return userReputationUrl;
	}

	/**
	 * @param userReputationUrl the userReputationUrl to set
	 */
	public void setUserReputationUrl(String userReputationUrl) {
		this.userReputationUrl = userReputationUrl;
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
