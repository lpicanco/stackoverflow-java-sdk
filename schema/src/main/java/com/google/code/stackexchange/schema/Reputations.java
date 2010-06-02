package com.google.code.stackexchange.schema;


import com.google.code.stackexchange.common.PagedList;

/**
 * The Interface Reputations.
 */
public interface Reputations extends SchemaEntity {

	/**
	 * Gets the reputations.
	 * 
	 * @return the reputations
	 */
	public PagedList<Reputation> getReputations();

	/**
	 * Sets the reputations.
	 * 
	 * @param reputations the new reputations
	 */
	public void setReputations(PagedList<Reputation> reputations);

}