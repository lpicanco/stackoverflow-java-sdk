/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import com.google.code.stackoverflow.query.RevisionApiQuery;
import com.google.code.stackoverflow.schema.Revision;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * @author nmukhtar
 *
 */
public class RevisionApiQueryImpl extends BaseStackOverflowApiQuery<Revision> implements RevisionApiQuery {

	public RevisionApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	@Override
	public RevisionApiQuery withQuestionIds(long... questionIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RevisionApiQuery withRevisionGuid(String revisionGuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RevisionApiQuery withTimePeriod(TimePeriod timePeriod) {
		// TODO Auto-generated method stub
		return null;
	}

}
