package epam.sedkov.day1.validator;

import epam.sedkov.day1.entity.PassedTime;

import java.time.LocalDate;

public class CalendarValidator {

    public static boolean isYear(int year) {
        return (year > 0 && year <= LocalDate.now().getYear());
    }

    public static boolean isMonth(int month) {
        return (month > 0 && month <= 12);
    }

    public static boolean isSecondsInCurrentDay(int seconds) {
        return (seconds > 0 && seconds <= PassedTime.SECONDS_IN_DAY);
    }

}
