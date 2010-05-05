/**
 * 
 */
package com.google.code.stackoverflow.schema.adapter.json;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.Answer;
import com.google.code.stackoverflow.schema.Answers;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class AnswersImpl.
 */
public class AnswersImpl extends BaseJsonAdapter implements Answers, Adaptable<Answers, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5190225278764284533L;
	
	/** The answers. */
	private List<Answer> answers = new ArrayList<Answer>();

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answers#getAnswers()
	 */
	public List<Answer> getAnswers() {
		return answers;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Answers#setAnswers(java.util.List)
	 */
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		JSONArray answers = (JSONArray) adaptee.get("answers");
		if (answers != null) {
			for (Object o : answers) {			
				AnswerImpl answer = new AnswerImpl();
				answer.adaptFrom((JSONObject) o);
				getAnswers().add(answer);
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
		JSONArray answers = new JSONArray();
		for (Answer answer : getAnswers()) {
			answers.add(((AnswerImpl) answer).adaptTo());
		}
		adapter.put("answers", answers);
		return adapter;
	}
}
