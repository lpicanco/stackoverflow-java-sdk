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
public enum UserTimelineType implements ValueEnum {

	BADGE("badge"),
	COMMENT("comment"),
	ASK_OR_ANSWERED("askoranswered"),
	ACCEPTED("accepted"),
	REVISION("revision");
	
    /**
     * Field Description.
     */
	private static final Map<String, UserTimelineType> stringToEnum = new HashMap<String, UserTimelineType>();

	static { // Initialize map from constant name to enum constant
		for (UserTimelineType op : values()) {
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
    UserTimelineType(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static UserTimelineType fromValue(String value) {
		return stringToEnum.get(value);
	}
	
}
