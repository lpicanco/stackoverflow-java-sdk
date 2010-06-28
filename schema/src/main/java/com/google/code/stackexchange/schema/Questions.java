/**
 * 
 */
package com.google.code.stackexchange.schema;

import com.google.code.stackexchange.common.PagedArrayList;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Question;
import com.google.code.stackexchange.schema.Questions;
import com.google.code.stackexchange.schema.adapter.Adaptable;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * The Class QuestionsImpl.
 */
public class Questions extends SchemaEntity implements Adaptable<PagedList<Question>, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public PagedList<Question> adaptFrom(JsonObject adaptee) {
		PagedList<Question> list = new PagedArrayList<Question>();		
		list.setTotal(adaptee.get("total").getAsLong());
		list.setPage(adaptee.get("page").getAsInt());
		list.setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray questions = adaptee.get("questions").getAsJsonArray();
		if (questions != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : questions) {			
				list.add(gson.fromJson(o, Question.class));
			}
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JsonObject adaptTo(PagedList<Question> adapter) {
		return (JsonObject) getGsonBuilder().create().toJsonTree(adapter);
	}
}
