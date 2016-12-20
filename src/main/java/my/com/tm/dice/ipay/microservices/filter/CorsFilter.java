package my.com.tm.dice.ipay.microservices.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class CorsFilter implements Filter {

    Logger logger = Logger.getLogger(CorsFilter.class);

    String originNames;

    public String getOriginNames() {
        return originNames;
    }

    public void setOriginNames(String originNames) {
        this.originNames = originNames;
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String originHeaderFromClient = request.getHeader("Origin");
        logger.debug("Origins :" + originNames);
        response.setHeader("Access-Control-Allow-Origin", originName(originHeaderFromClient));
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization,Content-Type");
        chain.doFilter(request, response);
    }

    public void init(FilterConfig filterConfig) {

    }

    public void destroy() {
    }

    private String originName(String originHeaderFromClient) {

        logger.debug("Origin Header From Client :" + originHeaderFromClient);
        // The below code splits the string on a delimiter defined as: zero or
        // more whitespace, a literal comma, zero or more whitespace which will
        // place the words into the list and collapse any whitespace between the
        // words and commas.
        List<String> origins = Arrays.asList(originNames.split("\\s*,\\s*"));
        if (origins.contains(originHeaderFromClient)) {
            return originHeaderFromClient;
        } else {
            return "";
        }
    }

}