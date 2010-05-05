package com.google.code.stackoverflow.schema;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * The Interface User.
 */
public interface User extends SchemaEntity {
	
	/**
	 * The Enum SortOrder.
	 */
	public enum SortOrder implements SortEnum {
		
		/** The MOS t_ reputed. */
		MOST_REPUTED("reputation", Order.ASCENDING),
		
		/** The LEAS t_ reputed. */
		LEAST_REPUTED("reputation", Order.DESCENDING),
		
		/** The MOS t_ recentl y_ created. */
		MOST_RECENTLY_CREATED("creation", Order.ASCENDING),
		
		/** The LEAS t_ recentl y_ created. */
		LEAST_RECENTLY_CREATED("creation", Order.DESCENDING),
		
		/** The NAM e_ ascending. */
		NAME_ASCENDING("name", Order.ASCENDING),
		
		/** The NAM e_ descending. */
		NAME_DESCENDING("name", Order.DESCENDING);
		
	    /** The Constant stringToEnum. */
		private static final Map<String, SortOrder> stringToEnum = new HashMap<String, SortOrder>();

		static { // Initialize map from constant name to enum constant
			for (SortOrder op : values()) {
				stringToEnum.put(op.value(), op);
			}
		}
		
	    /** The value. */
	    private final String value;
	    
	    /** The order. */
	    private final Order order;
	    
	    /**
    	 * Instantiates a new sort order.
    	 * 
    	 * @param value the value
    	 * @param order the order
    	 */
	    SortOrder(String value, Order order) {
	        this.value = value;
	        this.order = order;
	    }

		/* (non-Javadoc)
		 * @see com.google.code.stackoverflow.schema.ValueEnum#value()
		 */
		@Override
		public String value() {
			return value;
		}
		
		/**
		 * From value.
		 * 
		 * @param value the value
		 * 
		 * @return the sort order
		 */
		public static SortOrder fromValue(String value) {
			return stringToEnum.get(value);
		}

		/* (non-Javadoc)
		 * @see com.google.code.stackoverflow.schema.SortEnum#order()
		 */
		@Override
		public Order order() {
			return order;
		}
	}
	
	/**
	 * The Enum FavoriteSortOrder.
	 */
	public enum FavoriteSortOrder implements SortEnum {
		
		/** The MOS t_ recentl y_ updated. */
		MOST_RECENTLY_UPDATED("activity", Order.ASCENDING),
		
		/** The LEAS t_ recentl y_ updated. */
		LEAST_RECENTLY_UPDATED("activity", Order.DESCENDING),
		
		/** The MOS t_ viewed. */
		MOST_VIEWED("views", Order.ASCENDING),
		
		/** The LEAS t_ viewed. */
		LEAST_VIEWED("views", Order.DESCENDING),
		
		/** The MOS t_ recentl y_ created. */
		MOST_RECENTLY_CREATED("creation", Order.ASCENDING),
		
		/** The LEAS t_ recentl y_ created. */
		LEAST_RECENTLY_CREATED("creation", Order.DESCENDING),
		
		/** The MOS t_ recentl y_ added. */
		MOST_RECENTLY_ADDED("added", Order.ASCENDING),
		
		/** The LEAS t_ recentl y_ added. */
		LEAST_RECENTLY_ADDED("added", Order.DESCENDING),
		
		/** The MOS t_ voted. */
		MOST_VOTED("votes", Order.ASCENDING),
		
		/** The LEAS t_ voted. */
		LEAST_VOTED("votes", Order.DESCENDING);
		
	    /** The Constant stringToEnum. */
		private static final Map<String, FavoriteSortOrder> stringToEnum = new HashMap<String, FavoriteSortOrder>();

		static { // Initialize map from constant name to enum constant
			for (FavoriteSortOrder op : values()) {
				stringToEnum.put(op.value(), op);
			}
		}
		
	    /** The value. */
	    private final String value;

	    /** The order. */
	    private final Order order;
	    
	    /**
    	 * Instantiates a new favorite sort order.
    	 * 
    	 * @param value the value
    	 * @param order the order
    	 */
	    FavoriteSortOrder(String value, Order order) {
	        this.value = value;
	        this.order = order;
	    }

		/* (non-Javadoc)
		 * @see com.google.code.stackoverflow.schema.ValueEnum#value()
		 */
		@Override
		public String value() {
			return value;
		}
		
		/**
		 * From value.
		 * 
		 * @param value the value
		 * 
		 * @return the favorite sort order
		 */
		public static FavoriteSortOrder fromValue(String value) {
			return stringToEnum.get(value);
		}

		/* (non-Javadoc)
		 * @see com.google.code.stackoverflow.schema.SortEnum#order()
		 */
		@Override
		public Order order() {
			return order;
		}
	}
	
	/**
	 * The Enum QuestionSortOrder.
	 */
	public enum QuestionSortOrder implements SortEnum {
		
