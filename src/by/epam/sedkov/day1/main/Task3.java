package by.epam.sedkov.day1.main;

import by.epam.sedkov.day1.console.OrdinaryPrinter;
import by.epam.sedkov.day1.console.TrigonometricPrinter;
import by.epam.sedkov.day1.exception.CheckedException;
import by.epam.sedkov.day1.service.TrigonometricService;

public class Task3 {
    public static void main(String[] args) {
        TrigonometricService trigonometricService = new TrigonometricService();
        TrigonometricPrinter trigonometricPrinter = new TrigonometricPrinter();
        OrdinaryPrinter ordinaryPrinter = new OrdinaryPrinter();

        // Good result
        try {
            trigonometricPrinter.squarePrinter("inscribed square",
                    trigonometricService.receiveSquareOfInscribedSquare(
                            trigonometricService.receiveRadiusOfInscribedCircle(10.25)));
            trigonometricPrinter.howManySmallerPrinter(
                    trigonometricService.howManyTimesInscribedSmallerDescribed(10.25),
                    "inscribed square", "described square");
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }

        // Bad result
        try {
            trigonometricPrinter.squarePrinter("inscribed square",
                    trigonometricService.receiveSquareOfInscribedSquare(
                            trigonometricService.receiveRadiusOfInscribedCircle(0)));
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }

        try {
            trigonometricPrinter.howManySmallerPrinter(
                    trigonometricService.howManyTimesInscribedSmallerDescribed(-777),
                    "inscribed square", "described square");
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }
    }
}
