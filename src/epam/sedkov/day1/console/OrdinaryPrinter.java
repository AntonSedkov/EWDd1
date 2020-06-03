package epam.sedkov.day1.console;

public class OrdinaryPrinter {


    public void printResult(boolean value) {
        System.out.println(value);
    }

    public void printLastDigit(int lastDigit) {
        System.out.println("Last digit of number " + lastDigit);
    }

    public void printFunction(double result) {
        System.out.println("Result of expression equal " + result);
    }

    public void printException(Exception exception) {
        System.err.println(exception);
    }
}
