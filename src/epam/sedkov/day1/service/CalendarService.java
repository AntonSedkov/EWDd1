package epam.sedkov.day1.service;

import epam.sedkov.day1.entity.MonthEnum;
import epam.sedkov.day1.entity.PassedTime;
import epam.sedkov.day1.exception.CheckedException;
import epam.sedkov.day1.validator.CalendarValidator;

public class CalendarService {

    public int receiveQuantityOfDaysInMonth(int month) {
        return (MonthEnum.values()[month - 1].getDays());
    }

    public int receiveConcreteDaysInMonthAndYear(int year, int month) throws CheckedException {
        if (CalendarValidator.isMonth(month)) {
            int days = receiveQuantityOfDaysInMonth(month);
            if (CalendarValidator.isLeapYear(year) && MonthEnum.values()[month - 1] == MonthEnum.FEBRUARY) {
                days++;
            }
            return days;
        } else {
            throw new CheckedException("Wrong month: needed from 1 to 12");
        }
    }

    private int receiveHours(int seconds) {
        return seconds / CalendarValidator.SECONDS_IN_HOUR;
    }

    private int receiveMinutes(int seconds) {
        return (seconds % CalendarValidator.SECONDS_IN_HOUR / CalendarValidator.SECONDS_IN_MINUTE);
    }

    private int receiveSeconds(int seconds) {
        return (seconds % CalendarValidator.SECONDS_IN_HOUR % CalendarValidator.SECONDS_IN_MINUTE);
    }

    public PassedTime receiveTime(int seconds) throws CheckedException {
        if (CalendarValidator.isSecondsInCurrentDay(seconds)) {
            PassedTime passedTime = new PassedTime();
            passedTime.setPassedHours(receiveHours(seconds));
            passedTime.setPassedMinutes(receiveMinutes(seconds));
            passedTime.setPassedSeconds(receiveSeconds(seconds));
            return passedTime;
        } else {
            throw new CheckedException("Wrong data: must be during one day, seconds from 0 before " + CalendarValidator.SECONDS_IN_DAY);
        }
    }

}
