package epam.sedkov.day1.main;

import epam.sedkov.day1.console.OrdinaryPrinter;
import epam.sedkov.day1.exception.CheckedException;
import epam.sedkov.day1.service.FunctionService;

public class Task8 {
    public static void main(String[] args) {
        FunctionService functionService = new FunctionService();
        OrdinaryPrinter ordinaryPrinter = new OrdinaryPrinter();

        // Good result
        try {
            ordinaryPrinter.printFunction(
                    functionService.countExpressionForParameter(5));
            ordinaryPrinter.printFunction(
                    functionService.countExpressionForParameter(3));
            ordinaryPrinter.printFunction(
                    functionService.countExpressionForParameter(1));
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }

        // Bad result
        try {
            ordinaryPrinter.printFunction(
                    functionService.countExpressionForParameter(Math.cbrt(6)));
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }
    }
}
