package com.google.code.stackoverflow.schema;


/**
 * The Interface Badge.
 */
public interface Badge extends SchemaEntity {

	/**
	 * Gets the badge id.
	 * 
	 * @return the badge id
	 */
	public long getBadgeId();

	/**
	 * Sets the badge id.
	 * 
	 * @param badgeId the new badge id
	 */
	public void setBadgeId(long badgeId);

	/**
	 * Gets the rank.
	 * 
	 * @return the rank
	 */
	public BadgeRank getRank();

	/**
	 * Sets the rank.
	 * 
	 * @param badgeClass the new rank
	 */
	public void setRank(BadgeRank badgeClass);

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName();

	/**
	 * Sets the name.
	 * 
	 * @param name the new name
	 */
	public void setName(String name);

	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
	public String getDescription();

	/**
	 * Sets the description.
	 * 
	 * @param description the new description
	 */
	public void setDescription(String description);

	/**
	 * Gets the award count.
	 * 
	 * @return the award count
	 */
	public long getAwardCount();

	/**
	 * Sets the award count.
	 * 
	 * @param awardCount the new award count
	 */
	public void setAwardCount(long awardCount);
	
	/**
	 * Checks if is tag based.
	 * 
	 * @return true, if is tag based
	 */
	public boolean isTagBased();

	/**
	 * Sets the tag based.
	 * 
	 * @param tagBased the new tag based
	 */
	public void setTagBased(boolean tagBased);

	/**
	 * Gets the user id.
	 * 
	 * @return the user id
	 */
	public long getUserId();

	/**
	 * Sets the user id.
	 * 
	 * @param userId the new user id
	 */
	public void setUserId(long userId);
	
	/**
	 * Gets the badges recipients url.
	 * 
	 * @return the badges recipients url
	 */
	public String getBadgesRecipientsUrl();

	/**
	 * Sets the badges recipients url.
	 * 
	 * @param badgesRecipientsUrl the new badges recipients url
	 */
	public void setBadgesRecipientsUrl(String badgesRecipientsUrl);
}