/**
 * 
 */
package com.google.code.stackoverflow.schema;

import java.util.Date;

/**
 * The Class TimePeriod.
 */
public class TimePeriod {
	
	/** The start date. */
	private Date startDate;
	
	/** The end date. */
	private Date endDate;
	
	/**
	 * Instantiates a new time period.
	 * 
	 * @param startDate the start date
	 * @param endDate the end date
	 */
	public TimePeriod(Date startDate, Date endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	/**
	 * Gets the start date.
	 * 
	 * @return the start date
	 */
	public Date getStartDate() {
		return startDate;
	}
	
	/**
	 * Gets the end date.
	 * 
	 * @return the end date
	 */
	public Date getEndDate() {
		return endDate;
	}
}