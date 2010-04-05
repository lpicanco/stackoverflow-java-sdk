package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;

public enum UserFavoriteSortOrder implements ValueEnum {
	RECENT("recent"),
	VIEWS("views"),
	NEWEST("newest"),
	ADDED("added");
	
    /**
     * Field Description.
     */
	private static final Map<String, UserFavoriteSortOrder> stringToEnum = new HashMap<String, UserFavoriteSortOrder>();

	static { // Initialize map from constant name to enum constant
		for (UserFavoriteSortOrder op : values()) {
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
    UserFavoriteSortOrder(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static UserFavoriteSortOrder fromValue(String value) {
		return stringToEnum.get(value);
	}
}
