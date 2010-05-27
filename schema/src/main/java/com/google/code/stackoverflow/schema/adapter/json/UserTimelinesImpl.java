/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.common.PagedArrayList;
import com.google.code.stackoverflow.common.PagedList;
import com.google.code.stackoverflow.schema.UserTimeline;
import com.google.code.stackoverflow.schema.UserTimelines;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class UserTimelinesImpl.
 */
public class UserTimelinesImpl extends BaseJsonAdapter implements UserTimelines, Adaptable<UserTimelines, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The timelines. */
	private PagedList<UserTimeline> timelines = new PagedArrayList<UserTimeline>();

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimelines#getTimelines()
	 */
	public PagedList<UserTimeline> getTimelines() {
		return timelines;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.UserTimelines#setTimelines(java.util.List)
	 */
	public void setTimelines(PagedList<UserTimeline> timelines) {
		this.timelines = timelines;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		getTimelines().setTotal(getLongProperty(adaptee, "total"));
		getTimelines().setPage(getIntProperty(adaptee, "page"));
		getTimelines().setPageSize(getIntProperty(adaptee, "pagesize"));
		JSONArray timelines = (JSONArray) adaptee.get("user_timelines");
		if (timelines != null) {
			for (Object o : timelines) {			
				UserTimelineImpl timeline = new UserTimelineImpl();
				timeline.adaptFrom((JSONObject) o);
				getTimelines().add(timeline);
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
		JSONArray timelines = new JSONArray();
		for (UserTimeline timeline : getTimelines()) {
			timelines.add(((UserTimelineImpl) timeline).adaptTo());
		}
		adapter.put("usertimelines", timelines);
		return adapter;
	}
}
