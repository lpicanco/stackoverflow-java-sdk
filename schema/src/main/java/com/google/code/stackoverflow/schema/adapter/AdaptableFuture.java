/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author nmukhtar
 *
 */
public class AdaptableFuture<Adapter, Adaptee> implements Future<Adapter> {
	private Adaptable<Adapter, Adaptee> adaptable;
	private Future<Adaptee> future;
	
	public AdaptableFuture(Future<Adaptee> future, Adaptable<Adapter, Adaptee> adaptable) {
		this.future = future;
		this.adaptable = adaptable;
	}

	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		return future.cancel(mayInterruptIfRunning);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Adapter get() throws InterruptedException, ExecutionException {
		adaptable.adaptFrom(future.get());
		return (Adapter) adaptable;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Adapter get(long timeout, TimeUnit unit) throws InterruptedException,
			ExecutionException, TimeoutException {
		adaptable.adaptFrom(future.get(timeout, unit));
		return (Adapter) adaptable;
	}

	@Override
	public boolean isCancelled() {
		return future.isCancelled();
	}

	@Override
	public boolean isDone() {
		return future.isDone();
	}
}
