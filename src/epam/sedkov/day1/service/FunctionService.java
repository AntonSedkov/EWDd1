package epam.sedkov.day1.service;

import epam.sedkov.day1.entity.SegmentLine;
import epam.sedkov.day1.exception.CheckedException;
import epam.sedkov.day1.validator.FunctionValidator;

import java.util.Map;
import java.util.TreeMap;

public class FunctionService {

    private double countFirstExpression(double number) {
        double result = -Math.pow(number, 2) + 3 * number + 9;
        return result;
    }

    private double countSecondExpression(double number) throws CheckedException {
        if (FunctionValidator.isNotNullValueForFunction(number)) {
            return (1 / (Math.pow(number, 3) - 6));
        } else {
            throw new CheckedException("Division by zero");
        }
    }

    public double countExpressionForParameter(double number) throws CheckedException {
        if (number >= 3) {
            return countFirstExpression(number);
        } else {
            return countSecondExpression(number);
        }
    }

    private double countFunctionTan(double degrees) {
        return Math.tan(Math.toRadians(degrees));
    }

    public Map<Double, Double> countFunctionTanForSegment(SegmentLine segment) throws CheckedException {
        Map<Double, Double> tanValues = new TreeMap<>();
        for (double i = segment.getStartSegment(); i <= segment.getEndSegment(); i += segment.getStepSegment()) {
            if (FunctionValidator.isTanExist(i)) {
                tanValues.put(i, countFunctionTan(i));
            } else {
                throw new CheckedException("Division by zero: Tangent tends to infinity");
            }
        }
        return tanValues;
    }

}
