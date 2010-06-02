/**
 * 
 */
package com.google.code.stackexchange.schema.adapter.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackexchange.schema.ApiVersion;
import com.google.code.stackexchange.schema.Statistics;
import com.google.code.stackexchange.schema.adapter.Adaptable;

/**
 * The Class StatisticsImpl.
 */
public class StatisticsImpl extends BaseJsonAdapter implements Statistics, Adaptable<Statistics, JSONObject> {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3816093709987797926L;
	
	/** The total questions. */
	private long totalQuestions;
	
	/** The total unanswered. */
	private long totalUnanswered;
	
	/** The total answers. */
	private long totalAnswers;
	
	/** The total comments. */
	private long totalComments;
	
	/** The total votes. */
	private long totalVotes;
	
	/** The total badges. */
	private long totalBadges;
	
	/** The total users. */
	private long totalUsers;
	
	/** The questions per minute. */
	private double questionsPerMinute;
	
	/** The answers per minute. */
	private double answersPerMinute;
	
	/** The badges per minute. */
	private double badgesPerMinute;
	
	/** The api version. */
	private ApiVersion apiVersion;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#getTotalQuestions()
	 */
	public long getTotalQuestions() {
		return totalQuestions;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#setTotalQuestions(long)
	 */
	public void setTotalQuestions(long totalQuestions) {
		this.totalQuestions = totalQuestions;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#getTotalUnanswered()
	 */
	public long getTotalUnanswered() {
		return totalUnanswered;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#setTotalUnanswered(long)
	 */
	public void setTotalUnanswered(long totalUnanswered) {
		this.totalUnanswered = totalUnanswered;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#getTotalAnswers()
	 */
	public long getTotalAnswers() {
		return totalAnswers;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#setTotalAnswers(long)
	 */
	public void setTotalAnswers(long totalAnswers) {
		this.totalAnswers = totalAnswers;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#getTotalComments()
	 */
	public long getTotalComments() {
		return totalComments;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#setTotalComments(long)
	 */
	public void setTotalComments(long totalComments) {
		this.totalComments = totalComments;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#getTotalVotes()
	 */
	public long getTotalVotes() {
		return totalVotes;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#setTotalVotes(long)
	 */
	public void setTotalVotes(long totalVotes) {
		this.totalVotes = totalVotes;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#getTotalBadges()
	 */
	public long getTotalBadges() {
		return totalBadges;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#setTotalBadges(long)
	 */
	public void setTotalBadges(long totalBadges) {
		this.totalBadges = totalBadges;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#getTotalUsers()
	 */
	public long getTotalUsers() {
		return totalUsers;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#setTotalUsers(long)
	 */
	public void setTotalUsers(long totalUsers) {
		this.totalUsers = totalUsers;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#getQuestionsPerMinute()
	 */
	public double getQuestionsPerMinute() {
		return questionsPerMinute;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#setQuestionsPerMinute(double)
	 */
	public void setQuestionsPerMinute(double questionsPerMinute) {
		this.questionsPerMinute = questionsPerMinute;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#getAnswersPerMinute()
	 */
	public double getAnswersPerMinute() {
		return answersPerMinute;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#setAnswersPerMinute(double)
	 */
	public void setAnswersPerMinute(double answersPerMinute) {
		this.answersPerMinute = answersPerMinute;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#getBadgesPerMinute()
	 */
	public double getBadgesPerMinute() {
		return badgesPerMinute;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#setBadgesPerMinute(double)
	 */
	public void setBadgesPerMinute(double badgesPerMinute) {
		this.badgesPerMinute = badgesPerMinute;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#getApiVersion()
	 */
	public ApiVersion getApiVersion() {
		return apiVersion;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Statistics#setApiVersion(com.google.code.stackexchange.schema.ApiVersion)
	 */
	public void setApiVersion(ApiVersion apiVersion) {
		this.apiVersion = apiVersion;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		JSONArray stats = (JSONArray) adaptee.get("statistics");
		if (stats != null && !stats.isEmpty()) {
			JSONObject stat = (JSONObject) stats.get(0);
			copyProperties(this, stat);
			JSONObject apiVersion = (JSONObject) stat.get("api_version");
			if (apiVersion != null) {
				ApiVersionImpl version = new ApiVersionImpl();
				version.adaptFrom(apiVersion);
				setApiVersion(version);
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		JSONObject stats = new JSONObject();
		copyProperties(stats, this);
		adapter.put("statistics", stats);
		return adapter;
	}
}
