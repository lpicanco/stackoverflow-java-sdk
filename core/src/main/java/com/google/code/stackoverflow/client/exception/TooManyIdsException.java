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
public class TooManyIdsException extends StackOverflowApiClientException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4116844039359929855L;

	/**
	 * 
	 */
	public TooManyIdsException() {
		super();
	}

	/**
	 * @param message
	 */
	public TooManyIdsException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public TooManyIdsException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public TooManyIdsException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public TooManyIdsException(String message, int statusCode, int errorCode,
			Date timestamp) {
		super(message, statusCode, errorCode, timestamp);
	}
	
	/**
	 * @param message
	 * @param statusCode
	 * @param errorCode
	 * @param timestamp
	 */
	public TooManyIdsException(String message, Date timestamp) {
		super(message, 400, ErrorCodes.TOO_MANY_IDS, timestamp);
	}
}
