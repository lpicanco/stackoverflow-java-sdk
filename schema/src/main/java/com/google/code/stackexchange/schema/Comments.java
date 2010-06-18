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
public class Comments extends SchemaEntity implements Adaptable<Comments, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The comments. */
	private PagedList<Comment> comments = new PagedArrayList<Comment>();

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Comments#getComments()
	 */
	public PagedList<Comment> getComments() {
		return comments;
	}

	/**
	 * @see com.google.code.stackexchange.schema.Comments#setComments(java.util.List)
	 */
	public void setComments(PagedList<Comment> comments) {
		this.comments = comments;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JsonObject adaptee) {
		getComments().setTotal(adaptee.get("total").getAsLong());
		getComments().setPage(adaptee.get("page").getAsInt());
		getComments().setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray comments = adaptee.get("comments").getAsJsonArray();
		if (comments != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : comments) {			
				getComments().add(gson.fromJson(o, Comment.class));
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JsonObject adaptTo() {
		return (JsonObject) getGsonBuilder().create().toJsonTree(this);
	}
}
