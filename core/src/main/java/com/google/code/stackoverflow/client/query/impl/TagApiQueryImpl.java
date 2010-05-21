/**
 * 
 */
package com.google.code.stackoverflow.client.query.impl;


import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.common.PagedList;
import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.provider.url.DefaultApiUrlBuilder;
import com.google.code.stackoverflow.client.query.TagApiQuery;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Range;
import com.google.code.stackoverflow.schema.Tag;
import com.google.code.stackoverflow.schema.adapter.json.TagsImpl;

/**
 * The Class TagApiQueryImpl.
 */
public class TagApiQueryImpl extends BaseStackOverflowApiQuery<Tag> implements TagApiQuery {

	/**
	 * Instantiates a new tag api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public TagApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.TagApiQuery#withPaging(com.google.code.stackoverflow.schema.Paging)
	 */
	@Override
	public TagApiQuery withPaging(Paging paging) {
		apiUrlBuilder.withPaging(paging);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.TagApiQuery#withSort(com.google.code.stackoverflow.schema.Tag.SortOrder)
	 */
	@Override
	public TagApiQuery withSort(Tag.SortOrder sort) {
		apiUrlBuilder.withSort(sort);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.TagApiQuery#withUserIds(long[])
	 */
	@Override
	public TagApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.TagApiQuery#withClassification(com.google.code.stackoverflow.client.query.TagApiQuery.Classification)
	 */
	@Override
	public TagApiQuery withClassification(Classification classification) {
		switch (classification) {
		case BY_USER:
			((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_TAGS_FOR_USER);
			
			break;

		default:
			((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_TAGS);
		
			break;
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected PagedList<Tag> unmarshall(JSONObject json) {
		TagsImpl adapter = new TagsImpl();
		adapter.adaptFrom(json);
		return adapter.getTags();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_TAGS, getApplicationKey(), getApiVersion());
	}

	@Override
	public TagApiQuery withRange(Range range) {
		apiUrlBuilder.withRange(range);
		return this;
	}
}
