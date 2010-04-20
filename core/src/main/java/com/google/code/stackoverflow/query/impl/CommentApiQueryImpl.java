/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import com.google.code.stackoverflow.query.CommentApiQuery;
import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.SortEnum;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * @author nmukhtar
 *
 */
public class CommentApiQueryImpl extends BaseStackOverflowApiQuery<Comment> implements CommentApiQuery {

	public CommentApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	@Override
	public CommentApiQuery withClassification(Classification classification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentApiQuery withCommentIds(long... commentIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentApiQuery withPaging(Paging paging) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentApiQuery withSort(SortEnum sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentApiQuery withTimePeriod(TimePeriod timePeriod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentApiQuery withToUserId(long toUserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentApiQuery withUserIds(long... userIds) {
		// TODO Auto-generated method stub
		return null;
	}
}
