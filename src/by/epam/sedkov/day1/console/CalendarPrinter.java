package by.epam.sedkov.day1.console;

import by.epam.sedkov.day1.entity.PastTime;

public class CalendarPrinter {
    public void daysPrinter(int days) {
        System.out.printf("Quantity of days in month: %d. %n", days);
    }

    public void leapYearDefinitionPrinter(boolean isLeapYear) {
        System.out.println(isLeapYear ? "Year is leap." : "Year is not leap.");
    }

    public void pastTimePrinter(PastTime pastTime) {
        System.out.printf("To this moment has passed %dH:%dM:%dS.%n", pastTime.getPastHours(),
                pastTime.getPastMinutes(), pastTime.getPastSeconds());
    }

}
