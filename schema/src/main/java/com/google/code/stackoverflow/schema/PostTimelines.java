package com.google.code.stackoverflow.schema;

import java.util.List;

/**
 * The Interface PostTimelines.
 */
public interface PostTimelines extends SchemaEntity {

	/**
	 * Gets the timelines.
	 * 
	 * @return the timelines
	 */
	public List<PostTimeline> getTimelines();

	/**
	 * Sets the timelines.
	 * 
	 * @param timelines the new timelines
	 */
	public void setTimelines(List<PostTimeline> timelines);

}