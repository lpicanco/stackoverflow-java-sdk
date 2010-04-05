package com.google.code.stackoverflow.schema;

import java.util.List;

public interface QuestionTimelines extends SchemaEntity {

	/**
	 * @return the timelines
	 */
	public List<Timeline> getTimelines();

	/**
	 * @param timelines the timelines to set
	 */
	public void setTimelines(List<Timeline> timelines);

}