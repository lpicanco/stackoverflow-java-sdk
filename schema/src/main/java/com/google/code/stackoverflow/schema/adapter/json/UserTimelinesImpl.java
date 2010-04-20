/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.QuestionTimelines;
import com.google.code.stackoverflow.schema.PostTimeline;
import com.google.code.stackoverflow.schema.UserTimelines;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * @author nmukhtar
 *
 */
public class UserTimelinesImpl extends BaseJsonAdapter implements UserTimelines, Adaptable<QuestionTimelines, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5190225278764284533L;
	
	private List<PostTimeline> timelines = new ArrayList<PostTimeline>();

	public List<PostTimeline> getTimelines() {
		return timelines;
	}

	public void setTimelines(List<PostTimeline> timelines) {
		this.timelines = timelines;
	}

	@Override
	public void adaptFrom(JSONObject adaptee) {
		JSONArray timelines = (JSONArray) adaptee.get("usertimelines");
		if (timelines != null) {
			for (Object o : timelines) {			
				TimelineImpl timeline = new TimelineImpl();
				timeline.adaptFrom((JSONObject) o);
				getTimelines().add(timeline);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		JSONArray timelines = new JSONArray();
		for (PostTimeline timeline : getTimelines()) {
			timelines.add(((TimelineImpl) timeline).adaptTo());
		}
		adapter.put("usertimelines", timelines);
		return adapter;
	}
}
