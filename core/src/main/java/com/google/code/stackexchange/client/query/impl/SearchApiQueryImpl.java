/**
 * 
 */
package com.google.code.stackexchange.client.query.impl;

import java.util.Arrays;

import com.google.code.stackexchange.client.constant.StackExchangeApiMethods;
import com.google.code.stackexchange.client.provider.url.DefaultApiUrlBuilder;
import com.google.code.stackexchange.client.query.SearchApiQuery;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.Question;
import com.google.code.stackexchange.schema.Range;
import com.google.code.stackexchange.schema.TimePeriod;
import com.google.code.stackexchange.schema.User;
import com.google.gson.JsonObject;

/**
 * The Class QuestionApiQueryImpl.
 */
public class SearchApiQueryImpl extends BaseStackOverflowApiQuery<Question> implements SearchApiQuery {

	/**
	 * Instantiates a new question api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public SearchApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.QuestionApiQuery#withPaging(com.google.code.stackexchange.schema.Paging)
	 */
	@Override
	public SearchApiQuery withPaging(Paging paging) {
		apiUrlBuilder.withPaging(paging);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.QuestionApiQuery#withSort(com.google.code.stackexchange.schema.User.QuestionSortOrder)
	 */
	@Override
	public SearchApiQuery withSort(User.QuestionSortOrder sort) {
		apiUrlBuilder.withSort(sort);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.QuestionApiQuery#withTags(java.lang.String[])
	 */
	@Override
	public SearchApiQuery withTags(String... tag) {
		apiUrlBuilder.withParameters("tagged", Arrays.asList(tag));
		return this;
	}

	@Override
	public SearchApiQuery withOutTags(String... tag) {
		apiUrlBuilder.withParameters("nottagged", Arrays.asList(tag));
		return this;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.QuestionApiQuery#withTimePeriod(com.google.code.stackexchange.schema.TimePeriod)
	 */
	@Override
	public SearchApiQuery withTimePeriod(TimePeriod timePeriod) {
		apiUrlBuilder.withTimePeriod(timePeriod);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected PagedList<Question> unmarshall(JsonObject json) {
		return unmarshallList(Question.class, json);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackExchangeApiMethods.SEARCH_QUESTIONS, getApplicationKey(), getApiVersion());
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.QuestionApiQuery#withRange(com.google.code.stackexchange.schema.Range)
	 */
	@Override
	public SearchApiQuery withRange(Range range) {
		apiUrlBuilder.withRange(range);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.QuestionApiQuery#withRange(com.google.code.stackexchange.schema.Range)
	 */
	@Override
	public SearchApiQuery withInTitle(String inTitle) {
		apiUrlBuilder.withParameter("intitle", inTitle);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.impl.BaseStackOverflowApiQuery#list()
	 */
	@Override
	public PagedList<Question> list() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackExchangeApiMethods.SEARCH_QUESTIONS);
		return super.list();
	}
}
