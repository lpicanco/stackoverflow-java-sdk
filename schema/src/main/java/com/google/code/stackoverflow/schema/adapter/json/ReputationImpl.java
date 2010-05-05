package com.google.code.stackoverflow.schema.adapter.json;

import java.util.Date;

import org.json.simple.JSONObject;

import com.google.code.stackoverflow.schema.PostType;
import com.google.code.stackoverflow.schema.Reputation;
import com.google.code.stackoverflow.schema.adapter.Adaptable;

/**
 * The Class ReputationImpl.
 */
public class ReputationImpl extends BaseJsonAdapter implements Reputation,
		Adaptable<Reputation, JSONObject> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2066676039083125977L;
	
	/** The negative rep. */
	private long negativeRep;
	
	/** The on date. */
	private Date onDate;
	
	/** The positive rep. */
	private long positiveRep;
	
	/** The post id. */
	private long postId;
	
	/** The post type. */
	private PostType postType;
	
	/** The title. */
	private String title;

	/** The user id. */
	private long userId;
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputation#getUserId()
	 */
	@Override
	public long getUserId() {
		return userId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputation#setUserId(long)
	 */
	@Override
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputation#getNegativeRep()
	 */
	@Override
	public long getNegativeRep() {
		return negativeRep;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputation#getOnDate()
	 */
	@Override
	public Date getOnDate() {
		return onDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputation#getPositiveRep()
	 */
	@Override
	public long getPositiveRep() {
		return positiveRep;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputation#getPostId()
	 */
	@Override
	public long getPostId() {
		return postId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputation#getPostType()
	 */
	@Override
	public PostType getPostType() {
		return postType;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputation#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputation#setNegativeRep(long)
	 */
	@Override
	public void setNegativeRep(long negativeRep) {
		this.negativeRep = negativeRep;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputation#setOnDate(java.util.Date)
	 */
	@Override
	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputation#setPositiveRep(long)
	 */
	@Override
	public void setPositiveRep(long positiveRep) {
		this.positiveRep = positiveRep;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputation#setPostId(long)
	 */
	@Override
	public void setPostId(long postId) {
		this.postId = postId;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputation#setPostType(com.google.code.stackoverflow.schema.PostType)
	 */
	@Override
	public void setPostType(PostType postType) {
		this.postType = postType;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.Reputation#setTitle(java.lang.String)
	 */
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptFrom(java.lang.Object)
	 */
	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
	}

	/* (non-Javadoc)
	 * @see com.google.code.stackoverflow.schema.adapter.Adaptable#adaptTo()
	 */
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}

}
