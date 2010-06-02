/**
 * 
 */
package com.google.code.stackexchange.client.exception;

import java.util.Date;

import com.google.code.stackexchange.client.constant.ErrorCodes;

/**
 * The Class InvalidApplicationKeyException.
 */
public class InvalidApplicationKeyException extends StackExchangeApiException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * Instantiates a new invalid application key exception.
	 */
	public InvalidApplicationKeyException() {
		super();
	}

	/**
	 * Instantiates a new invalid application key exception.
	 * 
	 * @param message the message
	 */
	public InvalidApplicationKeyException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new invalid application key exception.
	 * 
	 * @param cause the cause
	 */
	public InvalidApplicationKeyException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new invalid application key exception.
	 * 
	 * @param message the message
	 * @param cause the cause
	 */
	public InvalidApplicationKeyException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new invalid application key exception.
	 * 
	 * @param message the message
	 * @param statusCode the status code
	 * @param errorCode the error code
	 * @param timestamp the timestamp
	 */
	public InvalidApplicationKeyException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * Instantiates a new invalid application key exception.
	 * 
	 * @param message the message
	 * @param timestamp the timestamp
	 */
	public InvalidApplicationKeyException(String message, Date timestamp) {
		super(message, 400, ErrorCodes.INVALID_APPLICATION_KEY, timestamp);
	}
}
