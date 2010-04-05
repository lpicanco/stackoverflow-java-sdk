package com.google.code.stackoverflow.schema;

import java.util.List;

public interface Answers extends SchemaEntity {

	/**
	 * @return the answers
	 */
	public List<Answer> getAnswers();

	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(List<Answer> answers);

}