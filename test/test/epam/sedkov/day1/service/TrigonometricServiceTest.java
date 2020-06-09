package test.epam.sedkov.day1.service;

import by.epam.sedkov.day1.entity.CircleFigure;
import by.epam.sedkov.day1.entity.PointCoordinate;
import by.epam.sedkov.day1.exception.CheckedException;
import by.epam.sedkov.day1.service.TrigonometricService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TrigonometricServiceTest {

    TrigonometricService trigonometricService;

    @BeforeClass
    public void setUp() {
        trigonometricService = new TrigonometricService();
    }

    @Test(dataProvider = "dataGoodRadius", dataProviderClass = DataProviderForService.class)
    public void testReceiveRadiusOfInscribedCircle(double in, double expected) {
        try {
            double actual = trigonometricService.receiveRadiusOfInscribedCircle(in);
            assertEquals(actual, expected, 0.0001);
        } catch (CheckedException e) {
            fail();
        }
    }

    @Test
    public void testWrongReceiveRadiusOfInscribedCircle() {
        try {
            double actual = trigonometricService.receiveRadiusOfInscribedCircle(3998.066);
            assertNotEquals(actual, 55.799, 0.0001);
        } catch (CheckedException e) {
            fail();
        }
    }

    @Test(dataProvider = "dataBadSquare", dataProviderClass = DataProviderForService.class,
            expectedExceptions = CheckedException.class, expectedExceptionsMessageRegExp = "Wrong input data: square must be bigger than 0.")
    public void testExceptionReceiveRadiusOfInscribedCircle(double in) throws CheckedException {
        double actual = trigonometricService.receiveRadiusOfInscribedCircle(in);
    }

    @Test(dataProvider = "dataGoodInscribedSquare", dataProviderClass = DataProviderForService.class)
    public void testReceiveSquareOfInscribedSquare(double in, double excepted) {
        try {
            double actual = trigonometricService.receiveSquareOfInscribedSquare(in);
            assertEquals(actual, excepted, 0.0001);
        } catch (CheckedException e) {
            fail();
        }
    }

    @Test
    public void testWrongReceiveSquareOfInscribedSquare() {
        try {
            double actual = trigonometricService.receiveSquareOfInscribedSquare(125.666);
            assertNotEquals(actual, 97.124, 0.0001);
        } catch (CheckedException e) {
            fail();
        }
    }

    @Test(dataProvider = "dataBadSquare", dataProviderClass = DataProviderForService.class,
            expectedExceptions = CheckedException.class, expectedExceptionsMessageRegExp = "Wrong input data: radius must be bigger than 0.")
    public void testExceptionReceiveSquareOfInscribedSquare(double in) throws CheckedException {
        double actual = trigonometricService.receiveSquareOfInscribedSquare(in);
    }

    @Test(dataProvider = "dataGoodHowManyTimes", dataProviderClass = DataProviderForService.class)
    public void testHowManyTimesSmaller(double in, double expected) {
        try {
            double actual = trigonometricService.howManyTimesSmaller(in);
            assertEquals(actual, expected);
        } catch (CheckedException e) {
            fail();
        }
    }

    @Test
    public void testWrongHowManyTimesSmaller() {
        try {
            double actual = trigonometricService.howManyTimesSmaller(9);
            assertNotEquals(actual, 3);
        } catch (CheckedException e) {
            fail();
        }
    }

    @Test(dataProvider = "dataBadSquare", dataProviderClass = DataProviderForService.class,
            expectedExceptions = CheckedException.class, expectedExceptionsMessageRegExp = "Wrong input data: radius must be bigger than 0.")
    public void testExceptionHowManyTimesInscribedSmallerDescribed(double in) throws CheckedException {
        double actual = trigonometricService.receiveSquareOfInscribedSquare(in);
    }

    @Test(dataProvider = "dataGoodClosePoint", dataProviderClass = DataProviderForService.class)
    public void testReceiveClosePoint(PointCoordinate pointA, PointCoordinate pointB, PointCoordinate expected) {
        try {
            PointCoordinate actual = trigonometricService.receiveClosePoint(pointA, pointB);
            assertEquals(actual, expected);
        } catch (CheckedException e) {
            fail();
        }
    }

    @Test(dataProvider = "dataBadClosePoint", dataProviderClass = DataProviderForService.class)
    public void testWrongReceiveClosePoint(PointCoordinate pointA, PointCoordinate pointB, PointCoordinate expected) {
        try {
            PointCoordinate actual = trigonometricService.receiveClosePoint(pointA, pointB);
            assertNotEquals(actual, expected);
        } catch (CheckedException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CheckedException.class, expectedExceptionsMessageRegExp = "Points have equal coordinates.")
    public void testExceptionReceiveClosePoint() throws CheckedException {
        PointCoordinate pointA = new PointCoordinate("point A", 10.33, -15.78);
        PointCoordinate pointB = new PointCoordinate("point B", 10.33, -15.78);
        PointCoordinate actual = trigonometricService.receiveClosePoint(pointA, pointB);
    }

    @Test(dataProvider = "dataCircleFigure", dataProviderClass = DataProviderForService.class)
    public void testCountCircleLengthAndSquare(double in, CircleFigure expected) {
        try {
            CircleFigure actual = trigonometricService.countCircleLengthAndSquare(in);
            //assertEquals(actual, expected);
            assertEquals(actual.getRadius(), expected.getRadius(), 0.0001, "Radius");
            assertEquals(actual.getLength(), expected.getLength(), 0.0001, "Length");
            assertEquals(actual.getSquare(), expected.getSquare(), 0.0001, "Square");
        } catch (CheckedException e) {
            fail();
        }
    }

    @Test
    public void testWrongCountCircleLengthAndSquare() {
        try {
            CircleFigure actual = trigonometricService.countCircleLengthAndSquare(7);
            CircleFigure expected = new CircleFigure(2, 15, 30);
            //assertNotEquals(actual, expected);
            assertNotEquals(actual.getRadius(), expected.getRadius(), 0.0001, "Radius");
            assertNotEquals(actual.getLength(), expected.getLength(), 0.0001, "Length");
            assertNotEquals(actual.getSquare(), expected.getSquare(), 0.0001, "Square");
        } catch (CheckedException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CheckedException.class, expectedExceptionsMessageRegExp = "Radius must be more than 0.")
    public void testExceptionCountCircleLengthAndSquare() throws CheckedException {
        CircleFigure actual = trigonometricService.countCircleLengthAndSquare(-88);
    }

}