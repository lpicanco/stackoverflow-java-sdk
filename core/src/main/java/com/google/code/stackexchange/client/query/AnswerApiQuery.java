/**
 * 
 */
package com.google.code.stackexchange.client.query;

import java.util.Set;

import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Answer;
import com.google.code.stackexchange.schema.FilterOption;
import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.Range;

/**
 * The Interface AnswerApiQuery.
 */
public interface AnswerApiQuery extends StackExchangeApiQuery<Answer> {
	
	/**
	 * List by users.
	 * 
	 * @return the paged list< answer>
	 */
	public PagedList<Answer> listByUsers();
	
	/**
	 * List by questions.
	 * 
	 * @return the paged list< answer>
	 */
	public PagedList<Answer> listByQuestions();
	
	/**
	 * With answer ids.
	 * 
	 * @param answerIds the answer ids
	 * 
	 * @return the answer api query
	 */
	public AnswerApiQuery withAnswerIds(long... answerIds);
	
	/**
	 * With user ids.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the answer api query
	 */
	public AnswerApiQuery withUserIds(long... userIds);
	
	/**
	 * With question ids.
	 * 
	 * @param questionIds the question ids
	 * 
	 * @return the answer api query
	 */
	public AnswerApiQuery withQuestionIds(long... questionIds);
	
	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the answer api query
	 */
	public AnswerApiQuery withSort(Answer.SortOrder sort);
	
	/**
	 * With range.
	 * 
	 * @param range the range
	 * 
	 * @return the answer api query
	 */
	public AnswerApiQuery withRange(Range range);
	
	/**
	 * With paging.
	 * 
	 * @param paging the paging
	 * 
	 * @return the question api query
	 */
	public AnswerApiQuery withPaging(Paging paging);

	/**
	 * With fetch options.
	 * 
	 * @param fetchOptions the fetch options
	 * 
	 * @return the answer api query
	 */
	public AnswerApiQuery withFetchOptions(Set<FilterOption> fetchOptions);
}
