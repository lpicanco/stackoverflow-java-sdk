/**
 * 
 */
package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;

/**
 * The Enum BadgeRank.
 */
public enum BadgeRank implements ValueEnum {
	
	/** The GOLD. */
	GOLD("gold"),
	
	/** The SILVER. */
	SILVER("silver"),
	
	/** The BRONZE. */
	BRONZE("bronze");

    /** The Constant stringToEnum. */
	private static final Map<String, BadgeRank> stringToEnum = new HashMap<String, BadgeRank>();

	static { // Initialize map from constant name to enum constant
		for (BadgeRank op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new badge rank.
     * 
     * @param value the value
     */
    BadgeRank(String value) {
        this.value = value;
    }

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.ValueEnum#value()
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
	 * @return the badge rank
	 */
	public static BadgeRank fromValue(String value) {
		return stringToEnum.get(value);
	}
}
