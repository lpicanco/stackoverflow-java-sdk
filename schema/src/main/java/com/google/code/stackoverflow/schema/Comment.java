package com.google.code.stackoverflow.schema;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public interface Comment extends SchemaEntity {
	
	public enum SortOrder implements SortEnum {
		MOST_RECENTLY_CREATED("creation", Order.ASCENDING),
		LEAST_RECENTLY_CREATED("creation", Order.DESCENDING),
		MOST_VOTED("votes", Order.ASCENDING),
		LEAST_VOTED("votes", Order.DESCENDING);
		
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
	
	/**
	 * @return the commentId
	 */
	public long getCommentId();

	/**
	 * @param commentId the commentId to set
	 */
	public void setCommentId(long commentId);

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate();

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate);

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
	 * @return the postId
	 */
	public long getPostId();

	/**
	 * @param postId the postId to set
	 */
	public void setPostId(long postId);

	/**
	 * @return the postType
	 */
	public PostType getPostType();

	/**
	 * @param postType the postType to set
	 */
	public void setPostType(PostType postType);

	/**
	 * @return the body
	 */
	public String getBody();

	/**
	 * @param body the body to set
	 */
	public void setBody(String body);

	/**
	 * @return the replyToUserId
	 */
	public long getReplyToUserId();

	/**
	 * @param replyToUserId the replyToUserId to set
	 */
	public void setReplyToUserId(long replyToUserId);

	/**
	 * @return the score
	 */
	public long getScore();

	/**
	 * @param score the score to set
	 */
	public void setScore(long score);

	/**
	 * @return the editCount
	 */
	public long getEditCount();

	/**
	 * @param editCount the editCount to set
	 */
	public void setEditCount(long editCount);

}