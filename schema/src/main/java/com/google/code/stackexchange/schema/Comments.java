/**
 * 
 */
package com.google.code.stackexchange.schema;

import com.google.code.stackexchange.common.PagedArrayList;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Comment;
import com.google.code.stackexchange.schema.Comments;
import com.google.code.stackexchange.schema.adapter.Adaptable;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * The Class CommentsImpl.
 */
public class Comments extends SchemaEntity implements Adaptable<PagedList<Comment>, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public PagedList<Comment> adaptFrom(JsonObject adaptee) {
		PagedList<Comment> list = new PagedArrayList<Comment>();
		list.setTotal(adaptee.get("total").getAsLong());
		list.setPage(adaptee.get("page").getAsInt());
		list.setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray comments = adaptee.get("comments").getAsJsonArray();
		if (comments != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : comments) {			
				list.add(gson.fromJson(o, Comment.class));
			}
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JsonObject adaptTo(PagedList<Comment> adapter) {
		return (JsonObject) getGsonBuilder().create().toJsonTree(adapter);
	}
}
