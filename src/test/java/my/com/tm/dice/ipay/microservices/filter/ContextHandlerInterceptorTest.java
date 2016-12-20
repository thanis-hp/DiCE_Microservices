package my.com.tm.dice.ipay.microservices.filter;

import junit.framework.TestCase;
import my.com.tm.dice.ipay.microservices.context.ThreadLocalContext;
import my.com.tm.dice.ipay.microservices.context.ThreadLocalContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:microservices-servlet-test.xml")
public class ContextHandlerInterceptorTest extends TestCase {

    private static final String POST_CODE = "postCode";

    private static final String DISCOVER_POSTCODE_URL = "/discover/postcode";

    private static final String SOME_CLIENT_IP = "10.54.5.191";
    private static final String SEVERAL_CLIENT_IPS = "10.54.5.191,10.54.5.192";

    private static final String HEADER_X_FORWARDED_FOR = "X_FORWARDED_FOR";

    @Autowired
    private RequestMappingHandlerAdapter handlerAdapter;

    @Autowired
    private RequestMappingHandlerMapping handlerMapping;

    @Test
    public void testGetValidClientIp() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setRequestURI(DISCOVER_POSTCODE_URL);
        request.setMethod(HttpMethod.GET.toString());
        request.setParameter(POST_CODE, "12345");
        request.addHeader(HEADER_X_FORWARDED_FOR, SOME_CLIENT_IP);

        MockHttpServletResponse response = new MockHttpServletResponse();

        HandlerExecutionChain handlerExecutionChain = handlerMapping.getHandler(request);

        HandlerInterceptor[] interceptors = handlerExecutionChain.getInterceptors();

        for (HandlerInterceptor interceptor : interceptors) {
            interceptor.preHandle(request, response, handlerExecutionChain.getHandler());
        }
        TestCase.assertEquals(SOME_CLIENT_IP, ThreadLocalContext.getClientIP());

    }

    @Test
    public void testGetValidSeveralClientIps() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setRequestURI(DISCOVER_POSTCODE_URL);
        request.setMethod(HttpMethod.GET.toString());
        request.setParameter(POST_CODE, "12345");
        request.addHeader(HEADER_X_FORWARDED_FOR, SEVERAL_CLIENT_IPS);

        MockHttpServletResponse response = new MockHttpServletResponse();

        HandlerExecutionChain handlerExecutionChain = handlerMapping.getHandler(request);

        HandlerInterceptor[] interceptors = handlerExecutionChain.getInterceptors();

        for (HandlerInterceptor interceptor : interceptors) {
            interceptor.preHandle(request, response, handlerExecutionChain.getHandler());
        }
        assertEquals(SOME_CLIENT_IP, ThreadLocalContext.getClientIP());

    }

    @Test
    public void testGetValidClientIpAfterCompletionWithoutException() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setRequestURI(DISCOVER_POSTCODE_URL);
        request.setMethod(HttpMethod.GET.toString());
        request.setParameter(POST_CODE, "12345");
        request.addHeader(HEADER_X_FORWARDED_FOR, SOME_CLIENT_IP);

        MockHttpServletResponse response = new MockHttpServletResponse();

        HandlerExecutionChain handlerExecutionChain = handlerMapping.getHandler(request);

        HandlerInterceptor[] interceptors = handlerExecutionChain.getInterceptors();

        for (HandlerInterceptor interceptor : interceptors) {
            interceptor.afterCompletion(request, response, handlerExecutionChain.getHandler(), null);
        }
        assertEquals(null, ThreadLocalContext.getClientIP());
    }

    @Test
    public void testGetValidClientIpAfterCompletionWithException() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setRequestURI(DISCOVER_POSTCODE_URL);
        request.setMethod(HttpMethod.GET.toString());
        request.setParameter(POST_CODE, "12345");
        request.addHeader(HEADER_X_FORWARDED_FOR, SOME_CLIENT_IP);

        MockHttpServletResponse response = new MockHttpServletResponse();

        HandlerExecutionChain handlerExecutionChain = handlerMapping.getHandler(request);

        HandlerInterceptor[] interceptors = handlerExecutionChain.getInterceptors();

        for (HandlerInterceptor interceptor : interceptors) {
            interceptor.afterCompletion(request, response, handlerExecutionChain.getHandler(), new Exception());
        }
        assertEquals(null, ThreadLocalContext.getClientIP());
    }
}
