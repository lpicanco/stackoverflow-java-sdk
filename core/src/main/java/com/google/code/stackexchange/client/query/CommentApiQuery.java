/**
 * 
 */
package com.google.code.stackexchange.client.query;

import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Comment;
import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.Range;
import com.google.code.stackexchange.schema.TimePeriod;

/**
 * The Interface CommentApiQuery.
 */
public interface CommentApiQuery extends StackExchangeApiQuery<Comment> {
	
	/**
	 * List user comments.
	 * 
	 * @return the paged list< comment>
	 */
	public PagedList<Comment> listUserComments();
	
	/**
	 * List user mentions.
	 * 
	 * @return the paged list< comment>
	 */
	public PagedList<Comment> listUserMentions();

	/**
	 * List user comments to user.
	 * 
	 * @return the paged list< comment>
	 */
	public PagedList<Comment> listUserCommentsToUser();
	
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
	 * With range.
	 * 
	 * @param range the range
	 * 
	 * @return the comment api query
	 */
	public CommentApiQuery withRange(Range range);
}
