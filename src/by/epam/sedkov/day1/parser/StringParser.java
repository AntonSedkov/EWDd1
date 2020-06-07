package by.epam.sedkov.day1.parser;

import by.epam.sedkov.day1.exception.CheckedException;
import by.epam.sedkov.day1.validator.FunctionValidator;

public class StringParser {

    public int parseLastDigit(String number) throws CheckedException {
        if (FunctionValidator.isIntegerValue(number)) {
            String numericWithoutSpaces = number.trim();
            return Integer.parseInt(numericWithoutSpaces.substring(numericWithoutSpaces.length() - 1));
        } else {
            throw new CheckedException("Wrong input data: not a number");
        }
    }
}
