package epam.sedkov.day1.service;

import epam.sedkov.day1.exception.MyCheckedException;
import epam.sedkov.day1.validator.NumberValidator;

public class NumericService {

    public int receiveLastDigit(int number) {
        return number % 10;
    }

    public int receiveLastDigit(String number) throws MyCheckedException {
        if (NumberValidator.isIntegerValue(number)) {
            String numericWithoutSpaces = number.trim();
            return Integer.parseInt(numericWithoutSpaces.substring(numericWithoutSpaces.length() - 1));
        } else {
            throw new MyCheckedException("Wrong input data: not a number");
        }
    }

    public int receiveLastSquaredDigit(int digit) throws MyCheckedException {
        if (NumberValidator.isDigit(digit)) {
            switch (digit) {
                case 1:
                case 9:
                    return 1;
                case 2:
                case 8:
                    return 4;
                case 3:
                case 7:
                    return 9;
                case 4:
                case 6:
                    return 6;
                case 5:
                    return 5;
                case 0:
                    return 0;
                default:
                    throw new MyCheckedException("Wrong case statement: not a digit");
            }
        } else {
            throw new MyCheckedException("Wrong input data: not a digit");
        }
    }

    public boolean atLeastTwoEven(int[] numbers) {
        int quantityOfEven = 0;
        for (int i = 0; quantityOfEven < 2 && i < numbers.length; i++) {
            if (NumberValidator.isEvenNumber(numbers[i])) {
                quantityOfEven++;
            }
        }
        return quantityOfEven == 2;
    }

    public boolean atLeastTwoEven(String[] numericStrings) throws MyCheckedException {
        int[] numbersFromString = new int[numericStrings.length];
        for (int i = 0; i < numericStrings.length; i++) {
            numbersFromString[i] = receiveLastDigit(numericStrings[i]);
        }
        return atLeastTwoEven(numbersFromString);
    }

    // perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself
    public boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        return number == sumOfDivisors;
    }


}