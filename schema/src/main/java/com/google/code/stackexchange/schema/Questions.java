package com.google.code.stackexchange.schema;


import com.google.code.stackexchange.common.PagedList;

/**
 * The Interface Questions.
 */
public interface Questions extends SchemaEntity {

	/**
	 * Gets the questions.
	 * 
	 * @return the questions
	 */
	public PagedList<Question> getQuestions();

	/**
	 * Sets the questions.
	 * 
	 * @param questions the new questions
	 */
	public void setQuestions(PagedList<Question> questions);

}