/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import com.google.code.stackoverflow.query.TagApiQuery;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.SortEnum;
import com.google.code.stackoverflow.schema.Tag;

/**
 * @author nmukhtar
 *
 */
public class TagApiQueryImpl extends BaseStackOverflowApiQuery<Tag> implements TagApiQuery {

	public TagApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	@Override
	public TagApiQuery withPaging(Paging paging) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TagApiQuery withSort(SortEnum sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TagApiQuery withUserIds(long... userIds) {
		// TODO Auto-generated method stub
		return null;
	}
}
