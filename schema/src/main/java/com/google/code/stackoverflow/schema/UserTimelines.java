package com.google.code.stackoverflow.schema;


import com.google.code.stackoverflow.common.PagedList;

/**
 * The Interface UserTimelines.
 */
public interface UserTimelines extends SchemaEntity {

	/**
	 * Gets the timelines.
	 * 
	 * @return the timelines
	 */
	public PagedList<UserTimeline> getTimelines();

	/**
	 * Sets the timelines.
	 * 
	 * @param timelines the new timelines
	 */
	public void setTimelines(PagedList<UserTimeline> timelines);

}