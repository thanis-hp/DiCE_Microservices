package my.com.tm.dice.ipay.microservices.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;

import junit.framework.TestCase;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context-test.xml")
public class CorsFilterTest extends TestCase {

    private static final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";
    private static final String ACCESS_CONTROL_MAX_AGE = "Access-Control-Max-Age";
    private static final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
    private static final String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
    private static final String INVALID_ORIGIN = "http://10.54.5.192:9999";
    private static final String ORIGIN = "Origin";
    private static final String VALID_ORIGIN = "http://10.54.5.191:9980";
    @Autowired
    CorsFilter corsFilter;

    @Test
    public void testValidOrigin() throws IOException, ServletException {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addHeader(ORIGIN, VALID_ORIGIN);
        MockHttpServletResponse response = new MockHttpServletResponse();
        FilterChain chain = new MockFilterChain();
        corsFilter.doFilter(request, response, chain);
        assertEquals(VALID_ORIGIN, response.getHeader(ACCESS_CONTROL_ALLOW_ORIGIN));

    }

    @Test
    public void testValidOriginAllowMethods() throws IOException, ServletException {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addHeader(ORIGIN, VALID_ORIGIN);
        MockHttpServletResponse response = new MockHttpServletResponse();
        FilterChain chain = new MockFilterChain();
        corsFilter.doFilter(request, response, chain);
        assertEquals("POST, GET, OPTIONS, DELETE", response.getHeader(ACCESS_CONTROL_ALLOW_METHODS));
    }

    @Test
    public void testValidOriginMaxAge() throws IOException, ServletException {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addHeader(ORIGIN, VALID_ORIGIN);
        MockHttpServletResponse response = new MockHttpServletResponse();
        FilterChain chain = new MockFilterChain();
        corsFilter.doFilter(request, response, chain);
        assertEquals("3600", response.getHeader(ACCESS_CONTROL_MAX_AGE));
    }

    @Test
    public void testValidOriginAllowHeaders() throws IOException, ServletException {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addHeader(ORIGIN, VALID_ORIGIN);
        MockHttpServletResponse response = new MockHttpServletResponse();
        FilterChain chain = new MockFilterChain();
        corsFilter.doFilter(request, response, chain);
        assertEquals("x-requested-with,Authorization,Content-Type", response.getHeader(ACCESS_CONTROL_ALLOW_HEADERS));
    }

    @Test
    public void testInvalidOrigin() throws IOException, ServletException {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addHeader(ORIGIN, INVALID_ORIGIN);
        MockHttpServletResponse response = new MockHttpServletResponse();
        FilterChain chain = new MockFilterChain();
        corsFilter.doFilter(request, response, chain);
        assertEquals(StringUtils.EMPTY, response.getHeader(ACCESS_CONTROL_ALLOW_ORIGIN));

    }

}
