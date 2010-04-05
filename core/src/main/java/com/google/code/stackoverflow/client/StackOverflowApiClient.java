/**
 *
 */
package com.google.code.stackoverflow.client;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.google.code.stackoverflow.schema.Answer;
import com.google.code.stackoverflow.schema.AnswerSortOrder;
import com.google.code.stackoverflow.schema.Badge;
import com.google.code.stackoverflow.schema.BadgeSortOrder;
import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.CommentSortOrder;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.Question;
import com.google.code.stackoverflow.schema.QuestionSortOrder;
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.Statistics;
import com.google.code.stackoverflow.schema.Tag;
import com.google.code.stackoverflow.schema.TagSortOrder;
import com.google.code.stackoverflow.schema.Timeline;
import com.google.code.stackoverflow.schema.UnansweredQuestionSortOrder;
import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.UserFavoriteSortOrder;
import com.google.code.stackoverflow.schema.UserSortOrder;
import com.google.code.stackoverflow.schema.UserQuestionSortOrder;


/**
 * The Interface StackOverflowApiClient. It acts as a facade for the whole StackOverflow API.
 * 
 * @author Nabeel Mukhtar
 */
public interface StackOverflowApiClient extends StackOverflowAuthenticationClient {
	
	public class TimePeriod {
		private Date startDate;
		private Date endDate;
		
		public TimePeriod(Date startDate, Date endDate) {
			this.startDate = startDate;
			this.endDate = endDate;
		}
		
		/**
		 * @return the startDate
		 */
		public Date getStartDate() {
			return startDate;
		}
		
		/**
		 * @return the endDate
		 */
		public Date getEndDate() {
			return endDate;
		}
	}
	
	public final class Paging {
		private int pageNumber;
		private int pageSize;
		
		public Paging(int pageNumber, int pageSize) {
			this.pageNumber = pageNumber;
			this.pageSize = pageSize;
		}
		
		/**
		 * @return the pageNumber
		 */
		public int getPageNumber() {
			return pageNumber;
		}
		/**
		 * @return the pageSize
		 */
		public int getPageSize() {
			return pageSize;
		}
	}
	
	// Question Methods
	public List<Question> getQuestions();
	public List<Question> getQuestions(Paging paging);
	public List<Question> getQuestions(TimePeriod timePeriod);
	public List<Question> getQuestions(QuestionSortOrder sort);
	public List<Question> getQuestions(Set<FilterOption> filterOptions);
	public List<Question> getQuestions(QuestionSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public List<Question> getUnansweredQuestions();
	public List<Question> getUnansweredQuestions(UnansweredQuestionSortOrder sort);
	public List<Question> getUnansweredQuestions(Paging paging);
	public List<Question> getUnansweredQuestions(TimePeriod timePeriod);
	public List<Question> getUnansweredQuestions(Set<FilterOption> filterOptions);
	public List<Question> getUnansweredQuestions(UnansweredQuestionSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public List<Question> getTaggedQuestions(List<String> tags);
	public List<Question> getTaggedQuestions(List<String> tags, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public List<Question> getQuestionsByUser(long userId);
	public List<Question> getQuestionsByUser(long userId, UserQuestionSortOrder sort);
	public List<Question> getQuestionsByUser(long userId, Paging paging);
	public List<Question> getQuestionsByUser(long userId, TimePeriod timePeriod);
	public List<Question> getQuestionsByUser(long userId, Set<FilterOption> filterOptions);
	public List<Question> getQuestionsByUser(long userId, UserQuestionSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public List<Question> getFavoriteQuestionsByUser(long userId);
	public List<Question> getFavoriteQuestionsByUser(long userId, UserFavoriteSortOrder sort);
	public List<Question> getFavoriteQuestionsByUser(long userId, Paging paging);
	public List<Question> getFavoriteQuestionsByUser(long userId, TimePeriod timePeriod);
	public List<Question> getFavoriteQuestionsByUser(long userId, Set<FilterOption> filterOptions);
	public List<Question> getFavoriteQuestionsByUser(long userId, UserFavoriteSortOrder sort, Paging paging, TimePeriod timePeriod, Set<FilterOption> filterOptions);
	public Question getQuestion(long questionId);
	public Question getQuestion(long questionId, Paging paging);
	public Question getQuestion(long questionId, Set<FilterOption> filterOptions);
	public Question getQuestion(long questionId, Paging paging, Set<FilterOption> filterOptions);
	public List<Timeline> getQuestionTimeline(long questionId);
	public List<Timeline> getQuestionTimeline(long questionId, TimePeriod timePeriod);
	
	// User Methods
	public List<User> getUsers();
	public List<User> getUsers(Paging paging);
	public List<User> getUsers(String filter);
	public List<User> getUsers(UserSortOrder sort);
	public List<User> getUsers(String filter, UserSortOrder sort, Paging paging);
	public List<Timeline> getUserTimeline(long userId);
	public List<Timeline> getUserTimeline(long userId, TimePeriod timePeriod);
	public List<Comment> getUserMentions(long userId);
	public List<Comment> getUserMentions(long userId, TimePeriod timePeriod);
	public List<Reputation> getUserReputations(long userId);
	public List<Reputation> getUserReputations(long userId, TimePeriod timePeriod);
	public List<Reputation> getUserReputations(long userId, Paging paging);
	public List<Reputation> getUserReputations(long userId, Paging paging, TimePeriod timePeriod);
	public User getUser(long userId);
	
	// Badge Methods
	public List<Badge> getBadges();
	public List<Badge> getBadges(BadgeSortOrder sort);
	public List<Badge> getBadgesForUser(long userId);

	// Tag Methods
	public List<Tag> getTags();
	public List<Tag> getTags(TagSortOrder sort);
	public List<Tag> getTags(Paging paging);
	public List<Tag> getTags(TagSortOrder sort, Paging paging);
	public List<Tag> getTagsForUser(long userId);
	public List<Tag> getTagsForUser(long userId, Paging paging);
	
	// Answer Methods
	public List<Answer> getAnswersByUser(long userId); 
	public List<Answer> getAnswersByUser(long userId, Set<FilterOption> filterOptions); 
	public List<Answer> getAnswersByUser(long userId, AnswerSortOrder sort);
	public List<Answer> getAnswersByUser(long userId, AnswerSortOrder sort, Set<FilterOption> filterOptions);
	public Answer getAnswer(long answerId);
	public Answer getAnswer(long answerId, Set<FilterOption> filterOptions);
	
	// Comment Methods
	public List<Comment> getUserComments(long userId);
	public List<Comment> getUserComments(long userId, CommentSortOrder sort);
	public List<Comment> getUserComments(long userId, TimePeriod timePeriod);
	public List<Comment> getUserComments(long userId, Paging paging);
	public List<Comment> getUserComments(long userId, CommentSortOrder sort, Paging paging, TimePeriod timePeriod);

	public List<Comment> getUserComments(long userId, long toUserId);
	public List<Comment> getUserComments(long userId, long toUserId, CommentSortOrder sort);
	public List<Comment> getUserComments(long userId, long toUserId, TimePeriod timePeriod);
	public List<Comment> getUserComments(long userId, long toUserId, Paging paging);
	public List<Comment> getUserComments(long userId, long toUserId, CommentSortOrder sort, Paging paging, TimePeriod timePeriod);
	public Comment getComment(long commentId);
	
	// Statistics Method
	public Statistics getStatistics();
}
