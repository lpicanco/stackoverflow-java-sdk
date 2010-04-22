/**
 *
 */
package com.google.code.stackoverflow.client.constant;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Class ApplicationConstants.
 *
 * @author Nabeel Mukhtar
 */
public final class ApplicationConstants {

    /** The Constant APP_CONSTANTS_FILE. */
    public static final String APP_CONSTANTS_FILE = "ApplicationConstants.properties";

    /** The static logger. */
    private static final Logger LOG = Logger.getLogger(ApplicationConstants.class.getCanonicalName());
    
    /** The Constant applicationConstants. */
    private static final Properties applicationConstants = new Properties();

    static {
        try {
            applicationConstants.load(
                ApplicationConstants.class.getResourceAsStream(APP_CONSTANTS_FILE));
        } catch (IOException e) {
            LOG.log(Level.SEVERE, "An error occurred while loading properties.", e);
        }
    }

    /** The Constant VALIDATE_XML. */
    public static final boolean VALIDATE_XML = getBooleanProperty("com.google.code.stackoverflow.client.validateXml");

    /** The Constant DEFAULT_PAGE_SIZE. */
    public static final int DEFAULT_PAGE_SIZE =
        getIntProperty("com.google.code.stackoverflow.client.defaultPageSize");

    /** The Constant CONTENT_ENCODING. */
    public static final String CONTENT_ENCODING = getProperty("com.google.code.stackoverflow.client.encoding");

    /** The Constant CLIENT_DEFAULT_IMPL. */
    public static final String CLIENT_DEFAULT_IMPL = getProperty("com.google.code.stackoverflow.client.defaultImpl");

    /** The Constant CONTENT_ENCODING. */
    public static final String DEFAULT_API_VERSION = getProperty("com.google.code.stackoverflow.client.defaultApiVersion");
    
    /** The Constant CONNECT_TIMEOUT. */
    public static final int CONNECT_TIMEOUT = getIntProperty("com.google.code.stackoverflow.client.connectTimeout");
    
    /** The Constant READ_TIMEOUT. */
    public static final int READ_TIMEOUT = getIntProperty("com.google.code.stackoverflow.client.readTimeout");
    
    /** The Constant MAX_RATE_LIMIT_HEADER. */
    public static final String MAX_RATE_LIMIT_HEADER = getProperty("com.google.code.stackoverflow.client.maxRateLimitHeader");

    /** The Constant CURRENT_RATE_LIMIT_HEADER. */
    public static final String CURRENT_RATE_LIMIT_HEADER = getProperty("com.google.code.stackoverflow.client.currentRateLimitHeader");
    
    /**
     * Instantiates a new application constants.
     */
    private ApplicationConstants() {}

    /**
     * Get property as int.
     */
    public static String getProperty(String key) {
        return applicationConstants.getProperty(key);
    }

    /**
     * Get property as int.
     */
    public static int getIntProperty(String key) {
        String property = applicationConstants.getProperty(key);

        if (isNullOrEmpty(property)) {
            return 0;
        } else {
            return Integer.parseInt(property);
        }
    }

    /**
     * Get property as boolean.
     */
    public static boolean getBooleanProperty(String key) {
        String property = applicationConstants.getProperty(key);

        if (isNullOrEmpty(property)) {
            return false;
        } else {
            return Boolean.parseBoolean(property);
        }
    }

    /**
     * Get property as double.
     */
    public static double getDoubleProperty(String key) {
        String property = applicationConstants.getProperty(key);

        if (isNullOrEmpty(property)) {
            return 0;
        } else {
            return Double.parseDouble(property);
        }
    }

    /**
     * Get property as long.
     */
    public static long getLongProperty(String key) {
        String property = applicationConstants.getProperty(key);

        if (isNullOrEmpty(property)) {
            return 0;
        } else {
            return Long.parseLong(property);
        }
    }

    /**
     * Get property as long.
     */
    private static boolean isNullOrEmpty(String s) {
        return ((s == null) || s.length() == 0);
    }
}
