package com.google.code.stackoverflow.schema;


import com.google.code.stackoverflow.client.common.PagedList;

/**
 * The Interface PostTimelines.
 */
public interface PostTimelines extends SchemaEntity {

	/**
	 * Gets the timelines.
	 * 
	 * @return the timelines
	 */
	public PagedList<PostTimeline> getTimelines();

	/**
	 * Sets the timelines.
	 * 
	 * @param timelines the new timelines
	 */
	public void setTimelines(PagedList<PostTimeline> timelines);

}