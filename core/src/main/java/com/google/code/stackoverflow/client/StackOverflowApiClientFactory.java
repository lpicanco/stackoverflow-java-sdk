/**
 *
 */
package com.google.code.stackoverflow.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.code.stackoverflow.client.impl.AsyncStackOverflowApiClientAdapter;
import com.google.code.stackoverflow.client.impl.StackOverflowApiJsonClient;

/**
 * A factory for creating LinkedInApiClient objects.
 * 
 * @author Nabeel Mukhtar
 */
public class StackOverflowApiClientFactory {

    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();

    /** The api consumer. */
    private String applicationKey;

    /**
     * Instantiates a new linked in api client factory.
     * 
     * @param apiConsumer the api consumer
     */
	private StackOverflowApiClientFactory(String applicationKey) {
        this.applicationKey = applicationKey;
    }
	
    /**
     * Sets the task executor to be used for asynchronous API calls. 
     * 
     * @param taskExecutor the task executor
     */
	public void setTaskExecutor(ExecutorService taskExecutor) {
        this.taskExecutor = taskExecutor;
	}

    /**
     * New instance.
     * 
     * @param consumerKey the consumer key
     * @param consumerSecret the consumer secret
     * 
     * @return the linked in api client factory
     */
    public static StackOverflowApiClientFactory newInstance(String applicationKey) {
    	if (applicationKey == null || applicationKey.length() == 0) {
    		throw new IllegalArgumentException("Please provide valid application key.");
    	}
        return new StackOverflowApiClientFactory(applicationKey);
    }

	/**
     * Creates a new LinkedInApiClient object.
     * 
     * @param accessToken the access token
     * 
     * @return the linked in api client
     */
	public StackOverflowApiClient createStackOverflowApiClient() {
		final StackOverflowApiClient client = new StackOverflowApiJsonClient(applicationKey);

        return client;
    }

	/**
     * Creates a new LinkedInApiClient object.
     * 
     * @param accessToken the access token
     * 
     * @return the linked in api client
     */
	public StackOverflowApiClient createStackOverflowApiClient(String apiVersion) {
		final StackOverflowApiClient client = new StackOverflowApiJsonClient(applicationKey, apiVersion);

        return client;
    }
	
    /**
     * Creates a new LinkedInApiClient object.
     * 
     * @param accessToken the access token
     * 
     * @return the linked in api client
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
     * Creates a new LinkedInApiClient object.
     * 
     * @param accessToken the access token
     * 
     * @return the async linked in api client
     */
    public AsyncStackOverflowApiClient createAsyncStackOverflowApiClient() {
        final StackOverflowApiClient client = createStackOverflowApiClient();

        return new AsyncStackOverflowApiClientAdapter(client, taskExecutor);
    }
}
