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
public class InternalServerException extends StackOverflowApiClientException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * 
	 */
	public InternalServerException() {
		super();
	}

	/**
	 * @param message
	 */
	public InternalServerException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public InternalServerException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InternalServerException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public InternalServerException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public InternalServerException(String message, Date timestamp) {
		super(message, 500, ErrorCodes.INTERNAL_SERVER_ERROR, timestamp);
	}
}
