/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.query.RevisionApiQuery;
import com.google.code.stackoverflow.schema.Revision;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.adapter.json.RevisionsImpl;

/**
 * @author nmukhtar
 *
 */
public class RevisionApiQueryImpl extends BaseStackOverflowApiQuery<Revision> implements RevisionApiQuery {

	public RevisionApiQueryImpl(String applicationId) {
		super(applicationId);
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_REVISION_FOR_POST, getApplicationKey(), getApiVersion());
	}

	@Override
	public RevisionApiQuery withQuestionIds(long... questionIds) {
		apiUrlBuilder.withIds(questionIds);
		return this;
	}

	@Override
	public RevisionApiQuery withRevisionGuid(String revisionGuid) {
		apiUrlBuilder.withField("revisionguid", revisionGuid);
		return this;
	}

	@Override
	public RevisionApiQuery withTimePeriod(TimePeriod timePeriod) {
		apiUrlBuilder.withTimePeriod(timePeriod);
		return this;
	}

	@Override
	protected List<Revision> unmarshall(JSONObject json) {
		RevisionsImpl adapter = new RevisionsImpl();
		adapter.adaptFrom(json);
		return adapter.getRevisions();
	}
}
