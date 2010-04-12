package com.google.code.stackoverflow.schema;

public interface SortEnum extends ValueEnum {
	public enum Order implements ValueEnum {
		ASCENDING("asc"), DESCENDING("desc");

		/** Field description */
		private final String value;

		/**
		 * Constructs ...
		 * 
		 * 
		 * @param name
		 */
		Order(String value) {
			this.value = value;
		}

		@Override
		public String value() {
			return value;
		}
	}

	/**
	 * @return the order of the field
	 */
	public Order order();
}