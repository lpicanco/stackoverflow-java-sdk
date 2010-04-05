package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;

public enum AnswerSortOrder implements ValueEnum {
	RECENT("recent"),
	VIEWS("views"),
	NEWEST("newest"),
	VOTES("votes");
	
    /**
     * Field Description.
     */
	private static final Map<String, AnswerSortOrder> stringToEnum = new HashMap<String, AnswerSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (AnswerSortOrder op : values()) {
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
    AnswerSortOrder(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static AnswerSortOrder fromValue(String value) {
		return stringToEnum.get(value);
	}
}
