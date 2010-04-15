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
public class InvalidPageSizeException extends StackOverflowApiClientException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * 
	 */
	public InvalidPageSizeException() {
		super();
	}

	/**
	 * @param message
	 */
	public InvalidPageSizeException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public InvalidPageSizeException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidPageSizeException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public InvalidPageSizeException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public InvalidPageSizeException(String message, Date timestamp) {
		super(message, 400, ErrorCodes.INVALID_PAGE_SIZE, timestamp);
	}
}
