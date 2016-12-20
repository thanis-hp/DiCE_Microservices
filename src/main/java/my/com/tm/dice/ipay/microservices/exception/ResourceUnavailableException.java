package my.com.tm.dice.ipay.microservices.exception;

/**
 * Exception thrown when the resource being appointment slot or phone number unavailable.
 * 
 * @author rajnishdashora
 * 
 */
public class ResourceUnavailableException extends SystemException {

    private static final long serialVersionUID = 5937072652547262634L;

    public ResourceUnavailableException() {
        super();
    }

    public ResourceUnavailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceUnavailableException(String message) {
        super(message);
    }

    public ResourceUnavailableException(Throwable cause) {
        super(cause);
    }

}