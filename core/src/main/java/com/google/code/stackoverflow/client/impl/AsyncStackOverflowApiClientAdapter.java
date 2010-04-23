/**
 *
 */
package com.google.code.stackoverflow.client.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import com.google.code.stackoverflow.client.AsyncStackOverflowApiClient;
import com.google.code.stackoverflow.client.StackOverflowApiClient;
import com.google.code.stackoverflow.client.provider.ApiProvider;
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
 * @author Nabeel Mukhtar
 *
 */
public class AsyncStackOverflowApiClientAdapter implements AsyncStackOverflowApiClient {

    /** Field description */
    private StackOverflowApiClient client;
    
    /** Field description */
    private ExecutorService taskExecutor;

    /** Field description */

    /**
     * Constructs ...
     *
     *
     * @param client
     */
    public AsyncStackOverflowApiClientAdapter(StackOverflowApiClient client, ExecutorService taskExecutor) {
        this.client  = client;
        this.taskExecutor = taskExecutor;
    }

    /**
     * Method description
     *
     *
     * @param task
     *
     * @return
     */
    protected Future<?> execute(Runnable task) {
        return taskExecutor.submit(task);
    }

    /**
     * Method description
     *
     *
     * @param task
     * @param <T>
     *
     * @return
     */
    protected <T> Future<T> execute(Callable<T> task) {
        return taskExecutor.submit(task);
    }
    
    /**
     * Sets the request headers.
     *
     * @param requestHeaders the request headers
     */
    public void setRequestHeaders(Map<String, String> requestHeaders) {
    	client.setRequestHeaders(requestHeaders);
    }

    /**
     * Gets the request headers.
     *
     * @return the request headers
     */
    public Map<String, String> getRequestHeaders() {
        return client.getRequestHeaders();
    }

    /**
     * Adds the request header.
     *
     * @param headerName the header name
     * @param headerValue the header value
     */
    public void addRequestHeader(String headerName, String headerValue) {
        client.addRequestHeader(headerName, headerValue);
    }

    /**
     * Removes the request header.
     *
     * @param headerName the header name
     */
    public void removeRequestHeader(String headerName) {
        client.removeRequestHeader(headerName);
    }

	@Override
	public String getApplicationKey() {
		return client.getApplicationKey();
	}

	@Override
	public void setApplicationKey(String applicationKey) {
		client.setApplicationKey(applicationKey);
	}
	
	@Override
	public ApiProvider getApiProvider() {
		return client.getApiProvider();
	}

	@Override
	public void setApiProvider(ApiProvider apiProvider) {
		client.setApiProvider(apiProvider);
	}

	@Override
	public Future<List<Answer>> getAnswer(final long answerId) {
		return execute(new Callable<List<Answer>>() {
            @Override
            public List<Answer> call() throws Exception {
                return client.getAnswers(answerId);
            }
        });
	}

