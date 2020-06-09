package by.epam.sedkov.day1.main;

import by.epam.sedkov.day1.console.OrdinaryPrinter;
import by.epam.sedkov.day1.console.TrigonometricPrinter;
import by.epam.sedkov.day1.entity.SegmentLine;
import by.epam.sedkov.day1.exception.CheckedException;
import by.epam.sedkov.day1.service.FunctionService;

public class Task10 {
    public static void main(String[] args) {
        FunctionService functionService = new FunctionService();
        TrigonometricPrinter trigonometricPrinter = new TrigonometricPrinter();
        OrdinaryPrinter ordinaryPrinter = new OrdinaryPrinter();

        try {
            trigonometricPrinter.tangentTablePrinter(
                    functionService.countFunctionTanForSegment(new SegmentLine(0, 720, 120))
            );
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }

        try {
            trigonometricPrinter.tangentTablePrinter(
                    functionService.countFunctionTanForSegment(new SegmentLine(0, 720, 45))
            );
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }
    }

}
