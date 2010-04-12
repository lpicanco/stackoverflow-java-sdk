package com.google.code.stackoverflow.schema;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Question extends SchemaEntity {
	
	public enum SortOrder implements SortEnum {
		ACTIVE("active"),
		NEWEST("newest"),
		FEATURED("featured"),
		HOT("hot"),
		WEEKLY_HOT("week"),
		MONTHLY_HOT("month"),
		VOTES("votes");
		
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
	    
	    /**
	     * Constructs ...
	     *
	     *
	     * @param name
	     */
	    SortOrder(String value) {
	        this.value = value;
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
			return null;
		}
	}
	
	public enum UnansweredSortOrder implements SortEnum {
		NEWEST("newest"),
		VOTES("votes");
		
	    /**
	     * Field Description.
	     */
		private static final Map<String, UnansweredSortOrder> stringToEnum = new HashMap<String, UnansweredSortOrder>();

		static { // Initialize map from constant name to enum constant
			for (UnansweredSortOrder op : values()) {
				stringToEnum.put(op.value(), op);
			}
		}
		
	    /** Field description */
	    private final String value;
	    
	    /**
	     * Constructs ...
	     *
	     *
	     * @param name
	     */
	    UnansweredSortOrder(String value) {
	        this.value = value;
	    }

		@Override
		public String value() {
			return value;
		}
		
		public static UnansweredSortOrder fromValue(String value) {
			return stringToEnum.get(value);
		}

		@Override
		public Order order() {
			return null;
		}
	}
	
	/**
	 * @return the answers
	 */
	public List<Answer> getAnswers();

	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(List<Answer> answers);

	/**
	 * @return the answerCount
	 */
	public long getAnswerCount();

	/**
	 * @param answerCount the answerCount to set
	 */
	public void setAnswerCount(long answerCount);

	/**
	 * @return the questionId
	 */
	public long getQuestionId();

	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(long questionId);

	/**
	 * @return the ownerUserId
	 */
	public long getOwnerUserId();

	/**
	 * @param ownerUserId the ownerUserId to set
	 */
	public void setOwnerUserId(long ownerUserId);

	/**
	 * @return the ownerDisplayName
	 */
	public String getOwnerDisplayName();

	/**
	 * @param ownerDisplayName the ownerDisplayName to set
	 */
	public void setOwnerDisplayName(String ownerDisplayName);

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate();

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate);

	/**
	 * @return the lastEditDate
	 */
	public Date getLastEditDate();

	/**
	 * @param lastEditDate the lastEditDate to set
	 */
	public void setLastEditDate(Date lastEditDate);

	/**
	 * @return the lastActivityDate
	 */
	public Date getLastActivityDate();

	/**
	 * @param lastActivityDate the lastActivityDate to set
	 */
	public void setLastActivityDate(Date lastActivityDate);

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
	 * @return the favoriteCount
	 */
	public long getFavoriteCount();

	/**
	 * @param favoriteCount the favoriteCount to set
	 */
	public void setFavoriteCount(long favoriteCount);

	/**
	 * @return the viewCount
	 */
	public long getViewCount();

	/**
	 * @param viewCount the viewCount to set
	 */
	public void setViewCount(long viewCount);

	/**
	 * @return the score
	 */
	public long getScore();

	/**
	 * @param score the score to set
	 */
	public void setScore(long score);

	/**
	 * @return the communityOwned
	 */
	public boolean isCommunityOwned();

	/**
	 * @param communityOwned the communityOwned to set
	 */
	public void setCommunityOwned(boolean communityOwned);

	/**
	 * @return the title
	 */
	public String getTitle();

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title);

	/**
	 * @return the tags
	 */
	public List<String> getTags();

	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags);

}