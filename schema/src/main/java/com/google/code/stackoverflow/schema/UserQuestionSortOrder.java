package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;

public enum UserQuestionSortOrder implements ValueEnum {
	RECENT("recent"),
	VIEWS("views"),
	NEWEST("newest"),
	VOTES("votes");
	
    /**
     * Field Description.
     */
	private static final Map<String, UserQuestionSortOrder> stringToEnum = new HashMap<String, UserQuestionSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (UserQuestionSortOrder op : values()) {
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
    UserQuestionSortOrder(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static UserQuestionSortOrder fromValue(String value) {
		return stringToEnum.get(value);
	}
}
