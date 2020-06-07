package test.epam.sedkov.day1.validator;

import by.epam.sedkov.day1.exception.CheckedException;
import by.epam.sedkov.day1.validator.CalendarValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CalendarValidatorTest {

    @Test(dataProvider = "dataGoodForYear", dataProviderClass = DataProviderForValidator.class)
    public void testIsYear(int year) {
        boolean actual = CalendarValidator.isYear(year);
        assertTrue(actual);
    }

    @Test(dataProvider = "dataBadForYear", dataProviderClass = DataProviderForValidator.class)
    public void testFailIsYear(int year) {
        boolean actual = CalendarValidator.isYear(year);
        assertFalse(actual);
    }

    @Test(dataProvider = "dataGoodForYear", dataProviderClass = DataProviderForValidator.class, dependsOnMethods = {"testIsYear"})
    public void testIsLeapYear(int year) throws CheckedException {
        boolean actual = CalendarValidator.isLeapYear(year);
        assertTrue(actual);
    }

    @Test(dataProvider = "dataBadForLeapYear", dataProviderClass = DataProviderForValidator.class)
    public void testFailIsLeapYear(int year) throws CheckedException {
        boolean actual = CalendarValidator.isLeapYear(year);
        assertFalse(actual);
    }

    @Test(dataProvider = "dataBadForYear", dataProviderClass = DataProviderForValidator.class,
            expectedExceptions = CheckedException.class)
    public void testExceptionIsLeapYear(int year) throws CheckedException {
        boolean actual = CalendarValidator.isLeapYear(year);
    }

    @Test(dataProvider = "dataGoodForMonth", dataProviderClass = DataProviderForValidator.class)
    public void testIsMonth(int month) {
        boolean actual = CalendarValidator.isMonth(month);
        assertTrue(actual);
    }

    @Test(dataProvider = "dataBadForMonth", dataProviderClass = DataProviderForValidator.class)
    public void testFailIsMonth(int month) {
        boolean actual = CalendarValidator.isMonth(month);
        assertFalse(actual);
    }

    @Test(dataProvider = "dataGoodSeconds", dataProviderClass = DataProviderForValidator.class)
    public void testIsSecondsInCurrentDay(int seconds) {
        boolean actual = CalendarValidator.isSecondsInCurrentDay(seconds);
        assertTrue(actual);
    }

    @Test(dataProvider = "dataBadSeconds", dataProviderClass = DataProviderForValidator.class)
    public void testFailIsSecondsInCurrentDay(int seconds) {
        boolean actual = CalendarValidator.isSecondsInCurrentDay(seconds);
        assertFalse(actual);
    }

}