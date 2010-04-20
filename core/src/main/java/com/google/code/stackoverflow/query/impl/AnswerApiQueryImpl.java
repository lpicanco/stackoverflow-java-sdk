/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import java.util.List;
import java.util.Set;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.provider.url.DefaultApiUrlBuilder;
import com.google.code.stackoverflow.query.AnswerApiQuery;
import com.google.code.stackoverflow.schema.Answer;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.SortEnum;
import com.google.code.stackoverflow.schema.adapter.json.AnswersImpl;

/**
 * @author nmukhtar
 *
 */
public class AnswerApiQueryImpl extends BaseStackOverflowApiQuery<Answer> implements AnswerApiQuery {

	public AnswerApiQueryImpl(String applicationId) {
		super(applicationId);
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_ANSWER, getApplicationKey(), getApiVersion());
	}

	@Override
	public AnswerApiQuery withAnswerIds(long... answerIds) {
		apiUrlBuilder.withIds(answerIds);
		return this;
	}

	@Override
	public AnswerApiQuery withFetchOptions(Set<FilterOption> fetchOptions) {
		apiUrlBuilder.withFetchOptions(fetchOptions);
		return this;
	}

	@Override
	public AnswerApiQuery withSort(SortEnum sort) {
		apiUrlBuilder.withSort(sort);
		return this;
	}

	@Override
	public AnswerApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	@Override
	public AnswerApiQuery withClassification(Classification classification) {
		switch (classification) {
		case BY_USER:
			((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_ANSWERS_BY_USER);
			
			break;

		default:
			((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_ANSWER);
		
			break;
		}
		return this;
	}

	@Override
	protected List<Answer> unmarshall(JSONObject json) {
		AnswersImpl adapter = new AnswersImpl();
		adapter.adaptFrom(json);
		return adapter.getAnswers();
	}
}
