package my.com.tm.dice.ipay.microservices.exception;

/**
 * Exceptions thrown when the token is invalid or has expired
 * 
 * @author tshriram02
 * 
 */
public class InvalidTokenException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -2007876708707990113L;

    public InvalidTokenException() {
        super();
    }

    public InvalidTokenException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidTokenException(String message) {
        super(message);
    }

    public InvalidTokenException(Throwable cause) {
        super(cause);
    }

}
