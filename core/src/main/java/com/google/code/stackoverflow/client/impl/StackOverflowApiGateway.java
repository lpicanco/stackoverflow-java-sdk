/**
 * 
 */
package com.google.code.stackoverflow.client.impl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

import com.google.code.stackoverflow.client.constant.ApplicationConstants;
import com.google.code.stackoverflow.client.constant.ErrorCodes;
import com.google.code.stackoverflow.client.exception.InternalServerException;
import com.google.code.stackoverflow.client.exception.InvalidApplicationKeyException;
import com.google.code.stackoverflow.client.exception.InvalidOrderException;
import com.google.code.stackoverflow.client.exception.InvalidPageSizeException;
import com.google.code.stackoverflow.client.exception.InvalidSortException;
import com.google.code.stackoverflow.client.exception.InvalidVectorFormatException;
import com.google.code.stackoverflow.client.exception.NotFoundException;
import com.google.code.stackoverflow.client.exception.RequestLimitExceededException;
import com.google.code.stackoverflow.client.exception.StackOverflowApiClientException;
import com.google.code.stackoverflow.client.exception.TooManyIdsException;
import com.google.code.stackoverflow.client.exception.UnconstrainedSearchException;
import com.google.code.stackoverflow.client.provider.ApiProvider;
import com.google.code.stackoverflow.client.provider.StackOverflowApiProvider;
import com.google.code.stackoverflow.schema.Error;

/**
 * @author nmukhtar
 *
 */
public abstract class StackOverflowApiGateway {
	
    /** The static logger. */
    protected final Logger LOG = Logger.getLogger(getClass().getCanonicalName());
	
	/** Field description */
	private static final String GZIP_ENCODING = "gzip";
	/** Field description */
	protected Map<String, String> requestHeaders;
	/** Field description */
	protected String applicationKey;
	/** Field description */
	private ApiProvider apiProvider = new StackOverflowApiProvider();
	/** Field description */
	protected String apiVersion = ApplicationConstants.DEFAULT_API_VERSION;
	/** Field description */
	private int maxRateLimit = -1;
	/** Field description */
	private int currentRateLimit = -1;

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setRequestHeaders(Map<String, String> requestHeaders) {
	    this.requestHeaders = requestHeaders;
	}

	/**
	 * {@inheritDoc}
	 */
	public Map<String, String> getRequestHeaders() {
	    return requestHeaders;
	}

	/**
	 * {@inheritDoc}
	 */
	public void addRequestHeader(String headerName, String headerValue) {
	    requestHeaders.put(headerName, headerValue);
	}

	/**
	 * {@inheritDoc}
	 */
	public void removeRequestHeader(String headerName) {
	    requestHeaders.remove(headerName);
	}

	/**
	 * @return the applicationKey
	 */
	public String getApplicationKey() {
		return applicationKey;
	}

	/**
	 * @param applicationKey the applicationKey to set
	 */
	public void setApplicationKey(String applicationKey) {
		this.applicationKey = applicationKey;
	}

	/**
	 * @return the apiProvider
	 */
	public ApiProvider getApiProvider() {
		return apiProvider;
	}

	/**
	 * @param apiProvider the apiProvider to set
	 */
	public void setApiProvider(ApiProvider apiProvider) {
		this.apiProvider = apiProvider;
	}
	
    /**
     * Method description
     *
     *
     * @return
     */
    public int getMaxRateLimit() {
    	return maxRateLimit;
    }
    
    /**
     * Method description
     *
     *
     * @return
     */
    public int getCurrentRateLimit() {
    	return currentRateLimit;
    }

