/**
 *
 */
package com.google.code.stackoverflow.query;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * A factory for creating StackOverflowApiClient objects.
 * 
 * @author Nabeel Mukhtar
 */
public class StackOverflowApiQueryFactory {

    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();

    /** The api consumer. */
    private String applicationKey;

    /**
     * Instantiates a new stack overflow api client factory.
     * 
     * @param apiConsumer the api consumer
     */
	private StackOverflowApiQueryFactory(String applicationKey) {
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
     * @return the stack overflow api client factory
     */
    public static StackOverflowApiQueryFactory newInstance(String applicationKey) {
    	if (applicationKey == null || applicationKey.length() == 0) {
    		throw new IllegalArgumentException("Please provide valid application key.");
    	}
        return new StackOverflowApiQueryFactory(applicationKey);
    }
}
