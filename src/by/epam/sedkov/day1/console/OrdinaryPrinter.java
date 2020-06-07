package by.epam.sedkov.day1.console;

public class OrdinaryPrinter {

    public void printResult(boolean value) {
        System.out.println(value);
    }

    public void printLastSquareDigit(int lastDigit) {
        System.out.println("Last digit of square number " + lastDigit);
    }

    public void printFunction(double result) {
        System.out.printf("Result of expression equal %s%n", result);
    }

    public void printException(Exception exception) {
        System.err.println(exception);
    }
}
