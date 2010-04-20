/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.query.UserTimelineApiQuery;
import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.adapter.json.UserTimelinesImpl;

/**
 * @author nmukhtar
 *
 */
public class UserTimelineApiQueryImpl extends BaseStackOverflowApiQuery<PostTimeline> implements UserTimelineApiQuery {

	public UserTimelineApiQueryImpl(String applicationId) {
		super(applicationId);
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_USER_TIMELINE, getApplicationKey(), getApiVersion());
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
	protected List<PostTimeline> unmarshall(JSONObject json) {
		UserTimelinesImpl adapter = new UserTimelinesImpl();
		adapter.adaptFrom(json);
		return adapter.getTimelines();
	}
}
