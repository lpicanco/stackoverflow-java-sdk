/**
 * 
 */
package com.google.code.stackoverflow.schema;

import java.util.Date;

public class TimePeriod {
	private Date startDate;
	private Date endDate;
	
	public TimePeriod(Date startDate, Date endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
}