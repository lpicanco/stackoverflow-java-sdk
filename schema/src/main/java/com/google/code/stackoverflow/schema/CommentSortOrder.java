package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;

public enum CommentSortOrder implements ValueEnum {
	RECENT("recent"),
	SCORE("score");
	
    /**
     * Field Description.
     */
	private static final Map<String, CommentSortOrder> stringToEnum = new HashMap<String, CommentSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (CommentSortOrder op : values()) {
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
    CommentSortOrder(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static CommentSortOrder fromValue(String value) {
		return stringToEnum.get(value);
	}
}
