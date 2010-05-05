package com.google.code.stackoverflow.schema;

import java.util.List;

/**
 * The Interface Users.
 */
public interface Users extends SchemaEntity {

	/**
	 * Gets the users.
	 * 
	 * @return the users
	 */
	public List<User> getUsers();

	/**
	 * Sets the users.
	 * 
	 * @param users the new users
	 */
	public void setUsers(List<User> users);

}