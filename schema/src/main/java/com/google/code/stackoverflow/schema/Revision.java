package com.google.code.stackoverflow.schema;

import java.util.Date;
import java.util.List;


public interface Revision extends SchemaEntity {

	/**
	 * @return the comment
	 */
	public String getComment();

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment);

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate();

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate);

	/**
	 * @return the isQuestion
	 */
	public boolean isQuestion();

	/**
	 * @param isQuestion the isQuestion to set
	 */
	public void setQuestion(boolean isQuestion);

	/**
	 * @return the isRollback
	 */
	public boolean isRollback();

	/**
	 * @param isRollback the isRollback to set
	 */
	public void setRollback(boolean isRollback);

	/**
	 * @return the lastTags
	 */
	public List<String> getLastTags();

	/**
	 * @param lastTags the lastTags to set
	 */
	public void setLastTags(List<String> lastTags);

	/**
	 * @return the revisionGuid
	 */
	public String getRevisionGuid();

	/**
	 * @param revisionGuid the revisionGuid to set
	 */
	public void setRevisionGuid(String revisionGuid);

	/**
	 * @return the revisionNumber
	 */
	public long getRevisionNumber();

	/**
	 * @param revisionNumber the revisionNumber to set
	 */
	public void setRevisionNumber(long revisionNumber);

	/**
	 * @return the tags
	 */
	public List<String> getTags();

	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags);

	/**
	 * @return the revisionType
	 */
	public RevisionType getRevisionType();

	/**
	 * @param revisionType the revisionType to set
	 */
	public void setRevisionType(RevisionType revisionType);

	/**
	 * @return the setCommunityWiki
	 */
	public boolean isSetCommunityWiki();

	/**
	 * @param setCommunityWiki the setCommunityWiki to set
	 */
	public void setSetCommunityWiki(boolean setCommunityWiki);

	/**
	 * @return the userId
	 */
	public long getUserId();

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId);

	/**
	 * @return the body
	 */
	public String getBody();

	/**
	 * @param body the body to set
	 */
	public void setBody(String body);

	/**
	 * @return the lastBody
	 */
	public String getLastBody();

	/**
	 * @param lastBody the lastBody to set
	 */
	public void setLastBody(String lastBody);

	/**
	 * @return the lastTitle
	 */
	public String getLastTitle();

	/**
	 * @param lastTitle the lastTitle to set
	 */
	public void setLastTitle(String lastTitle);

}