/**
 * 
 */
package com.google.code.stackexchange.schema;

import com.google.code.stackexchange.common.PagedArrayList;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.User;
import com.google.code.stackexchange.schema.Users;
import com.google.code.stackexchange.schema.adapter.Adaptable;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * The Class UsersImpl.
 */
public class Users extends SchemaEntity implements Adaptable<PagedList<User>, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public PagedList<User> adaptFrom(JsonObject adaptee) {
		PagedList<User> list = new PagedArrayList<User>();
		list.setTotal(adaptee.get("total").getAsLong());
		list.setPage(adaptee.get("page").getAsInt());
		list.setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray users = adaptee.get("users").getAsJsonArray();
		if (users != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : users) {			
				list.add(gson.fromJson(o, User.class));
			}
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JsonObject adaptTo(PagedList<User> adapter) {
		return (JsonObject) getGsonBuilder().create().toJsonTree(adapter);
	}
}
