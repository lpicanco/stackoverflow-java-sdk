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
public class Users extends SchemaEntity implements Adaptable<Users, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The users. */
	private PagedList<User> users = new PagedArrayList<User>();

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Users#getUsers()
	 */
	public PagedList<User> getUsers() {
		return users;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Users#setUsers(java.util.List)
	 */
	public void setUsers(PagedList<User> users) {
		this.users = users;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JsonObject adaptee) {
		getUsers().setTotal(adaptee.get("total").getAsLong());
		getUsers().setPage(adaptee.get("page").getAsInt());
		getUsers().setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray users = adaptee.get("users").getAsJsonArray();
		if (users != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : users) {			
				getUsers().add(gson.fromJson(o, User.class));
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
