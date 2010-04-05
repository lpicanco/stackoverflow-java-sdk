/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.ApiVersion;
import com.google.code.stackoverflow.schema.Statistics;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class StatisticsImpl extends BaseJsonAdapter implements Statistics, Adaptable<Statistics, JSONObject> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3816093709987797926L;
	private long totalQuestions;
	private long totalUnanswered;
	private long totalAnswers;
	private long totalComments;
	private long totalVotes;
	private long totalBadges;
	private long totalUsers;
	private double questionsPerMinute;
	private double answersPerMinute;
	private double badgesPerMinute;
	private ApiVersion apiVersion;
	
	/**
	 * @return the totalQuestions
	 */
	public long getTotalQuestions() {
		return totalQuestions;
	}
	/**
	 * @param totalQuestions the totalQuestions to set
	 */
	public void setTotalQuestions(long totalQuestions) {
		this.totalQuestions = totalQuestions;
	}
	/**
	 * @return the totalUnanswered
	 */
	public long getTotalUnanswered() {
		return totalUnanswered;
	}
	/**
	 * @param totalUnanswered the totalUnanswered to set
	 */
	public void setTotalUnanswered(long totalUnanswered) {
		this.totalUnanswered = totalUnanswered;
	}
	/**
	 * @return the totalAnswers
	 */
	public long getTotalAnswers() {
		return totalAnswers;
	}
	/**
	 * @param totalAnswers the totalAnswers to set
	 */
	public void setTotalAnswers(long totalAnswers) {
		this.totalAnswers = totalAnswers;
	}
	/**
	 * @return the totalComments
	 */
	public long getTotalComments() {
		return totalComments;
	}
	/**
	 * @param totalComments the totalComments to set
	 */
	public void setTotalComments(long totalComments) {
		this.totalComments = totalComments;
	}
	/**
	 * @return the totalVotes
	 */
	public long getTotalVotes() {
		return totalVotes;
	}
	/**
	 * @param totalVotes the totalVotes to set
	 */
	public void setTotalVotes(long totalVotes) {
		this.totalVotes = totalVotes;
	}
	/**
	 * @return the totalBadges
	 */
	public long getTotalBadges() {
		return totalBadges;
	}
	/**
	 * @param totalBadges the totalBadges to set
	 */
	public void setTotalBadges(long totalBadges) {
		this.totalBadges = totalBadges;
	}
	/**
	 * @return the totalUsers
	 */
	public long getTotalUsers() {
		return totalUsers;
	}
	/**
	 * @param totalUsers the totalUsers to set
	 */
	public void setTotalUsers(long totalUsers) {
		this.totalUsers = totalUsers;
	}
	/**
	 * @return the questionsPerMinute
	 */
	public double getQuestionsPerMinute() {
		return questionsPerMinute;
	}
	/**
	 * @param questionsPerMinute the questionsPerMinute to set
	 */
	public void setQuestionsPerMinute(double questionsPerMinute) {
		this.questionsPerMinute = questionsPerMinute;
	}
	/**
	 * @return the answersPerMinute
	 */
	public double getAnswersPerMinute() {
		return answersPerMinute;
	}
	/**
	 * @param answersPerMinute the answersPerMinute to set
	 */
	public void setAnswersPerMinute(double answersPerMinute) {
		this.answersPerMinute = answersPerMinute;
	}
	/**
	 * @return the badgesPerMinute
	 */
	public double getBadgesPerMinute() {
		return badgesPerMinute;
	}
	/**
	 * @param badgesPerMinute the badgesPerMinute to set
	 */
	public void setBadgesPerMinute(double badgesPerMinute) {
		this.badgesPerMinute = badgesPerMinute;
	}
	/**
	 * @return the apiVersion
	 */
	public ApiVersion getApiVersion() {
		return apiVersion;
	}
	/**
	 * @param apiVersion the apiVersion to set
	 */
	public void setApiVersion(ApiVersion apiVersion) {
		this.apiVersion = apiVersion;
	}
	
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
