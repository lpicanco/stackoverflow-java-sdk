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
public enum TimelineType implements ValueEnum {

	VOTES("votes"),
	COMMENT("comment"),
	ANSWER("answer"),
	REVISION("revision");
	
    /**
     * Field Description.
     */
	private static final Map<String, TimelineType> stringToEnum = new HashMap<String, TimelineType>();

	static { // Initialize map from constant name to enum constant
		for (TimelineType op : values()) {
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
    TimelineType(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static TimelineType fromValue(String value) {
		return stringToEnum.get(value);
	}
	
}
