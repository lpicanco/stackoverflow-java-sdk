/**
 * 
 */
package com.google.code.stackoverflow.client.exception;

import java.util.Date;

import com.google.code.stackoverflow.client.constant.ErrorCodes;

/**
 * The Class InvalidPageSizeException.
 */
public class InvalidPageSizeException extends StackOverflowApiClientException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * Instantiates a new invalid page size exception.
	 */
	public InvalidPageSizeException() {
		super();
	}

	/**
	 * Instantiates a new invalid page size exception.
	 * 
	 * @param message the message
	 */
	public InvalidPageSizeException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new invalid page size exception.
	 * 
	 * @param cause the cause
	 */
	public InvalidPageSizeException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new invalid page size exception.
	 * 
	 * @param message the message
	 * @param cause the cause
	 */
	public InvalidPageSizeException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new invalid page size exception.
	 * 
	 * @param message the message
	 * @param statusCode the status code
	 * @param errorCode the error code
	 * @param timestamp the timestamp
	 */
	public InvalidPageSizeException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * Instantiates a new invalid page size exception.
	 * 
	 * @param message the message
	 * @param timestamp the timestamp
	 */
	public InvalidPageSizeException(String message, Date timestamp) {
		super(message, 400, ErrorCodes.INVALID_PAGE_SIZE, timestamp);
	}
}
