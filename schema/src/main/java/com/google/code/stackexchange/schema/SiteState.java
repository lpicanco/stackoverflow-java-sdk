/**
 * 
 */
package com.google.code.stackexchange.schema;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nmukhtar
 *
 */
public enum SiteState implements ValueEnum {
	NORMAL("normal"),
	CLOSED_BETA("closed_beta"),
	OPEN_BETA("open_beta"),
	LINKED_META("linked_meta");
	
    /** The Constant stringToEnum. */
	private static final Map<String, SiteState> stringToEnum = new HashMap<String, SiteState>();

	static { // Initialize map from constant name to enum constant
		for (SiteState op : values()) {
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
    SiteState(String value) {
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
	public static SiteState fromValue(String value) {
		return stringToEnum.get(value);
	}
}
