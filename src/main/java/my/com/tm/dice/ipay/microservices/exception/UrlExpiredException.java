package my.com.tm.dice.ipay.microservices.exception;

/**
 * Created by Thaniswaran Raja Goval on 12/20/2016.
 * Email: thaniswaran.raja-goval@hpe.com
 */
public class UrlExpiredException extends Exception {
    public UrlExpiredException() {
        super();
    }

    public UrlExpiredException(String message) {
        super(message);
    }

    public UrlExpiredException(String message, Throwable cause) {
        super(message, cause);
    }

    public UrlExpiredException(Throwable cause) {
        super(cause);
    }

    protected UrlExpiredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
