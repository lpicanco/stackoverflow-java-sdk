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
public class Reputations extends SchemaEntity implements Adaptable<Reputations, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The reputations. */
	private PagedList<Reputation> reputations = new PagedArrayList<Reputation>();

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputations#getReputations()
	 */
	public PagedList<Reputation> getReputations() {
		return reputations;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputations#setReputations(java.util.List)
	 */
	public void setReputations(PagedList<Reputation> reputations) {
		this.reputations = reputations;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JsonObject adaptee) {
		getReputations().setTotal(adaptee.get("total").getAsLong());
		getReputations().setPage(adaptee.get("page").getAsInt());
		getReputations().setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray reputations = adaptee.get("rep_changes").getAsJsonArray();
		if (reputations != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : reputations) {			
				getReputations().add(gson.fromJson(o, Reputation.class));
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
