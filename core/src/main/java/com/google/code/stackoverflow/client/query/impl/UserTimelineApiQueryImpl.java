/**
 * 
 */
package com.google.code.stackoverflow.client.query.impl;


import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.query.UserTimelineApiQuery;
import com.google.code.stackoverflow.common.PagedList;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.UserTimeline;
import com.google.code.stackoverflow.schema.adapter.json.UserTimelinesImpl;

/**
 * The Class UserTimelineApiQueryImpl.
 */
public class UserTimelineApiQueryImpl extends BaseStackOverflowApiQuery<UserTimeline> implements UserTimelineApiQuery {

	/**
	 * Instantiates a new user timeline api query impl.
	 * 
	 * @param applicationId the application id
	 */
	public UserTimelineApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.UserTimelineApiQuery#withTimePeriod(com.google.code.stackoverflow.schema.TimePeriod)
	 */
	@Override
	public UserTimelineApiQuery withTimePeriod(TimePeriod timePeriod) {
		apiUrlBuilder.withTimePeriod(timePeriod);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.UserTimelineApiQuery#withUserIds(long[])
	 */
	@Override
	public UserTimelineApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.impl.BaseStackOverflowApiQuery#unmarshall(org.json.simple.JSONObject)
	 */
	@Override
	protected PagedList<UserTimeline> unmarshall(JSONObject json) {
		UserTimelinesImpl adapter = new UserTimelinesImpl();
		adapter.adaptFrom(json);
		return adapter.getTimelines();
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.client.query.StackOverflowApiQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_USER_TIMELINE, getApplicationKey(), getApiVersion());
	}
}
