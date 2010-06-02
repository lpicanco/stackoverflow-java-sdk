
package com.google.code.stackexchange.schema;

import java.util.Date;



/**
 * The Interface Error.
 */
public interface Error
    extends SchemaEntity
{
	
	/**
	 * Gets the timestamp.
	 * 
	 * @return the timestamp
	 */
    Date getTimestamp();

    /**
     * Sets the timestamp.
     * 
     * @param value the new timestamp
     */
    void setTimestamp(Date value);

    /**
     * Gets the error code.
     * 
     * @return the error code
     */
    int getErrorCode();

    /**
     * Sets the error code.
     * 
     * @param value the new error code
     */
    void setErrorCode(int value);

    /**
     * Gets the status code.
     * 
     * @return the status code
     */
    int getStatusCode();

    /**
     * Sets the status code.
     * 
     * @param value the new status code
     */
    void setStatusCode(int value);
    
    /**
     * Gets the message.
     * 
     * @return the message
     */
    String getMessage();

    /**
     * Sets the message.
     * 
     * @param value the new message
     */
    void setMessage(String value);
}
