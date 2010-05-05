package com.google.code.stackoverflow.schema;

import java.util.List;

/**
 * The Interface Answers.
 */
public interface Answers extends SchemaEntity {

	/**
	 * Gets the answers.
	 * 
	 * @return the answers
	 */
	public List<Answer> getAnswers();

	/**
	 * Sets the answers.
	 * 
	 * @param answers the new answers
	 */
	public void setAnswers(List<Answer> answers);

}