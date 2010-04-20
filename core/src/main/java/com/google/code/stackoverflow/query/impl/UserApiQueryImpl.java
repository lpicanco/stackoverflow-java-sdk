/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import com.google.code.stackoverflow.query.UserApiQuery;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.SortEnum;
import com.google.code.stackoverflow.schema.User;

/**
 * @author nmukhtar
 *
 */
public class UserApiQueryImpl extends BaseStackOverflowApiQuery<User> implements UserApiQuery {

	public UserApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	@Override
	public UserApiQuery withFilter(String filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserApiQuery withPaging(Paging paging) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserApiQuery withSort(SortEnum sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserApiQuery withUserIds(long... userIds) {
		// TODO Auto-generated method stub
		return null;
	}

}
