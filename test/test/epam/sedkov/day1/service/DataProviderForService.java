package test.epam.sedkov.day1.service;

import by.epam.sedkov.day1.entity.CircleFigure;
import by.epam.sedkov.day1.entity.PassedTime;
import by.epam.sedkov.day1.entity.PointCoordinate;
import by.epam.sedkov.day1.entity.SegmentLine;
import by.epam.sedkov.day1.validator.CalendarValidator;
import org.testng.annotations.DataProvider;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DataProviderForService {

    @DataProvider(name = "dataForMonth")
    public static Object[][] dataForMonth() {
        return new Object[][]{
                {01, 31}, {2, 28}, {11, 30}, {12, 31}
        };
    }

    @DataProvider(name = "dataForMonthException")
    public static Object[][] dataForMonthException() {
        return new Object[][]{
                {-12}, {0}, {33}, {500096}
        };
    }

    @DataProvider(name = "concreteDaysGoodData")
    public static Iterator<Object[]> concreteDaysGoodData() {
        Object[][] data = new Object[][]{
                {01, 02, 28}, {1600, 02, 29}, {100, 2, 28}, {2000, 8, 31}, {2003, 4, 30}, {2020, 12, 31}
        };
        List<Object[]> list = List.of(data);
        return list.iterator();
    }

    @DataProvider(name = "concreteDaysExceptionData")
    public static Iterator<Object[]> concreteDaysExceptionData() {
        Object[][] data = new Object[][]{
                {-100, 2}, {2000, -11}, {2099, 4}, {2020, 44}
        };
        List<Object[]> list = List.of(data);
        return list.iterator();
    }

    @DataProvider(name = "passedTimeData")
    public static Iterator<Object[]> passedTimeData() {
        Object[][] data = new Object[][]{
                {10, new PassedTime(0, 0, 10)},
                {66, new PassedTime(0, 1, 6)},
                {3690, new PassedTime(1, 1, 30)},
                {34587, new PassedTime(9, 36, 27)},
                {CalendarValidator.SECONDS_IN_DAY, new PassedTime(24, 0, 0)}
        };
        List<Object[]> list = List.of(data);
        return list.iterator();
    }

    @DataProvider(name = "dataCountExpressionForParameter")
    public static Object[][] dataCountExpressionForParameter() {
        return new Object[][]{
                {-4, -0.0142857}, {0, -0.1666666}, {2, 0.5}, {3, 9}, {10, -61}, {80.55, -6237.6525}
        };
    }

    @DataProvider(name = "dataTanForSegment")
    public static Iterator<Object[]> dataTanForSegment() {
        SegmentLine firstSegment = new SegmentLine(0, 180, 60);
        Map<Double, Double> firstMap = new TreeMap<>();
        firstMap.put(0.0, Math.tan(Math.toRadians(0)));
        firstMap.put(60.0, Math.tan(Math.toRadians(60)));
        firstMap.put(120.0, Math.tan(Math.toRadians(120)));
        firstMap.put(180.0, Math.tan(Math.toRadians(180)));
        SegmentLine secondSegment = new SegmentLine(-720, 45, 330);
        Map<Double, Double> secondMap = new TreeMap<>();
        secondMap.put(-720.0, Math.tan(Math.toRadians(-720)));
        secondMap.put(-390.0, Math.tan(Math.toRadians(-390)));
        secondMap.put(-60.0, Math.tan(Math.toRadians(-60)));
        Object[][] data = new Object[][]{
                {firstSegment, firstMap},
                {secondSegment, secondMap}
        };
        List<Object[]> list = List.of(data);
        return list.iterator();
    }

    @DataProvider(name = "dataWrongLastDigit")
    public static Object[][] dataWrongLastDigit() {
        int actual = 263;
        return new Object[][]{
                {actual, 0}, {actual, 1}, {actual, 2}, {actual, 4}, {actual, 5}, {actual, 6}, {actual, 7}, {actual, 8}, {actual, 9}
        };
    }

    @DataProvider(name = "dataLastSquaredDigit")
    public static Iterator<Object[]> iteratorLastSquaredDigit() {
        Object[][] data = new Object[][]{
                {0, 0}, {1, 1}, {2, 4}, {3, 9}, {4, 6}, {5, 5}, {6, 6}, {7, 9}, {8, 4}, {9, 1}
        };
        List<Object[]> list = List.of(data);
        return list.iterator();
    }

    @DataProvider(name = "dataAtLeastTwoEven")
    public static Object[][] dataAtLeastTwoEven() {
        return new Object[][]{
                {new int[]{2, 1, 4, 3}, true}, {new int[]{8, 6, 4, 1}, true}, {new int[]{80, 0, 96, 0}, true},
                {new int[]{1, 7, 3, 4}, false}, {new int[]{1, 1, 1, 1}, false}
        };
    }

    @DataProvider(name = "dataAtLeastTwoEvenString")
    public static Object[][] dataAtLeastTwoEvenString() {
        return new Object[][]{
                {new String[]{"13 ", " 26", " 39 ", "48"}, true},
                {new String[]{"8", "6", "4", "1"}, true},
                {new String[]{" 80 ", " 0 ", "96 ", " 0"}, true},
                {new String[]{"13 ", " 33", " 39 ", "48"}, false},
                {new String[]{" 77 ", " 7 ", "777 ", " 7"}, false}
        };
    }

    @DataProvider(name = "dataPerfectNumber")
    public static Iterator<Object[]> iteratorPerfectNumber() {
        Object[][] data = new Object[][]{
                {6, true}, {8128, true}, {33550336, true}, {32, false}, {1, false}, {1000, false}
        };
        List<Object[]> list = List.of(data);
        return list.iterator();
    }

    @DataProvider(name = "dataGoodRadius")
    public static Object[][] dataGoodRadius() {
        return new Object[][]{
                {1, 0.5}, {43.98, 3.31587}, {324, 9}, {81, 4.5}
        };
    }

    @DataProvider(name = "dataBadSquare")
    public static Object[][] dataBadRadius() {
        return new Object[][]{
                {0}, {-16}, {-11324.2323}
        };
    }

    @DataProvider(name = "dataGoodInscribedSquare")
    public static Object[][] dataGoodInscribedSquare() {
        return new Object[][]{
                {1, 2}, {43.98, 3868.4808}, {15.156, 459.4087}, {0.1, 0.02}
        };
    }

    @DataProvider(name = "dataGoodHowManyTimes")
    public static Object[][] dataGoodHowManyTimes() {
        return new Object[][]{
                {1, 2}, {43.98, 2}, {15.156, 2}, {0.1, 2}
        };
    }

    @DataProvider(name = "dataGoodClosePoint")
    public static Object[][] dataGoodClosePoint() {
        PointCoordinate pointA = new PointCoordinate("point A", 10.10, 85.74);
        PointCoordinate pointB = new PointCoordinate("point B", -56.38, -8.99);
        PointCoordinate pointC = new PointCoordinate("point C", -28.33, 99.05);
        return new Object[][]{
                {pointA, pointB, pointB}, {pointA, pointC, pointA}, {pointB, pointC, pointB}
        };
    }

    @DataProvider(name = "dataBadClosePoint")
    public static Object[][] dataBadClosePoint() {
        PointCoordinate pointA = new PointCoordinate("point A", 10.10, 85.74);
        PointCoordinate pointB = new PointCoordinate("point B", -56.38, -8.99);
        PointCoordinate pointC = new PointCoordinate("point C", -28.33, 99.05);
        return new Object[][]{
                {pointA, pointB, pointA}, {pointA, pointC, pointC}, {pointB, pointC, pointC}
        };
    }

    @DataProvider(name = "dataCircleFigure")
    public static Object[][] dataCircleFigure() {
        return new Object[][]{
                {1, new CircleFigure(1, 2 * Math.PI, Math.PI)},
                {2.5, new CircleFigure(2.5, 5 * Math.PI, 6.25 * Math.PI)},
                {10, new CircleFigure(10, 20 * Math.PI, 100 * Math.PI)}
        };
    }

}
