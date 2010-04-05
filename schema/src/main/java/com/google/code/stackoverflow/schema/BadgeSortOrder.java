package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;

public enum BadgeSortOrder implements ValueEnum {
	TAGS("tags"),
	NAME("name");
	
    /**
     * Field Description.
     */
	private static final Map<String, BadgeSortOrder> stringToEnum = new HashMap<String, BadgeSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (BadgeSortOrder op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** Field description */
    private final String value;
    
    /**
     * Constructs ...
     *
     *
     * @param name
     */
    BadgeSortOrder(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static BadgeSortOrder fromValue(String value) {
		return stringToEnum.get(value);
	}
}