		/** The MOS t_ recentl y_ updated. */
		MOST_RECENTLY_UPDATED("activity", Order.ASCENDING),
		
		/** The LEAS t_ recentl y_ updated. */
		LEAST_RECENTLY_UPDATED("activity", Order.DESCENDING),
		
		/** The MOS t_ viewed. */
		MOST_VIEWED("views", Order.ASCENDING),
		
		/** The LEAS t_ viewed. */
		LEAST_VIEWED("views", Order.DESCENDING),
		
		/** The MOS t_ recentl y_ created. */
		MOST_RECENTLY_CREATED("creation", Order.ASCENDING),
		
		/** The LEAS t_ recentl y_ created. */
		LEAST_RECENTLY_CREATED("creation", Order.DESCENDING),
		
		/** The MOS t_ voted. */
		MOST_VOTED("votes", Order.ASCENDING),
		
		/** The LEAS t_ voted. */
		LEAST_VOTED("votes", Order.DESCENDING);
		
	    /** The Constant stringToEnum. */
		private static final Map<String, QuestionSortOrder> stringToEnum = new HashMap<String, QuestionSortOrder>();

		static { // Initialize map from constant name to enum constant
			for (QuestionSortOrder op : values()) {
				stringToEnum.put(op.value(), op);
			}
		}
		
	    /** The value. */
	    private final String value;
	    
	    /** The order. */
	    private final Order order;
	    
	    /**
    	 * Instantiates a new question sort order.
    	 * 
    	 * @param value the value
    	 * @param order the order
    	 */
	    QuestionSortOrder(String value, Order order) {
	        this.value = value;
	        this.order = order;
	    }

		/* (non-Javadoc)
		 * @see com.google.code.stackoverflow.schema.ValueEnum#value()
		 */
		@Override
		public String value() {
			return value;
		}
		
		/**
		 * From value.
		 * 
		 * @param value the value
		 * 
		 * @return the question sort order
		 */
		public static QuestionSortOrder fromValue(String value) {
			return stringToEnum.get(value);
		}

		/* (non-Javadoc)
		 * @see com.google.code.stackoverflow.schema.SortEnum#order()
		 */
		@Override
		public Order order() {
			return order;
		}
	}
	
	/**
	 * Gets the user id.
	 * 
	 * @return the user id
	 */
	public long getUserId();

	/**
	 * Sets the user id.
	 * 
	 * @param userId the new user id
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user type.
	 * 
	 * @return the user type
	 */
	public UserType getUserType();

	/**
	 * Sets the user type.
	 * 
	 * @param userType the new user type
	 */
	public void setUserType(UserType userType);

	/**
	 * Gets the creation date.
	 * 
	 * @return the creation date
	 */
	public Date getCreationDate();

	/**
	 * Sets the creation date.
	 * 
	 * @param creationDate the new creation date
	 */
	public void setCreationDate(Date creationDate);

	/**
	 * Gets the display name.
	 * 
	 * @return the display name
	 */
	public String getDisplayName();

	/**
	 * Sets the display name.
	 * 
	 * @param displayName the new display name
	 */
	public void setDisplayName(String displayName);

	/**
	 * Gets the reputation.
	 * 
	 * @return the reputation
	 */
	public long getReputation();

	/**
	 * Sets the reputation.
	 * 
	 * @param reputation the new reputation
	 */
	public void setReputation(long reputation);

	/**
	 * Gets the email hash.
	 * 
	 * @return the email hash
	 */
	public String getEmailHash();

	/**
	 * Sets the email hash.
	 * 
	 * @param emailHash the new email hash
	 */
	public void setEmailHash(String emailHash);

	/**
	 * Gets the age.
	 * 
	 * @return the age
	 */
	public long getAge();

	/**
	 * Sets the age.
	 * 
	 * @param age the new age
	 */
	public void setAge(long age);

	/**
	 * Gets the last access date.
	 * 
	 * @return the last access date
	 */
	public Date getLastAccessDate();

	/**
	 * Sets the last access date.
	 * 
	 * @param lastAccessDate the new last access date
	 */
	public void setLastAccessDate(Date lastAccessDate);

	/**
	 * Gets the website url.
	 * 
	 * @return the website url
	 */
	public String getWebsiteUrl();

	/**
	 * Sets the website url.
	 * 
	 * @param websiteUrl the new website url
	 */
	public void setWebsiteUrl(String websiteUrl);

	/**
	 * Gets the location.
	 * 
	 * @return the location
	 */
	public String getLocation();

	/**
	 * Sets the location.
	 * 
	 * @param location the new location
	 */
	public void setLocation(String location);

	/**
	 * Gets the about me.
	 * 
	 * @return the about me
	 */
	public String getAboutMe();

	/**
	 * Sets the about me.
	 * 
	 * @param aboutMe the new about me
	 */
	public void setAboutMe(String aboutMe);

