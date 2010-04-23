/**
 *
 */
package com.google.code.stackoverflow.client.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.google.code.stackoverflow.client.StackOverflowApiClient;
import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.provider.url.ApiUrlBuilder;
import com.google.code.stackoverflow.schema.Answer;
import com.google.code.stackoverflow.schema.Answers;
import com.google.code.stackoverflow.schema.Badge;
import com.google.code.stackoverflow.schema.Badges;
import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.Comments;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.Question;
import com.google.code.stackoverflow.schema.PostTimelines;
import com.google.code.stackoverflow.schema.Questions;
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.Reputations;
import com.google.code.stackoverflow.schema.Revision;
import com.google.code.stackoverflow.schema.Revisions;
import com.google.code.stackoverflow.schema.Statistics;
import com.google.code.stackoverflow.schema.Tag;
import com.google.code.stackoverflow.schema.Tags;
import com.google.code.stackoverflow.schema.TimePeriod;
import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.UserTimeline;
import com.google.code.stackoverflow.schema.UserTimelines;
import com.google.code.stackoverflow.schema.Users;

/**
 * @author Nabeel Mukhtar
 *
 */
public abstract class BaseStackOverflowApiClient extends StackOverflowApiGateway implements StackOverflowApiClient {

    /**
     * Constructs ...
     *
     *
     * @param consumerKey
     * @param consumerSecret
     */
    protected BaseStackOverflowApiClient(String applicationKey) {
        requestHeaders = new HashMap<String, String>();

        // by default we compress contents
        requestHeaders.put("Accept-Encoding", "gzip, deflate");
        this.applicationKey = applicationKey;
    }
    
    /**
     * Constructs ...
     *
     *
     * @param consumerKey
     * @param consumerSecret
     */
    protected BaseStackOverflowApiClient(String applicationKey, String apiVersion) {
    	this(applicationKey);
    	this.apiVersion = apiVersion;
    }
    
    /**
     * Method description
     * @param applicationId TODO
     * @param urlFormat
     *
     *
     * @return
     */
    protected abstract ApiUrlBuilder createStackOverflowApiUrlBuilder(String methodName);

    /**
     * Get property as long.
     *
     * @param s
     *
     * @return
     */
    protected boolean isNullOrEmpty(String s) {
        return ((s == null) || (s.length() == 0));
    }

    /**
     *
     *
     * @param name
     * @param value
     */
    protected void assertNotNullOrEmpty(String name, String value) {
        if (isNullOrEmpty(value)) {
            throw new IllegalArgumentException(name + " cannot be null or empty.");
        }
    }

    /**
     *
     *
     * @param name
     * @param value
     */
    protected void assertNotNullOrEmpty(String name, Collection<?> value) {
        if ((value == null) || value.isEmpty()) {
            throw new IllegalArgumentException(name + " cannot be null or empty.");
        }
    }

    /**
     *
     *
     * @param name
     * @param value
     */
    protected void assertPositiveNumber(String name, int value) {
        if (value < 0) {
            throw new IllegalArgumentException(name + " cannot be less than zero.");
        }
    }

    /**
     *
     *
     * @param name
     * @param value
     */
    protected void assertNotNull(String name, Object value) {
        if (value == null) {
            throw new IllegalArgumentException(name + " cannot be null.");
        }
    }

