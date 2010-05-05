/**
 * 
 */
package com.google.code.stackoverflow.client.exception;

import java.util.Date;

import com.google.code.stackoverflow.client.constant.ErrorCodes;

/**
 * The Class InternalServerException.
 */
public class InternalServerException extends StackOverflowApiClientException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * Instantiates a new internal server exception.
	 */
	public InternalServerException() {
		super();
	}

	/**
	 * Instantiates a new internal server exception.
	 * 
	 * @param message the message
	 */
	public InternalServerException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new internal server exception.
	 * 
	 * @param cause the cause
	 */
	public InternalServerException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new internal server exception.
	 * 
	 * @param message the message
	 * @param cause the cause
	 */
	public InternalServerException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new internal server exception.
	 * 
	 * @param message the message
	 * @param statusCode the status code
	 * @param errorCode the error code
	 * @param timestamp the timestamp
	 */
	public InternalServerException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * Instantiates a new internal server exception.
	 * 
	 * @param message the message
	 * @param timestamp the timestamp
	 */
	public InternalServerException(String message, Date timestamp) {
		super(message, 500, ErrorCodes.INTERNAL_SERVER_ERROR, timestamp);
	}
}
