package my.com.tm.dice.ipay.microservices.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.com.tm.dice.ipay.microservices.context.ThreadLocalContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Request intercepter class to store remote IP address in thread local for every request and clears it once request is served.
 * 
 * <p>This class retrieves remote IP address from request header for X_FORWARDED_FOR. It stores IP address in thread local for each request 
 * in pre-handler, such that it is available to thread while request processing. 
 * It clears this information form thread local on post handler </p>
 *
 */
public class ContextHandlerInterceptor extends HandlerInterceptorAdapter {
	
	private static final String HEADER_X_FORWARDED_FOR = "X_FORWARDED_FOR";
	private static final String COMMA = ",";

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		ThreadLocalContext.setClientIP(getClientIpAddress(request));
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		ThreadLocalContext.removeInstance();
	}

	private static String getClientIpAddress(HttpServletRequest request) {
		String xForwardHeaderValue = request.getHeader(HEADER_X_FORWARDED_FOR);
		if (StringUtils.isNotBlank(xForwardHeaderValue)) {
			int idx = xForwardHeaderValue.indexOf(COMMA);
			if (idx > -1) {
				return xForwardHeaderValue.substring(0, idx);
			}
			return xForwardHeaderValue;
		}
		return request.getRemoteAddr();
	}

}