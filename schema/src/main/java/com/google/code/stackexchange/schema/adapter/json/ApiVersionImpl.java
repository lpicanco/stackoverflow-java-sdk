/**
 * 
 */
package com.google.code.stackexchange.schema.adapter.json;

import org.json.simple.JSONObject;

import com.google.code.stackexchange.schema.ApiVersion;
import com.google.code.stackexchange.schema.adapter.Adaptable;

/**
 * The Class ApiVersionImpl.
 */
public class ApiVersionImpl extends BaseJsonAdapter implements ApiVersion, Adaptable<ApiVersion, JSONObject> {

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
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}
}
