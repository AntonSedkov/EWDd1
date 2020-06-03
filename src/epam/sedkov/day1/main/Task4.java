package epam.sedkov.day1.main;

import epam.sedkov.day1.console.OrdinaryPrinter;
import epam.sedkov.day1.exception.MyCheckedException;
import epam.sedkov.day1.service.NumericService;

public class Task4 {
    public static void main(String[] args) {
        NumericService numericService = new NumericService();
        OrdinaryPrinter ordinaryPrinter = new OrdinaryPrinter();

        // Good result
        ordinaryPrinter.printResult(numericService.atLeastTwoEven(new int[]{1, 2, 3, 4}));
        ordinaryPrinter.printResult(numericService.atLeastTwoEven(new int[]{222, 111, 111, 111}));
        ordinaryPrinter.printResult(numericService.atLeastTwoEven(new int[]{246, 246, 246, 246}));

        try {
            ordinaryPrinter.printResult(numericService.atLeastTwoEven(new String[]{" 88", " 77 ", "88 ", "  88  "}));
            ordinaryPrinter.printResult(numericService.atLeastTwoEven(new String[]{" 1", " 1 ", "1 ", "  2  "}));
        } catch (MyCheckedException e) {
            ordinaryPrinter.printException(e);
        }

        // Bad result
        try {
            ordinaryPrinter.printResult(numericService.atLeastTwoEven(new String[]{" 88", " 88 ", "Hello ", "  Java!!!  "}));
        } catch (MyCheckedException e) {
            ordinaryPrinter.printException(e);
        }
    }
}
