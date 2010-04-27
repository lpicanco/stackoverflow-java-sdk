/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.Badge;
import com.google.code.stackoverflow.schema.BadgeRank;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class BadgeImpl extends BaseJsonAdapter implements Badge, Adaptable<Badge, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6303516718529213320L;
	
	private long badgeId;
	private BadgeRank rank;
	private String name;
	private String description;
	private long awardCount;
	private boolean tagBased;
	private long userId;
	private String badgesRecipientsUrl;
	
	@Override
	public long getUserId() {
		return userId;
	}

	@Override
	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getBadgeId() {
		return badgeId;
	}

	public void setBadgeId(long badgeId) {
		this.badgeId = badgeId;
	}

	public BadgeRank getRank() {
		return rank;
	}

	public void setRank(BadgeRank rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getAwardCount() {
		return awardCount;
	}

	public void setAwardCount(long awardCount) {
		this.awardCount = awardCount;
	}
	
	/**
	 * @return the tagBased
	 */
	public boolean isTagBased() {
		return tagBased;
	}

	/**
	 * @param tagBased the tagBased to set
	 */
	public void setTagBased(boolean tagBased) {
		this.tagBased = tagBased;
	}

	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
	}

	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public String getBadgesRecipientsUrl() {
		return badgesRecipientsUrl;
	}

	@Override
	public void setBadgesRecipientsUrl(String badgesRecipientsUrl) {
		this.badgesRecipientsUrl = badgesRecipientsUrl;
	}
}
