/**
 *
 */
package com.google.code.stackexchange.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.code.stackexchange.client.exception.StackExchangeApiException;
import com.google.code.stackexchange.client.impl.AsyncStackExchangeApiClientAdapter;
import com.google.code.stackexchange.client.impl.StackExchangeApiJsonClient;

/**
 * A factory for creating StackExchangeApiClient objects.
 */
public class StackExchangeApiClientFactory {

    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();

    /** The application key. */
    private String applicationKey;

    /**
     * Instantiates a new stack exchange api client factory.
     * 
     * @param applicationKey the application key
     */
	private StackExchangeApiClientFactory(String applicationKey) {
        this.applicationKey = applicationKey;
    }
	
    /**
     * Sets the task executor.
     * 
     * @param taskExecutor the new task executor
     */
	public void setTaskExecutor(ExecutorService taskExecutor) {
        this.taskExecutor = taskExecutor;
	}

    /**
     * New instance.
     * 
     * @param applicationKey the application key
     * 
     * @return the stack exchange api client factory
     */
    public static StackExchangeApiClientFactory newInstance(String applicationKey) {
        return new StackExchangeApiClientFactory(applicationKey);
    }

	/**
	 * Creates a new StackExchangeApiClient object.
	 * 
	 * @return the stack exchange api client
	 */
	public StackExchangeApiClient createStackExchangeApiClient() {
		final StackExchangeApiClient client = new StackExchangeApiJsonClient(applicationKey);

        return client;
    }

	/**
	 * Creates a new StackExchangeApiClient object.
	 * 
	 * @param apiVersion the api version
	 * 
	 * @return the stack exchange api client
	 */
	public StackExchangeApiClient createStackExchangeApiClient(String apiVersion) {
		final StackExchangeApiClient client = new StackExchangeApiJsonClient(applicationKey, apiVersion);

        return client;
    }
	
    /**
     * Creates a new StackExchangeApiClient object.
     * 
     * @param implClass the impl class
     * 
     * @return the stack exchange api client
     */
	public StackExchangeApiClient createStackEchangeApiClient(Class<? extends StackExchangeApiClient> implClass) {
    	try {
			final StackExchangeApiClient client = implClass.getConstructor(String.class).newInstance(applicationKey);

	        return client;
		} catch (Exception e) {
			throw new StackExchangeApiException(e);
		}
    }
    
    /**
     * Creates a new StackExchangeApiClient object.
     * 
     * @return the async stack overflow api client
     */
    public AsyncStackExchangeApiClient createAsyncStackExchangeApiClient() {
        final StackExchangeApiClient client = createStackExchangeApiClient();

        return new AsyncStackExchangeApiClientAdapter(client, taskExecutor);
    }
}
