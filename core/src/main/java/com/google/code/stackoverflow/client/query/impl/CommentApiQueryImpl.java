/**
 * 
 */
package com.google.code.stackoverflow.client.query.impl;


import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.common.PagedList;
import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.provider.url.DefaultApiUrlBuilder;
import com.google.code.stackoverflow.client.query.CommentApiQuery;
import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Range;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.adapter.json.CommentsImpl;

/**
 * The Class CommentApiQueryImpl.
 */
public class CommentApiQueryImpl extends BaseStackOverflowApiQuery<Comment> implements CommentApiQuery {

	/**
	 * Instantiates a new comment api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public CommentApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.CommentApiQuery#withClassification(com.google.code.stackoverflow.client.query.CommentApiQuery.Classification)
	 */
	@Override
	public CommentApiQuery withClassification(Classification classification) {
		switch (classification) {
		case MENTION:
			((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_USER_MENTIONS);
			
			break;

		case USER_COMMENT:
			((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_COMMENTS_BY_USER);
			
			break;
			
		case CONVERSATION:
			((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_COMMENTS_BY_USER_TO_USER);
			
			break;
			
		default:
			((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_COMMENT);
		
			break;
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.CommentApiQuery#withCommentIds(long[])
	 */
	@Override
	public CommentApiQuery withCommentIds(long... commentIds) {
		apiUrlBuilder.withIds(commentIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.CommentApiQuery#withPaging(com.google.code.stackoverflow.schema.Paging)
	 */
	@Override
	public CommentApiQuery withPaging(Paging paging) {
		apiUrlBuilder.withPaging(paging);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.CommentApiQuery#withSort(com.google.code.stackoverflow.schema.Comment.SortOrder)
	 */
	@Override
	public CommentApiQuery withSort(Comment.SortOrder sort) {
		apiUrlBuilder.withSort(sort);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.CommentApiQuery#withTimePeriod(com.google.code.stackoverflow.schema.TimePeriod)
	 */
	@Override
	public CommentApiQuery withTimePeriod(TimePeriod timePeriod) {
		apiUrlBuilder.withTimePeriod(timePeriod);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.CommentApiQuery#withToUserId(long)
	 */
	@Override
	public CommentApiQuery withToUserId(long toUserId) {
		apiUrlBuilder.withField("toid", String.valueOf(toUserId));
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.CommentApiQuery#withUserIds(long[])
	 */
	@Override
	public CommentApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected PagedList<Comment> unmarshall(JSONObject json) {
		CommentsImpl adapter = new CommentsImpl();
		adapter.adaptFrom(json);
		return adapter.getComments();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_COMMENT, getApplicationKey(), getApiVersion());
	}

	@Override
	public CommentApiQuery withRange(Range range) {
		apiUrlBuilder.withRange(range);
		return this;
	}
}
