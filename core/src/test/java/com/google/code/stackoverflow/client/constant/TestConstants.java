/**
 *
 */
package com.google.code.stackoverflow.client.constant;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Nabeel Mukhtar
 *
 */
public final class TestConstants {

    /** Field description */
    public static final String TEST_CONSTANTS_FILE = "TestConstants.properties";

    /** Field description */
    private static final Properties testConstants = new Properties();

    static {
        try {
            testConstants.load(TestConstants.class.getResourceAsStream(TEST_CONSTANTS_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /** Field description */
    public static final String STACK_OVERFLOW_TEST_API_KEY =
        testConstants.getProperty("com.google.code.stackoverflow.client.apiKey");

    /** Field description */
    public static final String STACK_OVERFLOW_TEST_USER_ID =
        testConstants.getProperty("com.google.code.stackoverflow.client.testUserId");
    /** Field description */
    public static final String STACK_OVERFLOW_TEST_QUESTION_ID =
        testConstants.getProperty("com.google.code.stackoverflow.client.testQuestionId");
    /** Field description */
    public static final String STACK_OVERFLOW_TEST_ANSWER_ID =
        testConstants.getProperty("com.google.code.stackoverflow.client.testAnswerId");
    /** Field description */
    public static final String STACK_OVERFLOW_TEST_PAGE_NO =
        testConstants.getProperty("com.google.code.stackoverflow.client.testPageNo");
    /** Field description */
    public static final String STACK_OVERFLOW_TEST_PAGE_SIZE =
        testConstants.getProperty("com.google.code.stackoverflow.client.testPageSize");
    /** Field description */
    public static final String STACK_OVERFLOW_TEST_TAGS =
        testConstants.getProperty("com.google.code.stackoverflow.client.testTags");
    /** Field description */
    public static final String STACK_OVERFLOW_TEST_USER_FILTER =
        testConstants.getProperty("com.google.code.stackoverflow.client.testUserFilter");

    /**
     * Constructs ...
     *
     */
    private TestConstants() {}
}
