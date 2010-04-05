package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;

public enum QuestionSortOrder implements ValueEnum {
	ACTIVE("active"),
	NEWEST("newest"),
	FEATURED("featured"),
	HOT("hot"),
	WEEKLY_HOT("week"),
	MONTHLY_HOT("month"),
	VOTES("votes");
	
    /**
     * Field Description.
     */
	private static final Map<String, QuestionSortOrder> stringToEnum = new HashMap<String, QuestionSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (QuestionSortOrder op : values()) {
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
    QuestionSortOrder(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static QuestionSortOrder fromValue(String value) {
		return stringToEnum.get(value);
	}
}
