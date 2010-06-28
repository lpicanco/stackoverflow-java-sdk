/**
 * 
 */
package com.google.code.stackexchange.schema;

import com.google.code.stackexchange.common.PagedArrayList;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Reputation;
import com.google.code.stackexchange.schema.Reputations;
import com.google.code.stackexchange.schema.adapter.Adaptable;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * The Class ReputationsImpl.
 */
public class Reputations extends SchemaEntity implements Adaptable<PagedList<Reputation>, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public PagedList<Reputation> adaptFrom(JsonObject adaptee) {
		PagedList<Reputation> list = new PagedArrayList<Reputation>();		
		list.setTotal(adaptee.get("total").getAsLong());
		list.setPage(adaptee.get("page").getAsInt());
		list.setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray reputations = adaptee.get("rep_changes").getAsJsonArray();
		if (reputations != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : reputations) {			
				list.add(gson.fromJson(o, Reputation.class));
			}
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JsonObject adaptTo(PagedList<Reputation> adapter) {
		return (JsonObject) getGsonBuilder().create().toJsonTree(adapter);
	}
}
