package my.com.tm.dice.ipay.microservices.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;

import junit.framework.TestCase;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.MDC;
import org.junit.After;
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
public class LoggerConfigurationUpdateFilterTest extends TestCase {

    private static final String AUTHORIZATION = "SOME_RANDOM_AUTH_TOKEN";
    private static final String AUTHORIZATION_HEADER_NAME = "Authorization";
    private static final String MDC_AUTH_HEADER = "authheader";

    /**
     * Since each test populates MDC, we will clear it after each test
     */
    @After
    public void clearMDC() {
        MDC.clear();
    }

    @Autowired
    LoggerConfigurationUpdateFilter loggerConfigurationUpdateFilter;

    @Test
    public void testMDCHeaderValue() throws IOException, ServletException {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addHeader(AUTHORIZATION_HEADER_NAME, AUTHORIZATION);
        MockHttpServletResponse response = new MockHttpServletResponse();
        FilterChain chain = new MockFilterChain();
        loggerConfigurationUpdateFilter.doFilter(request, response, chain);
        assertEquals(AUTHORIZATION, MDC.get(MDC_AUTH_HEADER));

    }

    @Test
    public void testMDCHeaderValueEmpty() throws IOException, ServletException {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addHeader(AUTHORIZATION_HEADER_NAME, StringUtils.EMPTY);
        MockHttpServletResponse response = new MockHttpServletResponse();
        FilterChain chain = new MockFilterChain();
        loggerConfigurationUpdateFilter.doFilter(request, response, chain);
        assertEquals(null, MDC.get(MDC_AUTH_HEADER));

    }
}
