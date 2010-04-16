/**
 *
 */
package com.google.code.stackoverflow.client;

import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;

import com.google.code.stackoverflow.client.StackOverflowApiClient.Paging;
import com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod;
import com.google.code.stackoverflow.schema.Answer;
import com.google.code.stackoverflow.schema.Badge;
import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.Question;
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.Revision;
import com.google.code.stackoverflow.schema.Statistics;
import com.google.code.stackoverflow.schema.Tag;
import com.google.code.stackoverflow.schema.Timeline;
import com.google.code.stackoverflow.schema.User;


/**
 * The Interface AsyncStackOverflowApiClient. This interface can be used for asynchronous invocation of API methods.
 * 
 * @author Nabeel Mukhtar
 */
public interface AsyncStackOverflowApiClient extends StackOverflowAuthenticationClient {
	
	// Question Methods
	public Future<List<Question>> getQuestions();
	public Future<List<Question>> getQuestions(Paging paging);
	public Future<List<Question>> getQuestions(TimePeriod timePeriod);
	public Future<List<Question>> getQuestions(Question.SortOrder sort);
	public Future<List<Question>> getQuestions(Set<FilterOption> filterOptions);
	public Future<List<Question>> getQuestions(Question.SortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public Future<List<Question>> getUnansweredQuestions();
	public Future<List<Question>> getUnansweredQuestions(Question.UnansweredSortOrder sort);
	public Future<List<Question>> getUnansweredQuestions(Paging paging);
	public Future<List<Question>> getUnansweredQuestions(TimePeriod timePeriod);
	public Future<List<Question>> getUnansweredQuestions(Set<FilterOption> filterOptions);
	public Future<List<Question>> getUnansweredQuestions(Question.UnansweredSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public Future<List<Question>> getTaggedQuestions(List<String> tags);
	public Future<List<Question>> getTaggedQuestions(List<String> tags, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public Future<List<Question>> getQuestionsByUser(long userId);
	public Future<List<Question>> getQuestionsByUser(long userId, User.QuestionSortOrder sort);
	public Future<List<Question>> getQuestionsByUser(long userId, Paging paging);
	public Future<List<Question>> getQuestionsByUser(long userId, TimePeriod timePeriod);
	public Future<List<Question>> getQuestionsByUser(long userId, Set<FilterOption> filterOptions);
	public Future<List<Question>> getQuestionsByUser(long userId, User.QuestionSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public Future<List<Question>> getFavoriteQuestionsByUser(long userId);
	public Future<List<Question>> getFavoriteQuestionsByUser(long userId, User.FavoriteSortOrder sort);
	public Future<List<Question>> getFavoriteQuestionsByUser(long userId, Paging paging);
	public Future<List<Question>> getFavoriteQuestionsByUser(long userId, TimePeriod timePeriod);
	public Future<List<Question>> getFavoriteQuestionsByUser(long userId, Set<FilterOption> filterOptions);
	public Future<List<Question>> getFavoriteQuestionsByUser(long userId, User.FavoriteSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public Future<Question> getQuestion(long questionId);
	public Future<Question> getQuestion(long questionId, Paging paging);
	public Future<Question> getQuestion(long questionId, Set<FilterOption> filterOptions);
	public Future<Question> getQuestion(long questionId, Paging paging, Set<FilterOption> filterOptions);
	public Future<List<Timeline>> getQuestionTimeline(long questionId);
	public Future<List<Timeline>> getQuestionTimeline(long questionId, TimePeriod timePeriod);
	
	// User Methods
	public Future<List<User>> getUsers();
	public Future<List<User>> getUsers(Paging paging);
	public Future<List<User>> getUsers(String filter);
	public Future<List<User>> getUsers(User.SortOrder sort);
	public Future<List<User>> getUsers(String filter, User.SortOrder sort, Paging paging);
	public Future<List<Timeline>> getUserTimeline(long userId);
	public Future<List<Timeline>> getUserTimeline(long userId, TimePeriod timePeriod);
	public Future<List<Comment>> getUserMentions(long userId);
	public Future<List<Comment>> getUserMentions(long userId, TimePeriod timePeriod);
	public Future<List<Reputation>> getUserReputations(long userId);
	public Future<List<Reputation>> getUserReputations(long userId, TimePeriod timePeriod);
	public Future<List<Reputation>> getUserReputations(long userId, Paging paging);
	public Future<List<Reputation>> getUserReputations(long userId, Paging paging, TimePeriod timePeriod);
	public Future<User> getUser(long userId);
	
	// Badge Methods
	public Future<List<Badge>> getBadges();
	public Future<List<Badge>> getBadgesByName();
	public Future<List<Badge>> getBadgesByTags();
	public Future<List<Badge>> getBadgesForUser(long userId);

	// Tag Methods
	public Future<List<Tag>> getTags();
	public Future<List<Tag>> getTags(Tag.SortOrder sort);
	public Future<List<Tag>> getTags(Paging paging);
	public Future<List<Tag>> getTags(Tag.SortOrder sort, Paging paging);
	public Future<List<Tag>> getTagsForUser(long userId);
	public Future<List<Tag>> getTagsForUser(long userId, Paging paging);
	
	// Answer Methods
	public Future<List<Answer>> getAnswersByUser(long userId); 
	public Future<List<Answer>> getAnswersByUser(long userId, Set<FilterOption> filterOptions); 
	public Future<List<Answer>> getAnswersByUser(long userId, Answer.SortOrder sort);
	public Future<List<Answer>> getAnswersByUser(long userId, Answer.SortOrder sort, Set<FilterOption> filterOptions);
	public Future<Answer> getAnswer(long answerId);
	public Future<Answer> getAnswer(long answerId, Set<FilterOption> filterOptions);
	
	// Comment Methods
	public Future<List<Comment>> getUserComments(long userId);
	public Future<List<Comment>> getUserComments(long userId, Comment.SortOrder sort);
	public Future<List<Comment>> getUserComments(long userId, TimePeriod timePeriod);
	public Future<List<Comment>> getUserComments(long userId, Paging paging);
	public Future<List<Comment>> getUserComments(long userId, Comment.SortOrder sort, Paging paging, TimePeriod timePeriod);

	public Future<List<Comment>> getUserComments(long userId, long toUserId);
	public Future<List<Comment>> getUserComments(long userId, long toUserId, Comment.SortOrder sort);
	public Future<List<Comment>> getUserComments(long userId, long toUserId, TimePeriod timePeriod);
	public Future<List<Comment>> getUserComments(long userId, long toUserId, Paging paging);
	public Future<List<Comment>> getUserComments(long userId, long toUserId, Comment.SortOrder sort, Paging paging, TimePeriod timePeriod);
	public Future<Comment> getComment(long commentId);
	
	// Statistics Method
	public Future<Statistics> getStatistics();
	
	// Revision Methods
	public Future<List<Revision>> getRevisionsForPost(long postId);
	public Future<List<Revision>> getRevisionsForPost(long postId, TimePeriod timePeriod);
	public Future<Revision> getRevisionForPost(long postId, String revisionGuid);
}
