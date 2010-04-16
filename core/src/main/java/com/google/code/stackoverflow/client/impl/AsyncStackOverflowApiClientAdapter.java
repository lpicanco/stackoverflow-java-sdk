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
import com.google.code.stackoverflow.client.StackOverflowApiClient.Paging;
import com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod;
import com.google.code.stackoverflow.schema.Answer;
import com.google.code.stackoverflow.schema.Badge;
import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.Question;
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.Statistics;
import com.google.code.stackoverflow.schema.Tag;
import com.google.code.stackoverflow.schema.Timeline;
import com.google.code.stackoverflow.schema.User;

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
	public Future<Answer> getAnswer(final long answerId) {
		return execute(new Callable<Answer>() {
            @Override
            public Answer call() throws Exception {
                return client.getAnswer(answerId);
            }
        });
	}

	@Override
	public Future<Answer> getAnswer(final long answerId,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<Answer>() {
            @Override
            public Answer call() throws Exception {
                return client.getAnswer(answerId, filterOptions);
            }
        });
	}

	@Override
	public Future<List<Answer>> getAnswersByUser(final long userId) {
		return execute(new Callable<List<Answer>>() {
            @Override
            public List<Answer> call() throws Exception {
                return client.getAnswersByUser(userId);
            }
        });
	}

	@Override
	public Future<List<Answer>> getAnswersByUser(final long userId,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Answer>>() {
            @Override
            public List<Answer> call() throws Exception {
                return client.getAnswersByUser(userId, filterOptions);
            }
        });
	}

	@Override
	public Future<List<Answer>> getAnswersByUser(final long userId,
			final Answer.SortOrder sort) {
		return execute(new Callable<List<Answer>>() {
            @Override
            public List<Answer> call() throws Exception {
                return client.getAnswersByUser(userId, sort);
            }
        });
	}

	@Override
	public Future<List<Answer>> getAnswersByUser(final long userId,
			final Answer.SortOrder sort, final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Answer>>() {
            @Override
            public List<Answer> call() throws Exception {
                return client.getAnswersByUser(userId, sort, filterOptions);
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
                return client.getBadgesForUser(userId);
            }
        });
	}

	@Override
	public Future<Comment> getComment(final long commentId) {
		return execute(new Callable<Comment>() {
            @Override
            public Comment call() throws Exception {
                return client.getComment(commentId);
            }
        });
	}

	@Override
	public Future<List<Question>> getFavoriteQuestionsByUser(final long userId) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getFavoriteQuestionsByUser(userId);
            }
        });
	}

	@Override
	public Future<List<Question>> getFavoriteQuestionsByUser(final long userId,
			final User.FavoriteSortOrder sort) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getFavoriteQuestionsByUser(userId, sort);
            }
        });
	}

	@Override
	public Future<List<Question>> getFavoriteQuestionsByUser(final long userId,
			final Paging paging) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getFavoriteQuestionsByUser(userId, paging);
            }
        });
	}

	@Override
	public Future<List<Question>> getFavoriteQuestionsByUser(final long userId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getFavoriteQuestionsByUser(userId, timePeriod);
            }
        });
	}

	@Override
	public Future<List<Question>> getFavoriteQuestionsByUser(final long userId,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getFavoriteQuestionsByUser(userId, filterOptions);
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
                return client.getFavoriteQuestionsByUser(userId, sort, paging, timePeriod, filterOptions);
            }
        });
	}

	@Override
	public Future<Question> getQuestion(final long questionId) {
		return execute(new Callable<Question>() {
            @Override
            public Question call() throws Exception {
                return client.getQuestion(questionId);
            }
        });
	}

	@Override
	public Future<Question> getQuestion(final long questionId, final Paging paging) {
		return execute(new Callable<Question>() {
            @Override
            public Question call() throws Exception {
                return client.getQuestion(questionId, paging);
            }
        });
	}

	@Override
	public Future<Question> getQuestion(final long questionId,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<Question>() {
            @Override
            public Question call() throws Exception {
                return client.getQuestion(questionId, filterOptions);
            }
        });
	}

	@Override
	public Future<Question> getQuestion(final long questionId, final Paging paging,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<Question>() {
            @Override
            public Question call() throws Exception {
                return client.getQuestion(questionId, paging, filterOptions);
            }
        });
	}

	@Override
	public Future<List<Timeline>> getQuestionTimeline(final long questionId) {
		return execute(new Callable<List<Timeline>>() {
            @Override
            public List<Timeline> call() throws Exception {
                return client.getQuestionTimeline(questionId);
            }
        });
	}

	@Override
	public Future<List<Timeline>> getQuestionTimeline(final long questionId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Timeline>>() {
            @Override
            public List<Timeline> call() throws Exception {
                return client.getQuestionTimeline(questionId, timePeriod);
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
                return client.getQuestionsByUser(userId);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestionsByUser(final long userId,
			final User.QuestionSortOrder sort) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestionsByUser(userId, sort);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestionsByUser(final long userId, final Paging paging) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestionsByUser(userId, paging);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestionsByUser(final long userId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestionsByUser(userId, timePeriod);
            }
        });
	}

	@Override
	public Future<List<Question>> getQuestionsByUser(final long userId,
			final Set<FilterOption> filterOptions) {
		return execute(new Callable<List<Question>>() {
            @Override
            public List<Question> call() throws Exception {
                return client.getQuestionsByUser(userId, filterOptions);
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
                return client.getQuestionsByUser(userId, sort, paging, timePeriod, filterOptions);
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
                return client.getTagsForUser(userId);
            }
        });
	}

	@Override
	public Future<List<Tag>> getTagsForUser(final long userId, final Paging paging) {
		return execute(new Callable<List<Tag>>() {
            @Override
            public List<Tag> call() throws Exception {
                return client.getTagsForUser(userId, paging);
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
	public Future<User> getUser(final long userId) {
		return execute(new Callable<User>() {
            @Override
            public User call() throws Exception {
                return client.getUser(userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUserComments(userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId,
			final Comment.SortOrder sort) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUserComments(userId, sort);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUserComments(userId, timePeriod);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId, final Paging paging) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUserComments(userId, paging);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId,
			final Comment.SortOrder sort, final Paging paging, final TimePeriod timePeriod) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUserComments(userId, sort, paging, timePeriod);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId, final long toUserId) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUserComments(userId, toUserId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId, final long toUserId,
			final Comment.SortOrder sort) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUserComments(userId, toUserId, sort);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId, final long toUserId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUserComments(userId, toUserId, timePeriod);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId, final long toUserId,
			final Paging paging) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUserComments(userId, toUserId, paging);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserComments(final long userId, final long toUserId,
			final Comment.SortOrder sort, final Paging paging, final TimePeriod timePeriod) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUserComments(userId, toUserId, sort, paging, timePeriod);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserMentions(final long userId) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUserMentions(userId);
            }
        });
	}

	@Override
	public Future<List<Comment>> getUserMentions(final long userId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Comment>>() {
            @Override
            public List<Comment> call() throws Exception {
                return client.getUserMentions(userId, timePeriod);
            }
        });
	}

	@Override
	public Future<List<Reputation>> getUserReputations(final long userId) {
		return execute(new Callable<List<Reputation>>() {
            @Override
            public List<Reputation> call() throws Exception {
                return client.getUserReputations(userId);
            }
        });
	}

	@Override
	public Future<List<Reputation>> getUserReputations(final long userId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Reputation>>() {
            @Override
            public List<Reputation> call() throws Exception {
                return client.getUserReputations(userId, timePeriod);
            }
        });
	}

	@Override
	public Future<List<Reputation>> getUserReputations(final long userId,
			final Paging paging) {
		return execute(new Callable<List<Reputation>>() {
            @Override
            public List<Reputation> call() throws Exception {
                return client.getUserReputations(userId, paging);
            }
        });
	}

	@Override
	public Future<List<Reputation>> getUserReputations(final long userId,
			final Paging paging, final TimePeriod timePeriod) {
		return execute(new Callable<List<Reputation>>() {
            @Override
            public List<Reputation> call() throws Exception {
                return client.getUserReputations(userId, paging, timePeriod);
            }
        });
	}

	@Override
	public Future<List<Timeline>> getUserTimeline(final long userId) {
		return execute(new Callable<List<Timeline>>() {
            @Override
            public List<Timeline> call() throws Exception {
                return client.getUserTimeline(userId);
            }
        });
	}

	@Override
	public Future<List<Timeline>> getUserTimeline(final long userId,
			final TimePeriod timePeriod) {
		return execute(new Callable<List<Timeline>>() {
            @Override
            public List<Timeline> call() throws Exception {
                return client.getUserTimeline(userId, timePeriod);
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
}
