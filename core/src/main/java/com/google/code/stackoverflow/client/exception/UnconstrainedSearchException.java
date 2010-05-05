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
public class UnconstrainedSearchException extends StackOverflowApiClientException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * 
	 */
	public UnconstrainedSearchException() {
		super();
	}

	/**
	 * @param message
	 */
	public UnconstrainedSearchException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public UnconstrainedSearchException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public UnconstrainedSearchException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public UnconstrainedSearchException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public UnconstrainedSearchException(String message, Date timestamp) {
		super(message, 400, ErrorCodes.UNCONSTRAINED_SEARCH, timestamp);
	}
}
