/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import java.util.Set;

import com.google.code.stackoverflow.schema.Answer;
import com.google.code.stackoverflow.schema.FilterOption;

/**
 * @author nmukhtar
 *
 */
public interface AnswerApiQuery extends StackOverflowApiQuery<Answer> {
	
	public enum Classification {
		NONE, BY_USER, BY_QUESTION;
	}
	
	/**
	 * 
	 */
	public AnswerApiQuery withAnswerIds(long... answerIds);
	
	/**
	 * 
	 */
	public AnswerApiQuery withUserIds(long... userIds);
	
	/**
	 * 
	 */
	public AnswerApiQuery withQuestionIds(long... questionIds);
	
	/**
	 * 
	 */
	public AnswerApiQuery withSort(Answer.SortOrder sort);
	
	/**
	 * 
	 */
	public AnswerApiQuery withFetchOptions(Set<FilterOption> fetchOptions);
	
	/**
	 * 
	 */
	public AnswerApiQuery withClassification(Classification classification);
}
