package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;

public enum TagSortOrder implements ValueEnum {
	POPULAR("popular"),
	NAME("name"),
	RECENT("recent");
	
    /**
     * Field Description.
     */
	private static final Map<String, TagSortOrder> stringToEnum = new HashMap<String, TagSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (TagSortOrder op : values()) {
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
    TagSortOrder(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static TagSortOrder fromValue(String value) {
		return stringToEnum.get(value);
	}
}
