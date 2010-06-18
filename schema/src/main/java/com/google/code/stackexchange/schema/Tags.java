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
public class Tags extends SchemaEntity implements Adaptable<Tags, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The tags. */
	private PagedList<Tag> tags = new PagedArrayList<Tag>();

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Tags#getTags()
	 */
	public PagedList<Tag> getTags() {
		return tags;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Tags#setTags(java.util.List)
	 */
	public void setTags(PagedList<Tag> tags) {
		this.tags = tags;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JsonObject adaptee) {
		getTags().setTotal(adaptee.get("total").getAsLong());
		getTags().setPage(adaptee.get("page").getAsInt());
		getTags().setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray tags = adaptee.get("tags").getAsJsonArray();
		if (tags != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : tags) {			
				getTags().add(gson.fromJson(o, Tag.class));
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
