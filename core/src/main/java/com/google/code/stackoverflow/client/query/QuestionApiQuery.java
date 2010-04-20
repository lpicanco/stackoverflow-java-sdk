/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import java.util.Set;

import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Question;
import com.google.code.stackoverflow.schema.SortEnum;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * @author nmukhtar
 *
 */
public interface QuestionApiQuery extends StackOverflowApiQuery<Question> {
	
	public enum Classification {
		NONE, UNANSWERED, FAVORITE, TAGGED;
	}

	/**
	 * 
	 */
	public QuestionApiQuery withQuestionIds(long... questionIds);
	
	/**
	 * 
	 */
	public QuestionApiQuery withUserIds(long... userIds);
	
	/**
	 * 
	 */
	public QuestionApiQuery withTags(String... tag);
	
	/**
	 * 
	 */
	public QuestionApiQuery withPaging(Paging paging);

	/**
	 * 
	 */
	public QuestionApiQuery withTimePeriod(TimePeriod timePeriod);

	/**
	 * 
	 */
	public QuestionApiQuery withSort(SortEnum sort);

	/**
	 * 
	 */
	public QuestionApiQuery withFetchOptions(Set<FilterOption> fetchOptions);
	
	/**
	 * 
	 */
	public QuestionApiQuery withClassification(Classification classification);
}
