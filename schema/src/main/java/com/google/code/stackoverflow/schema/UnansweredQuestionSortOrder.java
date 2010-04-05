package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;

public enum UnansweredQuestionSortOrder implements ValueEnum {
	NEWEST("newest"),
	VOTES("votes");
	
    /**
     * Field Description.
     */
	private static final Map<String, UnansweredQuestionSortOrder> stringToEnum = new HashMap<String, UnansweredQuestionSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (UnansweredQuestionSortOrder op : values()) {
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
    UnansweredQuestionSortOrder(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static UnansweredQuestionSortOrder fromValue(String value) {
		return stringToEnum.get(value);
	}
}
