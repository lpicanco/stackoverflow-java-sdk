/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.Revision;
import com.google.code.stackoverflow.schema.Revisions;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class RevisionsImpl.
 */
public class RevisionsImpl extends BaseJsonAdapter implements Revisions, Adaptable<Revisions, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The revisions. */
	private List<Revision> revisions = new ArrayList<Revision>();

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Revisions#getRevisions()
	 */
	public List<Revision> getRevisions() {
		return revisions;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Revisions#setRevisions(java.util.List)
	 */
	public void setRevisions(List<Revision> revisions) {
		this.revisions = revisions;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		JSONArray revisions = (JSONArray) adaptee.get("revisions");
		if (revisions != null) {
			for (Object o : revisions) {			
				RevisionImpl revision = new RevisionImpl();
				revision.adaptFrom((JSONObject) o);
				getRevisions().add(revision);
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
		JSONArray revisions = new JSONArray();
		for (Revision revision : getRevisions()) {
			revisions.add(((RevisionImpl) revision).adaptTo());
		}
		adapter.put("revisions", revisions);
		return adapter;
	}
}
