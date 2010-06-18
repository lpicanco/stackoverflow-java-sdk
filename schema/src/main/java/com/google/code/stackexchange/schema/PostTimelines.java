/**
 * 
 */
package com.google.code.stackexchange.schema;

import com.google.code.stackexchange.common.PagedArrayList;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.PostTimeline;
import com.google.code.stackexchange.schema.PostTimelines;
import com.google.code.stackexchange.schema.adapter.Adaptable;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * The Class PostTimelinesImpl.
 */
public class PostTimelines extends SchemaEntity implements Adaptable<PostTimelines, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The timelines. */
	private PagedList<PostTimeline> timelines = new PagedArrayList<PostTimeline>();

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimelines#getTimelines()
	 */
	public PagedList<PostTimeline> getTimelines() {
		return timelines;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.PostTimelines#setTimelines(java.util.List)
	 */
	public void setTimelines(PagedList<PostTimeline> timelines) {
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
		JsonArray timelines = adaptee.get("post_timelines").getAsJsonArray();
		if (timelines != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : timelines) {			
				getTimelines().add(gson.fromJson(o, PostTimeline.class));
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
