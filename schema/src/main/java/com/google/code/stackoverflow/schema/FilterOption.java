package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;


public enum FilterOption implements ValueEnum {
	INCLUDE_COMMENTS("comments", "true"),
	INCLUDE_BODY("body", "true");
	
    /**
     * Field Description.
     */
	private static final Map<String, FilterOption> stringToEnum = new HashMap<String, FilterOption>();

	static { // Initialize map from constant name to enum constant
		for (FilterOption op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** Field description */
    private final String value;
    
    /** Field description */
    private final String defaultValue;
    
    /**
     * Constructs ...
     *
     *
     * @param name
     */
    FilterOption(String value, String defaultValue) {
        this.value = value;
        this.defaultValue = defaultValue;
    }

	@Override
	public String value() {
		return value;
	}
	
	public String defaultValue() {
		return defaultValue;
	}
	
	public static FilterOption fromValue(String value) {
		return stringToEnum.get(value);
	}
}
