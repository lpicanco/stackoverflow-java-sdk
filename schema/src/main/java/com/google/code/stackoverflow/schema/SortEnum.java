package com.google.code.stackoverflow.schema;

/**
 * The Interface SortEnum.
 */
public interface SortEnum extends ValueEnum {
	
	/**
	 * The Enum Order.
	 */
	public enum Order implements ValueEnum {
		
		/** The ASCENDING. */
		ASCENDING("asc"), 
 /** The DESCENDING. */
 DESCENDING("desc");

		/** The value. */
		private final String value;

		/**
		 * Instantiates a new order.
		 * 
		 * @param value the value
		 */
		Order(String value) {
			this.value = value;
		}

		/* (non-Javadoc)
		 * @see com.google.code.stackoverflow.schema.ValueEnum#value()
		 */
		@Override
		public String value() {
			return value;
		}
	}

	/**
	 * Order.
	 * 
	 * @return the order
	 */
	public Order order();
}