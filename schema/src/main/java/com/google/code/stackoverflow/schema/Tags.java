package com.google.code.stackoverflow.schema;


import com.google.code.stackoverflow.client.common.PagedList;

/**
 * The Interface Tags.
 */
public interface Tags extends SchemaEntity {

	/**
	 * Gets the tags.
	 * 
	 * @return the tags
	 */
	public PagedList<Tag> getTags();

	/**
	 * Sets the tags.
	 * 
	 * @param tags the new tags
	 */
	public void setTags(PagedList<Tag> tags);

}