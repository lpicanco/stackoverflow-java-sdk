package com.google.code.stackoverflow.schema;


public interface Badge extends SchemaEntity {

	/**
	 * @return the badgeId
	 */
	public long getBadgeId();

	/**
	 * @param badgeId the badgeId to set
	 */
	public void setBadgeId(long badgeId);

	/**
	 * @return the badgeClass
	 */
	public BadgeRank getRank();

	/**
	 * @param badgeClass the badgeClass to set
	 */
	public void setRank(BadgeRank badgeClass);

	/**
	 * @return the name
	 */
	public String getName();

	/**
	 * @param name the name to set
	 */
	public void setName(String name);

	/**
	 * @return the description
	 */
	public String getDescription();

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description);

	/**
	 * @return the awardCount
	 */
	public long getAwardCount();

	/**
	 * @param awardCount the awardCount to set
	 */
	public void setAwardCount(long awardCount);
	
	/**
	 * @return the tagBased
	 */
	public boolean isTagBased();

	/**
	 * @param tagBased the tagBased to set
	 */
	public void setTagBased(boolean tagBased);

	/**
	 * @return the userId
	 */
	public long getUserId();

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId);
}