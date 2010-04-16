/**
 * 
 */
package com.google.code.stackoverflow.client;

import java.util.EnumSet;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.code.stackoverflow.client.constant.TestConstants;
import com.google.code.stackoverflow.schema.Answer;
import com.google.code.stackoverflow.schema.Badge;
import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.FilterOption;
import com.google.code.stackoverflow.schema.Question;
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.Revision;
import com.google.code.stackoverflow.schema.Tag;
import com.google.code.stackoverflow.schema.Timeline;
import com.google.code.stackoverflow.schema.User;

/**
 * @author nmukhtar
 *
 */
public class StackOverflowApiJsonClientTest extends StackOverflowApiClientTest {
	private StackOverflowApiClient client;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		client = factory.createStackOverflowApiClient();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		super.tearDown();
		client = null;
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getFavoriteQuestionsByUser(long, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging)}.
	 */
	@Test
	public void testGetFavoriteQuestionsByUserLongPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> favoriteQuestionsByUser = client.getFavoriteQuestionsByUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getPaging());
		assertNotNullOrEmpty("Questions should never be null.", favoriteQuestionsByUser);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getFavoriteQuestionsByUser(long, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod)}.
	 */
	@Test
	public void testGetFavoriteQuestionsByUserLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> favoriteQuestionsByUser = client.getFavoriteQuestionsByUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getTimePeriod());
		assertNotNullOrEmpty("Questions should never be null.", favoriteQuestionsByUser);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getFavoriteQuestionsByUser(long, java.util.Set)}.
	 */
	@Test
	public void testGetFavoriteQuestionsByUserLongSetOfFilterOption() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> favoriteQuestionsByUser = client.getFavoriteQuestionsByUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS));
		assertNotNullOrEmpty("Questions should never be null.", favoriteQuestionsByUser);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getFavoriteQuestionsByUser(long, com.google.code.stackoverflow.schema.UserFavoriteSortOrder, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, java.util.Set)}.
	 */
	@Test
	public void testGetFavoriteQuestionsByUserLongUserFavoriteSortOrderPagingTimePeriodSetOfFilterOption() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> favoriteQuestionsByUser = client.getFavoriteQuestionsByUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS));
		assertNotNullOrEmpty("Questions should never be null.", favoriteQuestionsByUser);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestion(long, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging)}.
	 */
	@Test
	public void testGetQuestionLongPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
    	Question question = client.getQuestion(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID), getPaging());
		assertNotNull("Question should never be null.", question);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestion(long, java.util.Set)}.
	 */
	@Test
	public void testGetQuestionLongSetOfFilterOption() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
    	Question question = client.getQuestion(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID), EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS));
		assertNotNull("Question should never be null.", question);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestion(long, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, java.util.Set)}.
	 */
	@Test
	public void testGetQuestionLongPagingSetOfFilterOption() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
    	Question question = client.getQuestion(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID), getPaging(), EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS));
		assertNotNull("Question should never be null.", question);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionTimeline(long, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod)}.
	 */
	@Test
	public void testGetQuestionTimelineLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
    	List<Timeline> questionTimeline = client.getQuestionTimeline(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID), getTimePeriod());
		assertNotNullOrEmpty("Question timeline should never be null.", questionTimeline);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestions(com.google.code.stackoverflow.client.StackOverflowApiClient.Paging)}.
	 */
	@Test
	public void testGetQuestionsPaging() {
		List<Question> questions = client.getQuestions(getPaging());
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestions(com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod)}.
	 */
	@Test
	public void testGetQuestionsTimePeriod() {
		List<Question> questions = client.getQuestions(getTimePeriod());
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestions(java.util.Set)}.
	 */
	@Test
	public void testGetQuestionsSetOfFilterOption() {
		List<Question> questions = client.getQuestions(EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestions(com.google.code.stackoverflow.schema.QuestionSortOrder, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, java.util.Set)}.
	 */
	@Test
	public void testGetQuestionsQuestionSortOrderPagingTimePeriodSetOfFilterOption() {
		List<Question> questions = client.getQuestions(Question.SortOrder.HOT, getPaging(), getTimePeriod(), EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionsByUser(long, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging)}.
	 */
	@Test
	public void testGetQuestionsByUserLongPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getQuestionsByUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getPaging());
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionsByUser(long, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod)}.
	 */
	@Test
	public void testGetQuestionsByUserLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getQuestionsByUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getTimePeriod());
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionsByUser(long, java.util.Set)}.
	 */
	@Test
	public void testGetQuestionsByUserLongSetOfFilterOption() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getQuestionsByUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionsByUser(long, com.google.code.stackoverflow.schema.UserQuestionSortOrder, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, java.util.Set)}.
	 */
	@Test
	public void testGetQuestionsByUserLongUserQuestionSortOrderPagingTimePeriodSetOfFilterOption() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getQuestionsByUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), User.QuestionSortOrder.MOST_RECENTLY_UPDATED, getPaging(), getTimePeriod(), EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getTaggedQuestions(java.util.List, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, java.util.Set)}.
	 */
	@Test
	public void testGetTaggedQuestionsListOfStringPagingTimePeriodSetOfFilterOption() {
		List<Question> questions = client.getTaggedQuestions(getTags(), getPaging(), getTimePeriod(), EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getTags(com.google.code.stackoverflow.client.StackOverflowApiClient.Paging)}.
	 */
	@Test
	public void testGetTagsPaging() {
		List<Tag> tags = client.getTags(getPaging());
		assertNotNullOrEmpty("Tags should never be null.", tags);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getTags(com.google.code.stackoverflow.schema.SortOrder, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging)}.
	 */
	@Test
	public void testGetTagsTagSortOrderPaging() {
		List<Tag> tags = client.getTags(Tag.SortOrder.MOST_POPULAR, getPaging());
		assertNotNullOrEmpty("Tags should never be null.", tags);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getTagsForUser(long, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging)}.
	 */
	@Test
	public void testGetTagsForUserLongPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Tag> tags = client.getTagsForUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getPaging());
		assertNotNullOrEmpty("Tags should never be null.", tags);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUnansweredQuestions(com.google.code.stackoverflow.client.StackOverflowApiClient.Paging)}.
	 */
	@Test
	public void testGetUnansweredQuestionsPaging() {
		List<Question> questions = client.getUnansweredQuestions(getPaging());
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUnansweredQuestions(com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod)}.
	 */
	@Test
	public void testGetUnansweredQuestionsTimePeriod() {
		List<Question> questions = client.getUnansweredQuestions(getTimePeriod());
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUnansweredQuestions(java.util.Set)}.
	 */
	@Test
	public void testGetUnansweredQuestionsSetOfFilterOption() {
		List<Question> questions = client.getUnansweredQuestions(EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUnansweredQuestions(com.google.code.stackoverflow.schema.UnansweredSortOrder, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, java.util.Set)}.
	 */
	@Test
	public void testGetUnansweredQuestionsUnansweredQuestionSortOrderPagingTimePeriodSetOfFilterOption() {
		List<Question> questions = client.getUnansweredQuestions(Question.UnansweredSortOrder.VOTES, getPaging(), getTimePeriod(), EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserMentions(long, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod)}.
	 */
	@Test
	public void testGetUserMentionsLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> mentions = client.getUserMentions(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getTimePeriod());
		assertNotNullOrEmpty("Mentions should never be null.", mentions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserTimeline(long, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod)}.
	 */
	@Test
	public void testGetUserTimelineLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Timeline> timelines = client.getUserTimeline(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getTimePeriod());
		assertNotNullOrEmpty("User Timelines should never be null.", timelines);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsers(com.google.code.stackoverflow.client.StackOverflowApiClient.Paging)}.
	 */
	@Test
	public void testGetUsersPaging() {
		List<User> users = client.getUsers(getPaging());
		assertNotNullOrEmpty("Users should never be null.", users);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsers(java.lang.String)}.
	 */
	@Test
	public void testGetUsersString() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Filter."), TestConstants.STACK_OVERFLOW_TEST_USER_FILTER);
		List<User> users = client.getUsers(TestConstants.STACK_OVERFLOW_TEST_USER_FILTER);
		assertNotNullOrEmpty("Users should never be null.", users);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsers(java.lang.String, com.google.code.stackoverflow.schema.SortOrder, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging)}.
	 */
	@Test
	public void testGetUsersStringUserSortOrderPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Filter."), TestConstants.STACK_OVERFLOW_TEST_USER_FILTER);
		List<User> users = client.getUsers(TestConstants.STACK_OVERFLOW_TEST_USER_FILTER, User.SortOrder.MOST_REPUTED, getPaging());
		assertNotNullOrEmpty("Users should never be null.", users);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getAnswer(long)}.
	 */
	@Test
	public void testGetAnswer() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Answer Id."), TestConstants.STACK_OVERFLOW_TEST_ANSWER_ID);
		Answer answer = client.getAnswer(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_ANSWER_ID));
		assertNotNull("Answer should never be null.", answer);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getAnswersByUser(long)}.
	 */
	@Test
	public void testGetAnswersByUserLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Answer> answers = client.getAnswersByUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Answers should never be null.", answers);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getAnswersByUser(long, com.google.code.stackoverflow.schema.SortOrder)}.
	 */
	@Test
	public void testGetAnswersByUserLongAnswerSortOrder() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Answer> answers = client.getAnswersByUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), Answer.SortOrder.MOST_RECENTLY_UPDATED);
		assertNotNullOrEmpty("Answers should never be null.", answers);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getBadges()}.
	 */
	@Test
	public void testGetBadges() {
		List<Badge> badges = client.getBadges();
		assertNotNullOrEmpty("Badges should never be null.", badges);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getBadgesByName(com.google.code.stackoverflow.schema.BadgeSortOrder)}.
	 */
	@Test
	public void testGetBadgesByName() {
		List<Badge> badges = client.getBadgesByName();
		assertNotNullOrEmpty("Badges should never be null.", badges);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getBadgesByTags(com.google.code.stackoverflow.schema.BadgeSortOrder)}.
	 */
	@Test
	public void testGetBadgesByTags() {
		List<Badge> badges = client.getBadgesByTags();
		assertNotNullOrEmpty("Badges should never be null.", badges);
	}
	
	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getBadgesForUser(long)}.
	 */
	@Test
	public void testGetBadgesForUser() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Badge> badges = client.getBadgesForUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Badges should never be null.", badges);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getFavoriteQuestionsByUser(long)}.
	 */
	@Test
	public void testGetFavoriteQuestionsByUserLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getFavoriteQuestionsByUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getFavoriteQuestionsByUser(long, com.google.code.stackoverflow.schema.UserFavoriteSortOrder)}.
	 */
	@Test
	public void testGetFavoriteQuestionsByUserLongUserFavoriteSortOrder() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getFavoriteQuestionsByUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), User.FavoriteSortOrder.MOST_RECENTLY_UPDATED);
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestion(long)}.
	 */
	@Test
	public void testGetQuestionLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
		Question question = client.getQuestion(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID));
		assertNotNull("Question should never be null.", question);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionTimeline(long)}.
	 */
	@Test
	public void testGetQuestionTimelineLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
		List<Timeline> timelines = client.getQuestionTimeline(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID));
		assertNotNullOrEmpty("Question timelines should never be null.", timelines);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestions()}.
	 */
	@Test
	public void testGetQuestions() {
		List<Question> questions = client.getQuestions();
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestions(com.google.code.stackoverflow.schema.QuestionSortOrder)}.
	 */
	@Test
	public void testGetQuestionsQuestionSortOrder() {
		List<Question> questions = client.getQuestions(Question.SortOrder.VOTES);
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionsByUser(long)}.
	 */
	@Test
	public void testGetQuestionsByUserLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getQuestionsByUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionsByUser(long, com.google.code.stackoverflow.schema.UserQuestionSortOrder)}.
	 */
	@Test
	public void testGetQuestionsByUserLongUserQuestionSortOrder() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getQuestionsByUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), User.QuestionSortOrder.MOST_RECENTLY_CREATED);
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getTaggedQuestions(java.util.List)}.
	 */
	@Test
	public void testGetTaggedQuestionsListOfString() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Tags."), TestConstants.STACK_OVERFLOW_TEST_TAGS);
		List<Question> questions = client.getTaggedQuestions(getTags());
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getTags()}.
	 */
	@Test
	public void testGetTags() {
		List<Tag> tags = client.getTags();
		assertNotNullOrEmpty("Tags should never be null.", tags);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getTags(com.google.code.stackoverflow.schema.SortOrder)}.
	 */
	@Test
	public void testGetTagsTagSortOrder() {
		List<Tag> tags = client.getTags(Tag.SortOrder.MOST_RECENTLY_UPDATED);
		assertNotNullOrEmpty("Tags should never be null.", tags);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getTagsForUser(long)}.
	 */
	@Test
	public void testGetTagsForUserLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Tag> tags = client.getTagsForUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Tags should never be null.", tags);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUnansweredQuestions()}.
	 */
	@Test
	public void testGetUnansweredQuestions() {
		List<Question> questions = client.getUnansweredQuestions();
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUnansweredQuestions(com.google.code.stackoverflow.schema.UnansweredSortOrder)}.
	 */
	@Test
	public void testGetUnansweredQuestionsUnansweredQuestionSortOrder() {
		List<Question> questions = client.getUnansweredQuestions(Question.UnansweredSortOrder.VOTES);
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUser(long)}.
	 */
	@Test
	public void testGetUser() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		User user = client.getUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNull("User should never be null.", user);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserMentions(long)}.
	 */
	@Test
	public void testGetUserMentionsLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> mentions = client.getUserMentions(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Mentions should never be null.", mentions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserTimeline(long)}.
	 */
	@Test
	public void testGetUserTimelineLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Timeline> timelines = client.getUserTimeline(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("User timeline should never be null.", timelines);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsers()}.
	 */
	@Test
	public void testGetUsers() {
		List<User> users = client.getUsers();
		assertNotNullOrEmpty("Users should never be null.", users);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsers(com.google.code.stackoverflow.schema.SortOrder)}.
	 */
	@Test
	public void testGetUsersUserSortOrder() {
		List<User> users = client.getUsers(User.SortOrder.NAME_ASCENDING);
		assertNotNullOrEmpty("Users should never be null.", users);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserReputations(long)}.
	 */
	@Test
	public void testGetUserReputationsLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Reputation> reputations = client.getUserReputations(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Reputations should never be null.", reputations);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserReputations(long, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod)}.
	 */
	@Test
	public void testGetUserReputationsLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Reputation> reputations = client.getUserReputations(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getTimePeriod());
		assertNotNullOrEmpty("Reputations should never be null.", reputations);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserReputations(long, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging)}.
	 */
	@Test
	public void testGetUserReputationsLongPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Reputation> reputations = client.getUserReputations(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getPaging());
		assertNotNullOrEmpty("Reputations should never be null.", reputations);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserReputations(long, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod)}.
	 */
	@Test
	public void testGetUserReputationsLongPagingTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Reputation> reputations = client.getUserReputations(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getPaging(), getTimePeriod());
		assertNotNullOrEmpty("Reputations should never be null.", reputations);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserComments(long)}.
	 */
	@Test
	public void testGetUserCommentsLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUserComments(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserComments(long, com.google.code.stackoverflow.schema.SortOrder)}.
	 */
	@Test
	public void testGetUserCommentsLongCommentSortOrder() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUserComments(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), Comment.SortOrder.MOST_VOTED);
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserComments(long, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod)}.
	 */
	@Test
	public void testGetUserCommentsLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUserComments(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getTimePeriod());
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserComments(long, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging)}.
	 */
	@Test
	public void testGetUserCommentsLongPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUserComments(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getPaging());
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserComments(long, com.google.code.stackoverflow.schema.SortOrder, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod)}.
	 */
	@Test
	public void testGetUserCommentsLongCommentSortOrderPagingTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUserComments(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), Comment.SortOrder.MOST_RECENTLY_CREATED, getPaging(), getTimePeriod());
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserComments(long, long)}.
	 */
	@Test
	public void testGetUserCommentsLongLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUserComments(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserComments(long, long, com.google.code.stackoverflow.schema.SortOrder)}.
	 */
	@Test
	public void testGetUserCommentsLongLongCommentSortOrder() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUserComments(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), Comment.SortOrder.MOST_RECENTLY_CREATED);
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserComments(long, long, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod)}.
	 */
	@Test
	public void testGetUserCommentsLongLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUserComments(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getTimePeriod());
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserComments(long, long, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging)}.
	 */
	@Test
	public void testGetUserCommentsLongLongPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUserComments(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getPaging());
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUserComments(long, long, com.google.code.stackoverflow.schema.SortOrder, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod)}.
	 */
	@Test
	public void testGetUserCommentsLongLongCommentSortOrderPagingTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUserComments(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), Comment.SortOrder.MOST_RECENTLY_CREATED, getPaging(), getTimePeriod());
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}
	
	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getRevisionsForPost(long)}.
	 */
	@Test
	public void testGetRevisionsForPostLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
		List<Revision> revisions = client.getRevisionsForPost(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID));
		assertNotNullOrEmpty("Revisions should never be null.", revisions);
	}
}
