package my.com.tm.dice.ipay.microservices.exception;

/**
 * Somebody gave us something and we can't process it. They're bad. We just can't comprehend what they're saying. Ideally, they can change
 * their request and we can try again. We're reasonable.
 * 
 * @author prabharangopalan
 * 
 */
public class InvalidInputException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -2007876708707990754L;

    public InvalidInputException() {
        super();
    }

    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException(Throwable cause) {
        super(cause);
    }

}
