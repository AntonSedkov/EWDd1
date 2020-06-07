package test.epam.sedkov.day1.service;

import by.epam.sedkov.day1.entity.PassedTime;
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
}