	@Override
	public List<Question> getFavoriteQuestionsByUser(long userId, Paging paging) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_FAVORITE_QUESTIONS);
        String                apiUrl  = builder.withId(userId).withPaging(paging).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getFavoriteQuestionsByUser(long userId,
			TimePeriod timePeriod) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_FAVORITE_QUESTIONS);
        String                apiUrl  = builder.withId(userId).withTimePeriod(timePeriod).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getFavoriteQuestionsByUser(long userId,
			Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_FAVORITE_QUESTIONS);
        String                apiUrl  = builder.withId(userId).withFetchOptions(filterOptions).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getFavoriteQuestionsByUser(long userId,
			User.FavoriteSortOrder sort, Paging paging, TimePeriod timePeriod,
			Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_FAVORITE_QUESTIONS);
        String                apiUrl  = builder.withId(userId).withSort(sort).withPaging(paging).withTimePeriod(timePeriod).withFetchOptions(filterOptions).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public Question getQuestion(long questionId, Paging paging) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTION);
        String                apiUrl  = builder.withId(questionId).withPaging(paging).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return getFirstElement(questions.getQuestions());
	}

	@Override
	public Question getQuestion(long questionId, Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTION);
        String                apiUrl  = builder.withId(questionId).withFetchOptions(filterOptions).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return getFirstElement(questions.getQuestions());
	}

	@Override
	public Question getQuestion(long questionId, Paging paging,
			Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTION);
        String                apiUrl  = builder.withId(questionId).withPaging(paging).withFetchOptions(filterOptions).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return getFirstElement(questions.getQuestions());
	}

	@Override
	public List<PostTimeline> getQuestionTimeline(long questionId,
			TimePeriod timePeriod) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTION_TIMELINE);
        String                apiUrl  = builder.withId(questionId).withTimePeriod(timePeriod).buildUrl();

        PostTimelines timelines = readResponse(PostTimelines.class, callApiMethod(apiUrl));
        return timelines.getTimelines();
	}

	@Override
	public List<Question> getQuestions(Paging paging) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTIONS);
        String                apiUrl  = builder.withPaging(paging).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getQuestions(TimePeriod timePeriod) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTIONS);
        String                apiUrl  = builder.withTimePeriod(timePeriod).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getQuestions(Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTIONS);
        String                apiUrl  = builder.withFetchOptions(filterOptions).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getQuestions(Question.SortOrder sort, Paging paging,
			TimePeriod timePeriod, Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTIONS);
        String                apiUrl  = builder.withSort(sort).withPaging(paging).withTimePeriod(timePeriod).withFetchOptions(filterOptions).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getQuestionsByUser(long userId, Paging paging) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTIONS_BY_USER);
        String                apiUrl  = builder.withId(userId).withPaging(paging).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getQuestionsByUser(long userId, TimePeriod timePeriod) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTIONS_BY_USER);
        String                apiUrl  = builder.withId(userId).withTimePeriod(timePeriod).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getQuestionsByUser(long userId,
			Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTIONS_BY_USER);
        String                apiUrl  = builder.withId(userId).withFetchOptions(filterOptions).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getQuestionsByUser(long userId,
			User.QuestionSortOrder sort, Paging paging, TimePeriod timePeriod,
			Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTIONS_BY_USER);
        String                apiUrl  = builder.withId(userId).withSort(sort).withPaging(paging).withTimePeriod(timePeriod).withFetchOptions(filterOptions).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getTaggedQuestions(List<String> tags,
			Paging paging, TimePeriod timePeriod,
			Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_TAGGED_QUESTIONS);
        String                apiUrl  = builder.withParameters("tagged", tags).withPaging(paging).withTimePeriod(timePeriod).withFetchOptions(filterOptions).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Tag> getTags(Paging paging) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_TAGS);
        String                apiUrl  = builder.withPaging(paging).buildUrl();

        Tags tags = readResponse(Tags.class, callApiMethod(apiUrl));
        
        return tags.getTags();
	}

	@Override
	public List<Tag> getTags(Tag.SortOrder sort, Paging paging) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_TAGS);
        String                apiUrl  = builder.withSort(sort).withPaging(paging).buildUrl();

        Tags tags = readResponse(Tags.class, callApiMethod(apiUrl));
        
        return tags.getTags();
	}

	@Override
	public List<Tag> getTagsForUser(long userId, Paging paging) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_TAGS_FOR_USER);
        String                apiUrl  = builder.withId(userId).withPaging(paging).buildUrl();

        Tags tags = readResponse(Tags.class, callApiMethod(apiUrl));
        
        return tags.getTags();
	}

	@Override
	public List<Question> getUnansweredQuestions(Paging paging) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_UN_ANSWERED_QUESTIONS);
        String                apiUrl  = builder.withPaging(paging).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getUnansweredQuestions(TimePeriod timePeriod) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_UN_ANSWERED_QUESTIONS);
        String                apiUrl  = builder.withTimePeriod(timePeriod).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getUnansweredQuestions(Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_UN_ANSWERED_QUESTIONS);
        String                apiUrl  = builder.withFetchOptions(filterOptions).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getUnansweredQuestions(
			Question.UnansweredSortOrder sort, Paging paging,
			TimePeriod timePeriod, Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_UN_ANSWERED_QUESTIONS);
        String                apiUrl  = builder.withSort(sort).withPaging(paging).withTimePeriod(timePeriod).withFetchOptions(filterOptions).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Comment> getUserMentions(long userId, TimePeriod timePeriod) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_USER_MENTIONS);
        String                apiUrl  = builder.withId(userId).withTimePeriod(timePeriod).buildUrl();

        Comments mentions = readResponse(Comments.class, callApiMethod(apiUrl));
        
        return mentions.getComments();
	}

	@Override
	public List<UserTimeline> getUserTimeline(long userId, TimePeriod timePeriod) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_USER_TIMELINE);
        String                apiUrl  = builder.withId(userId).withTimePeriod(timePeriod).buildUrl();

        UserTimelines timelines = readResponse(UserTimelines.class, callApiMethod(apiUrl));
        
        return timelines.getTimelines();
	}

	@Override
	public List<User> getUsers(Paging paging) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_USERS);
        String                apiUrl  = builder.withPaging(paging).buildUrl();

        Users users = readResponse(Users.class, callApiMethod(apiUrl));
        
        return users.getUsers();
	}

	@Override
	public List<User> getUsers(String filter) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_USERS);
        String                apiUrl  = builder.withParameter("filter", filter).buildUrl();

        Users users = readResponse(Users.class, callApiMethod(apiUrl));
        
        return users.getUsers();
	}

	@Override
	public List<User> getUsers(String filter, User.SortOrder sort, Paging paging) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_USERS);
        String                apiUrl  = builder.withParameter("filter", filter).withSort(sort).withPaging(paging).buildUrl();

        Users users = readResponse(Users.class, callApiMethod(apiUrl));
        
        return users.getUsers();
	}
	
	@Override
	public Answer getAnswer(long answerId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_ANSWER);
        String                apiUrl  = builder.withId(answerId).buildUrl();

        Answers answers = readResponse(Answers.class, callApiMethod(apiUrl));
        
        return getFirstElement(answers.getAnswers());
	}

	@Override
	public List<Answer> getAnswersByUser(long userId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_ANSWERS_BY_USER);
        String                apiUrl  = builder.withId(userId).buildUrl();

        Answers answers = readResponse(Answers.class, callApiMethod(apiUrl));
        
        return answers.getAnswers();
	}

	@Override
	public List<Answer> getAnswersByQuestion(long questionId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_ANSWERS_BY_QUESTION);
        String                apiUrl  = builder.withId(questionId).buildUrl();

        Answers answers = readResponse(Answers.class, callApiMethod(apiUrl));
        
        return answers.getAnswers();
	}
	
	@Override
	public List<Answer> getAnswersByUser(long userId, Answer.SortOrder sort) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_ANSWERS_BY_USER);
        String                apiUrl  = builder.withId(userId).withSort(sort).buildUrl();

        Answers answers = readResponse(Answers.class, callApiMethod(apiUrl));
        
        return answers.getAnswers();
	}

	@Override
	public List<Badge> getBadges() {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_BADGES);
        String                apiUrl  = builder.buildUrl();

        Badges badges = readResponse(Badges.class, callApiMethod(apiUrl));
        
        return badges.getBadges();
	}

	@Override
	public List<Badge> getBadgesByName() {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_BADGES_BY_NAME);
        String                apiUrl  = builder.buildUrl();

        Badges badges = readResponse(Badges.class, callApiMethod(apiUrl));
        
        return badges.getBadges();
	}

	@Override
	public List<Badge> getBadgesByTags() {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_BADGES_BY_TAGS);
        String                apiUrl  = builder.buildUrl();

        Badges badges = readResponse(Badges.class, callApiMethod(apiUrl));
        
        return badges.getBadges();
	}
	
	@Override
	public List<Badge> getBadgesForUser(long userId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_BADGES_FOR_USER);
        String                apiUrl  = builder.withId(userId).buildUrl();

        Badges badges = readResponse(Badges.class, callApiMethod(apiUrl));
        
        return badges.getBadges();
	}

	@Override
	public List<Question> getFavoriteQuestionsByUser(long userId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_FAVORITE_QUESTIONS);
        String                apiUrl  = builder.withId(userId).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getFavoriteQuestionsByUser(long userId,
			User.FavoriteSortOrder sort) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_FAVORITE_QUESTIONS);
        String                apiUrl  = builder.withId(userId).withSort(sort).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public Question getQuestion(long questionId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTION);
        String                apiUrl  = builder.withId(questionId).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return getFirstElement(questions.getQuestions());
	}

	@Override
	public List<PostTimeline> getQuestionTimeline(long questionId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTION_TIMELINE);
        String                apiUrl  = builder.withId(questionId).buildUrl();

        PostTimelines timelines = readResponse(PostTimelines.class, callApiMethod(apiUrl));
        return timelines.getTimelines();
	}

	@Override
	public List<Question> getQuestions() {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTIONS);
        String                apiUrl  = builder.buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getQuestions(Question.SortOrder sort) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTIONS);
        String                apiUrl  = builder.withSort(sort).buildUrl();
        
        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getQuestionsByUser(long userId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTIONS_BY_USER);
        String                apiUrl  = builder.withId(userId).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getQuestionsByUser(long userId,
			User.QuestionSortOrder sort) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_QUESTIONS_BY_USER);
        String                apiUrl  = builder.withId(userId).withSort(sort).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getTaggedQuestions(List<String> tags) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_TAGGED_QUESTIONS);
        String                apiUrl  = builder.withParameters("tagged", tags).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Tag> getTags() {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_TAGS);
        String                apiUrl  = builder.buildUrl();

        Tags tags = readResponse(Tags.class, callApiMethod(apiUrl));
        
        return tags.getTags();
	}

	@Override
	public List<Tag> getTags(Tag.SortOrder sort) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_TAGS);
        String                apiUrl  = builder.withSort(sort).buildUrl();

        Tags tags = readResponse(Tags.class, callApiMethod(apiUrl));
        
        return tags.getTags();
	}

	@Override
	public List<Tag> getTagsForUser(long userId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_TAGS_FOR_USER);
        String                apiUrl  = builder.withId(userId).buildUrl();

        Tags tags = readResponse(Tags.class, callApiMethod(apiUrl));
        
        return tags.getTags();
	}

	@Override
	public List<Question> getUnansweredQuestions() {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_UN_ANSWERED_QUESTIONS);
        String                apiUrl  = builder.buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public List<Question> getUnansweredQuestions(Question.UnansweredSortOrder sort) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_UN_ANSWERED_QUESTIONS);
        String                apiUrl  = builder.withSort(sort).buildUrl();

        Questions questions = readResponse(Questions.class, callApiMethod(apiUrl));
        
        return questions.getQuestions();
	}

	@Override
	public User getUser(long userId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_USER);
        String                apiUrl  = builder.withId(userId).buildUrl();

        Users users = readResponse(Users.class, callApiMethod(apiUrl));
        
        return getFirstElement(users.getUsers());
	}

	@Override
	public List<Comment> getUserMentions(long userId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_USER_MENTIONS);
        String                apiUrl  = builder.withId(userId).buildUrl();

        Comments mentions = readResponse(Comments.class, callApiMethod(apiUrl));
        
        return mentions.getComments();
	}

	@Override
	public List<UserTimeline> getUserTimeline(long userId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_USER_TIMELINE);
        String                apiUrl  = builder.withId(userId).buildUrl();

        UserTimelines timelines = readResponse(UserTimelines.class, callApiMethod(apiUrl));
        
        return timelines.getTimelines();
	}

	@Override
	public List<User> getUsers() {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_USERS);
        String                apiUrl  = builder.buildUrl();

        Users users = readResponse(Users.class, callApiMethod(apiUrl));
        
        return users.getUsers();
	}

	@Override
	public List<User> getUsers(User.SortOrder sort) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_USERS);
        String                apiUrl  = builder.withSort(sort).buildUrl();

        Users users = readResponse(Users.class, callApiMethod(apiUrl));
        
        return users.getUsers();
	}
	
	@Override
	public List<Reputation> getUserReputations(long userId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_USER_REPUTATIONS);
        String                apiUrl  = builder.withId(userId).buildUrl();

        Reputations reputations = readResponse(Reputations.class, callApiMethod(apiUrl));
        
        return reputations.getReputations();
	}

	@Override
	public List<Reputation> getUserReputations(long userId,
			TimePeriod timePeriod) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_USER_REPUTATIONS);
        String                apiUrl  = builder.withId(userId).withTimePeriod(timePeriod).buildUrl();

        Reputations reputations = readResponse(Reputations.class, callApiMethod(apiUrl));
        
        return reputations.getReputations();
	}

	@Override
	public List<Reputation> getUserReputations(long userId, Paging paging) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_USER_REPUTATIONS);
        String                apiUrl  = builder.withId(userId).withPaging(paging).buildUrl();

        Reputations reputations = readResponse(Reputations.class, callApiMethod(apiUrl));
        
        return reputations.getReputations();
	}

	@Override
	public List<Reputation> getUserReputations(long userId,
			Paging paging, TimePeriod timePeriod) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_USER_REPUTATIONS);
        String                apiUrl  = builder.withId(userId).withPaging(paging).withTimePeriod(timePeriod).buildUrl();

        Reputations reputations = readResponse(Reputations.class, callApiMethod(apiUrl));
        
        return reputations.getReputations();
	}

	@Override
	public List<Comment> getUserComments(long userId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_COMMENTS_BY_USER);
        String                apiUrl  = builder.withId(userId).buildUrl();

        Comments comments = readResponse(Comments.class, callApiMethod(apiUrl));
        
        return comments.getComments();
	}

	@Override
	public List<Comment> getUserComments(long userId, Comment.SortOrder sort) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_COMMENTS_BY_USER);
        String                apiUrl  = builder.withId(userId).withSort(sort).buildUrl();

        Comments comments = readResponse(Comments.class, callApiMethod(apiUrl));
        
        return comments.getComments();
	}

	@Override
	public List<Comment> getUserComments(long userId, TimePeriod timePeriod) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_COMMENTS_BY_USER);
        String                apiUrl  = builder.withId(userId).withTimePeriod(timePeriod).buildUrl();

        Comments comments = readResponse(Comments.class, callApiMethod(apiUrl));
        
        return comments.getComments();
	}

	@Override
	public List<Comment> getUserComments(long userId, Paging paging) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_COMMENTS_BY_USER);
        String                apiUrl  = builder.withId(userId).withPaging(paging).buildUrl();

        Comments comments = readResponse(Comments.class, callApiMethod(apiUrl));
        
        return comments.getComments();
	}

	@Override
	public List<Comment> getUserComments(long userId, Comment.SortOrder sort,
			Paging paging, TimePeriod timePeriod) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_COMMENTS_BY_USER);
        String                apiUrl  = builder.withId(userId).withSort(sort).withPaging(paging).withTimePeriod(timePeriod).buildUrl();

        Comments comments = readResponse(Comments.class, callApiMethod(apiUrl));
        
        return comments.getComments();
	}

	@Override
	public List<Comment> getUserComments(long userId, long toUserId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_COMMENTS_BY_USER);
        String                apiUrl  = builder.withId(userId).withField("toid", String.valueOf(toUserId)).buildUrl();

        Comments comments = readResponse(Comments.class, callApiMethod(apiUrl));
        
        return comments.getComments();
	}

	@Override
	public List<Comment> getUserComments(long userId, long toUserId,
			Comment.SortOrder sort) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_COMMENTS_BY_USER);
        String                apiUrl  = builder.withId(userId).withField("toid", String.valueOf(toUserId)).withSort(sort).buildUrl();

        Comments comments = readResponse(Comments.class, callApiMethod(apiUrl));
        
        return comments.getComments();
	}

	@Override
	public List<Comment> getUserComments(long userId, long toUserId,
			TimePeriod timePeriod) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_COMMENTS_BY_USER);
        String                apiUrl  = builder.withId(userId).withField("toid", String.valueOf(toUserId)).withTimePeriod(timePeriod).buildUrl();

        Comments comments = readResponse(Comments.class, callApiMethod(apiUrl));
        
        return comments.getComments();
	}

	@Override
	public List<Comment> getUserComments(long userId, long toUserId,
			Paging paging) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_COMMENTS_BY_USER);
        String                apiUrl  = builder.withId(userId).withField("toid", String.valueOf(toUserId)).withPaging(paging).buildUrl();

        Comments comments = readResponse(Comments.class, callApiMethod(apiUrl));
        
        return comments.getComments();
	}

	@Override
	public List<Comment> getUserComments(long userId, long toUserId,
			Comment.SortOrder sort, Paging paging, TimePeriod timePeriod) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_COMMENTS_BY_USER);
        String                apiUrl  = builder.withId(userId).withField("toid", String.valueOf(toUserId)).withSort(sort).withPaging(paging).withTimePeriod(timePeriod).buildUrl();

        Comments comments = readResponse(Comments.class, callApiMethod(apiUrl));
        
        return comments.getComments();
	}

	@Override
	public Comment getComment(long commentId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_COMMENT);
        String                apiUrl  = builder.withId(commentId).buildUrl();

        Comments comments = readResponse(Comments.class, callApiMethod(apiUrl));
        
        return getFirstElement(comments.getComments());
	}

	@Override
	public Statistics getStatistics() {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_STATISTICS);
        String                apiUrl  = builder.buildUrl();

        return readResponse(Statistics.class, callApiMethod(apiUrl));
	}
	
	@Override
	public Answer getAnswer(long answerId, Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_ANSWER);
        String                apiUrl  = builder.withId(answerId).withFetchOptions(filterOptions).buildUrl();

        Answers answers = readResponse(Answers.class, callApiMethod(apiUrl));
        
        return getFirstElement(answers.getAnswers());
	}

	@Override
	public List<Answer> getAnswersByUser(long userId,
			Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_ANSWERS_BY_USER);
        String                apiUrl  = builder.withId(userId).withFetchOptions(filterOptions).buildUrl();

        Answers answers = readResponse(Answers.class, callApiMethod(apiUrl));
        
        return answers.getAnswers();
	}

	@Override
	public List<Answer> getAnswersByQuestion(long questionId,
			Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_ANSWERS_BY_QUESTION);
        String                apiUrl  = builder.withId(questionId).withFetchOptions(filterOptions).buildUrl();

        Answers answers = readResponse(Answers.class, callApiMethod(apiUrl));
        
        return answers.getAnswers();
	}
	
	@Override
	public List<Answer> getAnswersByUser(long userId, Answer.SortOrder sort,
			Set<FilterOption> filterOptions) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_ANSWERS_BY_USER);
        String                apiUrl  = builder.withId(userId).withSort(sort).withFetchOptions(filterOptions).buildUrl();

        Answers answers = readResponse(Answers.class, callApiMethod(apiUrl));
        
        return answers.getAnswers();
	}
	
	@Override
	public Revision getRevisionForPost(long postId, String revisionGuid) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_REVISIONS_FOR_POST);
        String                apiUrl  = builder.withId(postId).withField("revisionguid", revisionGuid).buildUrl();

        Revisions revisions = readResponse(Revisions.class, callApiMethod(apiUrl));
        
        return getFirstElement(revisions.getRevisions());
	}

	@Override
	public List<Revision> getRevisionsForPost(long postId) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_REVISIONS_FOR_POST);
        String                apiUrl  = builder.withId(postId).buildUrl();

        Revisions revisions = readResponse(Revisions.class, callApiMethod(apiUrl));
        
        return revisions.getRevisions();
	}

	@Override
	public List<Revision> getRevisionsForPost(long postId, TimePeriod timePeriod) {
		ApiUrlBuilder builder = createStackOverflowApiUrlBuilder(StackOverflowApiMethods.GET_REVISIONS_FOR_POST);
        String                apiUrl  = builder.withId(postId).withTimePeriod(timePeriod).buildUrl();

        Revisions revisions = readResponse(Revisions.class, callApiMethod(apiUrl));
        
        return revisions.getRevisions();
	}
	
	private <T> T getFirstElement(List<T> list) {
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
}
