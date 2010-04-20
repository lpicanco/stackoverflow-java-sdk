/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import com.google.code.stackoverflow.query.ReputationApiQuery;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * @author nmukhtar
 *
 */
public class ReputationApiQueryImpl extends BaseStackOverflowApiQuery<Reputation> implements ReputationApiQuery {

	public ReputationApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	@Override
	public ReputationApiQuery withPaging(Paging paging) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReputationApiQuery withTimePeriod(TimePeriod timePeriod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReputationApiQuery withUserIds(long... userIds) {
		// TODO Auto-generated method stub
		return null;
	}

}
