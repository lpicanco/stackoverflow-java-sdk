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
 * @author nmukhtar
 *
 */
public class ReputationsImpl extends BaseJsonAdapter implements Reputations, Adaptable<Reputations, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5190225278764284533L;
	
	private List<Reputation> reputations = new ArrayList<Reputation>();

	public List<Reputation> getReputations() {
		return reputations;
	}

	public void setReputations(List<Reputation> reputations) {
		this.reputations = reputations;
	}

	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
		JSONArray reputations = (JSONArray) adaptee.get("repchanges");
		if (reputations != null) {
			for (Object o : reputations) {			
				ReputationImpl reputation = new ReputationImpl();
				reputation.adaptFrom((JSONObject) o);
				getReputations().add(reputation);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		JSONArray reputations = new JSONArray();
		for (Reputation reputation : getReputations()) {
			reputations.add(((ReputationImpl) reputation).adaptTo());
		}
		adapter.put("repchanges", reputations);
		return adapter;
	}
}
