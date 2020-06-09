package by.epam.sedkov.day1.parser;

import by.epam.sedkov.day1.exception.CheckedException;
import by.epam.sedkov.day1.validator.FunctionValidator;

public class StringParser {

    public int parseLastDigit(String number) throws CheckedException {
        if (FunctionValidator.isIntegerValue(number)) {
            String numericWithoutSpaces = number.trim();
            String lastDigit = numericWithoutSpaces.substring(numericWithoutSpaces.length() - 1);
            return Integer.parseInt(lastDigit);
        } else {
            throw new CheckedException("Wrong input data: not a number");
        }
    }
}
