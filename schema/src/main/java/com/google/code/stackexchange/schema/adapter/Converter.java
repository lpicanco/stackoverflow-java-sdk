/**
 *
 */
package com.google.code.stackexchange.schema.adapter;

/**
 * The Interface Converter.
 */
public interface Converter<Source, Destination> {

    /**
     * Convert.
     * 
     * @param source the source
     * 
     * @return the destination
     */
    public Destination convert(Source source);
}
