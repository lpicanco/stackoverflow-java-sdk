package com.google.code.stackexchange.schema;

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
	 * Gets the reply to user.
	 * 
	 * @return the reply to user
	 */
	public User getReplyToUser();

	/**
	 * Sets the reply to user.
	 * 
	 * @param replyToUser the new reply to user
	 */
	public void setReplyToUser(User replyToUser);

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