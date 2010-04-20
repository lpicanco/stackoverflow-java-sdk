package com.google.code.stackoverflow.schema;

import java.util.List;

public interface Questions extends SchemaEntity {

	/**
	 * @return the questions
	 */
	public List<Question> getQuestions();

	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(List<Question> questions);

}