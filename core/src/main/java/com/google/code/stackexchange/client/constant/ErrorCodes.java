/**
 * 
 */
package com.google.code.stackexchange.client.constant;

/**
 * The Interface ErrorCodes.
 */
public interface ErrorCodes {
	
	/** The NO t_ found. */
	public int NOT_FOUND = 404;
	
	/** The INTERNA l_ serve r_ error. */
	public int INTERNAL_SERVER_ERROR = 500;
	
	/** The INVALI d_ applicatio n_ key. */
	public int INVALID_APPLICATION_KEY = 4000;
	
	/** The INVALI d_ pag e_ size. */
	public int INVALID_PAGE_SIZE = 4001;
	
	/** The INVALI d_ sort. */
	public int INVALID_SORT = 4002;
	
	/** The INVALI d_ order. */
	public int INVALID_ORDER = 4003;
	
	/** The REQUES t_ limi t_ exceeded. */
	public int REQUEST_LIMIT_EXCEEDED = 4004;
	
	/** The INVALI d_ vecto r_ format. */
	public int INVALID_VECTOR_FORMAT = 4005;
	
	/** The TO o_ man y_ ids. */
	public int TOO_MANY_IDS = 4006;
	
	/** The UNCONSTRAINE d_ search. */
	public int UNCONSTRAINED_SEARCH = 4007;
}