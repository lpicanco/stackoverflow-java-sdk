/**
 * 
 */
package com.google.code.stackoverflow.query;

import java.util.Set;

import com.google.code.stackoverflow.schema.Answer;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.SortEnum;

/**
 * @author nmukhtar
 *
 */
public interface AnswerApiQuery extends StackOverflowApiQuery<Answer> {
	
	public enum Classification {
		NONE, BY_USER;
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
	public AnswerApiQuery withSort(SortEnum sort);
	
	/**
	 * 
	 */
	public AnswerApiQuery withFetchOptions(Set<FilterOption> fetchOptions);
	
	/**
	 * 
	 */
	public AnswerApiQuery withClassification(Classification classification);
}
