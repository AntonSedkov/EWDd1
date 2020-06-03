package epam.sedkov.day1.service;

import epam.sedkov.day1.entity.MonthEnum;
import epam.sedkov.day1.entity.PassedTime;
import epam.sedkov.day1.exception.MyCheckedException;
import epam.sedkov.day1.validator.CalendarValidator;

public class CalendarService {

    private int receiveQuantityOfDaysInMonth(int month) throws MyCheckedException {
        return (MonthEnum.values()[month - 1].getDays());
    }

    public boolean isLeapYear(int year) throws MyCheckedException {
        if (CalendarValidator.isYear(year)) {
            return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        } else {
            throw new MyCheckedException("Wrong year: needed from 0 to 2020");
        }
    }

    public int receiveConcreteDaysInMonthAndYear(int year, int month) throws MyCheckedException {
        if (CalendarValidator.isMonth(month)) {
            int days = receiveQuantityOfDaysInMonth(month);
            if (isLeapYear(year) && MonthEnum.values()[month - 1] == MonthEnum.FEBRUARY) {
                days++;
            }
            return days;
        } else {
            throw new MyCheckedException("Wrong month: needed from 1 to 12");
        }
    }

    private int receiveHours(int seconds) {
        return seconds / PassedTime.SECONDS_IN_HOUR;
    }

    private int receiveMinutes(int seconds) {
        return (seconds % PassedTime.SECONDS_IN_HOUR / PassedTime.SECONDS_IN_MINUTE);
    }

    private int receiveSeconds(int seconds) {
        return (seconds % PassedTime.SECONDS_IN_HOUR % PassedTime.SECONDS_IN_MINUTE);
    }

    public PassedTime receiveTime(int seconds) throws MyCheckedException {
        if (CalendarValidator.isSecondsInCurrentDay(seconds)) {
            PassedTime passedTime = new PassedTime();
            passedTime.setPassedHours(receiveHours(seconds));
            passedTime.setPassedMinutes(receiveMinutes(seconds));
            passedTime.setPassedSeconds(receiveSeconds(seconds));
            return passedTime;
        } else {
            throw new MyCheckedException("Wrong data: seconds from 0 before " + PassedTime.SECONDS_IN_DAY);
        }
    }

}
