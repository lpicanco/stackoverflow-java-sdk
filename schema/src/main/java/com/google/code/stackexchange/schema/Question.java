package com.google.code.stackexchange.schema;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Interface Question.
 */
public interface Question extends SchemaEntity {
	
	/**
	 * The Enum SortOrder.
	 */
	public enum SortOrder implements SortEnum {
		
		/** The ACTIVE. */
		ACTIVE("active"),
		
		/** The NEWEST. */
		NEWEST("newest"),
		
		/** The FEATURED. */
		FEATURED("featured"),
		
		/** The HOT. */
		HOT("hot"),
		
		/** The WEEKL y_ hot. */
		WEEKLY_HOT("week"),
		
		/** The MONTHL y_ hot. */
		MONTHLY_HOT("month"),
		
		/** The VOTES. */
		VOTES("votes");
		
	    /** The Constant stringToEnum. */
		private static final Map<String, SortOrder> stringToEnum = new HashMap<String, SortOrder>();

		static { // Initialize map from constant name to enum constant
			for (SortOrder op : values()) {
				stringToEnum.put(op.value(), op);
			}
		}
		
	    /** The value. */
	    private final String value;
	    
	    /**
    	 * Instantiates a new sort order.
    	 * 
    	 * @param value the value
    	 */
	    SortOrder(String value) {
	        this.value = value;
	    }

		/* (non-Javadoc)
		 * @see com.google.code.stackexchange.schema.ValueEnum#value()
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
		 * @see com.google.code.stackexchange.schema.SortEnum#order()
		 */
		@Override
		public Order order() {
			return null;
		}
	}
	
	/**
	 * The Enum UnansweredSortOrder.
	 */
	public enum UnansweredSortOrder implements SortEnum {
		
		/** The NEWEST. */
		NEWEST("newest"),
		
		/** The VOTES. */
		VOTES("votes");
		
	    /** The Constant stringToEnum. */
		private static final Map<String, UnansweredSortOrder> stringToEnum = new HashMap<String, UnansweredSortOrder>();

		static { // Initialize map from constant name to enum constant
			for (UnansweredSortOrder op : values()) {
				stringToEnum.put(op.value(), op);
			}
		}
		
	    /** The value. */
	    private final String value;
	    
	    /**
    	 * Instantiates a new unanswered sort order.
    	 * 
    	 * @param value the value
    	 */
	    UnansweredSortOrder(String value) {
	        this.value = value;
	    }

		/* (non-Javadoc)
		 * @see com.google.code.stackexchange.schema.ValueEnum#value()
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
		 * @return the unanswered sort order
		 */
		public static UnansweredSortOrder fromValue(String value) {
			return stringToEnum.get(value);
		}

		/* (non-Javadoc)
		 * @see com.google.code.stackexchange.schema.SortEnum#order()
		 */
		@Override
		public Order order() {
			return null;
		}
	}
	
	/**
	 * Gets the answers.
	 * 
	 * @return the answers
	 */
	public List<Answer> getAnswers();

	/**
	 * Sets the answers.
	 * 
	 * @param answers the new answers
	 */
	public void setAnswers(List<Answer> answers);

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
	 * Gets the owner.
	 * 
	 * @return the owner
	 */
	public User getOwner();

	/**
	 * Sets the owner.
	 * 
	 * @param owner the new owner
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
	 * Gets the tags.
	 * 
	 * @return the tags
	 */
	public List<String> getTags();

	/**
	 * Sets the tags.
	 * 
	 * @param tags the new tags
	 */
	public void setTags(List<String> tags);

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
	 * Gets the accepted answer id.
	 * 
	 * @return the accepted answer id
	 */
	public long getAcceptedAnswerId();

	/**
	 * Sets the accepted answer id.
	 * 
	 * @param acceptedAnswerId the new accepted answer id
	 */
	public void setAcceptedAnswerId(long acceptedAnswerId);

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
	 * Gets the closed date.
	 * 
	 * @return the closed date
	 */
	public Date getClosedDate();

	/**
	 * Sets the closed date.
	 * 
	 * @param closedDate the new closed date
	 */
	public void setClosedDate(Date closedDate);

	/**
	 * Gets the closed reason.
	 * 
	 * @return the closed reason
	 */
	public String getClosedReason();

	/**
	 * Sets the closed reason.
	 * 
	 * @param closedReason the new closed reason
	 */
	public void setClosedReason(String closedReason);

	/**
	 * Gets the locked date.
	 * 
	 * @return the locked date
	 */
	public Date getLockedDate();

	/**
	 * Sets the locked date.
	 * 
	 * @param lockedDate the new locked date
	 */
	public void setLockedDate(Date lockedDate);

	/**
	 * Gets the bounty closes date.
	 * 
	 * @return the bounty closes date
	 */
	public Date getBountyClosesDate();

	/**
	 * Sets the bounty closes date.
	 * 
	 * @param bountyClosesDate the new bounty closes date
	 */
	public void setBountyClosesDate(Date bountyClosesDate);

	/**
	 * Gets the bounty amount.
	 * 
	 * @return the bounty amount
	 */
	public long getBountyAmount();

	/**
	 * Sets the bounty amount.
	 * 
	 * @param bountyAmount the new bounty amount
	 */
	public void setBountyAmount(long bountyAmount);
	
	/**
	 * Gets the question timeline url.
	 * 
	 * @return the question timeline url
	 */
	public String getQuestionTimelineUrl();
	
	/**
	 * Sets the question timeline url.
	 * 
	 * @param questionTimelineUrl the new question timeline url
	 */
	public void setQuestionTimelineUrl(String questionTimelineUrl);

	/**
	 * Gets the question comments url.
	 * 
	 * @return the question comments url
	 */
	public String getQuestionCommentsUrl();

	/**
	 * Sets the question comments url.
	 * 
	 * @param questionCommentsUrl the new question comments url
	 */
	public void setQuestionCommentsUrl(String questionCommentsUrl);

	/**
	 * Gets the question answers url.
	 * 
	 * @return the question answers url
	 */
	public String getQuestionAnswersUrl();

	/**
	 * Sets the question answers url.
	 * 
	 * @param questionAnswersUrl the new question answers url
	 */
	public void setQuestionAnswersUrl(String questionAnswersUrl);
}