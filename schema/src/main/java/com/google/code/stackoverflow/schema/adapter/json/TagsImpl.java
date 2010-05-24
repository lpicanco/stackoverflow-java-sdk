/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.common.PagedArrayList;
import com.google.code.stackoverflow.common.PagedList;
import com.google.code.stackoverflow.schema.Tag;
import com.google.code.stackoverflow.schema.Tags;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class TagsImpl.
 */
public class TagsImpl extends BaseJsonAdapter implements Tags, Adaptable<Tags, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The tags. */
	private PagedList<Tag> tags = new PagedArrayList<Tag>();

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Tags#getTags()
	 */
	public PagedList<Tag> getTags() {
		return tags;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Tags#setTags(java.util.List)
	 */
	public void setTags(PagedList<Tag> tags) {
		this.tags = tags;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		getTags().setTotal(getLongProperty(adaptee, "total"));
		getTags().setPage(getIntProperty(adaptee, "page"));
		getTags().setPageSize(getIntProperty(adaptee, "pagesize"));
		JSONArray tags = (JSONArray) adaptee.get("tags");
		if (tags != null) {
			for (Object o : tags) {			
				TagImpl tag = new TagImpl();
				tag.adaptFrom((JSONObject) o);
				getTags().add(tag);
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
		JSONArray tags = new JSONArray();
		for (Tag tag : getTags()) {
			tags.add(((TagImpl) tag).adaptTo());
		}
		adapter.put("tags", tags);
		return adapter;
	}
}
