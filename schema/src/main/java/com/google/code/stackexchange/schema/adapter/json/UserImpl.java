/**
 * 
 */
package com.google.code.stackexchange.schema.adapter.json;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;

import com.google.code.stackexchange.schema.BadgeRank;
import com.google.code.stackexchange.schema.User;
import com.google.code.stackexchange.schema.UserType;
import com.google.code.stackexchange.schema.adapter.Adaptable;

/**
 * The Class UserImpl.
 */
public class UserImpl extends BaseJsonAdapter implements User, Adaptable<User, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5517600617397335450L;
	
	/** The user id. */
	private long userId;
	
	/** The user type. */
	private UserType userType;
	
	/** The creation date. */
	private Date creationDate;
	
	/** The display name. */
	private String displayName;
	
	/** The reputation. */
	private long reputation;
	
	/** The email hash. */
	private String emailHash;
	
	/** The age. */
	private long age;
	
	/** The last access date. */
	private Date lastAccessDate;
	
	/** The website url. */
	private String websiteUrl;
	
	/** The location. */
	private String location;
	
	/** The about me. */
	private String aboutMe;
	
	/** The question count. */
	private long questionCount;
	
	/** The answer count. */
	private long answerCount;
	
	/** The view count. */
	private long viewCount;
	
	/** The up vote count. */
	private long upVoteCount;
	
	/** The down vote count. */
	private long downVoteCount;
	
	/** The accept rate. */
	private double acceptRate;
	
	/** The user questions url. */
	private String userQuestionsUrl;
	
	/** The user answers url. */
	private String userAnswersUrl;
	
	/** The user favorites url. */
	private String userFavoritesUrl;
	
	/** The user tags url. */
	private String userTagsUrl;
	
	/** The user badges url. */
	private String userBadgesUrl;
	
	/** The user timeline url. */
	private String userTimelineUrl;
	
	/** The user mentioned url. */
	private String userMentionedUrl;
	
	/** The user comments url. */
	private String userCommentsUrl;
	
	/** The user reputation url. */
	private String userReputationUrl;
	
	/** The badge counts. */
	private Map<BadgeRank, Long> badgeCounts = new HashMap<BadgeRank, Long>();
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getUserId()
	 */
	public long getUserId() {
		return userId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setUserId(long)
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getUserType()
	 */
	public UserType getUserType() {
		return userType;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setUserType(com.google.code.stackexchange.schema.UserType)
	 */
	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getCreationDate()
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setCreationDate(java.util.Date)
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getDisplayName()
	 */
	public String getDisplayName() {
		return displayName;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setDisplayName(java.lang.String)
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getReputation()
	 */
	public long getReputation() {
		return reputation;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setReputation(long)
	 */
	public void setReputation(long reputation) {
		this.reputation = reputation;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getEmailHash()
	 */
	public String getEmailHash() {
		return emailHash;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setEmailHash(java.lang.String)
	 */
	public void setEmailHash(String emailHash) {
		this.emailHash = emailHash;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getAge()
	 */
	public long getAge() {
		return age;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setAge(long)
	 */
	public void setAge(long age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getLastAccessDate()
	 */
	public Date getLastAccessDate() {
		return lastAccessDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setLastAccessDate(java.util.Date)
	 */
	public void setLastAccessDate(Date lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getWebsiteUrl()
	 */
	public String getWebsiteUrl() {
		return websiteUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setWebsiteUrl(java.lang.String)
	 */
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getLocation()
	 */
	public String getLocation() {
		return location;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setLocation(java.lang.String)
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getAboutMe()
	 */
	public String getAboutMe() {
		return aboutMe;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setAboutMe(java.lang.String)
	 */
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getQuestionCount()
	 */
	public long getQuestionCount() {
		return questionCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setQuestionCount(long)
	 */
	public void setQuestionCount(long questionCount) {
		this.questionCount = questionCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getAnswerCount()
	 */
	public long getAnswerCount() {
		return answerCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setAnswerCount(long)
	 */
	public void setAnswerCount(long answerCount) {
		this.answerCount = answerCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getViewCount()
	 */
	public long getViewCount() {
		return viewCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setViewCount(long)
	 */
	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getUpVoteCount()
	 */
	public long getUpVoteCount() {
		return upVoteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setUpVoteCount(long)
	 */
	public void setUpVoteCount(long upVoteCount) {
		this.upVoteCount = upVoteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getDownVoteCount()
	 */
	public long getDownVoteCount() {
		return downVoteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setDownVoteCount(long)
	 */
	public void setDownVoteCount(long downVoteCount) {
		this.downVoteCount = downVoteCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getAcceptRate()
	 */
	public double getAcceptRate() {
		return acceptRate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setAcceptRate(double)
	 */
	public void setAcceptRate(double acceptRate) {
		this.acceptRate = acceptRate;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getUserQuestionsUrl()
	 */
	public String getUserQuestionsUrl() {
		return userQuestionsUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setUserQuestionsUrl(java.lang.String)
	 */
	public void setUserQuestionsUrl(String userQuestionsUrl) {
		this.userQuestionsUrl = userQuestionsUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getUserAnswersUrl()
	 */
	public String getUserAnswersUrl() {
		return userAnswersUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setUserAnswersUrl(java.lang.String)
	 */
	public void setUserAnswersUrl(String userAnswersUrl) {
		this.userAnswersUrl = userAnswersUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getUserFavoritesUrl()
	 */
	public String getUserFavoritesUrl() {
		return userFavoritesUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setUserFavoritesUrl(java.lang.String)
	 */
	public void setUserFavoritesUrl(String userFavoritesUrl) {
		this.userFavoritesUrl = userFavoritesUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getUserTagsUrl()
	 */
	public String getUserTagsUrl() {
		return userTagsUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setUserTagsUrl(java.lang.String)
	 */
	public void setUserTagsUrl(String userTagsUrl) {
		this.userTagsUrl = userTagsUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getUserBadgesUrl()
	 */
	public String getUserBadgesUrl() {
		return userBadgesUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setUserBadgesUrl(java.lang.String)
	 */
	public void setUserBadgesUrl(String userBadgesUrl) {
		this.userBadgesUrl = userBadgesUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getUserTimelineUrl()
	 */
	public String getUserTimelineUrl() {
		return userTimelineUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setUserTimelineUrl(java.lang.String)
	 */
	public void setUserTimelineUrl(String userTimelineUrl) {
		this.userTimelineUrl = userTimelineUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getUserMentionedUrl()
	 */
	public String getUserMentionedUrl() {
		return userMentionedUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setUserMentionedUrl(java.lang.String)
	 */
	public void setUserMentionedUrl(String userMentionedUrl) {
		this.userMentionedUrl = userMentionedUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getUserCommentsUrl()
	 */
	public String getUserCommentsUrl() {
		return userCommentsUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setUserCommentsUrl(java.lang.String)
	 */
	public void setUserCommentsUrl(String userCommentsUrl) {
		this.userCommentsUrl = userCommentsUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getUserReputationUrl()
	 */
	public String getUserReputationUrl() {
		return userReputationUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setUserReputationUrl(java.lang.String)
	 */
	public void setUserReputationUrl(String userReputationUrl) {
		this.userReputationUrl = userReputationUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#getBadgeCounts()
	 */
	public Map<BadgeRank, Long> getBadgeCounts() {
		return badgeCounts;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.User#setBadgeCounts(java.util.Map)
	 */
	public void setBadgeCounts(Map<BadgeRank, Long> badgeCounts) {
		this.badgeCounts = badgeCounts;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
		JSONObject map = (JSONObject) adaptee.get("badge_counts");
		if (map != null) {
			for (Map.Entry entry : (Set<Map.Entry>) map.entrySet()) {
				badgeCounts.put(BadgeRank.fromValue(entry.getKey().toString()), Long.valueOf(entry.getValue().toString()));
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}
}
