/**
 *
 */
package com.google.code.stackoverflow.client;

import java.util.concurrent.Future;

import com.google.code.stackoverflow.schema.SchemaEntity;


/**
 * The Class AsyncResponseHandler.
 */
public abstract class AsyncResponseHandler<T extends SchemaEntity> {
	
	/** The future. */
	private Future<T> future;
	
    /**
     * Sets the future.
     * 
     * @param future the new future
     */
	public void setFuture(Future<T> future) {
		this.future = future;
	}
	
    /**
     * Gets the future.
     * 
     * @return the future
     */
	public Future<T> getFuture() {
		return future;
	}

    /**
     * Handle response.
     * 
     * @param response the response
     */
    public abstract void handleResponse(T response);
}
