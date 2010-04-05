package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;

public enum UserType implements ValueEnum {
	MODERATOR("moderator"),
	REGISTERED("registered");
	
    /**
     * Field Description.
     */
	private static final Map<String, UserType> stringToEnum = new HashMap<String, UserType>();

	static { // Initialize map from constant name to enum constant
		for (UserType op : values()) {
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
    UserType(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static UserType fromValue(String value) {
		return stringToEnum.get(value);
	}
}
