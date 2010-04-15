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
public class InvalidOrderException extends StackOverflowApiClientException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * 
	 */
	public InvalidOrderException() {
		super();
	}

	/**
	 * @param message
	 */
	public InvalidOrderException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public InvalidOrderException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidOrderException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public InvalidOrderException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public InvalidOrderException(String message, Date timestamp) {
		super(message, 400, ErrorCodes.INVALID_ORDER, timestamp);
	}
}
