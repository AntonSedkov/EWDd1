package epam.sedkov.day1.service;

import epam.sedkov.day1.exception.MyCheckedException;
import epam.sedkov.day1.validator.FunctionValidator;

public class FunctionService {

    private double countFirstExpression(double number) {
        return (-Math.pow(number, 2) + 3 * number + 9);
    }

    private double countSecondExpression(double number) throws MyCheckedException {
        if (FunctionValidator.isNotNullValue(number)) {
            return (1 / (Math.pow(number, 3) - 6));
        } else {
            throw new MyCheckedException("Division by zero");
        }
    }

    public double countExpressionForParameter(double number) throws MyCheckedException {
        if (number >= 3) {
            return countFirstExpression(number);
        } else {
            return countSecondExpression(number);
        }
    }
}
