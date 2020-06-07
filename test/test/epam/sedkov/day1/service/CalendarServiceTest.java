package test.epam.sedkov.day1.service;

import by.epam.sedkov.day1.entity.PassedTime;
import by.epam.sedkov.day1.exception.CheckedException;
import by.epam.sedkov.day1.service.CalendarService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.epam.sedkov.day1.validator.DataProviderForValidator;

import static org.testng.Assert.assertEquals;

public class CalendarServiceTest {
    CalendarService calendarService;

    @BeforeClass
    public void setUp() {
        calendarService = new CalendarService();
    }

    @Test(dataProvider = "dataForMonth", dataProviderClass = DataProviderForService.class)
    public void testReceiveQuantityOfDaysInMonth(int month, int days) {
        int actual = calendarService.receiveQuantityOfDaysInMonth(month);
        assertEquals(actual, days, "Quantity of days");
    }

    @Test(dataProvider = "dataForMonthException", dataProviderClass = DataProviderForService.class,
            expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testExceptionReceiveQuantityOfDaysInMonth(int month) {
        int actual = calendarService.receiveQuantityOfDaysInMonth(month);
    }

    @Test(dataProvider = "concreteDaysGoodData", dataProviderClass = DataProviderForService.class,
            dependsOnMethods = {"testReceiveQuantityOfDaysInMonth"})
    public void testReceiveConcreteDaysInMonthAndYear(int year, int month, int days) throws CheckedException {
        int actual = calendarService.receiveConcreteDaysInMonthAndYear(year, month);
        assertEquals(actual, days, "Days in month in year");
    }

    @Test(dataProvider = "concreteDaysExceptionData", dataProviderClass = DataProviderForService.class,
            expectedExceptions = CheckedException.class)
    public void testExceptionReceiveConcreteDaysInMonthAndYear(int year, int month) throws CheckedException {
        int actual = calendarService.receiveConcreteDaysInMonthAndYear(year, month);
    }

    @Test(dataProvider = "passedTimeData", dataProviderClass = DataProviderForService.class)
    public void testReceiveTime(int seconds, PassedTime expected) throws CheckedException {
        PassedTime actual = calendarService.receiveTime(seconds);
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "dataBadSeconds", dataProviderClass = DataProviderForValidator.class,
            expectedExceptions = CheckedException.class)
    public void testExceptionReceiveTime(int seconds) throws CheckedException {
        PassedTime actual = calendarService.receiveTime(seconds);
    }

}