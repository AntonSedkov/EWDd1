package epam.sedkov.day1.main;

import epam.sedkov.day1.console.CalendarPrinter;
import epam.sedkov.day1.console.OrdinaryPrinter;
import epam.sedkov.day1.exception.CheckedException;
import epam.sedkov.day1.service.CalendarService;

public class Task6 {
    public static void main(String[] args) {

        CalendarService calendarService = new CalendarService();
        CalendarPrinter calendarPrinter = new CalendarPrinter();
        OrdinaryPrinter ordinaryPrinter = new OrdinaryPrinter();

        // Good result
        try {
            calendarPrinter.pastTimePrinter(
                    calendarService.receiveTime(55223));
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }

        // Bad result
        try {
            calendarPrinter.pastTimePrinter(
                    calendarService.receiveTime(1000000));
        } catch (CheckedException e) {
            ordinaryPrinter.printException(e);
        }
    }
}
