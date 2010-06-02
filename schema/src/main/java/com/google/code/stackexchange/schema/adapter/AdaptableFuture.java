/**
 * 
 */
package com.google.code.stackexchange.schema.adapter;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * The Class AdaptableFuture.
 */
public class AdaptableFuture<Adapter, Adaptee> implements Future<Adapter> {
	
	/** The adaptable. */
	private Adaptable<Adapter, Adaptee> adaptable;
	
	/** The future. */
	private Future<Adaptee> future;
	
	/**
	 * Instantiates a new adaptable future.
	 * 
	 * @param future the future
	 * @param adaptable the adaptable
	 */
	public AdaptableFuture(Future<Adaptee> future, Adaptable<Adapter, Adaptee> adaptable) {
		this.future = future;
		this.adaptable = adaptable;
	}

	/* (non-Javadoc)
	 * @see java.util.concurrent.Future#cancel(boolean)
	 */
	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		return future.cancel(mayInterruptIfRunning);
	}

	/* (non-Javadoc)
	 * @see java.util.concurrent.Future#get()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Adapter get() throws InterruptedException, ExecutionException {
		adaptable.adaptFrom(future.get());
		return (Adapter) adaptable;
	}

	/* (non-Javadoc)
	 * @see java.util.concurrent.Future#get(long, java.util.concurrent.TimeUnit)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Adapter get(long timeout, TimeUnit unit) throws InterruptedException,
			ExecutionException, TimeoutException {
		adaptable.adaptFrom(future.get(timeout, unit));
		return (Adapter) adaptable;
	}

	/* (non-Javadoc)
	 * @see java.util.concurrent.Future#isCancelled()
	 */
	@Override
	public boolean isCancelled() {
		return future.isCancelled();
	}

	/* (non-Javadoc)
	 * @see java.util.concurrent.Future#isDone()
	 */
	@Override
	public boolean isDone() {
		return future.isDone();
	}
}
