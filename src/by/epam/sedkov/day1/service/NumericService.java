package by.epam.sedkov.day1.service;

import by.epam.sedkov.day1.exception.CheckedException;
import by.epam.sedkov.day1.parser.StringParser;

public class NumericService {

    public int receiveLastDigit(int number) {
        return number % 10;
    }

    public int receiveLastDigit(String number) throws CheckedException {
        StringParser stringParser = new StringParser();
        return stringParser.parseLastDigit(number);
    }

    public int receiveLastSquaredDigit(int digit) throws CheckedException {
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
                throw new CheckedException("Wrong case statement: not a digit");
        }
    }

    public boolean atLeastTwoEven(int[] numbers) {
        int quantityOfEven = 0;
        for (int i = 0; quantityOfEven < 2 && i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                quantityOfEven++;
            }
        }
        return quantityOfEven == 2;
    }

    public boolean atLeastTwoEven(String[] numericStrings) throws CheckedException {
        int[] numbersFromString = new int[numericStrings.length];
        for (int i = 0; i < numericStrings.length; i++) {
            numbersFromString[i] = receiveLastDigit(numericStrings[i]);
        }
        return atLeastTwoEven(numbersFromString);
    }

    // perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself
    public boolean isPerfectNumber(int number) throws CheckedException {
        if (number > 0) {
            int sumOfDivisors = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }
            return number == sumOfDivisors;
        } else {
            throw new CheckedException("Number must be positive");
        }
    }

}