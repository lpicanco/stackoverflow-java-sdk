package com.google.code.stackoverflow.schema;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * The Interface Comment.
 */
public interface Comment extends SchemaEntity {
	
	/**
	 * The Enum SortOrder.
	 */
	public enum SortOrder implements SortEnum {
		
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
	 * Gets the comment id.
	 * 
	 * @return the comment id
	 */
	public long getCommentId();

	/**
	 * Sets the comment id.
	 * 
	 * @param commentId the new comment id
	 */
	public void setCommentId(long commentId);

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
	 * Gets the owner user id.
	 * 
	 * @return the owner user id
	 */
	public long getOwnerUserId();

	/**
	 * Sets the owner user id.
	 * 
	 * @param ownerUserId the new owner user id
	 */
	public void setOwnerUserId(long ownerUserId);

	/**
	 * Gets the owner display name.
	 * 
	 * @return the owner display name
	 */
	public String getOwnerDisplayName();

	/**
	 * Sets the owner display name.
	 * 
	 * @param ownerDisplayName the new owner display name
	 */
	public void setOwnerDisplayName(String ownerDisplayName);

	/**
	 * Gets the post id.
	 * 
	 * @return the post id
	 */
	public long getPostId();

	/**
	 * Sets the post id.
	 * 
	 * @param postId the new post id
	 */
	public void setPostId(long postId);

	/**
	 * Gets the post type.
	 * 
	 * @return the post type
	 */
	public PostType getPostType();

	/**
	 * Sets the post type.
	 * 
	 * @param postType the new post type
	 */
	public void setPostType(PostType postType);

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
	 * Gets the reply to user id.
	 * 
	 * @return the reply to user id
	 */
	public long getReplyToUserId();

	/**
	 * Sets the reply to user id.
	 * 
	 * @param replyToUserId the new reply to user id
	 */
	public void setReplyToUserId(long replyToUserId);

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
	 * Gets the edits the count.
	 * 
	 * @return the edits the count
	 */
	public long getEditCount();

	/**
	 * Sets the edits the count.
	 * 
	 * @param editCount the new edits the count
	 */
	public void setEditCount(long editCount);

}