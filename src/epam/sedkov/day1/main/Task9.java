package epam.sedkov.day1.main;

import epam.sedkov.day1.console.OrdinaryPrinter;
import epam.sedkov.day1.console.TrigonometricPrinter;
import epam.sedkov.day1.exception.CheckedException;
import epam.sedkov.day1.service.TrigonometricService;

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
