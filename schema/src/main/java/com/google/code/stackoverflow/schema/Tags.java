package com.google.code.stackoverflow.schema;

import java.util.List;

/**
 * The Interface Tags.
 */
public interface Tags extends SchemaEntity {

	/**
	 * Gets the tags.
	 * 
	 * @return the tags
	 */
	public List<Tag> getTags();

	/**
	 * Sets the tags.
	 * 
	 * @param tags the new tags
	 */
	public void setTags(List<Tag> tags);

}