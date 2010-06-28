/**
 * 
 */
package com.google.code.stackexchange.schema;

import com.google.code.stackexchange.common.PagedArrayList;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Tag;
import com.google.code.stackexchange.schema.Tags;
import com.google.code.stackexchange.schema.adapter.Adaptable;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * The Class TagsImpl.
 */
public class Tags extends SchemaEntity implements Adaptable<PagedList<Tag>, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public PagedList<Tag> adaptFrom(JsonObject adaptee) {
		PagedList<Tag> list = new PagedArrayList<Tag>();
		list.setTotal(adaptee.get("total").getAsLong());
		list.setPage(adaptee.get("page").getAsInt());
		list.setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray tags = adaptee.get("tags").getAsJsonArray();
		if (tags != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : tags) {			
				list.add(gson.fromJson(o, Tag.class));
			}
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JsonObject adaptTo(PagedList<Tag> adapter) {
		return (JsonObject) getGsonBuilder().create().toJsonTree(adapter);
	}
}
