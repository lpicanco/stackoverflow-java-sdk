/**
 * 
 */
package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nmukhtar
 *
 */
public enum BadgeRank implements ValueEnum {
	GOLD("gold"),
	SILVER("silver"),
	BRONZE("bronze");

    /**
     * Field Description.
     */
	private static final Map<String, BadgeRank> stringToEnum = new HashMap<String, BadgeRank>();

	static { // Initialize map from constant name to enum constant
		for (BadgeRank op : values()) {
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
    BadgeRank(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static BadgeRank fromValue(String value) {
		return stringToEnum.get(value);
	}
}
