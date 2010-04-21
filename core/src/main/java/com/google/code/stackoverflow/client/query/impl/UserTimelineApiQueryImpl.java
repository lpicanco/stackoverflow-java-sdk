/**
 * 
 */
package com.google.code.stackoverflow.client.query.impl;

import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.query.UserTimelineApiQuery;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.UserTimeline;
import com.google.code.stackoverflow.schema.adapter.json.UserTimelinesImpl;

/**
 * @author nmukhtar
 *
 */
public class UserTimelineApiQueryImpl extends BaseStackOverflowApiQuery<UserTimeline> implements UserTimelineApiQuery {

	public UserTimelineApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	@Override
	public UserTimelineApiQuery withTimePeriod(TimePeriod timePeriod) {
		apiUrlBuilder.withTimePeriod(timePeriod);
		return this;
	}

	@Override
	public UserTimelineApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	@Override
	protected List<UserTimeline> unmarshall(JSONObject json) {
		UserTimelinesImpl adapter = new UserTimelinesImpl();
		adapter.adaptFrom(json);
		return adapter.getTimelines();
	}

	@Override
	public void reset() {
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_USER_TIMELINE, getApplicationKey(), getApiVersion());
	}
}
