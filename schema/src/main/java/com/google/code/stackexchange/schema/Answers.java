/**
 * 
 */
package com.google.code.stackexchange.schema;

import com.google.code.stackexchange.common.PagedArrayList;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Answer;
import com.google.code.stackexchange.schema.Answers;
import com.google.code.stackexchange.schema.adapter.Adaptable;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * The Class AnswersImpl.
 */
public class Answers extends SchemaEntity implements Adaptable<PagedList<Answer>, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	@Override
	public PagedList<Answer> adaptFrom(JsonObject adaptee) {
		PagedList<Answer> list = new PagedArrayList<Answer>();
		list.setTotal(adaptee.get("total").getAsLong());
		list.setPage(adaptee.get("page").getAsInt());
		list.setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray answers = adaptee.get("answers").getAsJsonArray();
		if (answers != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : answers) {			
				list.add(gson.fromJson(o, Answer.class));
			}
		}
		return list;
	}

	@Override
	public JsonObject adaptTo(PagedList<Answer> adapter) {
		return (JsonObject) getGsonBuilder().create().toJsonTree(adapter);
	}
}
