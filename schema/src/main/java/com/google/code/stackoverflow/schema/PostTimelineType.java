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
public enum PostTimelineType implements ValueEnum {

	VOTES("votes"),
	COMMENT("comment"),
	ANSWER("answer"),
	QUESTION("question"),
	REVISION("revision");
	
    /**
     * Field Description.
     */
	private static final Map<String, PostTimelineType> stringToEnum = new HashMap<String, PostTimelineType>();

	static { // Initialize map from constant name to enum constant
		for (PostTimelineType op : values()) {
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
    PostTimelineType(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static PostTimelineType fromValue(String value) {
		return stringToEnum.get(value);
	}
	
}
