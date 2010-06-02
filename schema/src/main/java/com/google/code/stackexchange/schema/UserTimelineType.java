/**
 * 
 */
package com.google.code.stackexchange.schema;

import java.util.HashMap;
import java.util.Map;

/**
 * The Enum UserTimelineType.
 */
public enum UserTimelineType implements ValueEnum {

	/** The BADGE. */
	BADGE("badge"),
	
	/** The COMMENT. */
	COMMENT("comment"),
	
	/** The AS k_ o r_ answered. */
	ASK_OR_ANSWERED("askoranswered"),
	
	/** The ACCEPTED. */
	ACCEPTED("accepted"),
	
	/** The REVISION. */
	REVISION("revision");
	
    /** The Constant stringToEnum. */
	private static final Map<String, UserTimelineType> stringToEnum = new HashMap<String, UserTimelineType>();

	static { // Initialize map from constant name to enum constant
		for (UserTimelineType op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new user timeline type.
     * 
     * @param value the value
     */
    UserTimelineType(String value) {
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
	 * @return the user timeline type
	 */
	public static UserTimelineType fromValue(String value) {
		return stringToEnum.get(value);
	}
	
}
