/**
 * 
 */
package com.google.code.stackoverflow.client.exception;

import java.util.Date;

import com.google.code.stackoverflow.client.constant.ErrorCodes;

/**
 * The Class InvalidSortException.
 */
public class InvalidSortException extends StackOverflowApiClientException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * Instantiates a new invalid sort exception.
	 */
	public InvalidSortException() {
		super();
	}

	/**
	 * Instantiates a new invalid sort exception.
	 * 
	 * @param message the message
	 */
	public InvalidSortException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new invalid sort exception.
	 * 
	 * @param cause the cause
	 */
	public InvalidSortException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new invalid sort exception.
	 * 
	 * @param message the message
	 * @param cause the cause
	 */
	public InvalidSortException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new invalid sort exception.
	 * 
	 * @param message the message
	 * @param statusCode the status code
	 * @param errorCode the error code
	 * @param timestamp the timestamp
	 */
	public InvalidSortException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * Instantiates a new invalid sort exception.
	 * 
	 * @param message the message
	 * @param timestamp the timestamp
	 */
	public InvalidSortException(String message, Date timestamp) {
		super(message, 400, ErrorCodes.INVALID_SORT, timestamp);
	}
}