	/**
	 * Gets the question count.
	 * 
	 * @return the question count
	 */
	public long getQuestionCount();

	/**
	 * Sets the question count.
	 * 
	 * @param questionCount the new question count
	 */
	public void setQuestionCount(long questionCount);

	/**
	 * Gets the answer count.
	 * 
	 * @return the answer count
	 */
	public long getAnswerCount();

	/**
	 * Sets the answer count.
	 * 
	 * @param answerCount the new answer count
	 */
	public void setAnswerCount(long answerCount);

	/**
	 * Gets the view count.
	 * 
	 * @return the view count
	 */
	public long getViewCount();

	/**
	 * Sets the view count.
	 * 
	 * @param viewCount the new view count
	 */
	public void setViewCount(long viewCount);

	/**
	 * Gets the up vote count.
	 * 
	 * @return the up vote count
	 */
	public long getUpVoteCount();

	/**
	 * Sets the up vote count.
	 * 
	 * @param upVoteCount the new up vote count
	 */
	public void setUpVoteCount(long upVoteCount);

	/**
	 * Gets the down vote count.
	 * 
	 * @return the down vote count
	 */
	public long getDownVoteCount();

	/**
	 * Sets the down vote count.
	 * 
	 * @param downVoteCount the new down vote count
	 */
	public void setDownVoteCount(long downVoteCount);

	/**
	 * Gets the accept rate.
	 * 
	 * @return the accept rate
	 */
	public double getAcceptRate();

	/**
	 * Sets the accept rate.
	 * 
	 * @param acceptRate the new accept rate
	 */
	public void setAcceptRate(double acceptRate);
	
	/**
	 * Gets the user questions url.
	 * 
	 * @return the user questions url
	 */
	public String getUserQuestionsUrl();

	/**
	 * Sets the user questions url.
	 * 
	 * @param userQuestionsUrl the new user questions url
	 */
	public void setUserQuestionsUrl(String userQuestionsUrl);

	/**
	 * Gets the user answers url.
	 * 
	 * @return the user answers url
	 */
	public String getUserAnswersUrl();

	/**
	 * Sets the user answers url.
	 * 
	 * @param userAnswersUrl the new user answers url
	 */
	public void setUserAnswersUrl(String userAnswersUrl);

	/**
	 * Gets the user favorites url.
	 * 
	 * @return the user favorites url
	 */
	public String getUserFavoritesUrl();

	/**
	 * Sets the user favorites url.
	 * 
	 * @param userFavoritesUrl the new user favorites url
	 */
	public void setUserFavoritesUrl(String userFavoritesUrl);

	/**
	 * Gets the user tags url.
	 * 
	 * @return the user tags url
	 */
	public String getUserTagsUrl();

	/**
	 * Sets the user tags url.
	 * 
	 * @param userTagsUrl the new user tags url
	 */
	public void setUserTagsUrl(String userTagsUrl);

	/**
	 * Gets the user badges url.
	 * 
	 * @return the user badges url
	 */
	public String getUserBadgesUrl();

	/**
	 * Sets the user badges url.
	 * 
	 * @param userBadgesUrl the new user badges url
	 */
	public void setUserBadgesUrl(String userBadgesUrl);

	/**
	 * Gets the user timeline url.
	 * 
	 * @return the user timeline url
	 */
	public String getUserTimelineUrl();

	/**
	 * Sets the user timeline url.
	 * 
	 * @param userTimelineUrl the new user timeline url
	 */
	public void setUserTimelineUrl(String userTimelineUrl);

	/**
	 * Gets the user mentioned url.
	 * 
	 * @return the user mentioned url
	 */
	public String getUserMentionedUrl();

	/**
	 * Sets the user mentioned url.
	 * 
	 * @param userMentionedUrl the new user mentioned url
	 */
	public void setUserMentionedUrl(String userMentionedUrl);

	/**
	 * Gets the user comments url.
	 * 
	 * @return the user comments url
	 */
	public String getUserCommentsUrl();

	/**
	 * Sets the user comments url.
	 * 
	 * @param userCommentsUrl the new user comments url
	 */
	public void setUserCommentsUrl(String userCommentsUrl);

	/**
	 * Gets the user reputation url.
	 * 
	 * @return the user reputation url
	 */
	public String getUserReputationUrl();

	/**
	 * Sets the user reputation url.
	 * 
	 * @param userReputationUrl the new user reputation url
	 */
	public void setUserReputationUrl(String userReputationUrl);
	
	/**
	 * Gets the badge counts.
	 * 
	 * @return the badge counts
	 */
	public Map<BadgeRank, Long> getBadgeCounts();

	/**
	 * Sets the badge counts.
	 * 
	 * @param badgeCounts the badge counts
	 */
	public void setBadgeCounts(Map<BadgeRank, Long> badgeCounts);
}