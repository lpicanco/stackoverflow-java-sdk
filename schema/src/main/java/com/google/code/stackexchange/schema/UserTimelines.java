/**
 * 
 */
package com.google.code.stackexchange.schema;

import com.google.code.stackexchange.common.PagedArrayList;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.UserTimeline;
import com.google.code.stackexchange.schema.UserTimelines;
import com.google.code.stackexchange.schema.adapter.Adaptable;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * The Class UserTimelinesImpl.
 */
public class UserTimelines extends SchemaEntity implements Adaptable<PagedList<UserTimeline>, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public PagedList<UserTimeline> adaptFrom(JsonObject adaptee) {
		PagedList<UserTimeline> list = new PagedArrayList<UserTimeline>();
		list.setTotal(adaptee.get("total").getAsLong());
		list.setPage(adaptee.get("page").getAsInt());
		list.setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray timelines = adaptee.get("user_timelines").getAsJsonArray();
		if (timelines != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : timelines) {			
				list.add(gson.fromJson(o, UserTimeline.class));
			}
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JsonObject adaptTo(PagedList<UserTimeline> adapter) {
		return (JsonObject) getGsonBuilder().create().toJsonTree(adapter);
	}
}
