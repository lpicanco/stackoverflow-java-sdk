/**
 * 
 */
package com.google.code.stackexchange.schema;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 * The Class BaseJsonAdapter.
 */
public abstract class SchemaEntity implements Serializable {

	/** The logger. */
    protected transient final Logger logger = Logger.getLogger(getClass().getCanonicalName());
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 250056223059654638L;
}
