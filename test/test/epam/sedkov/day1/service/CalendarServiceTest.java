package test.epam.sedkov.day1.service;

import by.epam.sedkov.day1.entity.PastTime;
import by.epam.sedkov.day1.exception.CheckedException;
import by.epam.sedkov.day1.service.CalendarService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.epam.sedkov.day1.validator.DataProviderForValidator;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class CalendarServiceTest {
    private CalendarService calendarService;

    @BeforeClass
    public void setUp() {
        calendarService = new CalendarService();
    }

    @Test(dataProvider = "dataForMonth", dataProviderClass = DataProviderForService.class)
    public void testReceiveDaysInMonth(int month, int days) {
        int actual = calendarService.receiveDaysInMonth(month);
        assertEquals(actual, days, "Quantity of days");
    }

    @Test(dataProvider = "dataForMonthException", dataProviderClass = DataProviderForService.class,
            expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testExceptionReceiveDaysInMonth(int month) {
        int actual = calendarService.receiveDaysInMonth(month);
    }

    @Test(dataProvider = "concreteDaysGoodData", dataProviderClass = DataProviderForService.class,
            dependsOnMethods = {"testReceiveDaysInMonth"})
    public void testReceiveConcreteDays(int year, int month, int days) {
        try {
            int actual = calendarService.receiveConcreteDays(year, month);
            assertEquals(actual, days, "Days in month in year");
        } catch (CheckedException e) {
            fail();
        }
    }

    @Test(dataProvider = "concreteDaysExceptionData", dataProviderClass = DataProviderForService.class,
            expectedExceptions = CheckedException.class)
    public void testExceptionReceiveConcreteDays(int year, int month) throws CheckedException {
        int actual = calendarService.receiveConcreteDays(year, month);
    }

    @Test(dataProvider = "passedTimeData", dataProviderClass = DataProviderForService.class)
    public void testReceiveTime(int seconds, PastTime expected) {
        try {
            PastTime actual = calendarService.receiveTime(seconds);
            assertEquals(actual, expected);
        } catch (CheckedException e) {
            fail();
        }
    }

    @Test(dataProvider = "dataBadSeconds", dataProviderClass = DataProviderForValidator.class,
            expectedExceptions = CheckedException.class)
    public void testExceptionReceiveTime(int seconds) throws CheckedException {
        PastTime actual = calendarService.receiveTime(seconds);
    }

}