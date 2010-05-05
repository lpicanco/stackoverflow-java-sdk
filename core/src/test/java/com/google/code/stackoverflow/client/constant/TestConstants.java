/**
 *
 */
package com.google.code.stackoverflow.client.constant;
import java.io.IOException;
import java.util.Properties;

/**
 * The Class TestConstants.
 */
public final class TestConstants {

    /** The Constant TEST_CONSTANTS_FILE. */
    public static final String TEST_CONSTANTS_FILE = "TestConstants.properties";

    /** The Constant testConstants. */
    private static final Properties testConstants = new Properties();

    static {
        try {
            testConstants.load(TestConstants.class.getResourceAsStream(TEST_CONSTANTS_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /** The Constant STACK_OVERFLOW_TEST_API_KEY. */
    public static final String STACK_OVERFLOW_TEST_API_KEY =
        testConstants.getProperty("com.google.code.stackoverflow.client.apiKey");

    /** The Constant STACK_OVERFLOW_TEST_USER_IDS. */
    public static final String STACK_OVERFLOW_TEST_USER_IDS =
        testConstants.getProperty("com.google.code.stackoverflow.client.testUserIds");
    
    /** The Constant STACK_OVERFLOW_TEST_QUESTION_IDS. */
    public static final String STACK_OVERFLOW_TEST_QUESTION_IDS =
        testConstants.getProperty("com.google.code.stackoverflow.client.testQuestionIds");
    
    /** The Constant STACK_OVERFLOW_TEST_ANSWER_ID. */
    public static final String STACK_OVERFLOW_TEST_ANSWER_ID =
        testConstants.getProperty("com.google.code.stackoverflow.client.testAnswerId");
    
    /** The Constant STACK_OVERFLOW_TEST_PAGE_NO. */
    public static final String STACK_OVERFLOW_TEST_PAGE_NO =
        testConstants.getProperty("com.google.code.stackoverflow.client.testPageNo");
    
    /** The Constant STACK_OVERFLOW_TEST_PAGE_SIZE. */
    public static final String STACK_OVERFLOW_TEST_PAGE_SIZE =
        testConstants.getProperty("com.google.code.stackoverflow.client.testPageSize");
    
    /** The Constant STACK_OVERFLOW_TEST_TAGS. */
    public static final String STACK_OVERFLOW_TEST_TAGS =
        testConstants.getProperty("com.google.code.stackoverflow.client.testTags");
    
    /** The Constant STACK_OVERFLOW_TEST_USER_FILTER. */
    public static final String STACK_OVERFLOW_TEST_USER_FILTER =
        testConstants.getProperty("com.google.code.stackoverflow.client.testUserFilter");

    /**
     * Instantiates a new test constants.
     */
    private TestConstants() {}
}
