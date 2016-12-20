package my.com.tm.dice.ipay.microservices.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

/**
 * Filter to set logger configuration
 * <p>
 * This method sets the logger specific mapped diagnostic context configuration
 */
public class LoggerConfigurationUpdateFilter implements Filter {

    Logger logger = Logger.getLogger(LoggerConfigurationUpdateFilter.class);

    /**
     * Method to set the logger configuration value
     * <p>
     * This method sets the logger specific mapped diagnostic context configuration authheader to the Authorization header
     */
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        logger.debug("Setting authheader");
        String authorizationHeader = request.getHeader("Authorization");
        if (StringUtils.isNotEmpty(authorizationHeader)) {
            MDC.put("authheader", authorizationHeader);
        }
        chain.doFilter(request, response);
    }

    public void init(FilterConfig filterConfig) {

    }

    public void destroy() {
    }

}
