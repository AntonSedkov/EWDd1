package epam.sedkov.day1.exception;

public class CheckedException extends Exception {
    public CheckedException() {
    }

    public CheckedException(String message) {
        super(message);
    }

    public CheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
