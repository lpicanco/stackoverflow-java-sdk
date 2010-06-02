/**
 * 
 */
package com.google.code.stackexchange.schema;

import java.util.HashMap;
import java.util.Map;

/**
 * The Enum RevisionType.
 */
public enum RevisionType implements ValueEnum {

	/** The SINGL e_ user. */
	SINGLE_USER("single_user"),
	
	/** The VOT e_ based. */
	VOTE_BASED("vote_based");
	
    /** The Constant stringToEnum. */
	private static final Map<String, RevisionType> stringToEnum = new HashMap<String, RevisionType>();

	static { // Initialize map from constant name to enum constant
		for (RevisionType op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new revision type.
     * 
     * @param value the value
     */
    RevisionType(String value) {
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
	 * @return the revision type
	 */
	public static RevisionType fromValue(String value) {
		return stringToEnum.get(value);
	}
	
}
