package test.epam.sedkov.day1.service;

import by.epam.sedkov.day1.entity.SegmentLine;
import by.epam.sedkov.day1.exception.CheckedException;
import by.epam.sedkov.day1.service.FunctionService;
import by.epam.sedkov.day1.validator.FunctionValidator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Map;

import static org.testng.Assert.assertEquals;

public class FunctionServiceTest {

    FunctionService functionService;

    @BeforeClass
    public void setUp() {
        functionService = new FunctionService();
    }

    @Test(dataProvider = "dataCountExpressionForParameter", dataProviderClass = DataProviderForService.class)
    public void testCountExpressionForParameter(double in, double expected) throws CheckedException {
        double actual = functionService.countExpressionForParameter(in);
        assertEquals(actual, expected, 0.0001, "Result ");
    }

    @Test(expectedExceptions = CheckedException.class, expectedExceptionsMessageRegExp = "Division by zero")
    public void testExceptionCountExpressionForParameter() throws CheckedException {
        double actual = functionService.countExpressionForParameter(Math.cbrt(FunctionValidator.FUNCTION_RESTRICTION_TASK_EIGHT));
    }

    @Test(dataProvider = "dataTanForSegment", dataProviderClass = DataProviderForService.class)
    public void testCountFunctionTanForSegment(SegmentLine in, Map<Double, Double> out) throws CheckedException {
        Map<Double, Double> actual = functionService.countFunctionTanForSegment(in);
        assertEquals(actual, out);
    }

    @Test(expectedExceptions = CheckedException.class, expectedExceptionsMessageRegExp = "Division by zero: Tangent tends to infinity")
    public void testExceptionCountFunctionTanForSegment() throws CheckedException {
        SegmentLine segment = new SegmentLine(45, 145, 45);
        Map<Double, Double> actual = functionService.countFunctionTanForSegment(segment);
    }
}