/**
 *
 */
package com.google.code.stackoverflow.client.query;

import com.google.code.stackoverflow.client.query.impl.AnswerApiQueryImpl;
import com.google.code.stackoverflow.client.query.impl.BadgeApiQueryImpl;
import com.google.code.stackoverflow.client.query.impl.CommentApiQueryImpl;
import com.google.code.stackoverflow.client.query.impl.QuestionApiQueryImpl;
import com.google.code.stackoverflow.client.query.impl.QuestionTimelineApiQueryImpl;
import com.google.code.stackoverflow.client.query.impl.ReputationApiQueryImpl;
import com.google.code.stackoverflow.client.query.impl.RevisionApiQueryImpl;
import com.google.code.stackoverflow.client.query.impl.StatisticsApiQueryImpl;
import com.google.code.stackoverflow.client.query.impl.TagApiQueryImpl;
import com.google.code.stackoverflow.client.query.impl.UserApiQueryImpl;
import com.google.code.stackoverflow.client.query.impl.UserTimelineApiQueryImpl;


/**
 * A factory for creating StackOverflowApiClient objects.
 * 
 * @author Nabeel Mukhtar
 */
public class StackOverflowApiQueryFactory {

    /** The api consumer. */
    private String applicationKey;

    /**
     * Instantiates a new stack overflow api client factory.
     * 
     * @param apiConsumer the api consumer
     */
	private StackOverflowApiQueryFactory(String applicationKey) {
        this.applicationKey = applicationKey;
    }
	
    /**
     * 
     */
    public static StackOverflowApiQueryFactory newInstance(String applicationKey) {
    	if (applicationKey == null || applicationKey.length() == 0) {
    		throw new IllegalArgumentException("Please provide valid application key.");
    	}
        return new StackOverflowApiQueryFactory(applicationKey);
    }
    
    /**
     * 
     */
    public AnswerApiQuery newAnswerApiQuery() {
    	return new AnswerApiQueryImpl(applicationKey);
    }
    
    /**
     * 
     */
    public BadgeApiQuery newBadgeApiQuery() {
    	return new BadgeApiQueryImpl(applicationKey);
    }
    
    /**
     * 
     */
    public CommentApiQuery newCommentApiQuery() {
    	return new CommentApiQueryImpl(applicationKey);
    }
    
    /**
     * 
     */
    public QuestionApiQuery newQuestionApiQuery() {
    	return new QuestionApiQueryImpl(applicationKey);
    }

    /**
     * 
     */
    public QuestionTimelineApiQuery newQuestionTimelineApiQuery() {
    	return new QuestionTimelineApiQueryImpl(applicationKey);
    }

    /**
     * 
     */
    public ReputationApiQuery newReputationApiQuery() {
    	return new ReputationApiQueryImpl(applicationKey);
    }

    /**
     * 
     */
    public RevisionApiQuery newRevisionApiQuery() {
    	return new RevisionApiQueryImpl(applicationKey);
    }

    /**
     * 
     */
    public StatisticsApiQuery newStatisticsApiQuery() {
    	return new StatisticsApiQueryImpl(applicationKey);
    }

    /**
     * 
     */
    public TagApiQuery newTagApiQuery() {
    	return new TagApiQueryImpl(applicationKey);
    }

    /**
     * 
     */
    public UserApiQuery newUserApiQuery() {
    	return new UserApiQueryImpl(applicationKey);
    }

    /**
     * 
     */
    public UserTimelineApiQuery newUserTimelineApiQuery() {
    	return new UserTimelineApiQueryImpl(applicationKey);
    }
}
