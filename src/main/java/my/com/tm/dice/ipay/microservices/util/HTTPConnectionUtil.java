package my.com.tm.dice.ipay.microservices.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import my.com.tm.dice.ipay.microservices.exception.InfrastructureException;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HTTPConnectionUtil {

    Logger logger = Logger.getLogger(HTTPConnectionUtil.class);
    /*
     * Single instance, shared among all the requests. Backed by a MultiThreadedHttpConnectionManager as recommended by Apache
     * HTTPComponents doc
     */
    @Autowired
    private HttpClient httpClient;

    public String postMessage(String content, String url) throws InfrastructureException {
        if (StringUtils.isEmpty(url) || StringUtils.isEmpty(content)) {
            throw new IllegalArgumentException("The caller should have made sure the URL and content are not empty but failed to do it");
        }
        InfrastructureException ex = null;
        HttpPost post = new HttpPost(url);
        HttpEntity stringEntity;
        String responseString = "";
        logger.debug("About to make a POST request with body " + content + " to URL " + url + "\n");
        try {
            stringEntity = new StringEntity(content);
            post.setEntity(stringEntity);
            HttpResponse response = httpClient.execute(post);
            InputStream responseBodyStream = response.getEntity().getContent();
            responseString = IOUtils.toString(responseBodyStream);
            logger.debug("Successfully completed the request and the response is " + responseString + "\n\n");
        } catch (UnsupportedEncodingException e) {
            ex = new InfrastructureException(e);
        } catch (ClientProtocolException e) {
            ex = new InfrastructureException(e);
        } catch (IOException e) {
            ex = new InfrastructureException(e);
        } finally {
            post.releaseConnection();
        }
        if (ex != null) {
            logger.error("Encountered error " + ex.getClass().getName() + ". Reason is: " + ex.getMessage());
            throw ex;
        }
        return responseString;
    }

    public String getMessage(String url) throws InfrastructureException {
        if (StringUtils.isEmpty(url)) {
            throw new IllegalArgumentException("The caller should have made sure the URL is not empty but failed to do it");
        }
        InfrastructureException ex = null;
        HttpGet get = new HttpGet(url);
        String responseString = "";
        logger.debug("About to make a GET request to URL " + url + "\n");
        try {
            HttpResponse response = httpClient.execute(get);
            InputStream responseBodyStream = response.getEntity().getContent();
            responseString = IOUtils.toString(responseBodyStream);
            logger.debug("Successfully completed the request and the response is " + responseString + "\n\n");
        } catch (UnsupportedEncodingException e) {
            ex = new InfrastructureException(e);
        } catch (ClientProtocolException e) {
            ex = new InfrastructureException(e);
        } catch (IOException e) {
            ex = new InfrastructureException(e);
        } finally {
            get.releaseConnection();
        }
        if (ex != null) {
            logger.error("Encountered error " + ex.getClass().getName() + ". Reason is: " + ex.getMessage());
            throw ex;
        }
        return responseString;
    }
}
