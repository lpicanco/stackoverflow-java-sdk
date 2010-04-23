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
import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.UserTimeline;

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
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getFavoriteQuestionsByUsers(com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, long...)}.
	 */
	@Test
	public void testGetFavoriteQuestionsByUserLongPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> favoriteQuestionsByUser = client.getFavoriteQuestionsByUsers(getPaging(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Questions should never be null.", favoriteQuestionsByUser);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getFavoriteQuestionsByUsers(com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, long...)}.
	 */
	@Test
	public void testGetFavoriteQuestionsByUserLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> favoriteQuestionsByUser = client.getFavoriteQuestionsByUsers(getTimePeriod(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Questions should never be null.", favoriteQuestionsByUser);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getFavoriteQuestionsByUsers(java.util.Set, long...)}.
	 */
	@Test
	public void testGetFavoriteQuestionsByUserLongSetOfFilterOption() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> favoriteQuestionsByUser = client.getFavoriteQuestionsByUsers(EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Questions should never be null.", favoriteQuestionsByUser);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getFavoriteQuestionsByUsers(com.google.code.stackoverflow.schema.UserFavoriteSortOrder, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, java.util.Set, long...)}.
	 */
	@Test
	public void testGetFavoriteQuestionsByUserLongUserFavoriteSortOrderPagingTimePeriodSetOfFilterOption() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> favoriteQuestionsByUser = client.getFavoriteQuestionsByUsers(EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Questions should never be null.", favoriteQuestionsByUser);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestions(com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, long...)}.
	 */
	@Test
	public void testGetQuestionLongPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
    	List<Question> questions = client.getQuestions(getPaging(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID));
		assertNotNullOrEmpty("Question should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestions(java.util.Set, long...)}.
	 */
	@Test
	public void testGetQuestionLongSetOfFilterOption() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
    	List<Question> questions = client.getQuestions(EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID));
    	assertNotNullOrEmpty("Question should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestions(com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, java.util.Set, long...)}.
	 */
	@Test
	public void testGetQuestionLongPagingSetOfFilterOption() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
    	List<Question> questions = client.getQuestions(getPaging(), EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID));
    	assertNotNullOrEmpty("Question should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionsTimeline(com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, long...)}.
	 */
	@Test
	public void testGetQuestionTimelineLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
    	List<PostTimeline> questionTimeline = client.getQuestionsTimeline(getTimePeriod(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID));
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
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionsByUsers(com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, long...)}.
	 */
	@Test
	public void testGetQuestionsByUserLongPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getQuestionsByUsers(getPaging(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionsByUsers(com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, long...)}.
	 */
	@Test
	public void testGetQuestionsByUserLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getQuestionsByUsers(getTimePeriod(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionsByUsers(java.util.Set, long...)}.
	 */
	@Test
	public void testGetQuestionsByUserLongSetOfFilterOption() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getQuestionsByUsers(EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionsByUsers(com.google.code.stackoverflow.schema.UserQuestionSortOrder, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, java.util.Set, long...)}.
	 */
	@Test
	public void testGetQuestionsByUserLongUserQuestionSortOrderPagingTimePeriodSetOfFilterOption() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getQuestionsByUsers(User.QuestionSortOrder.MOST_RECENTLY_UPDATED, getPaging(), getTimePeriod(), EnumSet.of(FilterOption.INCLUDE_BODY, FilterOption.INCLUDE_COMMENTS), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
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
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getTagsForUsers(com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, long...)}.
	 */
	@Test
	public void testGetTagsForUserLongPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Tag> tags = client.getTagsForUsers(getPaging(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
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
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersMentions(com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, long...)}.
	 */
	@Test
	public void testGetUserMentionsLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> mentions = client.getUsersMentions(getTimePeriod(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Mentions should never be null.", mentions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersTimeline(com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, long...)}.
	 */
	@Test
	public void testGetUserTimelineLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<UserTimeline> timelines = client.getUsersTimeline(getTimePeriod(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
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
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getAnswers(long...)}.
	 */
	@Test
	public void testGetAnswer() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Answer Id."), TestConstants.STACK_OVERFLOW_TEST_ANSWER_ID);
		List<Answer> answers = client.getAnswers(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_ANSWER_ID));
		assertNotNullOrEmpty("Answers should never be null.", answers);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getAnswersByUsers(long...)}.
	 */
	@Test
	public void testGetAnswersByUserLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Answer> answers = client.getAnswersByUsers(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Answers should never be null.", answers);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getAnswersByQuestions(long...)}.
	 */
	@Test
	public void testGetAnswersByQuestionLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
		List<Answer> answers = client.getAnswersByQuestions(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID));
		assertNotNullOrEmpty("Answers should never be null.", answers);
	}
	
	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getAnswersByUsers(com.google.code.stackoverflow.schema.SortOrder, long...)}.
	 */
	@Test
	public void testGetAnswersByUserLongAnswerSortOrder() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Answer> answers = client.getAnswersByUsers(Answer.SortOrder.MOST_RECENTLY_UPDATED, Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
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
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getBadgesForUsers(long...)}.
	 */
	@Test
	public void testGetBadgesForUser() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Badge> badges = client.getBadgesForUsers(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Badges should never be null.", badges);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getFavoriteQuestionsByUsers(long...)}.
	 */
	@Test
	public void testGetFavoriteQuestionsByUserLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getFavoriteQuestionsByUsers(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getFavoriteQuestionsByUsers(com.google.code.stackoverflow.schema.UserFavoriteSortOrder, long...)}.
	 */
	@Test
	public void testGetFavoriteQuestionsByUserLongUserFavoriteSortOrder() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getFavoriteQuestionsByUsers(User.FavoriteSortOrder.MOST_RECENTLY_UPDATED, Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestions(long...)}.
	 */
	@Test
	public void testGetQuestionLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
		List<Question> questions = client.getQuestions(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionsTimeline(long...)}.
	 */
	@Test
	public void testGetQuestionTimelineLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
		List<PostTimeline> timelines = client.getQuestionsTimeline(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID));
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
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionsByUsers(long...)}.
	 */
	@Test
	public void testGetQuestionsByUserLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getQuestionsByUsers(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Questions should never be null.", questions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getQuestionsByUsers(com.google.code.stackoverflow.schema.UserQuestionSortOrder, long...)}.
	 */
	@Test
	public void testGetQuestionsByUserLongUserQuestionSortOrder() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Question> questions = client.getQuestionsByUsers(User.QuestionSortOrder.MOST_RECENTLY_CREATED, Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
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
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getTagsForUsers(long...)}.
	 */
	@Test
	public void testGetTagsForUserLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Tag> tags = client.getTagsForUsers(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
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
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsers(long...)}.
	 */
	@Test
	public void testGetUser() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<User> users = client.getUsers(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Users should never be null.", users);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersMentions(long...)}.
	 */
	@Test
	public void testGetUserMentionsLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> mentions = client.getUsersMentions(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Mentions should never be null.", mentions);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersTimeline(long...)}.
	 */
	@Test
	public void testGetUserTimelineLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<UserTimeline> timelines = client.getUsersTimeline(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
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
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersReputations(long...)}.
	 */
	@Test
	public void testGetUserReputationsLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Reputation> reputations = client.getUsersReputations(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Reputations should never be null.", reputations);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersReputations(com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, long...)}.
	 */
	@Test
	public void testGetUserReputationsLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Reputation> reputations = client.getUsersReputations(getTimePeriod(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Reputations should never be null.", reputations);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersReputations(com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, long...)}.
	 */
	@Test
	public void testGetUserReputationsLongPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Reputation> reputations = client.getUsersReputations(getPaging(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Reputations should never be null.", reputations);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersReputations(com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, long...)}.
	 */
	@Test
	public void testGetUserReputationsLongPagingTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Reputation> reputations = client.getUsersReputations(getPaging(), getTimePeriod(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Reputations should never be null.", reputations);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersComments(long...)}.
	 */
	@Test
	public void testGetUserCommentsLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUsersComments(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersCommentsToUser(com.google.code.stackoverflow.schema.SortOrder, long...)}.
	 */
	@Test
	public void testGetUserCommentsLongCommentSortOrder() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUsersComments(Comment.SortOrder.MOST_VOTED, Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersCommentsToUser(com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, long...)}.
	 */
	@Test
	public void testGetUserCommentsLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUsersComments(getTimePeriod(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersCommentsToUser(com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, long...)}.
	 */
	@Test
	public void testGetUserCommentsLongPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUsersComments(getPaging(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersComments(com.google.code.stackoverflow.schema.SortOrder, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, long...)}.
	 */
	@Test
	public void testGetUserCommentsLongCommentSortOrderPagingTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUsersComments(Comment.SortOrder.MOST_RECENTLY_CREATED, getPaging(), getTimePeriod(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersCommentsToUser(long, long...)}.
	 */
	@Test
	public void testGetUserCommentsLongLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUsersCommentsToUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersCommentsToUser(long, com.google.code.stackoverflow.schema.SortOrder, long...)}.
	 */
	@Test
	public void testGetUserCommentsLongLongCommentSortOrder() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUsersCommentsToUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), Comment.SortOrder.MOST_RECENTLY_CREATED, Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersCommentsToUser(long, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, long...)}.
	 */
	@Test
	public void testGetUserCommentsLongLongTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUsersCommentsToUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getTimePeriod(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersCommentsToUser(long, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, long...)}.
	 */
	@Test
	public void testGetUserCommentsLongLongPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUsersCommentsToUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), getPaging(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}

	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getUsersCommentsToUser(long, com.google.code.stackoverflow.schema.SortOrder, com.google.code.stackoverflow.client.StackOverflowApiClient.Paging, com.google.code.stackoverflow.client.StackOverflowApiClient.TimePeriod, long...)}.
	 */
	@Test
	public void testGetUserCommentsLongLongCommentSortOrderPagingTimePeriod() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test User Id."), TestConstants.STACK_OVERFLOW_TEST_USER_ID);
		List<Comment> comments = client.getUsersCommentsToUser(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID), Comment.SortOrder.MOST_RECENTLY_CREATED, getPaging(), getTimePeriod(), Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_USER_ID));
		assertNotNullOrEmpty("Comments should never be null.", comments);
	}
	
	/**
	 * Test method for {@link com.google.code.stackoverflow.client.impl.BaseStackOverflowApiClient#getRevisionsForPosts(long...)}.
	 */
	@Test
	public void testGetRevisionsForPostLong() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Question Id."), TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID);
		List<Revision> revisions = client.getRevisionsForPosts(Long.valueOf(TestConstants.STACK_OVERFLOW_TEST_QUESTION_ID));
		assertNotNullOrEmpty("Revisions should never be null.", revisions);
	}
}
