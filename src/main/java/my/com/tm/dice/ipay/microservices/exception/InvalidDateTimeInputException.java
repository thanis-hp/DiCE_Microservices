package my.com.tm.dice.ipay.microservices.exception;

/**
 * Exceptions thrown when some unprocessable input arrives to the DateTimeUtil Library
 * 
 * @author tshriram02
 * 
 */
public class InvalidDateTimeInputException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -2007876708707990752L;

    public InvalidDateTimeInputException() {
        super();
    }

    public InvalidDateTimeInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidDateTimeInputException(String message) {
        super(message);
    }

    public InvalidDateTimeInputException(Throwable cause) {
        super(cause);
    }

}
