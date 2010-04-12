package com.google.code.stackoverflow.schema;

import java.util.HashMap;
import java.util.Map;

public interface Tag extends SchemaEntity {
	
	public enum SortOrder implements SortEnum {
		MOST_POPULAR("popular", Order.ASCENDING),
		LEAST_POPULAR("popular", Order.DESCENDING),
		NAME_ASCENDING("name", Order.ASCENDING),
		NAME_DESCENDING("name", Order.DESCENDING),
		MOST_RECENTLY_UPDATED("activity", Order.ASCENDING),
		LEAST_RECENTLY_UPDATED("activity", Order.DESCENDING);
		
	    /**
	     * Field Description.
	     */
		private static final Map<String, SortOrder> stringToEnum = new HashMap<String, SortOrder>();

		static { // Initialize map from constant name to enum constant
			for (SortOrder op : values()) {
				stringToEnum.put(op.value(), op);
			}
		}
		
	    /** Field description */
	    private final String value;
	    
	    /** Field description */
	    private final Order order;
	    
	    /**
	     * Constructs ...
	     *
	     *
	     * @param name
	     */
	    SortOrder(String value, Order order) {
	        this.value = value;
	        this.order = order;
	    }

		@Override
		public String value() {
			return value;
		}
		
		public static SortOrder fromValue(String value) {
			return stringToEnum.get(value);
		}

		@Override
		public Order order() {
			return order;
		}
	}
	
	/**
	 * @return the name
	 */
	public String getName();

	/**
	 * @param name the name to set
	 */
	public void setName(String name);

	/**
	 * @return the count
	 */
	public long getCount();

	/**
	 * @param count the count to set
	 */
	public void setCount(long count);

}