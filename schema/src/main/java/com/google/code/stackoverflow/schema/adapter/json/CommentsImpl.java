/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.Comment;
import com.google.code.stackoverflow.schema.Comments;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class CommentsImpl.
 */
public class CommentsImpl extends BaseJsonAdapter implements Comments, Adaptable<Comments, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The comments. */
	private List<Comment> comments = new ArrayList<Comment>();

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comments#getComments()
	 */
	public List<Comment> getComments() {
		return comments;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Comments#setComments(java.util.List)
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
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
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptTo()
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
