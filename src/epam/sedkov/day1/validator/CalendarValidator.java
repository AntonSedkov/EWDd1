package epam.sedkov.day1.validator;

import epam.sedkov.day1.exception.CheckedException;

import java.time.LocalDate;

public class CalendarValidator {

    public static final int MONTH_IN_YEAR = 12;
    public static final int SECONDS_IN_DAY = 86400;
    public static final int SECONDS_IN_HOUR = 3600;
    public static final int SECONDS_IN_MINUTE = 60;

    private static final int FREQUENCY_LEAP_YEAR = 4;
    private static final int EXCEPTION_FOR_LEAP_YEAR = 100;
    private static final int FREQUENCY_LEAP_YEAR_IN_CENTURY = 400;

    public static boolean isYear(int year) {
        return (year > 0 && year <= LocalDate.now().getYear());
    }

    public static boolean isLeapYear(int year) throws CheckedException {
        if (CalendarValidator.isYear(year)) {
            return (year % FREQUENCY_LEAP_YEAR == 0 &&
                    (year % EXCEPTION_FOR_LEAP_YEAR != 0 || year % FREQUENCY_LEAP_YEAR_IN_CENTURY == 0));
        } else {
            throw new CheckedException("Wrong year: needed from 0 to " + LocalDate.now().getYear());
        }
    }

    public static boolean isMonth(int month) {
        return (month > 0 && month <= MONTH_IN_YEAR);
    }

    public static boolean isSecondsInCurrentDay(int seconds) {
        return (seconds > 0 && seconds <= SECONDS_IN_DAY);
    }

}
