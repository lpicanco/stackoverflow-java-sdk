/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.client.constant.StackOverflowApiMethods;
import com.google.code.stackoverflow.client.provider.url.DefaultApiUrlBuilder;
import com.google.code.stackoverflow.query.BadgeApiQuery;
import com.google.code.stackoverflow.schema.Badge;
import com.google.code.stackoverflow.schema.adapter.json.BadgesImpl;

/**
 * @author nmukhtar
 *
 */
public class BadgeApiQueryImpl extends BaseStackOverflowApiQuery<Badge> implements BadgeApiQuery {

	public BadgeApiQueryImpl(String applicationId) {
		super(applicationId);
		apiUrlBuilder = getApiProvider().createApiUrlBuilder(StackOverflowApiMethods.GET_BADGES, getApplicationKey(), getApiVersion());
	}

	@Override
	public BadgeApiQuery withClassification(Classification classification) {
		switch (classification) {
		case BY_NAME:
			((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_BADGES_BY_NAME);
			
			break;

		case BY_TAGS:
			((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_BADGES_BY_TAGS);
			
			break;

		default:
			((DefaultApiUrlBuilder) apiUrlBuilder).withMethod(StackOverflowApiMethods.GET_BADGES);
		
			break;
		}
		return this;
	}

	@Override
	public BadgeApiQuery withUserIds(long... userIds) {
		apiUrlBuilder.withIds(userIds);
		return this;
	}

	@Override
	protected List<Badge> unmarshall(JSONObject json) {
		BadgesImpl adapter = new BadgesImpl();
		adapter.adaptFrom(json);
		return adapter.getBadges();
	}
}
