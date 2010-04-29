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
	public List<Question> getQuestionsByUsers(long... userIds);
	public List<Question> getQuestionsByUsers(User.QuestionSortOrder sort, long... userIds);
	public List<Question> getQuestionsByUsers(Paging paging, long... userIds);
	public List<Question> getQuestionsByUsers(TimePeriod timePeriod, long... userIds);
	public List<Question> getQuestionsByUsers(Set<FilterOption> filterOptions, long... userIds);
	public List<Question> getQuestionsByUsers(User.QuestionSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions, long... userIds);
	public List<Question> getFavoriteQuestionsByUsers(long... userIds);
	public List<Question> getFavoriteQuestionsByUsers(User.FavoriteSortOrder sort, long... userIds);
	public List<Question> getFavoriteQuestionsByUsers(Paging paging, long... userIds);
	public List<Question> getFavoriteQuestionsByUsers(TimePeriod timePeriod, long... userIds);
	public List<Question> getFavoriteQuestionsByUsers(Set<FilterOption> filterOptions, long... userIds);
	public List<Question> getFavoriteQuestionsByUsers(User.FavoriteSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions, long... userIds);
	public List<Question> getQuestions(long... questionIds);
	public List<Question> getQuestions(Paging paging, long... questionIds);
	public List<Question> getQuestions(Set<FilterOption> filterOptions, long... questionIds);
	public List<Question> getQuestions(Paging paging, Set<FilterOption> filterOptions, long... questionIds);
	public List<PostTimeline> getQuestionsTimeline(long... questionIds);
	public List<PostTimeline> getQuestionsTimeline(TimePeriod timePeriod, long... questionIds);
	public List<Question> searchQuestions(String query);
	public List<Question> searchQuestions(String query, User.QuestionSortOrder sort, Paging paging);
	public List<Question> searchQuestions(List<String> includeTags, List<String> excludeTags);
	public List<Question> searchQuestions(List<String> includeTags, List<String> excludeTags, User.QuestionSortOrder sort, Paging paging);
	public List<Question> searchQuestions(String query, List<String> includeTags, List<String> excludeTags, User.QuestionSortOrder sort, Paging paging);
	
	// User Methods
	public List<User> getUsers();
	public List<User> getUsers(Paging paging);
	public List<User> getUsers(String filter);
	public List<User> getUsers(User.SortOrder sort);
	public List<User> getUsers(String filter, User.SortOrder sort, Paging paging);
	public List<UserTimeline> getUsersTimeline(long... userIds);
	public List<UserTimeline> getUsersTimeline(TimePeriod timePeriod, long... userIds);
	public List<Comment> getUsersMentions(long... userIds);
	public List<Comment> getUsersMentions(TimePeriod timePeriod, long... userIds);
	public List<Reputation> getUsersReputations(long... userIds);
	public List<Reputation> getUsersReputations(TimePeriod timePeriod, long... userIds);
	public List<Reputation> getUsersReputations(Paging paging, long... userIds);
	public List<Reputation> getUsersReputations(Paging paging, TimePeriod timePeriod, long... userIds);
	public List<User> getUsers(long... userIds);
	
	// Badge Methods
	public List<Badge> getBadges();
	public List<Badge> getBadgesByName();
	public List<Badge> getBadgesByTags();
	public List<Badge> getBadgesForUsers(long... userIds);
	public List<User> getBadgesRecipients(long... badgeIds);
	public List<User> getBadgesRecipients(Paging paging, long... badgeIds);

	// Tag Methods
	public List<Tag> getTags();
	public List<Tag> getTags(Tag.SortOrder sort);
	public List<Tag> getTags(Paging paging);
	public List<Tag> getTags(Tag.SortOrder sort, Paging paging);
	public List<Tag> getTagsForUsers(long... userIds);
	public List<Tag> getTagsForUsers(Paging paging, long... userIds);
	
	// Answer Methods
	public List<Answer> getAnswersByQuestions(long... questionIds); 
	public List<Answer> getAnswersByQuestions(Set<FilterOption> filterOptions, long... questionIds); 
	public List<Answer> getAnswersByQuestions(Answer.SortOrder sort, long... questionIds);
	public List<Answer> getAnswersByQuestions(Answer.SortOrder sort, Set<FilterOption> filterOptions, long... questionIds);
	public List<Answer> getAnswersByUsers(long... userIds); 
	public List<Answer> getAnswersByUsers(Set<FilterOption> filterOptions, long... userIds); 
	public List<Answer> getAnswersByUsers(Answer.SortOrder sort, long... userIds);
	public List<Answer> getAnswersByUsers(Answer.SortOrder sort, Set<FilterOption> filterOptions, long... userIds);
	public List<Answer> getAnswers(long... answerIds);
	public List<Answer> getAnswers(Set<FilterOption> filterOptions, long... answerIds);
	
	// Comment Methods
	public List<Comment> getUsersComments(long... userIds);
	public List<Comment> getUsersComments(Comment.SortOrder sort, long... userIds);
	public List<Comment> getUsersComments(TimePeriod timePeriod, long... userIds);
	public List<Comment> getUsersComments(Paging paging, long... userIds);
	public List<Comment> getUsersComments(Comment.SortOrder sort, Paging paging, TimePeriod timePeriod, long... userIds);

	public List<Comment> getUsersCommentsToUser(long toUserId, long... userIds);
	public List<Comment> getUsersCommentsToUser(long toUserId, Comment.SortOrder sort, long... userIds);
	public List<Comment> getUsersCommentsToUser(long toUserId, TimePeriod timePeriod, long... userIds);
	public List<Comment> getUsersCommentsToUser(long toUserId, Paging paging, long... userIds);
	public List<Comment> getUsersCommentsToUser(long toUserId, Comment.SortOrder sort, Paging paging, TimePeriod timePeriod, long... userIds);
	public List<Comment> getComments(long... commentIds);
	
	// Statistics Method
	public Statistics getStatistics();
	
	// Revision Methods
	public List<Revision> getRevisionsForPosts(long... postIds);
	public List<Revision> getRevisionsForPosts(TimePeriod timePeriod, long... postIds);
	public Revision getRevisionForPost(long postId, String revisionGuid);
}
