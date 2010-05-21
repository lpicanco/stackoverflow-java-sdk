package com.google.code.stackoverflow.schema;


import com.google.code.stackoverflow.client.common.PagedList;

/**
 * The Interface Users.
 */
public interface Users extends SchemaEntity {

	/**
	 * Gets the users.
	 * 
	 * @return the users
	 */
	public PagedList<User> getUsers();

	/**
	 * Sets the users.
	 * 
	 * @param users the new users
	 */
	public void setUsers(PagedList<User> users);

}