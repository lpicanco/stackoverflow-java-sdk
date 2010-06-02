/**
 * 
 */
package com.google.code.stackexchange.schema.adapter.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackexchange.common.PagedArrayList;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Question;
import com.google.code.stackexchange.schema.Questions;
import com.google.code.stackexchange.schema.adapter.Adaptable;

/**
 * The Class QuestionsImpl.
 */
public class QuestionsImpl extends BaseJsonAdapter implements Questions, Adaptable<Questions, JSONObject> {

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
	public void adaptFrom(JSONObject adaptee) {
		getQuestions().setTotal(getLongProperty(adaptee, "total"));
		getQuestions().setPage(getIntProperty(adaptee, "page"));
		getQuestions().setPageSize(getIntProperty(adaptee, "pagesize"));
		JSONArray questions = (JSONArray) adaptee.get("questions");
		if (questions != null) {
			for (Object o : questions) {			
				QuestionImpl question = new QuestionImpl();
				question.adaptFrom((JSONObject) o);
				getQuestions().add(question);
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
		JSONArray questions = new JSONArray();
		for (Question question : getQuestions()) {
			questions.add(((QuestionImpl) question).adaptTo());
		}
		adapter.put("questions", questions);
		return adapter;
	}
}
