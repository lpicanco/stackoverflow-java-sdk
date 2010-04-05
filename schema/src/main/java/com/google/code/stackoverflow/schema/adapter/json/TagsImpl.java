/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.Tag;
import com.google.code.stackoverflow.schema.Tags;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class TagsImpl extends BaseJsonAdapter implements Tags, Adaptable<Tags, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5190225278764284533L;
	
	private List<Tag> tags = new ArrayList<Tag>();

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
		JSONArray tags = (JSONArray) adaptee.get("tags");
		if (tags != null) {
			for (Object o : tags) {			
				TagImpl tag = new TagImpl();
				tag.adaptFrom((JSONObject) o);
				getTags().add(tag);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		JSONArray tags = new JSONArray();
		for (Tag tag : getTags()) {
			tags.add(((TagImpl) tag).adaptTo());
		}
		adapter.put("tags", tags);
		return adapter;
	}
}
