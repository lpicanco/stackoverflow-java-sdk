/**
 * 
 */
package com.google.code.stackexchange.schema;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.logging.Logger;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
 * The Class BaseJsonAdapter.
 */
public abstract class SchemaEntity implements Serializable {

	/** The logger. */
    protected transient final Logger logger = Logger.getLogger(getClass().getCanonicalName());
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 250056223059654638L;
	
	protected GsonBuilder getGsonBuilder() {
		GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {

			@Override
			public Date deserialize(JsonElement source, Type arg1,
					JsonDeserializationContext arg2) throws JsonParseException {
				return new Date(source.getAsLong() * 1000);
			}
			
		});
		builder.registerTypeAdapter(BadgeRank.class, new JsonDeserializer<BadgeRank>() {

			@Override
			public BadgeRank deserialize(JsonElement arg0, Type arg1,
					JsonDeserializationContext arg2) throws JsonParseException {
				return BadgeRank.fromValue(arg0.getAsString());
			}
			
		});
		builder.registerTypeAdapter(PostType.class, new JsonDeserializer<PostType>() {

			@Override
			public PostType deserialize(JsonElement arg0, Type arg1,
					JsonDeserializationContext arg2) throws JsonParseException {
				return PostType.fromValue(arg0.getAsString());
			}
			
		});
		builder.registerTypeAdapter(PostTimelineType.class, new JsonDeserializer<PostTimelineType>() {

			@Override
			public PostTimelineType deserialize(JsonElement arg0, Type arg1,
					JsonDeserializationContext arg2) throws JsonParseException {
				return PostTimelineType.fromValue(arg0.getAsString());
			}
			
		});
		builder.registerTypeAdapter(UserTimelineType.class, new JsonDeserializer<UserTimelineType>() {

			@Override
			public UserTimelineType deserialize(JsonElement arg0, Type arg1,
					JsonDeserializationContext arg2) throws JsonParseException {
				return UserTimelineType.fromValue(arg0.getAsString());
			}
			
		});
		builder.registerTypeAdapter(UserType.class, new JsonDeserializer<UserType>() {

			@Override
			public UserType deserialize(JsonElement arg0, Type arg1,
					JsonDeserializationContext arg2) throws JsonParseException {
				return UserType.fromValue(arg0.getAsString());
			}
			
		});
		builder.registerTypeAdapter(RevisionType.class, new JsonDeserializer<RevisionType>() {

			@Override
			public RevisionType deserialize(JsonElement arg0, Type arg1,
					JsonDeserializationContext arg2) throws JsonParseException {
				return RevisionType.fromValue(arg0.getAsString());
			}
			
		});
		
		builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
		
		return builder;		
	}
}
