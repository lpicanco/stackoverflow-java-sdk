package com.google.code.stackexchange.schema;

import java.util.HashMap;
import java.util.Map;

/**
 * The Interface Tag.
 */
public interface Tag extends SchemaEntity {
	
	/**
	 * The Enum SortOrder.
	 */
	public enum SortOrder implements SortEnum {
		
		/** The MOS t_ popular. */
		MOST_POPULAR("popular", Order.ASCENDING),
		
		/** The LEAS t_ popular. */
		LEAST_POPULAR("popular", Order.DESCENDING),
		
		/** The NAM e_ ascending. */
		NAME_ASCENDING("name", Order.ASCENDING),
		
		/** The NAM e_ descending. */
		NAME_DESCENDING("name", Order.DESCENDING),
		
		/** The MOS t_ recentl y_ updated. */
		MOST_RECENTLY_UPDATED("activity", Order.ASCENDING),
		
		/** The LEAS t_ recentl y_ updated. */
		LEAST_RECENTLY_UPDATED("activity", Order.DESCENDING);
		
	    /** The Constant stringToEnum. */
		private static final Map<String, SortOrder> stringToEnum = new HashMap<String, SortOrder>();

		static { // Initialize map from constant name to enum constant
			for (SortOrder op : values()) {
				stringToEnum.put(op.value(), op);
			}
		}
		
	    /** The value. */
	    private final String value;
	    
	    /** The order. */
	    private final Order order;
	    
	    /**
    	 * Instantiates a new sort order.
    	 * 
    	 * @param value the value
    	 * @param order the order
    	 */
	    SortOrder(String value, Order order) {
	        this.value = value;
	        this.order = order;
	    }

		/* (non-Javadoc)
		 * @see com.google.code.stackexchange.schema.ValueEnum#value()
		 */
		@Override
		public String value() {
			return value;
		}
		
		/**
		 * From value.
		 * 
		 * @param value the value
		 * 
		 * @return the sort order
		 */
		public static SortOrder fromValue(String value) {
			return stringToEnum.get(value);
		}

		/* (non-Javadoc)
		 * @see com.google.code.stackexchange.schema.SortEnum#order()
		 */
		@Override
		public Order order() {
			return order;
		}
	}
	
	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName();

	/**
	 * Sets the name.
	 * 
	 * @param name the new name
	 */
	public void setName(String name);

	/**
	 * Gets the count.
	 * 
	 * @return the count
	 */
	public long getCount();

	/**
	 * Sets the count.
	 * 
	 * @param count the new count
	 */
	public void setCount(long count);
	
	/**
	 * @return the fulfillsRequired
	 */
	public boolean isFulfillsRequired();

	/**
	 * @param fulfillsRequired the fulfillsRequired to set
	 */
	public void setFulfillsRequired(boolean fulfillsRequired);
	
	/**
	 * Gets the user id.
	 * 
	 * @return the user id
	 */
	public long getUserId();

	/**
	 * Sets the user id.
	 * 
	 * @param userId the new user id
	 */
	public void setUserId(long userId);
}