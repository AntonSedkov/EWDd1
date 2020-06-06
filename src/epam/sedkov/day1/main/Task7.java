package epam.sedkov.day1.main;

import epam.sedkov.day1.console.OrdinaryPrinter;
import epam.sedkov.day1.console.PointPrinter;
import epam.sedkov.day1.entity.PointCoordinate;
import epam.sedkov.day1.exception.CheckedException;
import epam.sedkov.day1.service.TrigonometricService;

public class Task7 {
    public static void main(String[] args) {

        TrigonometricService trigonometricService = new TrigonometricService();
        PointPrinter pointPrinter = new PointPrinter();
        OrdinaryPrinter ordinaryPrinter = new OrdinaryPrinter();

        // Good result
        try {
            pointPrinter.closePointPrinter(
                    trigonometricService.
                            receiveClosePoint(new PointCoordinate("Point A", 22.88, -9.77),
                                    new PointCoordinate("Point B", -8.11, 15.03)));

            pointPrinter.closePointPrinter(
                    trigonometricService.
                            receiveClosePoint(new PointCoordinate("Point A", 22.88, -9.77),
                                    new PointCoordinate("Point B", -88.11, 15.03)));
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }

        // Bad result
        try {
            pointPrinter.closePointPrinter(
                    trigonometricService.
                            receiveClosePoint(new PointCoordinate("Point A", 10.10, -5.5),
                                    new PointCoordinate("Point B", 10.10, -5.5)));
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }
    }
}
