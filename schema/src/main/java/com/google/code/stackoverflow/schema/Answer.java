package com.google.code.stackoverflow.schema;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Interface Answer.
 */
public interface Answer extends SchemaEntity {
	
	/**
	 * The Enum SortOrder.
	 */
	public enum SortOrder implements SortEnum {
		
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
	 * Gets the answer id.
	 * 
	 * @return the answer id
	 */
	public long getAnswerId();

	/**
	 * Sets the answer id.
	 * 
	 * @param answerId the new answer id
	 */
	public void setAnswerId(long answerId);

	/**
	 * Checks if is accepted.
	 * 
	 * @return true, if is accepted
	 */
	public boolean isAccepted();

	/**
	 * Sets the accepted.
	 * 
	 * @param accepted the new accepted
	 */
	public void setAccepted(boolean accepted);

	/**
	 * Gets the question id.
	 * 
	 * @return the question id
	 */
	public long getQuestionId();

	/**
	 * Sets the question id.
	 * 
	 * @param questionId the new question id
	 */
	public void setQuestionId(long questionId);

	/**
	 * Gets the owner display name.
	 * 
	 * @return the owner display name
	 */
	public User getOwner();

	/**
	 * Sets the owner display name.
	 * 
	 * @param ownerDisplayName the new owner display name
	 */
	public void setOwner(User owner);

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
	 * Gets the favorite count.
	 * 
	 * @return the favorite count
	 */
	public long getFavoriteCount();

	/**
	 * Sets the favorite count.
	 * 
	 * @param favoriteCount the new favorite count
	 */
	public void setFavoriteCount(long favoriteCount);

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
	 * Gets the score.
	 * 
	 * @return the score
	 */
	public long getScore();

	/**
	 * Sets the score.
	 * 
	 * @param score the new score
	 */
	public void setScore(long score);

	/**
	 * Checks if is community owned.
	 * 
	 * @return true, if is community owned
	 */
	public boolean isCommunityOwned();

	/**
	 * Sets the community owned.
	 * 
	 * @param communityOwned the new community owned
	 */
	public void setCommunityOwned(boolean communityOwned);

	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle();

	/**
	 * Sets the title.
	 * 
	 * @param title the new title
	 */
	public void setTitle(String title);
	
	/**
	 * Gets the body.
	 * 
	 * @return the body
	 */
	public String getBody();

	/**
	 * Sets the body.
	 * 
	 * @param body the new body
	 */
	public void setBody(String body);
	
	/**
	 * Gets the comments.
	 * 
	 * @return the comments
	 */
	public List<Comment> getComments();

	/**
	 * Sets the comments.
	 * 
	 * @param comments the new comments
	 */
	public void setComments(List<Comment> comments);

	/**
	 * Gets the last edit date.
	 * 
	 * @return the last edit date
	 */
	public Date getLastEditDate();

	/**
	 * Sets the last edit date.
	 * 
	 * @param lastEditDate the new last edit date
	 */
	public void setLastEditDate(Date lastEditDate);

	/**
	 * Gets the last activity date.
	 * 
	 * @return the last activity date
	 */
	public Date getLastActivityDate();

	/**
	 * Sets the last activity date.
	 * 
	 * @param lastActivityDate the new last activity date
	 */
	public void setLastActivityDate(Date lastActivityDate);
	
	/**
	 * Gets the answer comments url.
	 * 
	 * @return the answer comments url
	 */
	public String getAnswerCommentsUrl();

	/**
	 * Sets the answer comments url.
	 * 
	 * @param answerCommentsUrl the new answer comments url
	 */
	public void setAnswerCommentsUrl(String answerCommentsUrl);
}