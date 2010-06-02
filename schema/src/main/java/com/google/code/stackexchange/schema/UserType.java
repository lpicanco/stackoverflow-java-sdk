package com.google.code.stackexchange.schema;

import java.util.HashMap;
import java.util.Map;

/**
 * The Enum UserType.
 */
public enum UserType implements ValueEnum {
	
	/** The MODERATOR. */
	MODERATOR("moderator"),
	
	/** The REGISTERED. */
	REGISTERED("registered"),
	
	/** The UNREGISTERED. */
	UNREGISTERED("unregistered");
	
    /** The Constant stringToEnum. */
	private static final Map<String, UserType> stringToEnum = new HashMap<String, UserType>();

	static { // Initialize map from constant name to enum constant
		for (UserType op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new user type.
     * 
     * @param value the value
     */
    UserType(String value) {
        this.value = value;
    }

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.ValueEnum#value()
	 */
	@Override
	public String value() {
		return value;
	}
	
	/**
	 * From value.
	 * 
	 * @param value the value
	 * 
	 * @return the user type
	 */
	public static UserType fromValue(String value) {
		return stringToEnum.get(value);
	}
}
