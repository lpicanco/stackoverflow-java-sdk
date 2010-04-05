package com.google.code.stackoverflow.schema;

public interface Tag extends SchemaEntity {

	/**
	 * @return the name
	 */
	public String getName();

	/**
	 * @param name the name to set
	 */
	public void setName(String name);

	/**
	 * @return the count
	 */
	public long getCount();

	/**
	 * @param count the count to set
	 */
	public void setCount(long count);

}