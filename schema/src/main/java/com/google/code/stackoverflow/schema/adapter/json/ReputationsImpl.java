/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.Reputations;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class ReputationsImpl.
 */
public class ReputationsImpl extends BaseJsonAdapter implements Reputations, Adaptable<Reputations, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The reputations. */
	private List<Reputation> reputations = new ArrayList<Reputation>();

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputations#getReputations()
	 */
	public List<Reputation> getReputations() {
		return reputations;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputations#setReputations(java.util.List)
	 */
	public void setReputations(List<Reputation> reputations) {
		this.reputations = reputations;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		JSONArray reputations = (JSONArray) adaptee.get("repchanges");
		if (reputations != null) {
			for (Object o : reputations) {			
				ReputationImpl reputation = new ReputationImpl();
				reputation.adaptFrom((JSONObject) o);
				getReputations().add(reputation);
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
		JSONArray reputations = new JSONArray();
		for (Reputation reputation : getReputations()) {
			reputations.add(((ReputationImpl) reputation).adaptTo());
		}
		adapter.put("repchanges", reputations);
		return adapter;
	}
}
