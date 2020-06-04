package epam.sedkov.day1.validator;

public class FunctionValidator {

    public static boolean isNotNullValue(double number) {
        return number != Math.cbrt(6);
    }

    public static boolean isTanExist(double degree) {
        return Math.acos(0) != Math.toRadians(degree);
    }
}
