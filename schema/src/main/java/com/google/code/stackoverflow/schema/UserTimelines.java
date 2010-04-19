package com.google.code.stackoverflow.schema;

import java.util.List;

public interface UserTimelines extends SchemaEntity {

	/**
	 * @return the timelines
	 */
	public List<PostTimeline> getTimelines();

	/**
	 * @param timelines the timelines to set
	 */
	public void setTimelines(List<PostTimeline> timelines);

}