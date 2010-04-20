/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.SortEnum;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * @author nmukhtar
 *
 */
public interface CommentApiQuery extends StackOverflowApiQuery<Comment> {
	
	public enum Classification {
		COMMENT, USER_COMMENT, MENTION, CONVERSATION;
	}

	/**
	 * 
	 */
	public CommentApiQuery withCommentIds(long... commentIds);
	
	/**
	 * 
	 */
	public CommentApiQuery withUserIds(long... userIds);
	
	/**
	 * 
	 */
	public CommentApiQuery withToUserId(long toUserId);
	
	/**
	 * 
	 */
	public CommentApiQuery withPaging(Paging paging);

	/**
	 * 
	 */
	public CommentApiQuery withTimePeriod(TimePeriod timePeriod);

	/**
	 * 
	 */
	public CommentApiQuery withSort(SortEnum sort);

	/**
	 * 
	 */
	public CommentApiQuery withClassification(Classification classification);
}
