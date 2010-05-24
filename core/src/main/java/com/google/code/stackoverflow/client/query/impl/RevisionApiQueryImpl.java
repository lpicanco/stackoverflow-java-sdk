/**
 * 
 */
package com.google.code.stackoverflow.client.query.impl;


import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.query.RevisionApiQuery;
import com.google.code.stackoverflow.common.PagedList;
import com.google.code.stackoverflow.schema.Revision;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.adapter.json.RevisionsImpl;

/**
 * The Class RevisionApiQueryImpl.
 */
public class RevisionApiQueryImpl extends BaseStackOverflowApiQuery<Revision> implements RevisionApiQuery {

	/**
	 * Instantiates a new revision api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public RevisionApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.RevisionApiQuery#withQuestionIds(long[])
	 */
	@Override
	public RevisionApiQuery withQuestionIds(long... questionIds) {
		apiUrlBuilder.withIds(questionIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.RevisionApiQuery#withRevisionGuid(java.lang.String)
	 */
	@Override
	public RevisionApiQuery withRevisionGuid(String revisionGuid) {
		apiUrlBuilder.withField("revisionguid", revisionGuid);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.RevisionApiQuery#withTimePeriod(com.google.code.stackoverflow.schema.TimePeriod)
	 */
	@Override
	public RevisionApiQuery withTimePeriod(TimePeriod timePeriod) {
		apiUrlBuilder.withTimePeriod(timePeriod);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected PagedList<Revision> unmarshall(JSONObject json) {
		RevisionsImpl adapter = new RevisionsImpl();
		adapter.adaptFrom(json);
		return adapter.getRevisions();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_REVISION_FOR_POST, getApplicationKey(), getApiVersion());
	}
}
