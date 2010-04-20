/**
 *
 */
package com.google.code.stackoverflow.schema.adapter;

/**
 * @author nmukhtar
 *
 *
 * @param <Adapter>
 * @param <Adaptee>
 */
public interface Converter<Source, Destination> {

    /**
     * Method description
     *
     *
     * @param source
     */
    public Destination convert(Source source);
}
