package com.google.code.stackoverflow.schema;

import java.util.Date;


public interface User extends SchemaEntity {

	/**
	 * @return the userId
	 */
	public long getUserId();

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId);

	/**
	 * @return the userType
	 */
	public UserType getUserType();

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(UserType userType);

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate();

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate);

	/**
	 * @return the displayName
	 */
	public String getDisplayName();

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName);

	/**
	 * @return the reputation
	 */
	public long getReputation();

	/**
	 * @param reputation the reputation to set
	 */
	public void setReputation(long reputation);

	/**
	 * @return the emailHash
	 */
	public String getEmailHash();

	/**
	 * @param emailHash the emailHash to set
	 */
	public void setEmailHash(String emailHash);

	/**
	 * @return the age
	 */
	public long getAge();

	/**
	 * @param age the age to set
	 */
	public void setAge(long age);

	/**
	 * @return the lastAccessDate
	 */
	public Date getLastAccessDate();

	/**
	 * @param lastAccessDate the lastAccessDate to set
	 */
	public void setLastAccessDate(Date lastAccessDate);

	/**
	 * @return the websiteUrl
	 */
	public String getWebsiteUrl();

	/**
	 * @param websiteUrl the websiteUrl to set
	 */
	public void setWebsiteUrl(String websiteUrl);

	/**
	 * @return the location
	 */
	public String getLocation();

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location);

	/**
	 * @return the aboutMe
	 */
	public String getAboutMe();

	/**
	 * @param aboutMe the aboutMe to set
	 */
	public void setAboutMe(String aboutMe);

	/**
	 * @return the questionCount
	 */
	public long getQuestionCount();

	/**
	 * @param questionCount the questionCount to set
	 */
	public void setQuestionCount(long questionCount);

	/**
	 * @return the answerCount
	 */
	public long getAnswerCount();

	/**
	 * @param answerCount the answerCount to set
	 */
	public void setAnswerCount(long answerCount);

	/**
	 * @return the viewCount
	 */
	public long getViewCount();

	/**
	 * @param viewCount the viewCount to set
	 */
	public void setViewCount(long viewCount);

	/**
	 * @return the upVoteCount
	 */
	public long getUpVoteCount();

	/**
	 * @param upVoteCount the upVoteCount to set
	 */
	public void setUpVoteCount(long upVoteCount);

	/**
	 * @return the downVoteCount
	 */
	public long getDownVoteCount();

	/**
	 * @param downVoteCount the downVoteCount to set
	 */
	public void setDownVoteCount(long downVoteCount);

	/**
	 * @return the acceptRate
	 */
	public double getAcceptRate();

	/**
	 * @param acceptRate the acceptRate to set
	 */
	public void setAcceptRate(double acceptRate);

}