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
public class InvalidApplicationKeyException extends StackOverflowApiClientException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * 
	 */
	public InvalidApplicationKeyException() {
		super();
	}

	/**
	 * @param message
	 */
	public InvalidApplicationKeyException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public InvalidApplicationKeyException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidApplicationKeyException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public InvalidApplicationKeyException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public InvalidApplicationKeyException(String message, Date timestamp) {
		super(message, 400, ErrorCodes.INVALID_APPLICATION_KEY, timestamp);
	}
}
