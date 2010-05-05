package com.google.code.stackoverflow.schema;

import java.util.List;

/**
 * The Interface Questions.
 */
public interface Questions extends SchemaEntity {

	/**
	 * Gets the questions.
	 * 
	 * @return the questions
	 */
	public List<Question> getQuestions();

	/**
	 * Sets the questions.
	 * 
	 * @param questions the new questions
	 */
	public void setQuestions(List<Question> questions);

}