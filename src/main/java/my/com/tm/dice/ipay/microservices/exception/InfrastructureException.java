package my.com.tm.dice.ipay.microservices.exception;

/**
 * When something bad beyond our control happens and we can't do anything about it. We hope this is temporary so users can try again
 * sometime later (may be the backend system was down and it is back up later) or we got disconnected from network or whatever, but that's
 * not in our control
 * 
 * @author prabharangopalan
 * 
 */
public class InfrastructureException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -4321891586120262008L;

    public InfrastructureException() {
        super();
    }

    public InfrastructureException(String message, Throwable cause) {
        super(message, cause);
    }

    public InfrastructureException(String message) {
        super(message);
    }

    public InfrastructureException(Throwable cause) {
        super(cause);
    }

}
