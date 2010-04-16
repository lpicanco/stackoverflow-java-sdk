package com.google.code.stackoverflow.schema;


public interface Badge extends SchemaEntity {

	/**
	 * @return the badge_id
	 */
	public long getBadge_id();

	/**
	 * @param badge_id the badge_id to set
	 */
	public void setBadge_id(long badge_id);

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

}