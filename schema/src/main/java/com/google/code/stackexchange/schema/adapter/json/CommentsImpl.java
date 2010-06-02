/**
 * 
 */
package com.google.code.stackexchange.schema.adapter.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackexchange.common.PagedArrayList;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Comment;
import com.google.code.stackexchange.schema.Comments;
import com.google.code.stackexchange.schema.adapter.Adaptable;

/**
 * The Class CommentsImpl.
 */
public class CommentsImpl extends BaseJsonAdapter implements Comments, Adaptable<Comments, JSONObject> {

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
	public void adaptFrom(JSONObject adaptee) {
		getComments().setTotal(getLongProperty(adaptee, "total"));
		getComments().setPage(getIntProperty(adaptee, "page"));
		getComments().setPageSize(getIntProperty(adaptee, "pagesize"));
		JSONArray comments = (JSONArray) adaptee.get("comments");
		if (comments != null) {
			for (Object o : comments) {			
				CommentImpl comment = new CommentImpl();
				comment.adaptFrom((JSONObject) o);
				getComments().add(comment);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		JSONArray comments = new JSONArray();
		for (Comment comment : getComments()) {
			comments.add(((CommentImpl) comment).adaptTo());
		}
		adapter.put("comments", comments);
		return adapter;
	}
}
