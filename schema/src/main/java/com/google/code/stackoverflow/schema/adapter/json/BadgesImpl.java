/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.Badge;
import com.google.code.stackoverflow.schema.Badges;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class BadgesImpl extends BaseJsonAdapter implements Badges, Adaptable<Badges, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5190225278764284533L;
	
	private List<Badge> badges = new ArrayList<Badge>();

	public List<Badge> getBadges() {
		return badges;
	}

	public void setBadges(List<Badge> badges) {
		this.badges = badges;
	}

	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
		JSONArray badges = (JSONArray) adaptee.get("badges");
		if (badges != null) {
			for (Object o : badges) {			
				BadgeImpl badge = new BadgeImpl();
				badge.adaptFrom((JSONObject) o);
				getBadges().add(badge);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		JSONArray badges = new JSONArray();
		for (Badge badge : getBadges()) {
			badges.add(((BadgeImpl) badge).adaptTo());
		}
		adapter.put("badges", badges);
		return adapter;
	}
}
