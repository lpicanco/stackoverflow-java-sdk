package com.google.code.stackoverflow.schema;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public interface User extends SchemaEntity {
	
	public enum SortOrder implements SortEnum {
		REPUTATION("reputation", Order.ASCENDING),
		CREATION("creation", Order.ASCENDING),
		NAME("name", Order.ASCENDING);
		
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
		ACTIVITY("activity", Order.ASCENDING),
		VIEWS("views", Order.ASCENDING),
		CREATION("creation", Order.ASCENDING),
		ADDED("added", Order.ASCENDING),
		VOTES("votes", Order.ASCENDING);
		
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
		ACTIVITY("activity", Order.ASCENDING),
		VIEWS("views", Order.ASCENDING),
		CREATION("creation", Order.ASCENDING),
		VOTES("votes", Order.ASCENDING);
		
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

}