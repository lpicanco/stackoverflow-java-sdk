/**
 * 
 */
package com.google.code.stackexchange.schema;

import java.util.Date;

import com.google.code.stackexchange.schema.Error;

/**
 * The Class ErrorImpl.
 */
public class Error extends SchemaEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5493694517895646459L;
	
	/** The error code. */
	private int code;
	
	/** The status code. */
	private int statusCode;
	
	/** The message. */
	private String message;
	
	/** The timestamp. */
	private Date timestamp;

	public int getErrorCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setErrorCode(int value) {
		code = value;
	}

	public void setMessage(String value) {
		message = value;
	}

	public void setTimestamp(Date value) {
		timestamp = value;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int value) {
		statusCode = value;
	}
}
