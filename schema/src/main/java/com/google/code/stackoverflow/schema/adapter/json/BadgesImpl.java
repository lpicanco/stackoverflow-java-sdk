/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.common.PagedArrayList;
import com.google.code.stackoverflow.client.common.PagedList;
import com.google.code.stackoverflow.schema.Badge;
import com.google.code.stackoverflow.schema.Badges;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class BadgesImpl.
 */
public class BadgesImpl extends BaseJsonAdapter implements Badges, Adaptable<Badges, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The badges. */
	private PagedList<Badge> badges = new PagedArrayList<Badge>();

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Badges#getBadges()
	 */
	public PagedList<Badge> getBadges() {
		return badges;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Badges#setBadges(java.util.List)
	 */
	public void setBadges(PagedList<Badge> badges) {
		this.badges = badges;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
		getBadges().setTotal(getLongProperty(adaptee, "total"));
		getBadges().setPage(getIntProperty(adaptee, "page"));
		getBadges().setPageSize(getIntProperty(adaptee, "pagesize"));
		JSONArray badges = (JSONArray) adaptee.get("badges");
		if (badges != null) {
			for (Object o : badges) {			
				BadgeImpl badge = new BadgeImpl();
				badge.adaptFrom((JSONObject) o);
				getBadges().add(badge);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptTo()
	 */
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
