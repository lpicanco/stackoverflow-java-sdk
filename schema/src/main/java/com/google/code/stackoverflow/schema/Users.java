package com.google.code.stackoverflow.schema;

import java.util.List;

public interface Users extends SchemaEntity {

	/**
	 * @return the users
	 */
	public List<User> getUsers();

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<User> users);

}