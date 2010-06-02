/**
 * 
 */
package com.google.code.stackexchange.schema.adapter.json;

import org.json.simple.JSONObject;

import com.google.code.stackexchange.schema.Badge;
import com.google.code.stackexchange.schema.BadgeRank;
import com.google.code.stackexchange.schema.User;
import com.google.code.stackexchange.schema.adapter.Adaptable;

/**
 * The Class BadgeImpl.
 */
public class BadgeImpl extends BaseJsonAdapter implements Badge, Adaptable<Badge, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6303516718529213320L;
	
	/** The badge id. */
	private long badgeId;
	
	/** The rank. */
	private BadgeRank rank;
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
	/** The award count. */
	private long awardCount;
	
	/** The tag based. */
	private boolean tagBased;
	
	/** The user. */
	private UserImpl user;
	
	/** The badges recipients url. */
	private String badgesRecipientsUrl;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#getUserId()
	 */
	@Override
	public User getUser() {
		return user;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#setUserId(long)
	 */
	@Override
	public void setUser(User user) {
		this.user = (UserImpl) user;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#getBadgeId()
	 */
	public long getBadgeId() {
		return badgeId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#setBadgeId(long)
	 */
	public void setBadgeId(long badgeId) {
		this.badgeId = badgeId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#getRank()
	 */
	public BadgeRank getRank() {
		return rank;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#setRank(com.google.code.stackexchange.schema.BadgeRank)
	 */
	public void setRank(BadgeRank rank) {
		this.rank = rank;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#getName()
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#getDescription()
	 */
	public String getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#setDescription(java.lang.String)
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#getAwardCount()
	 */
	public long getAwardCount() {
		return awardCount;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#setAwardCount(long)
	 */
	public void setAwardCount(long awardCount) {
		this.awardCount = awardCount;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#isTagBased()
	 */
	public boolean isTagBased() {
		return tagBased;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#setTagBased(boolean)
	 */
	public void setTagBased(boolean tagBased) {
		this.tagBased = tagBased;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
		JSONObject userJson = (JSONObject) adaptee.get("user");
		if (userJson != null) {
			this.user = new UserImpl();
			user.adaptFrom(userJson);
		}
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#getBadgesRecipientsUrl()
	 */
	@Override
	public String getBadgesRecipientsUrl() {
		return badgesRecipientsUrl;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badge#setBadgesRecipientsUrl(java.lang.String)
	 */
	@Override
	public void setBadgesRecipientsUrl(String badgesRecipientsUrl) {
		this.badgesRecipientsUrl = badgesRecipientsUrl;
	}
}
