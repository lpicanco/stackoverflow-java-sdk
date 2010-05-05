/**
 * 
 */
package com.google.code.stackoverflow.client.exception;

import java.util.Date;

import com.google.code.stackoverflow.client.constant.ErrorCodes;

/**
 * The Class TooManyIdsException.
 */
public class TooManyIdsException extends StackOverflowApiClientException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * Instantiates a new too many ids exception.
	 */
	public TooManyIdsException() {
		super();
	}

	/**
	 * Instantiates a new too many ids exception.
	 * 
	 * @param message the message
	 */
	public TooManyIdsException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new too many ids exception.
	 * 
	 * @param cause the cause
	 */
	public TooManyIdsException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new too many ids exception.
	 * 
	 * @param message the message
	 * @param cause the cause
	 */
	public TooManyIdsException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new too many ids exception.
	 * 
	 * @param message the message
	 * @param statusCode the status code
	 * @param errorCode the error code
	 * @param timestamp the timestamp
	 */
	public TooManyIdsException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * Instantiates a new too many ids exception.
	 * 
	 * @param message the message
	 * @param timestamp the timestamp
	 */
	public TooManyIdsException(String message, Date timestamp) {
		super(message, 400, ErrorCodes.TOO_MANY_IDS, timestamp);
	}
}