	@Override
	public Future<List<Answer>> getAnswer(final long answerId,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Answer>>() {
            @Override
            public List<Answer> call() throws Exception {
                return client.getAnswers(filterOptions, answerId);
            }
        });
	}

	@Override
	public Future<List<Answer>> getAnswersByUser(final long userId) {
		return execute(new Callable<List<Answer>>() {
            @Override
            public List<Answer> call() throws Exception {
                return client.getAnswersByUsers(userId);
            }
        });
	}

	@Override
	public Future<List<Answer>> getAnswersByUser(final long userId,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Answer>>() {
            @Override
            public List<Answer> call() throws Exception {
                return client.getAnswersByUsers(filterOptions, userId);
            }
        });
	}

	@Override
	public Future<List<Answer>> getAnswersByUser(final long userId,
			final Answer.SortOrder sort) {
		return execute(new Callable<List<Answer>>() {
            @Override
            public List<Answer> call() throws Exception {
                return client.getAnswersByUsers(sort, userId);
            }
        });
	}

	@Override
	public Future<List<Answer>> getAnswersByUser(final long userId,
			final Answer.SortOrder sort, final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Answer>>() {
            @Override
            public List<Answer> call() throws Exception {
                return client.getAnswersByUsers(sort, filterOptions, userId);
            }
        });
	}

	@Override
	public Future<List<Badge>> getBadges() {
		return execute(new Callable<List<Badge>>() {
            @Override
            public List<Badge> call() throws Exception {
                return client.getBadges();
            }
        });
	}

	@Override
	public Future<List<Badge>> getBadgesByName() {
		return execute(new Callable<List<Badge>>() {
            @Override
            public List<Badge> call() throws Exception {
                return client.getBadgesByName();
            }
        });
	}

	@Override
	public Future<List<Badge>> getBadgesByTags() {
		return execute(new Callable<List<Badge>>() {
            @Override
            public List<Badge> call() throws Exception {
                return client.getBadgesByTags();
            }
        });
	}
	
	@Override
	public Future<List<Badge>> getBadgesForUser(final long userId) {
		return execute(new Callable<List<Badge>>() {
            @Override
            public List<Badge> call() throws Exception {
                return client.getBadgesForUsers(userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getComment(final long commentId) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getComments(commentId);
            }
        });
	}

	@Override
	public Future<List<Question>> getFavoriteQuestionsByUser(final long userId) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getFavoriteQuestionsByUsers(userId);
            }
        });
	}

	@Override
	public Future<List<Question>> getFavoriteQuestionsByUser(final long userId,
			final User.FavoriteSortOrder sort) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getFavoriteQuestionsByUsers(sort, userId);
            }
        });
	}

	@Override
	public Future<List<Question>> getFavoriteQuestionsByUser(final long userId,
			final Paging paging) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getFavoriteQuestionsByUsers(paging, userId);
            }
        });
	}

	@Override
	public Future<List<Question>> getFavoriteQuestionsByUser(final long userId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getFavoriteQuestionsByUsers(timePeriod, userId);
            }
        });
	}

	@Override
	public Future<List<Question>> getFavoriteQuestionsByUser(final long userId,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getFavoriteQuestionsByUsers(filterOptions, userId);
            }
        });
	}

	@Override
	public Future<List<Question>> getFavoriteQuestionsByUser(final long userId,
			final User.FavoriteSortOrder sort, final Paging paging, final TimePeriod timePeriod,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getFavoriteQuestionsByUsers(sort, paging, timePeriod, filterOptions, userId);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestion(final long questionId) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestions(questionId);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestion(final long questionId, final Paging paging) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestions(paging, questionId);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestion(final long questionId,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestions(filterOptions, questionId);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestion(final long questionId, final Paging paging,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestions(paging, filterOptions, questionId);
            }
        });
	}

	@Override
	public Future<List<PostTimeline>> getQuestionTimeline(final long questionId) {
		return execute(new Callable<List<PostTimeline>>() {
            @Override
            public List<PostTimeline> call() throws Exception {
                return client.getQuestionsTimeline(questionId);
            }
        });
	}

	@Override
	public Future<List<PostTimeline>> getQuestionTimeline(final long questionId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<PostTimeline>>() {
            @Override
            public List<PostTimeline> call() throws Exception {
                return client.getQuestionsTimeline(timePeriod, questionId);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestions() {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestions();
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestions(final Paging paging) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestions(paging);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestions(final TimePeriod timePeriod) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestions(timePeriod);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestions(final Question.SortOrder sort) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestions(sort);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestions(final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestions(filterOptions);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestions(final Question.SortOrder sort,
			final Paging paging, final TimePeriod timePeriod,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestions(sort, paging, timePeriod, filterOptions);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestionsByUser(final long userId) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestionsByUsers(userId);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestionsByUser(final long userId,
			final User.QuestionSortOrder sort) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestionsByUsers(sort, userId);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestionsByUser(final long userId, final Paging paging) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestionsByUsers(paging, userId);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestionsByUser(final long userId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestionsByUsers(timePeriod, userId);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestionsByUser(final long userId,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestionsByUsers(filterOptions, userId);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestionsByUser(final long userId,
			final User.QuestionSortOrder sort, final Paging paging, final TimePeriod timePeriod,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestionsByUsers(sort, paging, timePeriod, filterOptions, userId);
            }
        });
	}

	@Override
	public Future<Statistics> getStatistics() {
		return execute(new Callable<Statistics>() {
            @Override
            public Statistics call() throws Exception {
                return client.getStatistics();
            }
        });
	}

	@Override
	public Future<List<Question>> getTaggedQuestions(final List<String> tags) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getTaggedQuestions(tags);
            }
        });
	}

	@Override
	public Future<List<Question>> getTaggedQuestions(final List<String> tags,
			final Paging paging, final TimePeriod timePeriod,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getTaggedQuestions(tags, paging, timePeriod, filterOptions);
            }
        });
	}

	@Override
	public Future<List<Tag>> getTags() {
		return execute(new Callable<List<Tag>>() {
            @Override
            public List<Tag> call() throws Exception {
                return client.getTags();
            }
        });
	}

	@Override
	public Future<List<Tag>> getTags(final Tag.SortOrder sort) {
		return execute(new Callable<List<Tag>>() {
            @Override
            public List<Tag> call() throws Exception {
                return client.getTags(sort);
            }
        });
	}

	@Override
	public Future<List<Tag>> getTags(final Paging paging) {
		return execute(new Callable<List<Tag>>() {
            @Override
            public List<Tag> call() throws Exception {
                return client.getTags(paging);
            }
        });
	}

	@Override
	public Future<List<Tag>> getTags(final Tag.SortOrder sort, final Paging paging) {
		return execute(new Callable<List<Tag>>() {
            @Override
            public List<Tag> call() throws Exception {
                return client.getTags(sort, paging);
            }
        });
	}

	@Override
	public Future<List<Tag>> getTagsForUser(final long userId) {
		return execute(new Callable<List<Tag>>() {
            @Override
            public List<Tag> call() throws Exception {
                return client.getTagsForUsers(userId);
            }
        });
	}

	@Override
	public Future<List<Tag>> getTagsForUser(final long userId, final Paging paging) {
		return execute(new Callable<List<Tag>>() {
            @Override
            public List<Tag> call() throws Exception {
                return client.getTagsForUsers(paging, userId);
            }
        });
	}

	@Override
	public Future<List<Question>> getUnansweredQuestions() {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getUnansweredQuestions();
            }
        });
	}

	@Override
	public Future<List<Question>> getUnansweredQuestions(
			final Question.UnansweredSortOrder sort) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getUnansweredQuestions(sort);
            }
        });
	}

	@Override
	public Future<List<Question>> getUnansweredQuestions(final Paging paging) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getUnansweredQuestions(paging);
            }
        });
	}

	@Override
	public Future<List<Question>> getUnansweredQuestions(final TimePeriod timePeriod) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getUnansweredQuestions(timePeriod);
            }
        });
	}

	@Override
	public Future<List<Question>> getUnansweredQuestions(
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getUnansweredQuestions(filterOptions);
            }
        });
	}

	@Override
	public Future<List<Question>> getUnansweredQuestions(
			final Question.UnansweredSortOrder sort, final Paging paging,
			final TimePeriod timePeriod, final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getUnansweredQuestions(sort, paging, timePeriod, filterOptions);
            }
        });
	}

	@Override
	public Future<List<User>> getUser(final long userId) {
		return execute(new Callable<List<User>>() {
            @Override
            public List<User> call() throws Exception {
                return client.getUsers(userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUsersComments(userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId,
			final Comment.SortOrder sort) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUsersComments(sort, userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUsersComments(timePeriod, userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId, final Paging paging) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUsersComments(paging, userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId,
			final Comment.SortOrder sort, final Paging paging, final TimePeriod timePeriod) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUsersComments(sort, paging, timePeriod, userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId, final long toUserId) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUsersCommentsToUser(toUserId, userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId, final long toUserId,
			final Comment.SortOrder sort) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUsersCommentsToUser(toUserId, sort, userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId, final long toUserId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUsersCommentsToUser(toUserId, timePeriod, userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId, final long toUserId,
			final Paging paging) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUsersCommentsToUser(toUserId, paging, userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId, final long toUserId,
			final Comment.SortOrder sort, final Paging paging, final TimePeriod timePeriod) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUsersCommentsToUser(toUserId, sort, paging, timePeriod, userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserMentions(final long userId) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUsersMentions(userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserMentions(final long userId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUsersMentions(timePeriod, userId);
            }
        });
	}

	@Override
	public Future<List<Reputation>> getUserReputations(final long userId) {
		return execute(new Callable<List<Reputation>>() {
            @Override
            public List<Reputation> call() throws Exception {
                return client.getUsersReputations(userId);
            }
        });
	}

	@Override
	public Future<List<Reputation>> getUserReputations(final long userId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Reputation>>() {
            @Override
            public List<Reputation> call() throws Exception {
                return client.getUsersReputations(timePeriod, userId);
            }
        });
	}

	@Override
	public Future<List<Reputation>> getUserReputations(final long userId,
			final Paging paging) {
		return execute(new Callable<List<Reputation>>() {
            @Override
            public List<Reputation> call() throws Exception {
                return client.getUsersReputations(paging, userId);
            }
        });
	}

	@Override
	public Future<List<Reputation>> getUserReputations(final long userId,
			final Paging paging, final TimePeriod timePeriod) {
		return execute(new Callable<List<Reputation>>() {
            @Override
            public List<Reputation> call() throws Exception {
                return client.getUsersReputations(paging, timePeriod, userId);
            }
        });
	}

	@Override
	public Future<List<UserTimeline>> getUserTimeline(final long userId) {
		return execute(new Callable<List<UserTimeline>>() {
            @Override
            public List<UserTimeline> call() throws Exception {
                return client.getUsersTimeline(userId);
            }
        });
	}

	@Override
	public Future<List<UserTimeline>> getUserTimeline(final long userId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<UserTimeline>>() {
            @Override
            public List<UserTimeline> call() throws Exception {
                return client.getUsersTimeline(timePeriod, userId);
            }
        });
	}

	@Override
	public Future<List<User>> getUsers() {
		return execute(new Callable<List<User>>() {
            @Override
            public List<User> call() throws Exception {
                return client.getUsers();
            }
        });
	}

	@Override
	public Future<List<User>> getUsers(final Paging paging) {
		return execute(new Callable<List<User>>() {
            @Override
            public List<User> call() throws Exception {
                return client.getUsers(paging);
            }
        });
	}

	@Override
	public Future<List<User>> getUsers(final String filter) {
		return execute(new Callable<List<User>>() {
            @Override
            public List<User> call() throws Exception {
                return client.getUsers(filter);
            }
        });
	}

	@Override
	public Future<List<User>> getUsers(final User.SortOrder sort) {
		return execute(new Callable<List<User>>() {
            @Override
            public List<User> call() throws Exception {
                return client.getUsers(sort);
            }
        });
	}

	@Override
	public Future<List<User>> getUsers(final String filter, final User.SortOrder sort,
			final Paging paging) {
		return execute(new Callable<List<User>>() {
            @Override
            public List<User> call() throws Exception {
                return client.getUsers(filter, sort, paging);
            }
        });
	}

	@Override
	public Future<Revision> getRevisionForPost(final long postId, final String revisionGuid) {
		return execute(new Callable<Revision>() {
            @Override
            public Revision call() throws Exception {
                return client.getRevisionForPost(postId, revisionGuid);
            }
        });
	}

	@Override
	public Future<List<Revision>> getRevisionsForPost(final long postId) {
		return execute(new Callable<List<Revision>>() {
            @Override
            public List<Revision> call() throws Exception {
                return client.getRevisionsForPosts(postId);
            }
        });
	}

	@Override
	public Future<List<Revision>> getRevisionsForPost(final long postId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Revision>>() {
            @Override
            public List<Revision> call() throws Exception {
                return client.getRevisionsForPosts(timePeriod, postId);
            }
        });
	}

	@Override
	public int getCurrentRateLimit() {
		return client.getCurrentRateLimit();
	}

	@Override
	public int getMaxRateLimit() {
		return client.getMaxRateLimit();
	}
}
