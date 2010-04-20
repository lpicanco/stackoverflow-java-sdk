/**
 * 
 */
package com.google.code.stackoverflow.query.impl;

import com.google.code.stackoverflow.query.StatisticsApiQuery;
import com.google.code.stackoverflow.schema.Statistics;

/**
 * @author nmukhtar
 *
 */
public class StatisticsApiQueryImpl extends BaseStackOverflowApiQuery<Statistics> implements StatisticsApiQuery {

	public StatisticsApiQueryImpl(String applicationId) {
		super(applicationId);
	}
}
