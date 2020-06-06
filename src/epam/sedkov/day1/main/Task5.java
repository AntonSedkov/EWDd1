package epam.sedkov.day1.main;

import epam.sedkov.day1.console.OrdinaryPrinter;
import epam.sedkov.day1.service.NumericService;

public class Task5 {
    public static void main(String[] args) {
        NumericService numericService = new NumericService();
        OrdinaryPrinter ordinaryPrinter = new OrdinaryPrinter();

        // Good result
        ordinaryPrinter.printResult(
                numericService.isPerfectNumber(8128));
        ordinaryPrinter.printResult(
                numericService.isPerfectNumber(100));

    }
}
