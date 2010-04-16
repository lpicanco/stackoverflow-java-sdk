/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.User;
import com.google.code.stackoverflow.schema.Users;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class UsersImpl extends BaseJsonAdapter implements Users, Adaptable<Users, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5190225278764284533L;
	
	private List<User> users = new ArrayList<User>();

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public void adaptFrom(JSONObject adaptee) {
		JSONArray users = (JSONArray) adaptee.get("users");
		if (users != null) {
			for (Object o : users) {			
				UserImpl user = new UserImpl();
				user.adaptFrom((JSONObject) o);
				getUsers().add(user);
			}
		}
	}

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
