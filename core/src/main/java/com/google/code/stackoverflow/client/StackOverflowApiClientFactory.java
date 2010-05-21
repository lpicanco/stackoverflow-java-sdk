/**
 *
 */
package com.google.code.stackoverflow.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.code.stackoverflow.client.exception.StackOverflowApiClientException;
import com.google.code.stackoverflow.client.impl.AsyncStackOverflowApiClientAdapter;
import com.google.code.stackoverflow.client.impl.StackOverflowApiJsonClient;

/**
 * A factory for creating StackOverflowApiClient objects.
 */
public class StackOverflowApiClientFactory {

    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();

    /** The application key. */
    private String applicationKey;

    /**
     * Instantiates a new stack overflow api client factory.
     * 
     * @param applicationKey the application key
     */
	private StackOverflowApiClientFactory(String applicationKey) {
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
     * @return the stack overflow api client factory
     */
    public static StackOverflowApiClientFactory newInstance(String applicationKey) {
        return new StackOverflowApiClientFactory(applicationKey);
    }

	/**
	 * Creates a new StackOverflowApiClient object.
	 * 
	 * @return the stack overflow api client
	 */
	public StackOverflowApiClient createStackOverflowApiClient() {
		final StackOverflowApiClient client = new StackOverflowApiJsonClient(applicationKey);

        return client;
    }

	/**
	 * Creates a new StackOverflowApiClient object.
	 * 
	 * @param apiVersion the api version
	 * 
	 * @return the stack overflow api client
	 */
	public StackOverflowApiClient createStackOverflowApiClient(String apiVersion) {
		final StackOverflowApiClient client = new StackOverflowApiJsonClient(applicationKey, apiVersion);

        return client;
    }
	
    /**
     * Creates a new StackOverflowApiClient object.
     * 
     * @param implClass the impl class
     * 
     * @return the stack overflow api client
     */
	public StackOverflowApiClient createStackOverflowApiClient(Class<? extends StackOverflowApiClient> implClass) {
    	try {
			final StackOverflowApiClient client = implClass.getConstructor(String.class).newInstance(applicationKey);

	        return client;
		} catch (Exception e) {
			throw new StackOverflowApiClientException(e);
		}
    }
    
    /**
     * Creates a new StackOverflowApiClient object.
     * 
     * @return the async stack overflow api client
     */
    public AsyncStackOverflowApiClient createAsyncStackOverflowApiClient() {
        final StackOverflowApiClient client = createStackOverflowApiClient();

        return new AsyncStackOverflowApiClientAdapter(client, taskExecutor);
    }
}
