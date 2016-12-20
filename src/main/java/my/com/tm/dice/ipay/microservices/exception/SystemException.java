package my.com.tm.dice.ipay.microservices.exception;

/**
 * Exceptions thrown when the there is a System specific exception that occurs
 * 
 * @author tshriram02
 * 
 */
public class SystemException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -2007876708797990113L;

    public SystemException() {
        super();
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }

}
