/**
 * 
 */
package com.google.code.stackexchange.schema;

import com.google.code.stackexchange.common.PagedArrayList;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Badge;
import com.google.code.stackexchange.schema.Badges;
import com.google.code.stackexchange.schema.adapter.Adaptable;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * The Class BadgesImpl.
 */
public class Badges extends SchemaEntity implements Adaptable<Badges, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The badges. */
	private PagedList<Badge> badges = new PagedArrayList<Badge>();

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badges#getBadges()
	 */
	public PagedList<Badge> getBadges() {
		return badges;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Badges#setBadges(java.util.List)
	 */
	public void setBadges(PagedList<Badge> badges) {
		this.badges = badges;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JsonObject adaptee) {
//		getBadges().setTotal(adaptee.get("total").getAsLong());
//		getBadges().setPage(adaptee.get("page").getAsInt());
//		getBadges().setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray badges = adaptee.get("badges").getAsJsonArray();
		if (badges != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : badges) {			
				getBadges().add(gson.fromJson(o, Badge.class));
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JsonObject adaptTo() {
		return (JsonObject) getGsonBuilder().create().toJsonTree(this);
	}
}
