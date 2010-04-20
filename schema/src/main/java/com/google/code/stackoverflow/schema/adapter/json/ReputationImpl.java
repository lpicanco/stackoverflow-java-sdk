package com.google.code.stackoverflow.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.PostType;
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

public class ReputationImpl extends BaseJsonAdapter implements Reputation,
		Adaptable<Reputation, JSONObject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2066676039083125977L;
	private long negativeRep;
	private Date onDate;
	private long positiveRep;
	private long postId;
	private PostType postType;
	private String title;

	private long userId;
	
	@Override
	public long getUserId() {
		return userId;
	}

	@Override
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	@Override
	public long getNegativeRep() {
		return negativeRep;
	}

	@Override
	public Date getOnDate() {
		return onDate;
	}

	@Override
	public long getPositiveRep() {
		return positiveRep;
	}

	@Override
	public long getPostId() {
		return postId;
	}

	@Override
	public PostType getPostType() {
		return postType;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setNegativeRep(long negativeRep) {
		this.negativeRep = negativeRep;
	}

	@Override
	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}

	@Override
	public void setPositiveRep(long positiveRep) {
		this.positiveRep = positiveRep;
	}

	@Override
	public void setPostId(long postId) {
		this.postId = postId;
	}

	@Override
	public void setPostType(PostType postType) {
		this.postType = postType;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
	}

	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}

}
