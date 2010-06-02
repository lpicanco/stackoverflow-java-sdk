/**
 * 
 */
package com.google.code.stackexchange.schema.adapter.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackexchange.common.PagedArrayList;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Reputation;
import com.google.code.stackexchange.schema.Reputations;
import com.google.code.stackexchange.schema.adapter.Adaptable;

/**
 * The Class ReputationsImpl.
 */
public class ReputationsImpl extends BaseJsonAdapter implements Reputations, Adaptable<Reputations, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The reputations. */
	private PagedList<Reputation> reputations = new PagedArrayList<Reputation>();

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputations#getReputations()
	 */
	public PagedList<Reputation> getReputations() {
		return reputations;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Reputations#setReputations(java.util.List)
	 */
	public void setReputations(PagedList<Reputation> reputations) {
		this.reputations = reputations;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		getReputations().setTotal(getLongProperty(adaptee, "total"));
		getReputations().setPage(getIntProperty(adaptee, "page"));
		getReputations().setPageSize(getIntProperty(adaptee, "pagesize"));
		JSONArray reputations = (JSONArray) adaptee.get("rep_changes");
		if (reputations != null) {
			for (Object o : reputations) {			
				ReputationImpl reputation = new ReputationImpl();
				reputation.adaptFrom((JSONObject) o);
				getReputations().add(reputation);
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
		JSONArray reputations = new JSONArray();
		for (Reputation reputation : getReputations()) {
			reputations.add(((ReputationImpl) reputation).adaptTo());
		}
		adapter.put("repchanges", reputations);
		return adapter;
	}
}
