package com.google.code.stackoverflow.schema;


/**
 * The Interface Statistics.
 */
public interface Statistics extends SchemaEntity {

	/**
	 * Gets the total questions.
	 * 
	 * @return the total questions
	 */
	public long getTotalQuestions();

	/**
	 * Sets the total questions.
	 * 
	 * @param totalQuestions the new total questions
	 */
	public void setTotalQuestions(long totalQuestions);

	/**
	 * Gets the total unanswered.
	 * 
	 * @return the total unanswered
	 */
	public long getTotalUnanswered();

	/**
	 * Sets the total unanswered.
	 * 
	 * @param totalUnanswered the new total unanswered
	 */
	public void setTotalUnanswered(long totalUnanswered);

	/**
	 * Gets the total answers.
	 * 
	 * @return the total answers
	 */
	public long getTotalAnswers();

	/**
	 * Sets the total answers.
	 * 
	 * @param totalAnswers the new total answers
	 */
	public void setTotalAnswers(long totalAnswers);

	/**
	 * Gets the total comments.
	 * 
	 * @return the total comments
	 */
	public long getTotalComments();

	/**
	 * Sets the total comments.
	 * 
	 * @param totalComments the new total comments
	 */
	public void setTotalComments(long totalComments);

	/**
	 * Gets the total votes.
	 * 
	 * @return the total votes
	 */
	public long getTotalVotes();

	/**
	 * Sets the total votes.
	 * 
	 * @param totalVotes the new total votes
	 */
	public void setTotalVotes(long totalVotes);

	/**
	 * Gets the total badges.
	 * 
	 * @return the total badges
	 */
	public long getTotalBadges();

	/**
	 * Sets the total badges.
	 * 
	 * @param totalBadges the new total badges
	 */
	public void setTotalBadges(long totalBadges);

	/**
	 * Gets the total users.
	 * 
	 * @return the total users
	 */
	public long getTotalUsers();

	/**
	 * Sets the total users.
	 * 
	 * @param totalUsers the new total users
	 */
	public void setTotalUsers(long totalUsers);

	/**
	 * Gets the questions per minute.
	 * 
	 * @return the questions per minute
	 */
	public double getQuestionsPerMinute();

	/**
	 * Sets the questions per minute.
	 * 
	 * @param questionsPerMinute the new questions per minute
	 */
	public void setQuestionsPerMinute(double questionsPerMinute);

	/**
	 * Gets the answers per minute.
	 * 
	 * @return the answers per minute
	 */
	public double getAnswersPerMinute();

	/**
	 * Sets the answers per minute.
	 * 
	 * @param answersPerMinute the new answers per minute
	 */
	public void setAnswersPerMinute(double answersPerMinute);

	/**
	 * Gets the badges per minute.
	 * 
	 * @return the badges per minute
	 */
	public double getBadgesPerMinute();

	/**
	 * Sets the badges per minute.
	 * 
	 * @param badgesPerMinute the new badges per minute
	 */
	public void setBadgesPerMinute(double badgesPerMinute);

	/**
	 * Gets the api version.
	 * 
	 * @return the api version
	 */
	public ApiVersion getApiVersion();

	/**
	 * Sets the api version.
	 * 
	 * @param apiVersion the new api version
	 */
	public void setApiVersion(ApiVersion apiVersion);

}