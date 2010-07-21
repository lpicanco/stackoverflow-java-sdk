/**
 * 
 */
package com.google.code.stackexchange.schema;

import java.util.Date;

/**
 * @author nmukhtar
 *
 */
public class Migration extends SchemaEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6689362797017710687L;
	
	private long newQuestionId;
	private Site toSite;
	private Date onDate;
	/**
	 * @return the newQuestionId
	 */
	public long getNewQuestionId() {
		return newQuestionId;
	}
	/**
	 * @param newQuestionId the newQuestionId to set
	 */
	public void setNewQuestionId(long newQuestionId) {
		this.newQuestionId = newQuestionId;
	}
	/**
	 * @return the toSite
	 */
	public Site getToSite() {
		return toSite;
	}
	/**
	 * @param toSite the toSite to set
	 */
	public void setToSite(Site toSite) {
		this.toSite = toSite;
	}
	/**
	 * @return the onDate
	 */
	public Date getOnDate() {
		return onDate;
	}
	/**
	 * @param onDate the onDate to set
	 */
	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}
}
