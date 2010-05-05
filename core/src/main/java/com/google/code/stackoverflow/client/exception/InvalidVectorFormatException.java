/**
 * 
 */
package com.google.code.stackoverflow.client.exception;

import java.util.Date;

import com.google.code.stackoverflow.client.constant.ErrorCodes;

/**
 * The Class InvalidVectorFormatException.
 */
public class InvalidVectorFormatException extends StackOverflowApiClientException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * Instantiates a new invalid vector format exception.
	 */
	public InvalidVectorFormatException() {
		super();
	}

	/**
	 * Instantiates a new invalid vector format exception.
	 * 
	 * @param message the message
	 */
	public InvalidVectorFormatException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new invalid vector format exception.
	 * 
	 * @param cause the cause
	 */
	public InvalidVectorFormatException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new invalid vector format exception.
	 * 
	 * @param message the message
	 * @param cause the cause
	 */
	public InvalidVectorFormatException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new invalid vector format exception.
	 * 
	 * @param message the message
	 * @param statusCode the status code
	 * @param errorCode the error code
	 * @param timestamp the timestamp
	 */
	public InvalidVectorFormatException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * Instantiates a new invalid vector format exception.
	 * 
	 * @param message the message
	 * @param timestamp the timestamp
	 */
	public InvalidVectorFormatException(String message, Date timestamp) {
		super(message, 400, ErrorCodes.INVALID_VECTOR_FORMAT, timestamp);
	}
}
