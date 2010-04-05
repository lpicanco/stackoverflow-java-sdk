package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;

public enum UserSortOrder implements ValueEnum {
	REPUTATION("reputation"),
	NEWEST("newest"),
	OLDEST("oldest"),
	NAME("name");
	
    /**
     * Field Description.
     */
	private static final Map<String, UserSortOrder> stringToEnum = new HashMap<String, UserSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (UserSortOrder op : values()) {
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
    UserSortOrder(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static UserSortOrder fromValue(String value) {
		return stringToEnum.get(value);
	}
}
