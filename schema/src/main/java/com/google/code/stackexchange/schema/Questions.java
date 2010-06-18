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
public class Questions extends SchemaEntity implements Adaptable<Questions, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The questions. */
	private PagedList<Question> questions = new PagedArrayList<Question>();

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Questions#getQuestions()
	 */
	public PagedList<Question> getQuestions() {
		return questions;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Questions#setQuestions(java.util.List)
	 */
	public void setQuestions(PagedList<Question> questions) {
		this.questions = questions;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JsonObject adaptee) {
		getQuestions().setTotal(adaptee.get("total").getAsLong());
		getQuestions().setPage(adaptee.get("page").getAsInt());
		getQuestions().setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray questions = adaptee.get("questions").getAsJsonArray();
		if (questions != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : questions) {			
				getQuestions().add(gson.fromJson(o, Question.class));
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JsonObject adaptTo() {
		return (JsonObject) getGsonBuilder().create().toJsonTree(this);
	}
}
