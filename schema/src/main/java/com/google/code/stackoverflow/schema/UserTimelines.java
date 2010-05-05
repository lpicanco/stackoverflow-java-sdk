package com.google.code.stackoverflow.schema;

import java.util.List;

/**
 * The Interface UserTimelines.
 */
public interface UserTimelines extends SchemaEntity {

	/**
	 * Gets the timelines.
	 * 
	 * @return the timelines
	 */
	public List<UserTimeline> getTimelines();

	/**
	 * Sets the timelines.
	 * 
	 * @param timelines the new timelines
	 */
	public void setTimelines(List<UserTimeline> timelines);

}