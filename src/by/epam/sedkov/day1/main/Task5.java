package by.epam.sedkov.day1.main;

import by.epam.sedkov.day1.console.OrdinaryPrinter;
import by.epam.sedkov.day1.exception.CheckedException;
import by.epam.sedkov.day1.service.NumericService;

public class Task5 {
    public static void main(String[] args) {
        NumericService numericService = new NumericService();
        OrdinaryPrinter ordinaryPrinter = new OrdinaryPrinter();

        // Good result
        try {
            ordinaryPrinter.printResult(
                    numericService.isPerfectNumber(8128));
            ordinaryPrinter.printResult(
                    numericService.isPerfectNumber(100));
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }

        // Bad result
        try {
            ordinaryPrinter.printResult(
                    numericService.isPerfectNumber(-8128));
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }

    }
}
