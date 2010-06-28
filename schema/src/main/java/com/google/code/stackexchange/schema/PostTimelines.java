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
public class PostTimelines extends SchemaEntity implements Adaptable<PagedList<PostTimeline>, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public PagedList<PostTimeline> adaptFrom(JsonObject adaptee) {
		PagedList<PostTimeline> list = new PagedArrayList<PostTimeline>();
		list.setTotal(adaptee.get("total").getAsLong());
		list.setPage(adaptee.get("page").getAsInt());
		list.setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray timelines = adaptee.get("post_timelines").getAsJsonArray();
		if (timelines != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : timelines) {			
				list.add(gson.fromJson(o, PostTimeline.class));
			}
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JsonObject adaptTo(PagedList<PostTimeline> adapter) {
		return (JsonObject) getGsonBuilder().create().toJsonTree(adapter);
	}
}
