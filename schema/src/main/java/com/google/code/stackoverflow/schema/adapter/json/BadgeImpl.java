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
	
	private long badge_id;
	private BadgeRank badgeClass;
	private String name;
	private String description;
	private long awardCount;
	
	public long getBadge_id() {
		return badge_id;
	}

	public void setBadge_id(long badge_id) {
		this.badge_id = badge_id;
	}

	public BadgeRank getRank() {
		return badgeClass;
	}

	public void setRank(BadgeRank badgeClass) {
		this.badgeClass = badgeClass;
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
}
