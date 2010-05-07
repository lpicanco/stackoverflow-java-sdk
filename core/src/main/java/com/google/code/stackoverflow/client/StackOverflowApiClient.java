/**
 *
 */
package com.google.code.stackoverflow.client;

import java.util.List;
import java.util.Set;

import com.google.code.stackoverflow.schema.Answer;
import com.google.code.stackoverflow.schema.Badge;
import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Question;
import com.google.code.stackoverflow.schema.Range;
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.Revision;
import com.google.code.stackoverflow.schema.Statistics;
import com.google.code.stackoverflow.schema.Tag;
import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.UserTimeline;


/**
 * The Interface StackOverflowApiClient.
 */
public interface StackOverflowApiClient extends StackOverflowAuthenticationClient {
	
	// Question Methods
	/**
	 * Gets the questions.
	 * 
	 * @return the questions
	 */
	public List<Question> getQuestions();
	
	/**
	 * Gets the questions.
	 * 
	 * @param paging the paging
	 * 
	 * @return the questions
	 */
	public List<Question> getQuestions(Paging paging);
	
	/**
	 * Gets the questions.
	 * 
	 * @param timePeriod the time period
	 * 
	 * @return the questions
	 */
	public List<Question> getQuestions(TimePeriod timePeriod);
	
	/**
	 * Gets the questions.
	 * 
	 * @param sort the sort
	 * 
	 * @return the questions
	 */
	public List<Question> getQuestions(Question.SortOrder sort);
	
	/**
	 * Gets the questions.
	 * 
	 * @param sort the sort
	 * 
	 * @return the questions
	 */
	public List<Question> getQuestions(Question.SortOrder sort, Range range);
	
	/**
	 * Gets the questions.
	 * 
	 * @param filterOptions the filter options
	 * 
	 * @return the questions
	 */
	public List<Question> getQuestions(Set<FilterOption> filterOptions);
	
