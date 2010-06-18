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
public class Revisions extends SchemaEntity implements Adaptable<Revisions, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The revisions. */
	private PagedList<Revision> revisions = new PagedArrayList<Revision>();

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revisions#getRevisions()
	 */
	public PagedList<Revision> getRevisions() {
		return revisions;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Revisions#setRevisions(java.util.List)
	 */
	public void setRevisions(PagedList<Revision> revisions) {
		this.revisions = revisions;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JsonObject adaptee) {
//		getRevisions().setTotal(adaptee.get("total").getAsLong());
//		getRevisions().setPage(adaptee.get("page").getAsInt());
//		getRevisions().setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray revisions = adaptee.get("revisions").getAsJsonArray();
		if (revisions != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : revisions) {			
				getRevisions().add(gson.fromJson(o, Revision.class));
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
