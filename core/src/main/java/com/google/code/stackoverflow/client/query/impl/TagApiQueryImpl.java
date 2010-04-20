/**
 * 
 */
package com.google.code.stackoverflow.client.query.impl;

import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.provider.url.DefaultApiUrlBuilder;
import com.google.code.stackoverflow.client.query.TagApiQuery;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Tag;
import com.google.code.stackoverflow.schema.adapter.json.TagsImpl;

/**
 * @author nmukhtar
 *
 */
public class TagApiQueryImpl extends BaseStackOverflowApiQuery<Tag> implements TagApiQuery {

	public TagApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	@Override
	public TagApiQuery withPaging(Paging paging) {
		apiUrlBuilder.withPaging(paging);
		return this;
	}

	@Override
	public TagApiQuery withSort(Tag.SortOrder sort) {
		apiUrlBuilder.withSort(sort);
		return this;
	}

	@Override
	public TagApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

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

	@Override
	protected List<Tag> unmarshall(JSONObject json) {
		TagsImpl adapter = new TagsImpl();
		adapter.adaptFrom(json);
		return adapter.getTags();
	}

	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_TAGS, getApplicationKey(), getApiVersion());
	}
}
