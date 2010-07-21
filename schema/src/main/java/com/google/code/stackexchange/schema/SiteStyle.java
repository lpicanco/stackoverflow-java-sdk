/**
 * 
 */
package com.google.code.stackexchange.schema;

/**
 * @author nmukhtar
 *
 */
public class SiteStyle extends SchemaEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6468007026606509603L;
	
	private String linkColor;
	private String tagForegroundColor;
	private String tagBackgroundColor;
	/**
	 * @return the linkColor
	 */
	public String getLinkColor() {
		return linkColor;
	}
	/**
	 * @param linkColor the linkColor to set
	 */
	public void setLinkColor(String linkColor) {
		this.linkColor = linkColor;
	}
	/**
	 * @return the tagForegroundColor
	 */
	public String getTagForegroundColor() {
		return tagForegroundColor;
	}
	/**
	 * @param tagForegroundColor the tagForegroundColor to set
	 */
	public void setTagForegroundColor(String tagForegroundColor) {
		this.tagForegroundColor = tagForegroundColor;
	}
	/**
	 * @return the tagBackgroundColor
	 */
	public String getTagBackgroundColor() {
		return tagBackgroundColor;
	}
	/**
	 * @param tagBackgroundColor the tagBackgroundColor to set
	 */
	public void setTagBackgroundColor(String tagBackgroundColor) {
		this.tagBackgroundColor = tagBackgroundColor;
	}
}