	/**
	 * Stolen liberally from http://www.kodejava.org/examples/266.html
	 */
	protected static String convertStreamToString(InputStream is) {
	    /*
	     * To convert the InputStream to String we use the BufferedReader.readLine()
	     * method. We iterate until the BufferedReader return null which means
	     * there's no more data to read. Each line will appended to a StringBuilder
	     * and returned as String.
	     */
	    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
	    StringBuilder sb = new StringBuilder();
	
	    String line = null;
	    try {
	        while ((line = reader.readLine()) != null) {
	            sb.append(line + "\n");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            is.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	    return sb.toString();
	}

	/**
	*
	*
	*/
	protected InputStream callApiMethod(String apiUrl) {
		return callApiMethod(apiUrl, HttpURLConnection.HTTP_OK);
	}

	/**
	 *
	 *
	 * @param apiUrl
	 * @param expected
	 * @param httpHeaders
	 *
	 * @return
	 */
	protected InputStream callApiMethod(String apiUrl, int expected) {
	    try {
	        URL               url     = new URL(apiUrl);
	        HttpURLConnection request = (HttpURLConnection) url.openConnection();
	
	        if (ApplicationConstants.CONNECT_TIMEOUT > -1) {
	            request.setConnectTimeout(ApplicationConstants.CONNECT_TIMEOUT);
	        }
	
	        if (ApplicationConstants.READ_TIMEOUT > -1) {
	            request.setReadTimeout(ApplicationConstants.READ_TIMEOUT);
	        }
	
	        for (String headerName : requestHeaders.keySet()) {
	            request.setRequestProperty(headerName, requestHeaders.get(headerName));
	        }
	        
	        request.connect();
	        maxRateLimit = request.getHeaderFieldInt(ApplicationConstants.MAX_RATE_LIMIT_HEADER, -1);
	        currentRateLimit = request.getHeaderFieldInt(ApplicationConstants.CURRENT_RATE_LIMIT_HEADER, -1);
	        
	        if (request.getResponseCode() != expected) {
	            Error error = readResponse(Error.class,
	                    getWrappedInputStream(request.getErrorStream(),
	                        GZIP_ENCODING.equalsIgnoreCase(request.getContentEncoding())));
	            error.setStatusCode(request.getResponseCode());
	        	
	            throw createStackOverflowApiClientException(error);
	        } else {
	            return getWrappedInputStream(request.getInputStream(),
	                                         GZIP_ENCODING.equalsIgnoreCase(request.getContentEncoding()));
	        }
	    } catch (IOException e) {
	        throw new StackOverflowApiClientException(e);
	    }
	}

	/**
	 *
	 *
	 * @param apiUrl
	 * @param xmlContent
	 * @param contentType
	 * @param method
	 * @param expected
	 *
	 * @return
	 */
	protected InputStream callApiMethod(String apiUrl, String xmlContent, String contentType,
			String method, int expected) {
			    try {
			        URL               url     = new URL(apiUrl);
			        HttpURLConnection request = (HttpURLConnection) url.openConnection();
			
			        if (ApplicationConstants.CONNECT_TIMEOUT > -1) {
			            request.setConnectTimeout(ApplicationConstants.CONNECT_TIMEOUT);
			        }
			
			        if (ApplicationConstants.READ_TIMEOUT > -1) {
			            request.setReadTimeout(ApplicationConstants.READ_TIMEOUT);
			        }
			
			        for (String headerName : requestHeaders.keySet()) {
			            request.setRequestProperty(headerName, requestHeaders.get(headerName));
			        }
			
			        request.setRequestMethod(method);
			        request.setDoOutput(true);
			
			        if (contentType != null) {
			            request.setRequestProperty("Content-Type", contentType);
			        }
			
			        if (xmlContent != null) {
			            PrintStream out = new PrintStream(new BufferedOutputStream(request.getOutputStream()));
			
			            out.print(xmlContent);
			            out.flush();
			            out.close();
			        }
			
			        request.connect();
			        
			        maxRateLimit = request.getHeaderFieldInt(ApplicationConstants.MAX_RATE_LIMIT_HEADER, -1);
			        currentRateLimit = request.getHeaderFieldInt(ApplicationConstants.CURRENT_RATE_LIMIT_HEADER, -1);
			        
			        if (request.getResponseCode() != expected) {
			            Error error = readResponse(Error.class,
			                    getWrappedInputStream(request.getErrorStream(),
			                        GZIP_ENCODING.equalsIgnoreCase(request.getContentEncoding())));
			            error.setStatusCode(request.getResponseCode());
			            
			            throw createStackOverflowApiClientException(error);
			        } else {
			            return getWrappedInputStream(request.getInputStream(),
			                                         GZIP_ENCODING.equalsIgnoreCase(request.getContentEncoding()));
			        }
			    } catch (IOException e) {
			        throw new StackOverflowApiClientException(e);
			    }
			}

	/**
	 * Method description
	 *
	 *
	 * @param is
	 *
	 */
	protected void closeStream(InputStream is) {
	    try {
	        is.close();
	    } catch (IOException e) {
	    	LOG.log(Level.SEVERE, "An error occurred while closing stream.", e);	
	    }
	}

	/**
	 * Method description
	 *
	 *
	 * @param connection
	 *
	 */
	protected void closeConnection(HttpURLConnection connection) {
	    try {
	    	if (connection != null) {
	    		connection.disconnect();
	    	}
	    } catch (Exception e) {
	    	LOG.log(Level.SEVERE, "An error occurred while disconnecting connection.", e);	
	    }
	}

	/**
	 * Method description
	 *
	 *
	 * @param error
	 * @return
	 */
	protected StackOverflowApiClientException createStackOverflowApiClientException(Error error) {
		switch (error.getErrorCode()) {
		
		case ErrorCodes.INTERNAL_SERVER_ERROR:
			return new InternalServerException(error.getMessage(), new Date());
	
		case ErrorCodes.INVALID_APPLICATION_KEY:
			return new InvalidApplicationKeyException(error.getMessage(), new Date());
			
		case ErrorCodes.INVALID_ORDER:
			return new InvalidOrderException(error.getMessage(), new Date());
			
		case ErrorCodes.INVALID_PAGE_SIZE:
			return new InvalidPageSizeException(error.getMessage(), new Date());
			
		case ErrorCodes.INVALID_SORT:
			return new InvalidSortException(error.getMessage(), new Date());
	
		case ErrorCodes.NOT_FOUND:
			return new NotFoundException(error.getMessage(), new Date());
			
		case ErrorCodes.REQUEST_LIMIT_EXCEEDED:
			return new RequestLimitExceededException(error.getMessage(), new Date());
			
		case ErrorCodes.INVALID_VECTOR_FORMAT:
			return new InvalidVectorFormatException(error.getMessage(), new Date());
			
		case ErrorCodes.TOO_MANY_IDS:
			return new TooManyIdsException(error.getMessage(), new Date());
			
		case ErrorCodes.UNCONSTRAINED_SEARCH:
			return new UnconstrainedSearchException(error.getMessage(), new Date());
		default:
			return new StackOverflowApiClientException(error.getMessage(), error.getStatusCode(), error.getErrorCode(), new Date());
		}
	}

	/**
	 * Method description
	 *
	 *
	 * @param is
	 * @param gzip
	 * @return
	 * @throws IOException
	 */
	protected InputStream getWrappedInputStream(InputStream is, boolean gzip)
			throws IOException {
			    if (gzip) {
			        return new BufferedInputStream(new GZIPInputStream(is));
			    } else {
			        return new BufferedInputStream(is);
			    }
			}

	/**
	 * Method description
	 *
	 *
	 *
	 *
	 * @param clazz
	 * @param is
	 * @param <T>
	 *
	 * @return
	 */
	protected <T> T readResponse(Class<T> clazz, InputStream is) {
	    try {
	        return unmarshallObject(clazz, is);
	    } finally {
	        closeStream(is);
	    }
	}
	

    /**
     * Method description
     *
     *
     *
     * @param clazz
     * @param xmlContent
     * @param <T>
     *
     * @return
     */
    protected abstract <T> T unmarshallObject(Class<T> clazz, InputStream xmlContent);

    /**
     * Method description
     *
     *
     * @param element
     *
     * @return
     */
    protected abstract String marshallObject(Object element);
}
