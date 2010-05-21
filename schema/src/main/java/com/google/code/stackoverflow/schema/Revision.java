package com.google.code.stackoverflow.schema;

import java.util.Date;
import java.util.List;


/**
 * The Interface Revision.
 */
public interface Revision extends SchemaEntity {

	/**
	 * Gets the comment.
	 * 
	 * @return the comment
	 */
	public String getComment();

	/**
	 * Sets the comment.
	 * 
	 * @param comment the new comment
	 */
	public void setComment(String comment);

	/**
	 * Gets the creation date.
	 * 
	 * @return the creation date
	 */
	public Date getCreationDate();

	/**
	 * Sets the creation date.
	 * 
	 * @param creationDate the new creation date
	 */
	public void setCreationDate(Date creationDate);

	/**
	 * Checks if is question.
	 * 
	 * @return true, if is question
	 */
	public boolean isQuestion();

	/**
	 * Sets the question.
	 * 
	 * @param isQuestion the new question
	 */
	public void setQuestion(boolean isQuestion);

	/**
	 * Checks if is rollback.
	 * 
	 * @return true, if is rollback
	 */
	public boolean isRollback();

	/**
	 * Sets the rollback.
	 * 
	 * @param isRollback the new rollback
	 */
	public void setRollback(boolean isRollback);

	/**
	 * Gets the last tags.
	 * 
	 * @return the last tags
	 */
	public List<String> getLastTags();

	/**
	 * Sets the last tags.
	 * 
	 * @param lastTags the new last tags
	 */
	public void setLastTags(List<String> lastTags);

	/**
	 * Gets the revision guid.
	 * 
	 * @return the revision guid
	 */
	public String getRevisionGuid();

	/**
	 * Sets the revision guid.
	 * 
	 * @param revisionGuid the new revision guid
	 */
	public void setRevisionGuid(String revisionGuid);

	/**
	 * Gets the revision number.
	 * 
	 * @return the revision number
	 */
	public long getRevisionNumber();

	/**
	 * Sets the revision number.
	 * 
	 * @param revisionNumber the new revision number
	 */
	public void setRevisionNumber(long revisionNumber);

	/**
	 * Gets the tags.
	 * 
	 * @return the tags
	 */
	public List<String> getTags();

	/**
	 * Sets the tags.
	 * 
	 * @param tags the new tags
	 */
	public void setTags(List<String> tags);

	/**
	 * Gets the revision type.
	 * 
	 * @return the revision type
	 */
	public RevisionType getRevisionType();

	/**
	 * Sets the revision type.
	 * 
	 * @param revisionType the new revision type
	 */
	public void setRevisionType(RevisionType revisionType);

	/**
	 * Checks if is sets the community wiki.
	 * 
	 * @return true, if is sets the community wiki
	 */
	public boolean isSetCommunityWiki();

	/**
	 * Sets the sets the community wiki.
	 * 
	 * @param setCommunityWiki the new sets the community wiki
	 */
	public void setSetCommunityWiki(boolean setCommunityWiki);

	/**
	 * Gets the user id.
	 * 
	 * @return the user id
	 */
	public User getUser();

	/**
	 * Sets the user id.
	 * 
	 * @param userId the new user id
	 */
	public void setUser(User user);

	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle();
	
	/**
	 * Sets the title.
	 * 
	 * @param title the new title
	 */
	public void setTitle(String title);
	
	/**
	 * Gets the body.
	 * 
	 * @return the body
	 */
	public String getBody();

	/**
	 * Sets the body.
	 * 
	 * @param body the new body
	 */
	public void setBody(String body);

	/**
	 * Gets the last body.
	 * 
	 * @return the last body
	 */
	public String getLastBody();

	/**
	 * Sets the last body.
	 * 
	 * @param lastBody the new last body
	 */
	public void setLastBody(String lastBody);

	/**
	 * Gets the last title.
	 * 
	 * @return the last title
	 */
	public String getLastTitle();

	/**
	 * Sets the last title.
	 * 
	 * @param lastTitle the new last title
	 */
	public void setLastTitle(String lastTitle);

	/**
	 * Gets the post id.
	 * 
	 * @return the post id
	 */
	public long getPostId();
	
	/**
	 * Sets the post id.
	 * 
	 * @param postId the new post id
	 */
	public void setPostId(long postId);
}