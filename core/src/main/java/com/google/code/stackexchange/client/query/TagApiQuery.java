/**
 * 
 */
package com.google.code.stackexchange.client.query;

import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.Range;
import com.google.code.stackexchange.schema.Tag;
import com.google.code.stackexchange.schema.TimePeriod;

/**
 * The Interface TagApiQuery.
 */
public interface TagApiQuery extends StackExchangeApiQuery<Tag> {
	
	/**
	 * List by user.
	 * 
	 * @return the paged list< tag>
	 */
	public PagedList<Tag> listByUser();
	
	/**
	 * With user ids.
	 * 
	 * @param userIds the user ids
	 * 
	 * @return the tag api query
	 */
	public TagApiQuery withUserIds(long... userIds);
	
	/**
	 * With paging.
	 * 
	 * @param paging the paging
	 * 
	 * @return the tag api query
	 */
	public TagApiQuery withPaging(Paging paging);

	/**
	 * With sort.
	 * 
	 * @param sort the sort
	 * 
	 * @return the tag api query
	 */
	public TagApiQuery withSort(Tag.SortOrder sort);
	
	/**
	 * With range.
	 * 
	 * @param range the range
	 * 
	 * @return the tag api query
	 */
	public TagApiQuery withRange(Range range);
	
	public TagApiQuery withFilter(String filter);
	
	public TagApiQuery withTimePeriod(TimePeriod timePeriod);
}
