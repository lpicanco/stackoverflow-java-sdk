package com.google.code.stackexchange.schema;

import java.util.HashMap;
import java.util.Map;


/**
 * The Enum FilterOption.
 */
public enum FilterOption implements ValueEnum {
	
	/** The INCLUD e_ comments. */
	INCLUDE_COMMENTS("comments", "true"),
	
	/** The INCLUD e_ body. */
	INCLUDE_BODY("body", "true"),
	
	/** The INCLUD e_ answers. */
	INCLUDE_ANSWERS("answers", "true");
	
    /** The Constant stringToEnum. */
	private static final Map<String, FilterOption> stringToEnum = new HashMap<String, FilterOption>();

	static { // Initialize map from constant name to enum constant
		for (FilterOption op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /** The default value. */
    private final String defaultValue;
    
    /**
     * Instantiates a new filter option.
     * 
     * @param value the value
     * @param defaultValue the default value
     */
    FilterOption(String value, String defaultValue) {
        this.value = value;
        this.defaultValue = defaultValue;
    }

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.ValueEnum#value()
	 */
	@Override
	public String value() {
		return value;
	}
	
	/**
	 * Default value.
	 * 
	 * @return the string
	 */
	public String defaultValue() {
		return defaultValue;
	}
	
	/**
	 * From value.
	 * 
	 * @param value the value
	 * 
	 * @return the filter option
	 */
	public static FilterOption fromValue(String value) {
		return stringToEnum.get(value);
	}
}
