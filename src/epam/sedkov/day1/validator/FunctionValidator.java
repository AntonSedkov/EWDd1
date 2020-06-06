package epam.sedkov.day1.validator;

public class FunctionValidator {
    private static final String INTEGER_VALUE = "\\d+";
    private static final int FUNCTION_RESTRICTION_TASK_EIGHT = 6;

    public static boolean isIntegerValue(String numericString) {
        return (numericString.trim().matches(INTEGER_VALUE));
    }

    public static boolean isNotNullValueForFunction(double number) {
        return number != Math.cbrt(FUNCTION_RESTRICTION_TASK_EIGHT);
    }

    public static boolean isTanExist(double degree) {
        double radian = Math.toRadians(degree);
        boolean flag = (radian % (Math.PI / 2) != 0);
        flag = ((radian % Math.PI == 0) != flag);
        return flag;
    }
}
