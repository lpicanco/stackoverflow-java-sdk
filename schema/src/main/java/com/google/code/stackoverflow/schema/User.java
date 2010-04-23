package com.google.code.stackoverflow.schema;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public interface User extends SchemaEntity {
	
	public enum SortOrder implements SortEnum {
		MOST_REPUTED("reputation", Order.ASCENDING),
		LEAST_REPUTED("reputation", Order.DESCENDING),
		MOST_RECENTLY_CREATED("creation", Order.ASCENDING),
		LEAST_RECENTLY_CREATED("creation", Order.DESCENDING),
		NAME_ASCENDING("name", Order.ASCENDING),
		NAME_DESCENDING("name", Order.DESCENDING);
		
	    /**
	     * Field Description.
	     */
		private static final Map<String, SortOrder> stringToEnum = new HashMap<String, SortOrder>();

		static { // Initialize map from constant name to enum constant
			for (SortOrder op : values()) {
				stringToEnum.put(op.value(), op);
			}
		}
		
	    /** Field description */
	    private final String value;
	    
	    /** Field description */
	    private final Order order;
	    
	    /**
	     * Constructs ...
	     *
	     *
	     * @param name
	     */
	    SortOrder(String value, Order order) {
	        this.value = value;
	        this.order = order;
	    }

		@Override
		public String value() {
			return value;
		}
		
		public static SortOrder fromValue(String value) {
			return stringToEnum.get(value);
		}

		@Override
		public Order order() {
			return order;
		}
	}
	
	public enum FavoriteSortOrder implements SortEnum {
		MOST_RECENTLY_UPDATED("activity", Order.ASCENDING),
		LEAST_RECENTLY_UPDATED("activity", Order.DESCENDING),
		MOST_VIEWED("views", Order.ASCENDING),
		LEAST_VIEWED("views", Order.DESCENDING),
		MOST_RECENTLY_CREATED("creation", Order.ASCENDING),
		LEAST_RECENTLY_CREATED("creation", Order.DESCENDING),
		MOST_RECENTLY_ADDED("added", Order.ASCENDING),
		LEAST_RECENTLY_ADDED("added", Order.DESCENDING),
		MOST_VOTED("votes", Order.ASCENDING),
		LEAST_VOTED("votes", Order.DESCENDING);
		
	    /**
	     * Field Description.
	     */
		private static final Map<String, FavoriteSortOrder> stringToEnum = new HashMap<String, FavoriteSortOrder>();

		static { // Initialize map from constant name to enum constant
			for (FavoriteSortOrder op : values()) {
				stringToEnum.put(op.value(), op);
			}
		}
		
	    /** Field description */
	    private final String value;

	    /** Field description */
	    private final Order order;
	    
	    /**
	     * Constructs ...
	     *
	     *
	     * @param name
	     */
	    FavoriteSortOrder(String value, Order order) {
	        this.value = value;
	        this.order = order;
	    }

		@Override
		public String value() {
			return value;
		}
		
		public static FavoriteSortOrder fromValue(String value) {
			return stringToEnum.get(value);
		}

		@Override
		public Order order() {
			return order;
		}
	}
	
	public enum QuestionSortOrder implements SortEnum {
		MOST_RECENTLY_UPDATED("activity", Order.ASCENDING),
		LEAST_RECENTLY_UPDATED("activity", Order.DESCENDING),
		MOST_VIEWED("views", Order.ASCENDING),
		LEAST_VIEWED("views", Order.DESCENDING),
		MOST_RECENTLY_CREATED("creation", Order.ASCENDING),
		LEAST_RECENTLY_CREATED("creation", Order.DESCENDING),
		MOST_VOTED("votes", Order.ASCENDING),
		LEAST_VOTED("votes", Order.DESCENDING);
		
	    /**
	     * Field Description.
	     */
		private static final Map<String, QuestionSortOrder> stringToEnum = new HashMap<String, QuestionSortOrder>();

		static { // Initialize map from constant name to enum constant
			for (QuestionSortOrder op : values()) {
				stringToEnum.put(op.value(), op);
			}
		}
		
	    /** Field description */
	    private final String value;
	    
	    /** Field description */
	    private final Order order;
	    
	    /**
	     * Constructs ...
	     *
	     *
	     * @param name
	     */
	    QuestionSortOrder(String value, Order order) {
	        this.value = value;
	        this.order = order;
	    }

		@Override
		public String value() {
			return value;
		}
		
		public static QuestionSortOrder fromValue(String value) {
			return stringToEnum.get(value);
		}

		@Override
		public Order order() {
			return order;
		}
	}
	
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
	
	/**
	 * @return the userQuestionsUrl
	 */
	public String getUserQuestionsUrl();

	/**
	 * @param userQuestionsUrl the userQuestionsUrl to set
	 */
	public void setUserQuestionsUrl(String userQuestionsUrl);

	/**
	 * @return the userAnswersUrl
	 */
	public String getUserAnswersUrl();

	/**
	 * @param userAnswersUrl the userAnswersUrl to set
	 */
	public void setUserAnswersUrl(String userAnswersUrl);

	/**
	 * @return the userFavoritesUrl
	 */
	public String getUserFavoritesUrl();

	/**
	 * @param userFavoritesUrl the userFavoritesUrl to set
	 */
	public void setUserFavoritesUrl(String userFavoritesUrl);

	/**
	 * @return the userTagsUrl
	 */
	public String getUserTagsUrl();

	/**
	 * @param userTagsUrl the userTagsUrl to set
	 */
	public void setUserTagsUrl(String userTagsUrl);

	/**
	 * @return the userBadgesUrl
	 */
	public String getUserBadgesUrl();

	/**
	 * @param userBadgesUrl the userBadgesUrl to set
	 */
	public void setUserBadgesUrl(String userBadgesUrl);

	/**
	 * @return the userTimelineUrl
	 */
	public String getUserTimelineUrl();

	/**
	 * @param userTimelineUrl the userTimelineUrl to set
	 */
	public void setUserTimelineUrl(String userTimelineUrl);

	/**
	 * @return the userMentionedUrl
	 */
	public String getUserMentionedUrl();

	/**
	 * @param userMentionedUrl the userMentionedUrl to set
	 */
	public void setUserMentionedUrl(String userMentionedUrl);

	/**
	 * @return the userCommentsUrl
	 */
	public String getUserCommentsUrl();

	/**
	 * @param userCommentsUrl the userCommentsUrl to set
	 */
	public void setUserCommentsUrl(String userCommentsUrl);

	/**
	 * @return the userReputationUrl
	 */
	public String getUserReputationUrl();

	/**
	 * @param userReputationUrl the userReputationUrl to set
	 */
	public void setUserReputationUrl(String userReputationUrl);
}