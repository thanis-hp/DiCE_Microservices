package my.com.tm.dice.ipay.microservices.exception;

/**
 * Exceptions thrown when Email is not sent because of some failure
 * 
 * @author tshriram02
 * 
 */
public class EmailNotSentException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -2007876708797990129L;

    public EmailNotSentException() {
        super();
    }

    public EmailNotSentException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmailNotSentException(String message) {
        super(message);
    }

    public EmailNotSentException(Throwable cause) {
        super(cause);
    }

}
