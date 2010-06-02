/**
 * 
 */
package com.google.code.stackexchange.schema.adapter.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.stackexchange.common.PagedArrayList;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Answer;
import com.google.code.stackexchange.schema.Answers;
import com.google.code.stackexchange.schema.adapter.Adaptable;

/**
 * The Class AnswersImpl.
 */
public class AnswersImpl extends BaseJsonAdapter implements Answers, Adaptable<Answers, JSONObject> {

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

	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		getAnswers().setTotal(getLongProperty(adaptee, "total"));
		getAnswers().setPage(getIntProperty(adaptee, "page"));
		getAnswers().setPageSize(getIntProperty(adaptee, "pagesize"));
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
	 * @see com.google.code.stackexchange.schema.adapter.Adaptable#adaptTo()
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
