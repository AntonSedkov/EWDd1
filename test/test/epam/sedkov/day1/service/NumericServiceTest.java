package test.epam.sedkov.day1.service;

import by.epam.sedkov.day1.exception.CheckedException;
import by.epam.sedkov.day1.service.NumericService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumericServiceTest {
    private NumericService numericService;

    @BeforeClass
    public void setUp() {
        numericService = new NumericService();
    }

    @Test
    public void testReceiveLastDigit() {
        int actual = numericService.receiveLastDigit(263);
        assertEquals(actual, 3);
    }

    @Test(dataProvider = "dataWrongLastDigit", dataProviderClass = DataProviderForService.class)
    public void testWrongReceiveLastDigit(int in, int expected) {
        int actual = numericService.receiveLastDigit(in);
        assertNotEquals(actual, expected);
    }

    @Test(dataProvider = "dataLastSquaredDigit", dataProviderClass = DataProviderForService.class)
    public void testReceiveLastSquaredDigit(int in, int expected) {
        try {
            int actual = numericService.receiveLastSquaredDigit(in);
            assertEquals(actual, expected);
        } catch (CheckedException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CheckedException.class, expectedExceptionsMessageRegExp = "Wrong case statement: not a digit")
    public void testExceptionReceiveLastSquaredDigit() throws CheckedException {
        int actual = numericService.receiveLastSquaredDigit(1111);
    }

    @Test(dataProvider = "dataAtLeastTwoEven", dataProviderClass = DataProviderForService.class)
    public void testAtLeastTwoEven(int[] in, boolean expected) {
        boolean actual = numericService.atLeastTwoEven(in);
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "dataPerfectNumber", dataProviderClass = DataProviderForService.class)
    public void testIsPerfectNumber(int in, boolean expected) {
        try {
            boolean actual = numericService.isPerfectNumber(in);
            assertEquals(actual, expected);
        } catch (CheckedException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CheckedException.class, expectedExceptionsMessageRegExp = "Number must be positive")
    public void testExceptionPerfectNumber() throws CheckedException {
        boolean actual = numericService.isPerfectNumber(-145457547);
    }

}