package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;


public enum PostType implements ValueEnum {
	ANSWER("answer"),
	COMMENT("comment"),
	QUESTION("question");
	
    /**
     * Field Description.
     */
	private static final Map<String, PostType> stringToEnum = new HashMap<String, PostType>();

	static { // Initialize map from constant name to enum constant
		for (PostType op : values()) {
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
    PostType(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	public static PostType fromValue(String value) {
		return stringToEnum.get(value);
	}
}
