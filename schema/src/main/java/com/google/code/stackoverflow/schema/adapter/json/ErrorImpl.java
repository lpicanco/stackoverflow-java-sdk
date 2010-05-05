/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.Error;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class ErrorImpl.
 */
public class ErrorImpl extends BaseJsonAdapter implements Error, Adaptable<Error, JSONObject> {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5493694517895646459L;
	
	/** The error code. */
	private int errorCode;
	
	/** The status code. */
	private int statusCode;
	
	/** The message. */
	private String message;
	
	/** The timestamp. */
	private Date timestamp;

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Error#getErrorCode()
	 */
	@Override
	public int getErrorCode() {
		return errorCode;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Error#getMessage()
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Error#getTimestamp()
	 */
	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Error#setErrorCode(int)
	 */
	@Override
	public void setErrorCode(int value) {
		errorCode = value;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Error#setMessage(java.lang.String)
	 */
	@Override
	public void setMessage(String value) {
		message = value;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Error#setTimestamp(java.util.Date)
	 */
	@Override
	public void setTimestamp(Date value) {
		timestamp = value;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		JSONObject error = (JSONObject) adaptee.get("error");
		if (error != null) {
			setErrorCode(((Long) error.get("code")).intValue());
			setMessage((String) error.get("message"));
		}
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JSONObject adaptTo() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Error#getStatusCode()
	 */
	@Override
	public int getStatusCode() {
		return statusCode;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Error#setStatusCode(int)
	 */
	@Override
	public void setStatusCode(int value) {
		statusCode = value;
	}
}
