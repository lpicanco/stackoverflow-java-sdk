/**
 *
 */
package com.google.code.stackoverflow.client.exception;

import java.util.Date;

/**
 * Class description
 *
 *
 */
public class StackOverflowApiClientException extends RuntimeException {
	private int statusCode;
	private int errorCode;
	private Date timestamp;

    /**
	 *
	 */
	private static final long serialVersionUID = -4345556572105572685L;

	/**
     * Constructs ...
     *
     */
    public StackOverflowApiClientException() {
        super();
    }

    /**
     * Constructs ...
     *
     *
     * @param message
     */
    public StackOverflowApiClientException(String message) {
        super(message);
    }

    /**
     * Constructs ...
     *
     *
     * @param cause
     */
    public StackOverflowApiClientException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs ...
     *
     *
     * @param message
     * @param cause
     */
    public StackOverflowApiClientException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs ...
     *
     *
     * @param message
     * @param cause
     */
    public StackOverflowApiClientException(String message, int statusCode , int errorCode, Date timestamp) {
        super(message);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.timestamp = timestamp;
    }
    
	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
