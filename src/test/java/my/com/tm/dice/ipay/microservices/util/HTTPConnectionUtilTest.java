package my.com.tm.dice.ipay.microservices.util;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import junit.framework.TestCase;
import my.com.tm.dice.ipay.microservices.exception.InfrastructureException;
import my.com.tm.dice.ipay.microservices.exception.InfrastructureException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicStatusLine;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:microservices-servlet-test.xml")
public class HTTPConnectionUtilTest extends TestCase {

    private static final String OK = "OK";

    @InjectMocks
    @Autowired
    private HTTPConnectionUtil httpConnectionUtil;

    @Mock
    HttpClient httpClient;

    private static final String URL = "http://www.httpconnectionutil.test";
    private static final String CONTENT = "testcontent";
    private static final String RESPONSE_CONTENT = "responseContent";
    private static final String HTTP_PROTOCOL = "http";

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testValidPost() throws Exception {
        HttpResponse mockHttpResponse = getMockHttpResponse(HttpStatus.SC_OK, RESPONSE_CONTENT);
        /**
         * <pre>
         * Inlining the getMockHttpResponse call in the thenReturn causes Mockito to throw an unfinishedStubbingException. 
         * Read here for more info: http://stackoverflow.com/a/26319364
         * Using any(HttpPost) since the  httpConnectionUtil.postMessage internally creates a `new HttpPost` which will never be the same as the on we created earlier on. 
         * Use caution since we are testing the method and not exactly what goes in the POST body.
         * </pre>
         */
        when(httpClient.execute(any(HttpPost.class))).thenReturn(mockHttpResponse);
        String response = httpConnectionUtil.postMessage(CONTENT, URL);
        assertEquals(RESPONSE_CONTENT, response);
    }

    @SuppressWarnings("unchecked")
    @Test(expected = InfrastructureException.class)
    public void testPostIOException() throws Exception {
        when(httpClient.execute(any(HttpPost.class))).thenThrow(IOException.class);
        httpConnectionUtil.postMessage(CONTENT, URL);
        assertFalse(true);
    }

    @SuppressWarnings("unchecked")
    @Test(expected = InfrastructureException.class)
    public void testPostUnsupportedEncodingException() throws Exception {
        when(httpClient.execute(any(HttpPost.class))).thenThrow(UnsupportedEncodingException.class);
        httpConnectionUtil.postMessage(CONTENT, URL);
        assertFalse(true);
    }

    @SuppressWarnings("unchecked")
    @Test(expected = InfrastructureException.class)
    public void testPostClientProtocolException() throws Exception {
        when(httpClient.execute(any(HttpPost.class))).thenThrow(ClientProtocolException.class);
        httpConnectionUtil.postMessage(CONTENT, URL);
        assertFalse(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidContent() throws InfrastructureException {
        httpConnectionUtil.postMessage(null, URL);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidUrl() throws InfrastructureException {
        httpConnectionUtil.postMessage(CONTENT, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInvalidUrl() throws InfrastructureException {
        httpConnectionUtil.getMessage(null);
    }

    @Test
    public void testValidGet() throws Exception {
        HttpResponse mockHttpResponse = getMockHttpResponse(HttpStatus.SC_OK, RESPONSE_CONTENT);
        /**
         * <pre>
         * Inlining the getMockHttpResponse call in the thenReturn causes Mockito to throw an unfinishedStubbingException. 
         * Read here for more info: http://stackoverflow.com/a/26319364
         * Using any(HttpPost) since the  httpConnectionUtil.postMessage internally creates a `new HttpPost` which will never be the same as the on we created earlier on. 
         * Use caution since we are testing the method and not exactly what goes in the POST body.
         * </pre>
         */
        when(httpClient.execute(any(HttpGet.class))).thenReturn(mockHttpResponse);
        String response = httpConnectionUtil.getMessage(URL);
        assertEquals(RESPONSE_CONTENT, response);
    }

    @SuppressWarnings("unchecked")
    @Test(expected = InfrastructureException.class)
    public void testGetIOException() throws Exception {
        when(httpClient.execute(any(HttpGet.class))).thenThrow(IOException.class);
        httpConnectionUtil.getMessage(URL);
        assertFalse(true);
    }

    @SuppressWarnings("unchecked")
    @Test(expected = InfrastructureException.class)
    public void testGetUnsupportedEncodingException() throws Exception {
        when(httpClient.execute(any(HttpGet.class))).thenThrow(UnsupportedEncodingException.class);
        httpConnectionUtil.getMessage(URL);
        assertFalse(true);
    }

    @SuppressWarnings("unchecked")
    @Test(expected = InfrastructureException.class)
    public void testGetClientProtocolException() throws Exception {
        when(httpClient.execute(any(HttpGet.class))).thenThrow(ClientProtocolException.class);
        httpConnectionUtil.getMessage(URL);
        assertFalse(true);
    }

    private HttpResponse getMockHttpResponse(int status, String content) throws UnsupportedEncodingException {
        final StatusLine sl = new BasicStatusLine(new ProtocolVersion(HTTP_PROTOCOL, 1, 1), status, OK);
        final HttpResponse response = Mockito.mock(HttpResponse.class);
        final HttpEntity entity = new StringEntity(content);
        Mockito.when(response.getStatusLine()).thenReturn(sl);
        Mockito.when(response.getEntity()).thenReturn(entity);
        return response;
    }
}
