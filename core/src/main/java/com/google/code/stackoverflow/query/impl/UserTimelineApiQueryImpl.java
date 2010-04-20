/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import com.google.code.stackoverflow.query.UserTimelineApiQuery;
import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * @author nmukhtar
 *
 */
public class UserTimelineApiQueryImpl extends BaseStackOverflowApiQuery<PostTimeline> implements UserTimelineApiQuery {

	public UserTimelineApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	@Override
	public UserTimelineApiQuery withTimePeriod(TimePeriod timePeriod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserTimelineApiQuery withUserIds(long... userIds) {
		// TODO Auto-generated method stub
		return null;
	}
}
