package by.epam.sedkov.day1.main;

import by.epam.sedkov.day1.console.OrdinaryPrinter;
import by.epam.sedkov.day1.service.NumericService;

public class Task1 {
    public static void main(String[] args) {
        NumericService numericService = new NumericService();
        OrdinaryPrinter printer = new OrdinaryPrinter();

        // Good result
        try {
            printer.printLastSquareDigit(
                    numericService.receiveLastSquaredDigit(
                            numericService.receiveLastDigit(242)));
            printer.printLastSquareDigit(
                    numericService.receiveLastSquaredDigit(
                            numericService.receiveLastDigit(" 125459312423677  ")));
        } catch (Exception e) {
            printer.printException(e);
        }

        // Bad result
        try {
            printer.printLastSquareDigit(
                    numericService.receiveLastSquaredDigit(
                            numericService.receiveLastDigit("Hello Java!!!")));
        } catch (Exception e) {
            printer.printException(e);
        }
    }
}
