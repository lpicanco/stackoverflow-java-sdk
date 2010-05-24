package com.google.code.stackoverflow.schema;


import com.google.code.stackoverflow.common.PagedList;

/**
 * The Interface Answers.
 */
public interface Answers extends SchemaEntity {

	/**
	 * Gets the answers.
	 * 
	 * @return the answers
	 */
	public PagedList<Answer> getAnswers();

	/**
	 * Sets the answers.
	 * 
	 * @param answers the new answers
	 */
	public void setAnswers(PagedList<Answer> answers);

}