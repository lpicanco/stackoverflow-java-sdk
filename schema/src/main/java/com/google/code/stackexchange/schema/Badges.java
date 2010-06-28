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
public class Badges extends SchemaEntity implements Adaptable<PagedList<Badge>, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public PagedList<Badge> adaptFrom(JsonObject adaptee) {
		PagedList<Badge> list = new PagedArrayList<Badge>();
		
//		getBadges().setTotal(adaptee.get("total").getAsLong());
//		getBadges().setPage(adaptee.get("page").getAsInt());
//		getBadges().setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray badges = adaptee.get("badges").getAsJsonArray();
		if (badges != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : badges) {			
				list.add(gson.fromJson(o, Badge.class));
			}
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JsonObject adaptTo(PagedList<Badge> adapter) {
		return (JsonObject) getGsonBuilder().create().toJsonTree(adapter);
	}
}
