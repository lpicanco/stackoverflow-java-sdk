/**
 *
 */
package com.google.code.stackoverflow.client;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import com.google.code.stackoverflow.client.constant.TestConstants;
import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.TimePeriod;

/**
 * @author Nabeel Mukhtar
 *
 */
public abstract class StackOverflowApiClientTest extends TestCase {

    /** Field description */
    protected StackOverflowApiClientFactory factory;

    /** Field description */
	protected static final String RESOURCE_MISSING_MESSAGE = "Please define a test %s in TestConstants.properties file.";


    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {}

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {}

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    	assertNotNull(String.format(RESOURCE_MISSING_MESSAGE, "Application Key"), TestConstants.STACK_OVERFLOW_TEST_API_KEY);
    	factory =
            StackOverflowApiClientFactory.newInstance(TestConstants.STACK_OVERFLOW_TEST_API_KEY);
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    	factory = null;
    }

	/**
	 *
	 */
	protected Date getCurrentDate() {
		return new Date();
	}

	/**
	 *
	 */
	protected Date getLastWeekDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -7);
		return calendar.getTime();
	}

	/**
	 *
	 */
	protected Paging getPaging() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Page No."), TestConstants.STACK_OVERFLOW_TEST_PAGE_NO);
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Page Size"), TestConstants.STACK_OVERFLOW_TEST_PAGE_SIZE);
    	return new Paging(Integer.parseInt(TestConstants.STACK_OVERFLOW_TEST_PAGE_NO), Integer.parseInt(TestConstants.STACK_OVERFLOW_TEST_PAGE_SIZE));    	
	}
	
	protected List<String> getTags() {
    	assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test Tags."), TestConstants.STACK_OVERFLOW_TEST_TAGS);
    	return Arrays.asList(TestConstants.STACK_OVERFLOW_TEST_TAGS.split(","));
	}
	
	/**
	 *
	 */
	protected TimePeriod getTimePeriod() {
		return new TimePeriod(getLastWeekDate(), new Date());
	}
	
	/**
	 *
	 */
	protected static void assertNotNullOrEmpty(String message, String value) {
		assertNotNull(message, value);
		assertFalse(message, "".equals(value));
	}
	
	/**
	 *
	 */
	protected static void assertNotNullOrEmpty(String message, Collection<?> value) {
		assertNotNull(message, value);
		assertFalse(message, value.isEmpty());
	}
}
