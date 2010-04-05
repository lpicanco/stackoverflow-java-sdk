package com.google.code.stackoverflow.schema;

import java.util.List;

public interface Tags extends SchemaEntity {

	/**
	 * @return the tags
	 */
	public List<Tag> getTags();

	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<Tag> tags);

}