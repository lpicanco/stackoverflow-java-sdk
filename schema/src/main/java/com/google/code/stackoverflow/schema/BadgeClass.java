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
public enum BadgeClass implements ValueEnum {
	GOLD("gold"),
	SILVER("silver"),
	BRONZE("bronze");

    /**
     * Field Description.
     */
	private static final Map<String, BadgeClass> stringToEnum = new HashMap<String, BadgeClass>();

	static { // Initialize map from constant name to enum constant
		for (BadgeClass op : values()) {
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
    BadgeClass(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static BadgeClass fromValue(String value) {
		return stringToEnum.get(value);
	}
}
