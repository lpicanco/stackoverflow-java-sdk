/**
 *
 */
package com.google.code.stackexchange.schema.adapter;

/**
 * The Interface Adaptable.
 */
public interface Adaptable<Adapter, Adaptee> {

    /**
     * Adapt from.
     * 
     * @param adaptee the adaptee
     * @return TODO
     */
    public Adapter adaptFrom(Adaptee adaptee);

    /**
     * Adapt to.
     * @param adapter TODO
     * 
     * @return the adaptee
     */
    public Adaptee adaptTo(Adapter adapter);
}
