/**
 *
 */
package com.google.code.stackoverflow.client;

import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;

import com.google.code.stackoverflow.schema.Answer;
import com.google.code.stackoverflow.schema.Badge;
import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.Question;
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.Revision;
import com.google.code.stackoverflow.schema.Statistics;
import com.google.code.stackoverflow.schema.Tag;
import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.UserTimeline;


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
	public Future<List<Question>> getQuestionsByUsers(long... userIds);
	public Future<List<Question>> getQuestionsByUsers(User.QuestionSortOrder sort, long... userIds);
	public Future<List<Question>> getQuestionsByUsers(Paging paging, long... userIds);
	public Future<List<Question>> getQuestionsByUsers(TimePeriod timePeriod, long... userIds);
	public Future<List<Question>> getQuestionsByUsers(Set<FilterOption> filterOptions, long... userIds);
	public Future<List<Question>> getQuestionsByUsers(User.QuestionSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions, long... userIds);
	public Future<List<Question>> getFavoriteQuestionsByUsers(long... userIds);
	public Future<List<Question>> getFavoriteQuestionsByUsers(User.FavoriteSortOrder sort, long... userIds);
	public Future<List<Question>> getFavoriteQuestionsByUsers(Paging paging, long... userIds);
	public Future<List<Question>> getFavoriteQuestionsByUsers(TimePeriod timePeriod, long... userIds);
	public Future<List<Question>> getFavoriteQuestionsByUsers(Set<FilterOption> filterOptions, long... userIds);
	public Future<List<Question>> getFavoriteQuestionsByUsers(User.FavoriteSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions, long... userIds);
	public Future<List<Question>> getQuestions(long... questionIds);
	public Future<List<Question>> getQuestions(Paging paging, long... questionIds);
	public Future<List<Question>> getQuestions(Set<FilterOption> filterOptions, long... questionIds);
	public Future<List<Question>> getQuestions(Paging paging, Set<FilterOption> filterOptions, long... questionIds);
	public Future<List<PostTimeline>> getQuestionsTimeline(long... questionIds);
	public Future<List<PostTimeline>> getQuestionsTimeline(TimePeriod timePeriod, long... questionIds);
	
	// User Methods
	public Future<List<User>> getUsers();
	public Future<List<User>> getUsers(Paging paging);
	public Future<List<User>> getUsers(String filter);
	public Future<List<User>> getUsers(User.SortOrder sort);
	public Future<List<User>> getUsers(String filter, User.SortOrder sort, Paging paging);
	public Future<List<UserTimeline>> getUsersTimeline(long... userIds);
	public Future<List<UserTimeline>> getUsersTimeline(TimePeriod timePeriod, long... userIds);
	public Future<List<Comment>> getUsersMentions(long... userIds);
	public Future<List<Comment>> getUsersMentions(TimePeriod timePeriod, long... userIds);
	public Future<List<Reputation>> getUsersReputations(long... userIds);
	public Future<List<Reputation>> getUsersReputations(TimePeriod timePeriod, long... userIds);
	public Future<List<Reputation>> getUsersReputations(Paging paging, long... userIds);
	public Future<List<Reputation>> getUsersReputations(Paging paging, TimePeriod timePeriod, long... userIds);
	public Future<List<User>> getUsers(long... userIds);
	
	// Badge Methods
	public Future<List<Badge>> getBadges();
	public Future<List<Badge>> getBadgesByName();
	public Future<List<Badge>> getBadgesByTags();
	public Future<List<Badge>> getBadgesForUsers(long... userIds);
	public Future<List<User>> getBadgesRecipients(final long... badgeIds);
	public Future<List<User>> getBadgesRecipients(final Paging paging, final long... badgeIds);

	// Tag Methods
	public Future<List<Tag>> getTags();
	public Future<List<Tag>> getTags(Tag.SortOrder sort);
	public Future<List<Tag>> getTags(Paging paging);
	public Future<List<Tag>> getTags(Tag.SortOrder sort, Paging paging);
	public Future<List<Tag>> getTagsForUsers(long... userIds);
	public Future<List<Tag>> getTagsForUsers(Paging paging, long... userIds);
	
	// Answer Methods
	public Future<List<Answer>> getAnswersByUsers(long... userIds); 
	public Future<List<Answer>> getAnswersByUsers(Set<FilterOption> filterOptions, long... userIds); 
	public Future<List<Answer>> getAnswersByUsers(Answer.SortOrder sort, long... userIds);
	public Future<List<Answer>> getAnswersByUsers(Answer.SortOrder sort, Set<FilterOption> filterOptions, long... userIds);
	public Future<List<Answer>> getAnswers(long... answerIds);
	public Future<List<Answer>> getAnswers(Set<FilterOption> filterOptions, long... answerIds);
	public Future<List<Answer>> getAnswersByQuestions(final long... questionIds); 
	public Future<List<Answer>> getAnswersByQuestions(final Set<FilterOption> filterOptions, final long... questionIds); 
	public Future<List<Answer>> getAnswersByQuestions(final Answer.SortOrder sort, final long... questionIds);
	public Future<List<Answer>> getAnswersByQuestions(final Answer.SortOrder sort, final Set<FilterOption> filterOptions, final long... questionIds);
		
	// Comment Methods
	public Future<List<Comment>> getUsersComments(long... userIds);
	public Future<List<Comment>> getUsersComments(Comment.SortOrder sort, long... userIds);
	public Future<List<Comment>> getUsersComments(TimePeriod timePeriod, long... userIds);
	public Future<List<Comment>> getUsersComments(Paging paging, long... userIds);
	public Future<List<Comment>> getUsersComments(Comment.SortOrder sort, Paging paging, TimePeriod timePeriod, long... userIds);

	public Future<List<Comment>> getUsersCommentsToUser(long toUserId, long... userIds);
	public Future<List<Comment>> getUsersCommentsToUser(long toUserId, Comment.SortOrder sort, long... userIds);
	public Future<List<Comment>> getUsersCommentsToUser(long toUserId, TimePeriod timePeriod, long... userIds);
	public Future<List<Comment>> getUsersCommentsToUser(long toUserId, Paging paging, long... userIds);
	public Future<List<Comment>> getUsersCommentsToUser(long toUserId, Comment.SortOrder sort, Paging paging, TimePeriod timePeriod, long... userIds);
	public Future<List<Comment>> getComments(long... commentIds);
	
	// Statistics Method
	public Future<Statistics> getStatistics();
	
	// Revision Methods
	public Future<List<Revision>> getRevisionsForPosts(long... postIds);
	public Future<List<Revision>> getRevisionsForPosts(TimePeriod timePeriod, long... postIds);
	public Future<Revision> getRevisionForPost(long postId, String revisionGuid);
}
