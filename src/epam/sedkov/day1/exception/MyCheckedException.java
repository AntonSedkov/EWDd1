package epam.sedkov.day1.exception;

public class MyCheckedException extends Exception {
    public MyCheckedException() {
    }

    public MyCheckedException(String message) {
        super(message);
    }
}
