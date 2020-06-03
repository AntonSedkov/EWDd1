package epam.sedkov.day1.main;

import epam.sedkov.day1.console.CalendarPrinter;
import epam.sedkov.day1.console.OrdinaryPrinter;
import epam.sedkov.day1.service.CalendarService;

public class Task2 {
    public static void main(String[] args) {

        CalendarService calendarService = new CalendarService();
        CalendarPrinter calendarPrinter = new CalendarPrinter();
        OrdinaryPrinter printer = new OrdinaryPrinter();

        // Good result
        try {
            calendarPrinter.daysPrinter(calendarService.receiveConcreteDaysInMonthAndYear(2012, 02));
            calendarPrinter.leapYearDefinitionPrinter(calendarService.isLeapYear(2012));
            calendarPrinter.daysPrinter(calendarService.receiveConcreteDaysInMonthAndYear(2010, 2));
            calendarPrinter.leapYearDefinitionPrinter(calendarService.isLeapYear(2010));
            calendarPrinter.daysPrinter(calendarService.receiveConcreteDaysInMonthAndYear(1900, 12));
            calendarPrinter.leapYearDefinitionPrinter(calendarService.isLeapYear(1900));
        } catch (Exception e) {
            printer.printException(e);
        }

        // Bad result
        try {
            calendarPrinter.daysPrinter(calendarService.receiveConcreteDaysInMonthAndYear(2012, 1234));
        } catch (Exception e) {
            printer.printException(e);
        }

        try {
            calendarPrinter.leapYearDefinitionPrinter(calendarService.isLeapYear(33333));
        } catch (Exception e) {
            printer.printException(e);
        }
    }
}
