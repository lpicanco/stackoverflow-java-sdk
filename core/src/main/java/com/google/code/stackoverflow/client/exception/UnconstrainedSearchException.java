/**
 * 
 */
package com.google.code.stackoverflow.client.exception;

import java.util.Date;

import com.google.code.stackoverflow.client.constant.ErrorCodes;

/**
 * The Class UnconstrainedSearchException.
 */
public class UnconstrainedSearchException extends StackOverflowApiClientException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * Instantiates a new unconstrained search exception.
	 */
	public UnconstrainedSearchException() {
		super();
	}

	/**
	 * Instantiates a new unconstrained search exception.
	 * 
	 * @param message the message
	 */
	public UnconstrainedSearchException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new unconstrained search exception.
	 * 
	 * @param cause the cause
	 */
	public UnconstrainedSearchException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new unconstrained search exception.
	 * 
	 * @param message the message
	 * @param cause the cause
	 */
	public UnconstrainedSearchException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new unconstrained search exception.
	 * 
	 * @param message the message
	 * @param statusCode the status code
	 * @param errorCode the error code
	 * @param timestamp the timestamp
	 */
	public UnconstrainedSearchException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * Instantiates a new unconstrained search exception.
	 * 
	 * @param message the message
	 * @param timestamp the timestamp
	 */
	public UnconstrainedSearchException(String message, Date timestamp) {
		super(message, 400, ErrorCodes.UNCONSTRAINED_SEARCH, timestamp);
	}
}
