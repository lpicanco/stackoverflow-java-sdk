/**
 * 
 */
package com.google.code.stackoverflow.client.exception;

import java.util.Date;

import com.google.code.stackoverflow.client.constant.ErrorCodes;

/**
 * @author nmukhtar
 *
 */
public class RequestLimitExceededException extends StackOverflowApiClientException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * 
	 */
	public RequestLimitExceededException() {
		super();
	}

	/**
	 * @param message
	 */
	public RequestLimitExceededException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public RequestLimitExceededException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public RequestLimitExceededException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public RequestLimitExceededException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public RequestLimitExceededException(String message, Date timestamp) {
		super(message, 403, ErrorCodes.REQUEST_LIMIT_EXCEEDED, timestamp);
	}
}
