package my.com.tm.dice.ipay.microservices.context;

/**
 * This class is a container for thread local variables. Thread Local stores remote IP address.
 *
 */
public class ThreadLocalContext {
	
	private static ThreadLocal<String> clientIP = new ThreadLocal<String>();
	
	public static String getClientIP() {
		return clientIP.get();
	}

	public static void setClientIP(String ipValue) {
		clientIP.set(ipValue);
	}
	
	public static void removeInstance() {
		clientIP.remove();
	}

}
