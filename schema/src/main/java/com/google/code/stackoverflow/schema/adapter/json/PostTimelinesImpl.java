/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.PostTimelines;
import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class PostTimelinesImpl.
 */
public class PostTimelinesImpl extends BaseJsonAdapter implements PostTimelines, Adaptable<PostTimelines, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The timelines. */
	private List<PostTimeline> timelines = new ArrayList<PostTimeline>();

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimelines#getTimelines()
	 */
	public List<PostTimeline> getTimelines() {
		return timelines;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.PostTimelines#setTimelines(java.util.List)
	 */
	public void setTimelines(List<PostTimeline> timelines) {
		this.timelines = timelines;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		JSONArray timelines = (JSONArray) adaptee.get("post_timelines");
		if (timelines != null) {
			for (Object o : timelines) {			
				PostTimelineImpl timeline = new PostTimelineImpl();
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
		for (PostTimeline timeline : getTimelines()) {
			timelines.add(((PostTimelineImpl) timeline).adaptTo());
		}
		adapter.put("post_timelines", timelines);
		return adapter;
	}
}
