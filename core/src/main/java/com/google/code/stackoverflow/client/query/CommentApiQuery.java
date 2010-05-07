/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Range;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * The Interface CommentApiQuery.
 */
public interface CommentApiQuery extends StackOverflowApiQuery<Comment> {
	
	/**
	 * The Enum Classification.
	 */
	public enum Classification {
		
		/** The COMMENT. */
		COMMENT, 
 /** The USE r_ comment. */
 USER_COMMENT, 
 /** The MENTION. */
 MENTION, 
 /** The CONVERSATION. */
 CONVERSATION;
	}

	/**
	 * With comment ids.
	 * 
	 * @param commentIds the comment ids
	 * 
	 * @return the comment api query
	 */
	public CommentApiQuery withCommentIds(long... commentIds);
	
	/**
	 * With user ids.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the comment api query
	 */
	public CommentApiQuery withUserIds(long... userIds);
	
	/**
	 * With to user id.
	 * 
	 * @param toUserId the to user id
	 * 
	 * @return the comment api query
	 */
	public CommentApiQuery withToUserId(long toUserId);
	
	/**
	 * With paging.
	 * 
	 * @param paging the paging
	 * 
	 * @return the comment api query
	 */
	public CommentApiQuery withPaging(Paging paging);

	/**
	 * With time period.
	 * 
	 * @param timePeriod the time period
	 * 
	 * @return the comment api query
	 */
	public CommentApiQuery withTimePeriod(TimePeriod timePeriod);

	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the comment api query
	 */
	public CommentApiQuery withSort(Comment.SortOrder sort);

	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the comment api query
	 */
	public CommentApiQuery withRange(Range range);
	
	/**
	 * With classification.
	 * 
	 * @param classification the classification
	 * 
	 * @return the comment api query
	 */
	public CommentApiQuery withClassification(Classification classification);
}
