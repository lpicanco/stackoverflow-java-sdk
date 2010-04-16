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
public enum RevisionType implements ValueEnum {

	SINGLE_USER("single_user"),
	VOTE_BASED("vote_based");
	
    /**
     * Field Description.
     */
	private static final Map<String, RevisionType> stringToEnum = new HashMap<String, RevisionType>();

	static { // Initialize map from constant name to enum constant
		for (RevisionType op : values()) {
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
    RevisionType(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static RevisionType fromValue(String value) {
		return stringToEnum.get(value);
	}
	
}
