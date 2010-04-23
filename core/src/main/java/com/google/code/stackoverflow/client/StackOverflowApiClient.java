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
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.Revision;
import com.google.code.stackoverflow.schema.Statistics;
import com.google.code.stackoverflow.schema.Tag;
import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.UserTimeline;


/**
 * The Interface StackOverflowApiClient. It acts as a facade for the whole StackOverflow API.
 * 
 * @author Nabeel Mukhtar
 */
public interface StackOverflowApiClient extends StackOverflowAuthenticationClient {
	
	// Question Methods
	public List<Question> getQuestions();
	public List<Question> getQuestions(Paging paging);
	public List<Question> getQuestions(TimePeriod timePeriod);
	public List<Question> getQuestions(Question.SortOrder sort);
	public List<Question> getQuestions(Set<FilterOption> filterOptions);
	public List<Question> getQuestions(Question.SortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public List<Question> getUnansweredQuestions();
	public List<Question> getUnansweredQuestions(Question.UnansweredSortOrder sort);
	public List<Question> getUnansweredQuestions(Paging paging);
	public List<Question> getUnansweredQuestions(TimePeriod timePeriod);
	public List<Question> getUnansweredQuestions(Set<FilterOption> filterOptions);
	public List<Question> getUnansweredQuestions(Question.UnansweredSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public List<Question> getTaggedQuestions(List<String> tags);
	public List<Question> getTaggedQuestions(List<String> tags, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public List<Question> getQuestionsByUser(long userId);
	public List<Question> getQuestionsByUser(long userId, User.QuestionSortOrder sort);
	public List<Question> getQuestionsByUser(long userId, Paging paging);
	public List<Question> getQuestionsByUser(long userId, TimePeriod timePeriod);
	public List<Question> getQuestionsByUser(long userId, Set<FilterOption> filterOptions);
	public List<Question> getQuestionsByUser(long userId, User.QuestionSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public List<Question> getFavoriteQuestionsByUser(long userId);
	public List<Question> getFavoriteQuestionsByUser(long userId, User.FavoriteSortOrder sort);
	public List<Question> getFavoriteQuestionsByUser(long userId, Paging paging);
	public List<Question> getFavoriteQuestionsByUser(long userId, TimePeriod timePeriod);
	public List<Question> getFavoriteQuestionsByUser(long userId, Set<FilterOption> filterOptions);
	public List<Question> getFavoriteQuestionsByUser(long userId, User.FavoriteSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public Question getQuestion(long questionId);
	public Question getQuestion(long questionId, Paging paging);
	public Question getQuestion(long questionId, Set<FilterOption> filterOptions);
	public Question getQuestion(long questionId, Paging paging, Set<FilterOption> filterOptions);
	public List<PostTimeline> getQuestionTimeline(long questionId);
	public List<PostTimeline> getQuestionTimeline(long questionId, TimePeriod timePeriod);
	
	// User Methods
	public List<User> getUsers();
	public List<User> getUsers(Paging paging);
	public List<User> getUsers(String filter);
	public List<User> getUsers(User.SortOrder sort);
	public List<User> getUsers(String filter, User.SortOrder sort, Paging paging);
	public List<UserTimeline> getUserTimeline(long userId);
	public List<UserTimeline> getUserTimeline(long userId, TimePeriod timePeriod);
	public List<Comment> getUserMentions(long userId);
	public List<Comment> getUserMentions(long userId, TimePeriod timePeriod);
	public List<Reputation> getUserReputations(long userId);
	public List<Reputation> getUserReputations(long userId, TimePeriod timePeriod);
	public List<Reputation> getUserReputations(long userId, Paging paging);
	public List<Reputation> getUserReputations(long userId, Paging paging, TimePeriod timePeriod);
	public User getUser(long userId);
	
	// Badge Methods
	public List<Badge> getBadges();
	public List<Badge> getBadgesByName();
	public List<Badge> getBadgesByTags();
	public List<Badge> getBadgesForUser(long userId);

	// Tag Methods
	public List<Tag> getTags();
	public List<Tag> getTags(Tag.SortOrder sort);
	public List<Tag> getTags(Paging paging);
	public List<Tag> getTags(Tag.SortOrder sort, Paging paging);
	public List<Tag> getTagsForUser(long userId);
	public List<Tag> getTagsForUser(long userId, Paging paging);
	
	// Answer Methods
	public List<Answer> getAnswersByQuestion(long questionId); 
	public List<Answer> getAnswersByQuestion(long questionId, Set<FilterOption> filterOptions); 
	public List<Answer> getAnswersByUser(long userId); 
	public List<Answer> getAnswersByUser(long userId, Set<FilterOption> filterOptions); 
	public List<Answer> getAnswersByUser(long userId, Answer.SortOrder sort);
	public List<Answer> getAnswersByUser(long userId, Answer.SortOrder sort, Set<FilterOption> filterOptions);
	public Answer getAnswer(long answerId);
	public Answer getAnswer(long answerId, Set<FilterOption> filterOptions);
	
	// Comment Methods
	public List<Comment> getUserComments(long userId);
	public List<Comment> getUserComments(long userId, Comment.SortOrder sort);
	public List<Comment> getUserComments(long userId, TimePeriod timePeriod);
	public List<Comment> getUserComments(long userId, Paging paging);
	public List<Comment> getUserComments(long userId, Comment.SortOrder sort, Paging paging, TimePeriod timePeriod);

	public List<Comment> getUserComments(long userId, long toUserId);
	public List<Comment> getUserComments(long userId, long toUserId, Comment.SortOrder sort);
	public List<Comment> getUserComments(long userId, long toUserId, TimePeriod timePeriod);
	public List<Comment> getUserComments(long userId, long toUserId, Paging paging);
	public List<Comment> getUserComments(long userId, long toUserId, Comment.SortOrder sort, Paging paging, TimePeriod timePeriod);
	public Comment getComment(long commentId);
	
	// Statistics Method
	public Statistics getStatistics();
	
	// Revision Methods
	public List<Revision> getRevisionsForPost(long postId);
	public List<Revision> getRevisionsForPost(long postId, TimePeriod timePeriod);
	public Revision getRevisionForPost(long postId, String revisionGuid);
}
