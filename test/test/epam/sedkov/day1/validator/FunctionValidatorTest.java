package test.epam.sedkov.day1.validator;

import by.epam.sedkov.day1.validator.FunctionValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class FunctionValidatorTest {

    @Test
    public void testIsIntegerValue() {
        boolean actual = FunctionValidator.isIntegerValue(" 123045678901234567890   ");
        assertTrue(actual);
    }

    @Test
    public void testFailIsIntegerValue() {
        boolean actual = FunctionValidator.isIntegerValue("Hello Java 111");
        assertFalse(actual);
    }

    @Test(dataProvider = "dataForCube", dataProviderClass = DataProviderForValidator.class)
    public void testIsNotNullValueForFunction(double in) {
        boolean actual = FunctionValidator.isNotNullValueForFunction(in);
        assertTrue(actual);
    }

    @Test
    public void testFailIsNotNullValueForFunction() {
        boolean actual = FunctionValidator.isNotNullValueForFunction(Math.cbrt(FunctionValidator.FUNCTION_RESTRICTION_TASK_EIGHT));
        assertFalse(actual);
    }

    @Test(dataProvider = "dataGoodForTan", dataProviderClass = DataProviderForValidator.class)
    public void testIsTanExist(double in, double result) {
        boolean actual = FunctionValidator.isTanExist(in);
        assertTrue(actual);
    }

    @Test(dataProvider = "dataBadForTan", dataProviderClass = DataProviderForValidator.class)
    public void testFailIsTanExist(double in) {
        boolean actual = FunctionValidator.isTanExist(in);
        assertFalse(actual);
    }

}