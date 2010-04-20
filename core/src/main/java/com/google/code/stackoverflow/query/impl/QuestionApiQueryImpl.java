/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import java.util.Set;

import com.google.code.stackoverflow.query.QuestionApiQuery;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Question;
import com.google.code.stackoverflow.schema.SortEnum;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * @author nmukhtar
 *
 */
public class QuestionApiQueryImpl extends BaseStackOverflowApiQuery<Question> implements QuestionApiQuery {

	public QuestionApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	@Override
	public QuestionApiQuery withClassification(Classification classification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionApiQuery withFetchOptions(Set<FilterOption> fetchOptions) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionApiQuery withPaging(Paging paging) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionApiQuery withQuestionIds(long... questionIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionApiQuery withSort(SortEnum sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionApiQuery withTags(String... tag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionApiQuery withTimePeriod(TimePeriod timePeriod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionApiQuery withUserIds(long... userIds) {
		// TODO Auto-generated method stub
		return null;
	}

}
