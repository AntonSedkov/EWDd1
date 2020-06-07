package by.epam.sedkov.day1.main;

import by.epam.sedkov.day1.console.OrdinaryPrinter;
import by.epam.sedkov.day1.console.TrigonometricPrinter;
import by.epam.sedkov.day1.service.TrigonometricService;
import by.epam.sedkov.day1.exception.CheckedException;

public class Task9 {
    public static void main(String[] args) {
        TrigonometricService trigonometricService = new TrigonometricService();
        TrigonometricPrinter trigonometricPrinter = new TrigonometricPrinter();
        OrdinaryPrinter ordinaryPrinter = new OrdinaryPrinter();

        // Good result
        try {
            trigonometricPrinter.circlePrint(
                    trigonometricService.countCircleLengthAndSquare(5.19)
            );
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }

        // Bad result
        try {
            trigonometricPrinter.circlePrint(
                    trigonometricService.countCircleLengthAndSquare(-2.77)
            );
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }
    }
}
