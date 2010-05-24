/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.common.PagedArrayList;
import com.google.code.stackoverflow.common.PagedList;
import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.Users;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class UsersImpl.
 */
public class UsersImpl extends BaseJsonAdapter implements Users, Adaptable<Users, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The users. */
	private PagedList<User> users = new PagedArrayList<User>();

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Users#getUsers()
	 */
	public PagedList<User> getUsers() {
		return users;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Users#setUsers(java.util.List)
	 */
	public void setUsers(PagedList<User> users) {
		this.users = users;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		getUsers().setTotal(getLongProperty(adaptee, "total"));
		getUsers().setPage(getIntProperty(adaptee, "page"));
		getUsers().setPageSize(getIntProperty(adaptee, "pagesize"));
		JSONArray users = (JSONArray) adaptee.get("users");
		if (users != null) {
			for (Object o : users) {			
				UserImpl user = new UserImpl();
				user.adaptFrom((JSONObject) o);
				getUsers().add(user);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptTo()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		JSONArray users = new JSONArray();
		for (User user : getUsers()) {
			users.add(((UserImpl) user).adaptTo());
		}
		adapter.put("users", users);
		return adapter;
	}
}
