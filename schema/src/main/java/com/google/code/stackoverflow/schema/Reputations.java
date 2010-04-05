package com.google.code.stackoverflow.schema;

import java.util.List;

public interface Reputations extends SchemaEntity {

	/**
	 * @return the reputations
	 */
	public List<Reputation> getReputations();

	/**
	 * @param reputations the reputations to set
	 */
	public void setReputations(List<Reputation> reputations);

}