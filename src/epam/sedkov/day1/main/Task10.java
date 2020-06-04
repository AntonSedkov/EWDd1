package epam.sedkov.day1.main;

import epam.sedkov.day1.console.OrdinaryPrinter;
import epam.sedkov.day1.console.TrigonometricPrinter;
import epam.sedkov.day1.entity.SegmentLine;
import epam.sedkov.day1.exception.MyCheckedException;
import epam.sedkov.day1.service.FunctionService;

public class Task10 {
    public static void main(String[] args) {
        FunctionService functionService = new FunctionService();
        TrigonometricPrinter trigonometricPrinter = new TrigonometricPrinter();
        OrdinaryPrinter ordinaryPrinter = new OrdinaryPrinter();

        try {
            trigonometricPrinter.tangentTablePrinter(
                    functionService.countFunctionTanForSegment(new SegmentLine())
            );
        } catch (MyCheckedException e) {
            ordinaryPrinter.printException(e);
        }

        try {
            trigonometricPrinter.tangentTablePrinter(
                    functionService.countFunctionTanForSegment(new SegmentLine(75,140,15))
            );
        } catch (MyCheckedException e) {
            ordinaryPrinter.printException(e);
        }

    }

}
