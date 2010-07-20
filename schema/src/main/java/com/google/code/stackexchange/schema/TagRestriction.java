package com.google.code.stackexchange.schema;

import java.util.HashMap;
import java.util.Map;

public enum TagRestriction implements ValueEnum {
	ANONYMOUS("anonymous"), UNREGISTERED("unregistered"), REGISTERED("registered"), MODERATOR("moderator");
	
    /** The Constant stringToEnum. */
	private static final Map<String, TagRestriction> stringToEnum = new HashMap<String, TagRestriction>();

	static { // Initialize map from constant name to enum constant
		for (TagRestriction op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new post timeline type.
     * 
     * @param value the value
     */
    TagRestriction(String value) {
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
	 * @return the post timeline type
	 */
	public static TagRestriction fromValue(String value) {
		return stringToEnum.get(value);
	}
}
