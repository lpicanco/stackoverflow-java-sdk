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
public class Answers extends SchemaEntity implements Adaptable<Answers, JsonObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The answers. */
	private PagedList<Answer> answers = new PagedArrayList<Answer>();

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Answers#getAnswers()
	 */
	public PagedList<Answer> getAnswers() {
		return answers;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.Answers#setAnswers(java.util.List)
	 */
	public void setAnswers(PagedList<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public void adaptFrom(JsonObject adaptee) {
		getAnswers().setTotal(adaptee.get("total").getAsLong());
		getAnswers().setPage(adaptee.get("page").getAsInt());
		getAnswers().setPageSize(adaptee.get("pagesize").getAsInt());
		JsonArray answers = adaptee.get("answers").getAsJsonArray();
		if (answers != null) {
			Gson gson = getGsonBuilder().create();
			for (JsonElement o : answers) {			
				getAnswers().add(gson.fromJson(o, Answer.class));
			}
		}
	}

	@Override
	public JsonObject adaptTo() {
		return (JsonObject) getGsonBuilder().create().toJsonTree(this);
	}
}
