/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import java.util.Set;

import com.google.code.stackoverflow.query.AnswerApiQuery;
import com.google.code.stackoverflow.schema.Answer;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.SortEnum;

/**
 * @author nmukhtar
 *
 */
public class AnswerApiQueryImpl extends BaseStackOverflowApiQuery<Answer> implements AnswerApiQuery {

	public AnswerApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	@Override
	public AnswerApiQuery withAnswerIds(long... answerIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnswerApiQuery withFetchOptions(Set<FilterOption> fetchOptions) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnswerApiQuery withSort(SortEnum sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnswerApiQuery withUserIds(long... userIds) {
		// TODO Auto-generated method stub
		return null;
	}
}
