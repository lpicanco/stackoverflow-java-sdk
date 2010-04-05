package com.google.code.stackoverflow.schema;

public interface ApiVersion {

	/**
	 * @return the version
	 */
	public String getVersion();

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version);

	/**
	 * @return the revision
	 */
	public String getRevision();

	/**
	 * @param revision the revision to set
	 */
	public void setRevision(String revision);

}