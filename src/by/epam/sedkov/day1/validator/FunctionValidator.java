package by.epam.sedkov.day1.validator;

public class FunctionValidator {
    private static final String INTEGER_VALUE = "\\d+";
    public static final int FUNCTION_RESTRICTION_TASK_EIGHT = 6;
    public static final int DEGREE_FOR_2_PI = 360;

    public static boolean isIntegerValue(String numericString) {
        return (numericString.trim().matches(INTEGER_VALUE));
    }

    public static boolean isNotNullValueForFunction(double number) {
        return number != Math.cbrt(FUNCTION_RESTRICTION_TASK_EIGHT);
    }

    public static boolean isTanExist(double degree) {
        double degreeLowerRestriction = degree % DEGREE_FOR_2_PI;
        double radian = Math.toRadians(degreeLowerRestriction);
        boolean flag = (radian % (Math.PI / 2) != 0);
        flag = ((radian % Math.PI == 0) != flag);
        return flag;
    }
}
