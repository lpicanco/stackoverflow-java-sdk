/**
 * 
 */
package com.google.code.stackexchange.schema;

import com.google.code.stackexchange.schema.ApiVersion;

/**
 * The Class ApiVersionImpl.
 */
public class ApiVersion extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4844722882774546494L;
	
	/** The version. */
	private String version;
	
	/** The revision. */
	private String revision;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.ApiVersion#getVersion()
	 */
	public String getVersion() {
		return version;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.ApiVersion#setVersion(java.lang.String)
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.ApiVersion#getRevision()
	 */
	public String getRevision() {
		return revision;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.ApiVersion#setRevision(java.lang.String)
	 */
	public void setRevision(String revision) {
		this.revision = revision;
	}
}
