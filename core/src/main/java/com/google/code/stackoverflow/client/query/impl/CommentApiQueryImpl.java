/**
 * 
 */
package com.google.code.stackoverflow.client.query.impl;

import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.provider.url.DefaultApiUrlBuilder;
import com.google.code.stackoverflow.client.query.CommentApiQuery;
import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.adapter.json.CommentsImpl;

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

	@Override
	public CommentApiQuery withCommentIds(long... commentIds) {
		apiUrlBuilder.withIds(commentIds);
		return this;
	}

	@Override
	public CommentApiQuery withPaging(Paging paging) {
		apiUrlBuilder.withPaging(paging);
		return this;
	}

	@Override
	public CommentApiQuery withSort(Comment.SortOrder sort) {
		apiUrlBuilder.withSort(sort);
		return this;
	}

	@Override
	public CommentApiQuery withTimePeriod(TimePeriod timePeriod) {
		apiUrlBuilder.withTimePeriod(timePeriod);
		return this;
	}

	@Override
	public CommentApiQuery withToUserId(long toUserId) {
		apiUrlBuilder.withField("toid", String.valueOf(toUserId));
		return this;
	}

	@Override
	public CommentApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	@Override
	protected List<Comment> unmarshall(JSONObject json) {
		CommentsImpl adapter = new CommentsImpl();
		adapter.adaptFrom(json);
		return adapter.getComments();
	}

	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_COMMENT, getApplicationKey(), getApiVersion());
	}
}
