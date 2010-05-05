/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.Question;
import com.google.code.stackoverflow.schema.Questions;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class QuestionsImpl.
 */
public class QuestionsImpl extends BaseJsonAdapter implements Questions, Adaptable<Questions, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The questions. */
	private List<Question> questions = new ArrayList<Question>();

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Questions#getQuestions()
	 */
	public List<Question> getQuestions() {
		return questions;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Questions#setQuestions(java.util.List)
	 */
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
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
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptTo()
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