	/**
	 * Gets the questions.
	 * 
	 * @param sort the sort
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param filterOptions the filter options
	 * 
	 * @return the questions
	 */
	public List<Question> getQuestions(Question.SortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	
	/**
	 * Gets the unanswered questions.
	 * 
	 * @return the unanswered questions
	 */
	public List<Question> getUnansweredQuestions();
	
	/**
	 * Gets the unanswered questions.
	 * 
	 * @param sort the sort
	 * 
	 * @return the unanswered questions
	 */
	public List<Question> getUnansweredQuestions(Question.UnansweredSortOrder sort);
	
	/**
	 * Gets the unanswered questions.
	 * 
	 * @param sort the sort
	 * 
	 * @return the unanswered questions
	 */
	public List<Question> getUnansweredQuestions(Question.UnansweredSortOrder sort, Range range);
	
	/**
	 * Gets the unanswered questions.
	 * 
	 * @param paging the paging
	 * 
	 * @return the unanswered questions
	 */
	public List<Question> getUnansweredQuestions(Paging paging);
	
	/**
	 * Gets the unanswered questions.
	 * 
	 * @param timePeriod the time period
	 * 
	 * @return the unanswered questions
	 */
	public List<Question> getUnansweredQuestions(TimePeriod timePeriod);
	
	/**
	 * Gets the unanswered questions.
	 * 
	 * @param filterOptions the filter options
	 * 
	 * @return the unanswered questions
	 */
	public List<Question> getUnansweredQuestions(Set<FilterOption> filterOptions);
	
	/**
	 * Gets the unanswered questions.
	 * 
	 * @param sort the sort
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param filterOptions the filter options
	 * 
	 * @return the unanswered questions
	 */
	public List<Question> getUnansweredQuestions(Question.UnansweredSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	
	/**
	 * Gets the tagged questions.
	 * 
	 * @param tags the tags
	 * 
	 * @return the tagged questions
	 */
	public List<Question> getTaggedQuestions(List<String> tags);
	
	/**
	 * Gets the tagged questions.
	 * 
	 * @param tags the tags
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param filterOptions the filter options
	 * 
	 * @return the tagged questions
	 */
	public List<Question> getTaggedQuestions(List<String> tags, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	
	/**
	 * Gets the questions by users.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the questions by users
	 */
	public List<Question> getQuestionsByUsers(long... userIds);
	
	/**
	 * Gets the questions by users.
	 * 
	 * @param sort the sort
	 * @param userIds the user ids
	 * 
	 * @return the questions by users
	 */
	public List<Question> getQuestionsByUsers(User.QuestionSortOrder sort, long... userIds);
	
	/**
	 * Gets the questions by users.
	 * 
	 * @param sort the sort
	 * @param userIds the user ids
	 * 
	 * @return the questions by users
	 */
	public List<Question> getQuestionsByUsers(User.QuestionSortOrder sort, Range range, long... userIds);
	
	/**
	 * Gets the questions by users.
	 * 
	 * @param paging the paging
	 * @param userIds the user ids
	 * 
	 * @return the questions by users
	 */
	public List<Question> getQuestionsByUsers(Paging paging, long... userIds);
	
	/**
	 * Gets the questions by users.
	 * 
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the questions by users
	 */
	public List<Question> getQuestionsByUsers(TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the questions by users.
	 * 
	 * @param filterOptions the filter options
	 * @param userIds the user ids
	 * 
	 * @return the questions by users
	 */
	public List<Question> getQuestionsByUsers(Set<FilterOption> filterOptions, long... userIds);
	
	/**
	 * Gets the questions by users.
	 * 
	 * @param sort the sort
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param filterOptions the filter options
	 * @param userIds the user ids
	 * 
	 * @return the questions by users
	 */
	public List<Question> getQuestionsByUsers(User.QuestionSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions, long... userIds);
	
	/**
	 * Gets the favorite questions by users.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the favorite questions by users
	 */
	public List<Question> getFavoriteQuestionsByUsers(long... userIds);
	
	/**
	 * Gets the favorite questions by users.
	 * 
	 * @param sort the sort
	 * @param userIds the user ids
	 * 
	 * @return the favorite questions by users
	 */
	public List<Question> getFavoriteQuestionsByUsers(User.FavoriteSortOrder sort, long... userIds);
	
	/**
	 * Gets the favorite questions by users.
	 * 
	 * @param sort the sort
	 * @param userIds the user ids
	 * 
	 * @return the favorite questions by users
	 */
	public List<Question> getFavoriteQuestionsByUsers(User.FavoriteSortOrder sort, Range range, long... userIds);
	
	/**
	 * Gets the favorite questions by users.
	 * 
	 * @param paging the paging
	 * @param userIds the user ids
	 * 
	 * @return the favorite questions by users
	 */
	public List<Question> getFavoriteQuestionsByUsers(Paging paging, long... userIds);
	
	/**
	 * Gets the favorite questions by users.
	 * 
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the favorite questions by users
	 */
	public List<Question> getFavoriteQuestionsByUsers(TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the favorite questions by users.
	 * 
	 * @param filterOptions the filter options
	 * @param userIds the user ids
	 * 
	 * @return the favorite questions by users
	 */
	public List<Question> getFavoriteQuestionsByUsers(Set<FilterOption> filterOptions, long... userIds);
	
	/**
	 * Gets the favorite questions by users.
	 * 
	 * @param sort the sort
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param filterOptions the filter options
	 * @param userIds the user ids
	 * 
	 * @return the favorite questions by users
	 */
	public List<Question> getFavoriteQuestionsByUsers(User.FavoriteSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions, long... userIds);
	
	/**
	 * Gets the questions.
	 * 
	 * @param questionIds the question ids
	 * 
	 * @return the questions
	 */
	public List<Question> getQuestions(long... questionIds);
	
	/**
	 * Gets the questions.
	 * 
	 * @param paging the paging
	 * @param questionIds the question ids
	 * 
	 * @return the questions
	 */
	public List<Question> getQuestions(Paging paging, long... questionIds);
	
	/**
	 * Gets the questions.
	 * 
	 * @param filterOptions the filter options
	 * @param questionIds the question ids
	 * 
	 * @return the questions
	 */
	public List<Question> getQuestions(Set<FilterOption> filterOptions, long... questionIds);
	
	/**
	 * Gets the questions.
	 * 
	 * @param paging the paging
	 * @param filterOptions the filter options
	 * @param questionIds the question ids
	 * 
	 * @return the questions
	 */
	public List<Question> getQuestions(Paging paging, Set<FilterOption> filterOptions, long... questionIds);
	
	/**
	 * Gets the questions timeline.
	 * 
	 * @param questionIds the question ids
	 * 
	 * @return the questions timeline
	 */
	public List<PostTimeline> getQuestionsTimeline(long... questionIds);
	
	/**
	 * Gets the questions timeline.
	 * 
	 * @param timePeriod the time period
	 * @param questionIds the question ids
	 * 
	 * @return the questions timeline
	 */
	public List<PostTimeline> getQuestionsTimeline(TimePeriod timePeriod, long... questionIds);
	
	/**
	 * Search questions.
	 * 
	 * @param query the query
	 * 
	 * @return the list< question>
	 */
	public List<Question> searchQuestions(String query);
	
	/**
	 * Search questions.
	 * 
	 * @param query the query
	 * @param sort the sort
	 * @param paging the paging
	 * 
	 * @return the list< question>
	 */
	public List<Question> searchQuestions(String query, User.QuestionSortOrder sort, Paging paging);
	
	/**
	 * Search questions.
	 * 
	 * @param query the query
	 * @param sort the sort
	 * @param paging the paging
	 * 
	 * @return the list< question>
	 */
	public List<Question> searchQuestions(String query, User.QuestionSortOrder sort, Range range);
	
	/**
	 * Search questions.
	 * 
	 * @param includeTags the include tags
	 * @param excludeTags the exclude tags
	 * 
	 * @return the list< question>
	 */
	public List<Question> searchQuestions(List<String> includeTags, List<String> excludeTags);
	
	/**
	 * Search questions.
	 * 
	 * @param includeTags the include tags
	 * @param excludeTags the exclude tags
	 * @param sort the sort
	 * @param paging the paging
	 * 
	 * @return the list< question>
	 */
	public List<Question> searchQuestions(List<String> includeTags, List<String> excludeTags, User.QuestionSortOrder sort, Paging paging);
	
	/**
	 * Search questions.
	 * 
	 * @param query the query
	 * @param includeTags the include tags
	 * @param excludeTags the exclude tags
	 * @param sort the sort
	 * @param paging the paging
	 * 
	 * @return the list< question>
	 */
	public List<Question> searchQuestions(String query, List<String> includeTags, List<String> excludeTags, User.QuestionSortOrder sort, Paging paging);
	
	// User Methods
	/**
	 * Gets the users.
	 * 
	 * @return the users
	 */
	public List<User> getUsers();
	
	/**
	 * Gets the users.
	 * 
	 * @param paging the paging
	 * 
	 * @return the users
	 */
	public List<User> getUsers(Paging paging);
	
	/**
	 * Gets the users.
	 * 
	 * @param filter the filter
	 * 
	 * @return the users
	 */
	public List<User> getUsers(String filter);
	
	/**
	 * Gets the users.
	 * 
	 * @param sort the sort
	 * 
	 * @return the users
	 */
	public List<User> getUsers(User.SortOrder sort);
	
	/**
	 * Gets the users.
	 * 
	 * @param sort the sort
	 * 
	 * @return the users
	 */
	public List<User> getUsers(User.SortOrder sort, Range range);
	
	/**
	 * Gets the users.
	 * 
	 * @param filter the filter
	 * @param sort the sort
	 * @param paging the paging
	 * 
	 * @return the users
	 */
	public List<User> getUsers(String filter, User.SortOrder sort, Paging paging);
	
	/**
	 * Gets the users timeline.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the users timeline
	 */
	public List<UserTimeline> getUsersTimeline(long... userIds);
	
	/**
	 * Gets the users timeline.
	 * 
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users timeline
	 */
	public List<UserTimeline> getUsersTimeline(TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the users mentions.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the users mentions
	 */
	public List<Comment> getUsersMentions(long... userIds);
	
	/**
	 * Gets the users mentions.
	 * 
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users mentions
	 */
	public List<Comment> getUsersMentions(TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the users reputations.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the users reputations
	 */
	public List<Reputation> getUsersReputations(long... userIds);
	
	/**
	 * Gets the users reputations.
	 * 
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users reputations
	 */
	public List<Reputation> getUsersReputations(TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the users reputations.
	 * 
	 * @param paging the paging
	 * @param userIds the user ids
	 * 
	 * @return the users reputations
	 */
	public List<Reputation> getUsersReputations(Paging paging, long... userIds);
	
	/**
	 * Gets the users reputations.
	 * 
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users reputations
	 */
	public List<Reputation> getUsersReputations(Paging paging, TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the users.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the users
	 */
	public List<User> getUsers(long... userIds);
	
	// Badge Methods
	/**
	 * Gets the badges.
	 * 
	 * @return the badges
	 */
	public List<Badge> getBadges();
	
	/**
	 * Gets the badges by name.
	 * 
	 * @return the badges by name
	 */
	public List<Badge> getBadgesByName();
	
	/**
	 * Gets the badges by tags.
	 * 
	 * @return the badges by tags
	 */
	public List<Badge> getBadgesByTags();
	
	/**
	 * Gets the badges for users.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the badges for users
	 */
	public List<Badge> getBadgesForUsers(long... userIds);
	
	/**
	 * Gets the badges recipients.
	 * 
	 * @param badgeIds the badge ids
	 * 
	 * @return the badges recipients
	 */
	public List<User> getBadgesRecipients(long... badgeIds);
	
	/**
	 * Gets the badges recipients.
	 * 
	 * @param paging the paging
	 * @param badgeIds the badge ids
	 * 
	 * @return the badges recipients
	 */
	public List<User> getBadgesRecipients(Paging paging, long... badgeIds);

	// Tag Methods
	/**
	 * Gets the tags.
	 * 
	 * @return the tags
	 */
	public List<Tag> getTags();
	
	/**
	 * Gets the tags.
	 * 
	 * @param sort the sort
	 * 
	 * @return the tags
	 */
	public List<Tag> getTags(Tag.SortOrder sort);
	
	/**
	 * Gets the tags.
	 * 
	 * @param paging the paging
	 * 
	 * @return the tags
	 */
	public List<Tag> getTags(Paging paging);
	
	/**
	 * Gets the tags.
	 * 
	 * @param sort the sort
	 * @param paging the paging
	 * 
	 * @return the tags
	 */
	public List<Tag> getTags(Tag.SortOrder sort, Paging paging);
	
	/**
	 * Gets the tags for users.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the tags for users
	 */
	public List<Tag> getTagsForUsers(long... userIds);
	
	/**
	 * Gets the tags for users.
	 * 
	 * @param paging the paging
	 * @param userIds the user ids
	 * 
	 * @return the tags for users
	 */
	public List<Tag> getTagsForUsers(Paging paging, long... userIds);
	
	// Answer Methods
	/**
	 * Gets the answers by questions.
	 * 
	 * @param questionIds the question ids
	 * 
	 * @return the answers by questions
	 */
	public List<Answer> getAnswersByQuestions(long... questionIds); 
	
	/**
	 * Gets the answers by questions.
	 * 
	 * @param filterOptions the filter options
	 * @param questionIds the question ids
	 * 
	 * @return the answers by questions
	 */
	public List<Answer> getAnswersByQuestions(Set<FilterOption> filterOptions, long... questionIds); 
	
	/**
	 * Gets the answers by questions.
	 * 
	 * @param sort the sort
	 * @param questionIds the question ids
	 * 
	 * @return the answers by questions
	 */
	public List<Answer> getAnswersByQuestions(Answer.SortOrder sort, long... questionIds);
	
	/**
	 * Gets the answers by questions.
	 * 
	 * @param sort the sort
	 * @param questionIds the question ids
	 * 
	 * @return the answers by questions
	 */
	public List<Answer> getAnswersByQuestions(Answer.SortOrder sort, Range range, long... questionIds);
	
	/**
	 * Gets the answers by questions.
	 * 
	 * @param sort the sort
	 * @param filterOptions the filter options
	 * @param questionIds the question ids
	 * 
	 * @return the answers by questions
	 */
	public List<Answer> getAnswersByQuestions(Answer.SortOrder sort, Set<FilterOption> filterOptions, long... questionIds);
	
	/**
	 * Gets the answers by users.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the answers by users
	 */
	public List<Answer> getAnswersByUsers(long... userIds); 
	
	/**
	 * Gets the answers by users.
	 * 
	 * @param filterOptions the filter options
	 * @param userIds the user ids
	 * 
	 * @return the answers by users
	 */
	public List<Answer> getAnswersByUsers(Set<FilterOption> filterOptions, long... userIds); 
	
	/**
	 * Gets the answers by users.
	 * 
	 * @param sort the sort
	 * @param userIds the user ids
	 * 
	 * @return the answers by users
	 */
	public List<Answer> getAnswersByUsers(Answer.SortOrder sort, long... userIds);
	
	/**
	 * Gets the answers by users.
	 * 
	 * @param sort the sort
	 * @param userIds the user ids
	 * 
	 * @return the answers by users
	 */
	public List<Answer> getAnswersByUsers(Answer.SortOrder sort, Range range, long... userIds);
	
	/**
	 * Gets the answers by users.
	 * 
	 * @param sort the sort
	 * @param filterOptions the filter options
	 * @param userIds the user ids
	 * 
	 * @return the answers by users
	 */
	public List<Answer> getAnswersByUsers(Answer.SortOrder sort, Set<FilterOption> filterOptions, long... userIds);
	
	/**
	 * Gets the answers.
	 * 
	 * @param answerIds the answer ids
	 * 
	 * @return the answers
	 */
	public List<Answer> getAnswers(long... answerIds);
	
	/**
	 * Gets the answers.
	 * 
	 * @param filterOptions the filter options
	 * @param answerIds the answer ids
	 * 
	 * @return the answers
	 */
	public List<Answer> getAnswers(Set<FilterOption> filterOptions, long... answerIds);
	
	// Comment Methods
	/**
	 * Gets the users comments.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the users comments
	 */
	public List<Comment> getUsersComments(long... userIds);
	
	/**
	 * Gets the users comments.
	 * 
	 * @param sort the sort
	 * @param userIds the user ids
	 * 
	 * @return the users comments
	 */
	public List<Comment> getUsersComments(Comment.SortOrder sort, long... userIds);
	
	/**
	 * Gets the users comments.
	 * 
	 * @param sort the sort
	 * @param userIds the user ids
	 * 
	 * @return the users comments
	 */
	public List<Comment> getUsersComments(Comment.SortOrder sort, Range range, long... userIds);
	
	/**
	 * Gets the users comments.
	 * 
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users comments
	 */
	public List<Comment> getUsersComments(TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the users comments.
	 * 
	 * @param paging the paging
	 * @param userIds the user ids
	 * 
	 * @return the users comments
	 */
	public List<Comment> getUsersComments(Paging paging, long... userIds);
	
	/**
	 * Gets the users comments.
	 * 
	 * @param sort the sort
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users comments
	 */
	public List<Comment> getUsersComments(Comment.SortOrder sort, Paging paging, TimePeriod timePeriod, long... userIds);

	/**
	 * Gets the users comments to user.
	 * 
	 * @param toUserId the to user id
	 * @param userIds the user ids
	 * 
	 * @return the users comments to user
	 */
	public List<Comment> getUsersCommentsToUser(long toUserId, long... userIds);
	
	/**
	 * Gets the users comments to user.
	 * 
	 * @param toUserId the to user id
	 * @param sort the sort
	 * @param userIds the user ids
	 * 
	 * @return the users comments to user
	 */
	public List<Comment> getUsersCommentsToUser(long toUserId, Comment.SortOrder sort, long... userIds);
	
	/**
	 * Gets the users comments to user.
	 * 
	 * @param toUserId the to user id
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users comments to user
	 */
	public List<Comment> getUsersCommentsToUser(long toUserId, TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the users comments to user.
	 * 
	 * @param toUserId the to user id
	 * @param paging the paging
	 * @param userIds the user ids
	 * 
	 * @return the users comments to user
	 */
	public List<Comment> getUsersCommentsToUser(long toUserId, Paging paging, long... userIds);
	
	/**
	 * Gets the users comments to user.
	 * 
	 * @param toUserId the to user id
	 * @param sort the sort
	 * @param paging the paging
	 * @param timePeriod the time period
	 * @param userIds the user ids
	 * 
	 * @return the users comments to user
	 */
	public List<Comment> getUsersCommentsToUser(long toUserId, Comment.SortOrder sort, Paging paging, TimePeriod timePeriod, long... userIds);
	
	/**
	 * Gets the comments.
	 * 
	 * @param commentIds the comment ids
	 * 
	 * @return the comments
	 */
	public List<Comment> getComments(long... commentIds);
	
	// Statistics Method
	/**
	 * Gets the statistics.
	 * 
	 * @return the statistics
	 */
	public Statistics getStatistics();
	
	// Revision Methods
	/**
	 * Gets the revisions for posts.
	 * 
	 * @param postIds the post ids
	 * 
	 * @return the revisions for posts
	 */
	public List<Revision> getRevisionsForPosts(long... postIds);
	
	/**
	 * Gets the revisions for posts.
	 * 
	 * @param timePeriod the time period
	 * @param postIds the post ids
	 * 
	 * @return the revisions for posts
	 */
	public List<Revision> getRevisionsForPosts(TimePeriod timePeriod, long... postIds);
	
	/**
	 * Gets the revision for post.
	 * 
	 * @param postId the post id
	 * @param revisionGuid the revision guid
	 * 
	 * @return the revision for post
	 */
	public Revision getRevisionForPost(long postId, String revisionGuid);
}
