package epam.sedkov.day1.validator;

public class NumberValidator {
    private static final String INTEGER_VALUE = "\\d+";
    private static final String DIGIT_VALUE = "\\d{1}";

    public static boolean isIntegerValue(String numericString) {
        return (numericString.trim().matches(INTEGER_VALUE));
    }

    public static boolean isDigit(Integer number) {
        return number.toString().matches(DIGIT_VALUE);
    }

    public static boolean isDoubleForTrigonometricFigures(double number) {
        return number > 0;
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

}
