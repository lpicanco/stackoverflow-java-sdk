package com.google.code.stackoverflow.schema;

import java.util.List;

public interface UserTimelines extends SchemaEntity {

	/**
	 * @return the timelines
	 */
	public List<UserTimeline> getTimelines();

	/**
	 * @param timelines the timelines to set
	 */
	public void setTimelines(List<UserTimeline> timelines);

}