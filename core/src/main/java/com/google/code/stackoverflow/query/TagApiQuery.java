/**
 * 
 */
package com.google.code.stackoverflow.query;

import com.google.code.stackoverflow.schema.Paging;
import com.google.code.stackoverflow.schema.SortEnum;
import com.google.code.stackoverflow.schema.Tag;

/**
 * @author nmukhtar
 *
 */
public interface TagApiQuery extends StackOverflowApiQuery<Tag> {
	
	/**
	 * 
	 */
	public TagApiQuery withUserIds(long... userIds);
	
	/**
	 * 
	 */
	public TagApiQuery withPaging(Paging paging);

	/**
	 * 
	 */
	public TagApiQuery withSort(SortEnum sort);
}
