package Task_2;


public class DivisionByZeroException extends Exception {

    public DivisionByZeroException() {
    }

    public DivisionByZeroException(String message) {
        super(message);
    }

    public DivisionByZeroException(Throwable cause) {
        super(cause);
    }

    public DivisionByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivisionByZeroException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
