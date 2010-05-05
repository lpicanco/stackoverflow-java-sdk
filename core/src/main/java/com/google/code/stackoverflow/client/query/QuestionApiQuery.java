/**
 * 
 */
package com.google.code.stackoverflow.client.query;

import java.util.Set;

import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Question;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * The Interface QuestionApiQuery.
 */
public interface QuestionApiQuery extends StackOverflowApiQuery<Question> {
	
	/**
	 * The Enum Classification.
	 */
	public enum Classification {
		
		/** The NONE. */
		NONE, 
 /** The UNANSWERED. */
 UNANSWERED, 
 /** The FAVORITE. */
 FAVORITE, 
 /** The TAGGED. */
 TAGGED;
	}

	/**
	 * With question ids.
	 * 
	 * @param questionIds the question ids
	 * 
	 * @return the question api query
	 */
	public QuestionApiQuery withQuestionIds(long... questionIds);
	
	/**
	 * With user ids.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the question api query
	 */
	public QuestionApiQuery withUserIds(long... userIds);
	
	/**
	 * With tags.
	 * 
	 * @param tag the tag
	 * 
	 * @return the question api query
	 */
	public QuestionApiQuery withTags(String... tag);
	
	/**
	 * With paging.
	 * 
	 * @param paging the paging
	 * 
	 * @return the question api query
	 */
	public QuestionApiQuery withPaging(Paging paging);

	/**
	 * With time period.
	 * 
	 * @param timePeriod the time period
	 * 
	 * @return the question api query
	 */
	public QuestionApiQuery withTimePeriod(TimePeriod timePeriod);

	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the question api query
	 */
	public QuestionApiQuery withSort(Question.SortOrder sort);

	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the question api query
	 */
	public QuestionApiQuery withSort(Question.UnansweredSortOrder sort);
	
	/**
	 * With fetch options.
	 * 
	 * @param fetchOptions the fetch options
	 * 
	 * @return the question api query
	 */
	public QuestionApiQuery withFetchOptions(Set<FilterOption> fetchOptions);
	
	/**
	 * With classification.
	 * 
	 * @param classification the classification
	 * 
	 * @return the question api query
	 */
	public QuestionApiQuery withClassification(Classification classification);
}
