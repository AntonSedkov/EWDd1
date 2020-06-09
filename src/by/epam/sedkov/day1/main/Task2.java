package by.epam.sedkov.day1.main;

import by.epam.sedkov.day1.console.CalendarPrinter;
import by.epam.sedkov.day1.console.OrdinaryPrinter;
import by.epam.sedkov.day1.service.CalendarService;
import by.epam.sedkov.day1.validator.CalendarValidator;

public class Task2 {
    public static void main(String[] args) {

        CalendarService calendarService = new CalendarService();
        CalendarPrinter calendarPrinter = new CalendarPrinter();
        OrdinaryPrinter printer = new OrdinaryPrinter();

        // Good result
        try {
            calendarPrinter.daysPrinter(calendarService.receiveConcreteDays(2012, 02));
            calendarPrinter.leapYearDefinitionPrinter(CalendarValidator.isLeapYear(2012));
            calendarPrinter.daysPrinter(calendarService.receiveConcreteDays(2010, 2));
            calendarPrinter.leapYearDefinitionPrinter(CalendarValidator.isLeapYear(2010));
            calendarPrinter.daysPrinter(calendarService.receiveConcreteDays(1900, 12));
            calendarPrinter.leapYearDefinitionPrinter(CalendarValidator.isLeapYear(1900));
        } catch (Exception e) {
            printer.printException(e);
        }

        // Bad result
        try {
            calendarPrinter.daysPrinter(calendarService.receiveConcreteDays(2012, 1234));
        } catch (Exception e) {
            printer.printException(e);
        }

        try {
            calendarPrinter.leapYearDefinitionPrinter(CalendarValidator.isLeapYear(33333));
        } catch (Exception e) {
            printer.printException(e);
        }
    }
}
