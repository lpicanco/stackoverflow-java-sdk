package com.google.code.stackoverflow.schema;


public interface Statistics extends SchemaEntity {

	/**
	 * @return the totalQuestions
	 */
	public long getTotalQuestions();

	/**
	 * @param totalQuestions the totalQuestions to set
	 */
	public void setTotalQuestions(long totalQuestions);

	/**
	 * @return the totalUnanswered
	 */
	public long getTotalUnanswered();

	/**
	 * @param totalUnanswered the totalUnanswered to set
	 */
	public void setTotalUnanswered(long totalUnanswered);

	/**
	 * @return the totalAnswers
	 */
	public long getTotalAnswers();

	/**
	 * @param totalAnswers the totalAnswers to set
	 */
	public void setTotalAnswers(long totalAnswers);

	/**
	 * @return the totalComments
	 */
	public long getTotalComments();

	/**
	 * @param totalComments the totalComments to set
	 */
	public void setTotalComments(long totalComments);

	/**
	 * @return the totalVotes
	 */
	public long getTotalVotes();

	/**
	 * @param totalVotes the totalVotes to set
	 */
	public void setTotalVotes(long totalVotes);

	/**
	 * @return the totalBadges
	 */
	public long getTotalBadges();

	/**
	 * @param totalBadges the totalBadges to set
	 */
	public void setTotalBadges(long totalBadges);

	/**
	 * @return the totalUsers
	 */
	public long getTotalUsers();

	/**
	 * @param totalUsers the totalUsers to set
	 */
	public void setTotalUsers(long totalUsers);

	/**
	 * @return the questionsPerMinute
	 */
	public double getQuestionsPerMinute();

	/**
	 * @param questionsPerMinute the questionsPerMinute to set
	 */
	public void setQuestionsPerMinute(double questionsPerMinute);

	/**
	 * @return the answersPerMinute
	 */
	public double getAnswersPerMinute();

	/**
	 * @param answersPerMinute the answersPerMinute to set
	 */
	public void setAnswersPerMinute(double answersPerMinute);

	/**
	 * @return the badgesPerMinute
	 */
	public double getBadgesPerMinute();

	/**
	 * @param badgesPerMinute the badgesPerMinute to set
	 */
	public void setBadgesPerMinute(double badgesPerMinute);

	/**
	 * @return the apiVersion
	 */
	public ApiVersion getApiVersion();

	/**
	 * @param apiVersion the apiVersion to set
	 */
	public void setApiVersion(ApiVersion apiVersion);

}