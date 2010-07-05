/**
 * 
 */
package com.google.code.stackexchange.client.query;

import java.util.Set;

import com.google.code.stackexchange.schema.FilterOption;
import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.Question;
import com.google.code.stackexchange.schema.Range;
import com.google.code.stackexchange.schema.TimePeriod;
import com.google.code.stackexchange.schema.User;

/**
 * The Interface QuestionApiQuery.
 */
public interface SearchApiQuery extends StackExchangeApiQuery<Question> {
	
	/**
	 * With question ids.
	 * 
	 * @param questionIds the question ids
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withQuestionIds(long... questionIds);
	
	/**
	 * With user ids.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withUserIds(long... userIds);
	
	/**
	 * With tags.
	 * 
	 * @param tag the tag
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withTags(String... tag);
	
	/**
	 * With paging.
	 * 
	 * @param paging the paging
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withPaging(Paging paging);

	/**
	 * With time period.
	 * 
	 * @param timePeriod the time period
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withTimePeriod(TimePeriod timePeriod);

	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withSort(Question.SortOrder sort);

	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withSort(Question.UnansweredSortOrder sort);
	
	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withSort(User.QuestionSortOrder sort);
	
	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withSort(User.FavoriteSortOrder sort);
	
	/**
	 * With range.
	 * 
	 * @param range the range
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withRange(Range range);
	
	/**
	 * With fetch options.
	 * 
	 * @param fetchOptions the fetch options
	 * 
	 * @return the question api query
	 */
	public SearchApiQuery withFetchOptions(Set<FilterOption> fetchOptions);

	public SearchApiQuery withInTitle(String searchString);
}
