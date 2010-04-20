/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import com.google.code.stackoverflow.query.BadgeApiQuery;
import com.google.code.stackoverflow.schema.Badge;

/**
 * @author nmukhtar
 *
 */
public class BadgeApiQueryImpl extends BaseStackOverflowApiQuery<Badge> implements BadgeApiQuery {

	public BadgeApiQueryImpl(String applicationId) {
		super(applicationId);
	}

	@Override
	public BadgeApiQuery withClassification(Classification classification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BadgeApiQuery withUserIds(long... userIds) {
		// TODO Auto-generated method stub
		return null;
	}
}
