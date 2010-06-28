/**
 * 
 */
package com.google.code.stackexchange.schema;

import com.google.code.stackexchange.common.PagedArrayList;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Revision;
import com.google.code.stackexchange.schema.Revisions;
import com.google.code.stackexchange.schema.adapter.Adaptable;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * The Class RevisionsImpl.
 */
public class Revisions extends SchemaEntity implements Adaptable<PagedList<Revision>, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public PagedList<Revision> adaptFrom(JsonObject adaptee) {
		PagedList<Revision> list = new PagedArrayList<Revision>();
//		getRevisions().setTotal(adaptee.get("total").getAsLong());
//		getRevisions().setPage(adaptee.get("page").getAsInt());
//		getRevisions().setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray revisions = adaptee.get("revisions").getAsJsonArray();
		if (revisions != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : revisions) {			
				list.add(gson.fromJson(o, Revision.class));
			}
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JsonObject adaptTo(PagedList<Revision> adapter) {
		return (JsonObject) getGsonBuilder().create().toJsonTree(adapter);
	}
}
