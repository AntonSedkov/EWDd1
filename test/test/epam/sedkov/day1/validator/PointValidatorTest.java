package test.epam.sedkov.day1.validator;

import by.epam.sedkov.day1.entity.PointCoordinate;
import by.epam.sedkov.day1.validator.PointValidator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PointValidatorTest {

    PointCoordinate pointA;
    PointCoordinate pointB;
    PointCoordinate pointC;

    @BeforeMethod
    public void setUp() {
        pointA = new PointCoordinate("point A", 5.5, 10.10);
        pointB = new PointCoordinate("point B", 5.5, 10.10);
        pointC = new PointCoordinate("point C", 5.5, 100.100);
    }

    @Test
    public void testIsEqualCoordinates() {
        boolean actual = PointValidator.isEqualCoordinates(pointA, pointB);
        Assert.assertTrue(actual);
    }

    @Test
    public void testWrongIsEqualCoordinate() {
        boolean actual = PointValidator.isEqualCoordinates(pointA, pointC);
        Assert.assertFalse(actual);
    }

    @Test(dataProvider = "dataForFail", dataProviderClass = DataProviderForValidator.class)
    public void testTwoIsEqualCoordinate(PointCoordinate in, boolean out) {
        boolean actual = PointValidator.isEqualCoordinates(pointA, in);
        Assert.assertEquals(actual, out);
    }

}