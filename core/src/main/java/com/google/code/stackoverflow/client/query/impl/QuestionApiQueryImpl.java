/**
 * 
 */
package com.google.code.stackoverflow.client.query.impl;

import java.util.Arrays;
import java.util.Set;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.provider.url.DefaultApiUrlBuilder;
import com.google.code.stackoverflow.client.query.QuestionApiQuery;
import com.google.code.stackoverflow.common.PagedList;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Question;
import com.google.code.stackoverflow.schema.Range;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.adapter.json.QuestionsImpl;

/**
 * The Class QuestionApiQueryImpl.
 */
public class QuestionApiQueryImpl extends BaseStackOverflowApiQuery<Question> implements QuestionApiQuery {

	/**
	 * Instantiates a new question api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public QuestionApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.QuestionApiQuery#withFetchOptions(java.util.Set)
	 */
	@Override
	public QuestionApiQuery withFetchOptions(Set<FilterOption> fetchOptions) {
		apiUrlBuilder.withFetchOptions(fetchOptions);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.QuestionApiQuery#withPaging(com.google.code.stackoverflow.schema.Paging)
	 */
	@Override
	public QuestionApiQuery withPaging(Paging paging) {
		apiUrlBuilder.withPaging(paging);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.QuestionApiQuery#withQuestionIds(long[])
	 */
	@Override
	public QuestionApiQuery withQuestionIds(long... questionIds) {
		apiUrlBuilder.withIds(questionIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.QuestionApiQuery#withSort(com.google.code.stackoverflow.schema.Question.SortOrder)
	 */
	@Override
	public QuestionApiQuery withSort(Question.SortOrder sort) {
		apiUrlBuilder.withSort(sort);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.QuestionApiQuery#withSort(com.google.code.stackoverflow.schema.Question.UnansweredSortOrder)
	 */
	@Override
	public QuestionApiQuery withSort(Question.UnansweredSortOrder sort) {
		apiUrlBuilder.withSort(sort);
		return this;
	}
	
	@Override
	public QuestionApiQuery withSort(User.QuestionSortOrder sort) {
		apiUrlBuilder.withSort(sort);
		return this;
	}
	
	@Override
	public QuestionApiQuery withSort(User.FavoriteSortOrder sort) {
		apiUrlBuilder.withSort(sort);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.QuestionApiQuery#withTags(java.lang.String[])
	 */
	@Override
	public QuestionApiQuery withTags(String... tag) {
		apiUrlBuilder.withParameters("tagged", Arrays.asList(tag));
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.QuestionApiQuery#withTimePeriod(com.google.code.stackoverflow.schema.TimePeriod)
	 */
	@Override
	public QuestionApiQuery withTimePeriod(TimePeriod timePeriod) {
		apiUrlBuilder.withTimePeriod(timePeriod);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.QuestionApiQuery#withUserIds(long[])
	 */
	@Override
	public QuestionApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected PagedList<Question> unmarshall(JSONObject json) {
		QuestionsImpl adapter = new QuestionsImpl();
		adapter.adaptFrom(json);
		return adapter.getQuestions();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_QUESTIONS, getApplicationKey(), getApiVersion());
	}

	@Override
	public QuestionApiQuery withRange(Range range) {
		apiUrlBuilder.withRange(range);
		return this;
	}

	@Override
	public PagedList<Question> listFavoriteQuestions() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_FAVORITE_QUESTIONS);
		return super.list();
	}

	@Override
	public PagedList<Question> listTaggedQuestions() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_TAGGED_QUESTIONS);
		return super.list();
	}

	@Override
	public PagedList<Question> listUnansweredQuestions() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_UN_ANSWERED_QUESTIONS);
		return super.list();
	}
	
	@Override
	public PagedList<Question> list() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_QUESTIONS);
		return super.list();
	}

	@Override
	public PagedList<Question> listQuestionsByUser() {
		((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_QUESTIONS_BY_USER);
		return super.list();
	}
}
