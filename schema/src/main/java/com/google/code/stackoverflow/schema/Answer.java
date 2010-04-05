package com.google.code.stackoverflow.schema;

import java.util.Date;
import java.util.List;

public interface Answer extends SchemaEntity {

	/**
	 * @return the answerId
	 */
	public long getAnswerId();

	/**
	 * @param answerId the answerId to set
	 */
	public void setAnswerId(long answerId);

	/**
	 * @return the accepted
	 */
	public boolean isAccepted();

	/**
	 * @param accepted the accepted to set
	 */
	public void setAccepted(boolean accepted);

	/**
	 * @return the questionId
	 */
	public long getQuestionId();

	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(long questionId);

	/**
	 * @return the ownerUserId
	 */
	public long getOwnerUserId();

	/**
	 * @param ownerUserId the ownerUserId to set
	 */
	public void setOwnerUserId(long ownerUserId);

	/**
	 * @return the ownerDisplayName
	 */
	public String getOwnerDisplayName();

	/**
	 * @param ownerDisplayName the ownerDisplayName to set
	 */
	public void setOwnerDisplayName(String ownerDisplayName);

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate();

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate);

	/**
	 * @return the upVoteCount
	 */
	public long getUpVoteCount();

	/**
	 * @param upVoteCount the upVoteCount to set
	 */
	public void setUpVoteCount(long upVoteCount);

	/**
	 * @return the downVoteCount
	 */
	public long getDownVoteCount();

	/**
	 * @param downVoteCount the downVoteCount to set
	 */
	public void setDownVoteCount(long downVoteCount);

	/**
	 * @return the favoriteCount
	 */
	public long getFavoriteCount();

	/**
	 * @param favoriteCount the favoriteCount to set
	 */
	public void setFavoriteCount(long favoriteCount);

	/**
	 * @return the viewCount
	 */
	public long getViewCount();

	/**
	 * @param viewCount the viewCount to set
	 */
	public void setViewCount(long viewCount);

	/**
	 * @return the score
	 */
	public long getScore();

	/**
	 * @param score the score to set
	 */
	public void setScore(long score);

	/**
	 * @return the communityOwned
	 */
	public boolean isCommunityOwned();

	/**
	 * @param communityOwned the communityOwned to set
	 */
	public void setCommunityOwned(boolean communityOwned);

	/**
	 * @return the title
	 */
	public String getTitle();

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title);

	/**
	 * @return the comments
	 */
	public List<Comment> getComments();

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<Comment> comments);

	/**
	 * @return the lastEditDate
	 */
	public Date getLastEditDate();

	/**
	 * @param lastEditDate the lastEditDate to set
	 */
	public void setLastEditDate(Date lastEditDate);

}