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
public class InvalidSortException extends StackOverflowApiClientException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * 
	 */
	public InvalidSortException() {
		super();
	}

	/**
	 * @param message
	 */
	public InvalidSortException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public InvalidSortException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidSortException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public InvalidSortException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public InvalidSortException(String message, Date timestamp) {
		super(message, 400, ErrorCodes.INVALID_SORT, timestamp);
	}
}
