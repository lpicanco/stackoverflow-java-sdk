/**
 * 
 */
package com.google.code.stackexchange.schema;

/**
 * The Class Range.
 */
public final class Range {
	
	/** The min. */
	private long min;
	
	/** The max. */
	private long max;
	
	/**
	 * Instantiates a new range.
	 * 
	 * @param min the min
	 * @param max the max
	 */
	public Range(long min, long max) {
		this.min = min;
		this.max = max;
	}
	
	/**
	 * Gets the min.
	 * 
	 * @return the min
	 */
	public long getMin() {
		return min;
	}
	
	/**
	 * Gets the max.
	 * 
	 * @return the max
	 */
	public long getMax() {
		return max;
	}
}