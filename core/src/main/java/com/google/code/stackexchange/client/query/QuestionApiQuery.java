/**
 * 
 */
package com.google.code.stackexchange.client.query;

import java.util.Set;

import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.FilterOption;
import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.Question;
import com.google.code.stackexchange.schema.Range;
import com.google.code.stackexchange.schema.TimePeriod;
import com.google.code.stackexchange.schema.User;

/**
 * The Interface QuestionApiQuery.
 */
public interface QuestionApiQuery extends StackExchangeApiQuery<Question> {
	
	/**
	 * List unanswered questions.
	 * 
	 * @return the paged list< question>
	 */
	public PagedList<Question> listUnansweredQuestions();
	
	/**
	 * List favorite questions.
	 * 
	 * @return the paged list< question>
	 */
	public PagedList<Question> listFavoriteQuestions();

	/**
	 * List tagged questions.
	 * 
	 * @return the paged list< question>
	 */
	public PagedList<Question> listTaggedQuestions();
	
	/**
	 * List questions by user.
	 * 
	 * @return the paged list< question>
	 */
	public PagedList<Question> listQuestionsByUser();
	
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
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the question api query
	 */
	public QuestionApiQuery withSort(User.QuestionSortOrder sort);
	
	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the question api query
	 */
	public QuestionApiQuery withSort(User.FavoriteSortOrder sort);
	
	/**
	 * With range.
	 * 
	 * @param range the range
	 * 
	 * @return the question api query
	 */
	public QuestionApiQuery withRange(Range range);
	
	/**
	 * With fetch options.
	 * 
	 * @param fetchOptions the fetch options
	 * 
	 * @return the question api query
	 */
	public QuestionApiQuery withFetchOptions(Set<FilterOption> fetchOptions);
}
