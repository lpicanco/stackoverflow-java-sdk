/**
 * 
 */
package com.google.code.stackexchange.client.query.impl;

import java.util.Set;

import org.json.simple.JSONObject;

import com.google.code.stackexchange.client.constant.StackExchangeApiMethods;
import com.google.code.stackexchange.client.provider.url.DefaultApiUrlBuilder;
import com.google.code.stackexchange.client.query.AnswerApiQuery;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Answer;
import com.google.code.stackexchange.schema.FilterOption;
import com.google.code.stackexchange.schema.Range;
import com.google.code.stackexchange.schema.adapter.json.AnswersImpl;

/**
 * The Class AnswerApiQueryImpl.
 */
public class AnswerApiQueryImpl extends BaseStackOverflowApiQuery<Answer> implements AnswerApiQuery {

	/**
	 * Instantiates a new answer api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public AnswerApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.AnswerApiQuery#withAnswerIds(long[])
	 */
	@Override
	public AnswerApiQuery withAnswerIds(long... answerIds) {
		apiUrlBuilder.withIds(answerIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.AnswerApiQuery#withFetchOptions(java.util.Set)
	 */
	@Override
	public AnswerApiQuery withFetchOptions(Set<FilterOption> fetchOptions) {
		apiUrlBuilder.withFetchOptions(fetchOptions);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.AnswerApiQuery#withSort(com.google.code.stackexchange.schema.Answer.SortOrder)
	 */
	@Override
	public AnswerApiQuery withSort(Answer.SortOrder sort) {
		apiUrlBuilder.withSort(sort);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.AnswerApiQuery#withUserIds(long[])
	 */
	@Override
	public AnswerApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.AnswerApiQuery#withQuestionIds(long[])
	 */
	@Override
	public AnswerApiQuery withQuestionIds(long... questionIds) {
		apiUrlBuilder.withIds(questionIds);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected PagedList<Answer> unmarshall(JSONObject json) {
		AnswersImpl adapter = new AnswersImpl();
		adapter.adaptFrom(json);
		return adapter.getAnswers();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackExchangeApiMethods.GET_ANSWER, getApplicationKey(), getApiVersion());
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.AnswerApiQuery#withRange(com.google.code.stackexchange.schema.Range)
	 */
	@Override
	public AnswerApiQuery withRange(Range range) {
		apiUrlBuilder.withRange(range);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.AnswerApiQuery#listByQuestions()
	 */
	@Override
	public PagedList<Answer> listByQuestions() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackExchangeApiMethods.GET_ANSWERS_BY_QUESTION);
		return super.list();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.AnswerApiQuery#listByUsers()
	 */
	@Override
	public PagedList<Answer> listByUsers() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackExchangeApiMethods.GET_ANSWERS_BY_USER);
		return super.list();
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.impl.BaseStackOverflowApiQuery#list()
	 */
	@Override
	public PagedList<Answer> list() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackExchangeApiMethods.GET_ANSWER);
		return super.list();
	}
}
