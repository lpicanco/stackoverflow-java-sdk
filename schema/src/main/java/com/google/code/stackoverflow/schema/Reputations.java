package com.google.code.stackoverflow.schema;

import java.util.List;

/**
 * The Interface Reputations.
 */
public interface Reputations extends SchemaEntity {

	/**
	 * Gets the reputations.
	 * 
	 * @return the reputations
	 */
	public List<Reputation> getReputations();

	/**
	 * Sets the reputations.
	 * 
	 * @param reputations the new reputations
	 */
	public void setReputations(List<Reputation> reputations);

}