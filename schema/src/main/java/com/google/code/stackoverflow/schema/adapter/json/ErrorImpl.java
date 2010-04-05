/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.Error;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class ErrorImpl extends BaseJsonAdapter implements Error, Adaptable<Error, JSONObject> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5493694517895646459L;
	private long errorCode;
	private String message;
	private Date timestamp;

	@Override
	public long getErrorCode() {
		return errorCode;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	@Override
	public void setErrorCode(long value) {
		errorCode = value;
	}

	@Override
	public void setMessage(String value) {
		message = value;
	}

	@Override
	public void setTimestamp(Date value) {
		timestamp = value;
	}

	@Override
	public void adaptFrom(JSONObject adaptee) {
		JSONObject error = (JSONObject) adaptee.get("error");
		if (error != null) {
			setErrorCode((Long) error.get("Code"));
			setMessage((String) error.get("Message"));
		}
	}

	@Override
	public JSONObject adaptTo() {
		return null;
	}
}
