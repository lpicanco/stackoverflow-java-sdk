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
public class UserTimelines extends SchemaEntity implements Adaptable<UserTimelines, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The timelines. */
	private PagedList<UserTimeline> timelines = new PagedArrayList<UserTimeline>();

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.UserTimelines#getTimelines()
	 */
	public PagedList<UserTimeline> getTimelines() {
		return timelines;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.UserTimelines#setTimelines(java.util.List)
	 */
	public void setTimelines(PagedList<UserTimeline> timelines) {
		this.timelines = timelines;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JsonObject adaptee) {
		getTimelines().setTotal(adaptee.get("total").getAsLong());
		getTimelines().setPage(adaptee.get("page").getAsInt());
		getTimelines().setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray timelines = adaptee.get("user_timelines").getAsJsonArray();
		if (timelines != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : timelines) {			
				getTimelines().add(gson.fromJson(o, UserTimeline.class));
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
