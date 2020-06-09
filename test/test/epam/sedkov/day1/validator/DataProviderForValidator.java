package test.epam.sedkov.day1.validator;

import by.epam.sedkov.day1.entity.PointCoordinate;
import by.epam.sedkov.day1.validator.CalendarValidator;
import org.testng.annotations.DataProvider;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class DataProviderForValidator {

    @DataProvider(name = "dataForFail")
    public static Iterator<Object[]> dataIteratorPoint() {
        Object[][] data = new Object[][]{
                {new PointCoordinate("point D", 50.80, 10.10), false},
                {new PointCoordinate("point E", -41.79, -15.62), false},
                {new PointCoordinate("point E", -5.5, -10.10), false},
                {new PointCoordinate("point A", 5.5, 10.10), true}
        };
        List<Object[]> list = List.of(data);
        return list.iterator();
    }

    @DataProvider(name = "dataForCube")
    public static Iterator<Object[]> dataIteratorCube() {
        Object[][] data = new Object[][]{
                {0.5},
                {11},
                {1000},
        };
        List<Object[]> list = List.of(data);
        return list.iterator();
    }

    @DataProvider(name = "dataGoodForTan")
    public static Object[][] dataGoodForTan() {
        return new Object[][]{
                {0.5, Math.tan(Math.toRadians(0.5))},
                {-45, Math.tan(Math.toRadians(-45))},
                {180, Math.tan(Math.toRadians(180))},
                {-360, Math.tan(Math.toRadians(-360))},
                {720, Math.tan(Math.toRadians(720))},
                {-1080, Math.tan(Math.toRadians(-1080))}
        };
    }

    @DataProvider(name = "dataBadForTan")
    public static Object[][] dataBadForTan() {
        return new Object[][]{
                {90}, {270}, {-450}, {990}, {-1170}
        };
    }

    @DataProvider(name = "dataGoodForYear")
    public static Iterator<Object[]> iteratorGood() {
        Object[][] data = new Object[][]{
                {4}, {640}, {1600}, {LocalDate.now().getYear()}
        };
        List<Object[]> list = List.of(data);
        return list.iterator();
    }

    @DataProvider(name = "dataBadForYear")
    public static Iterator<Object[]> iteratorBad() {
        Object[][] data = new Object[][]{
                {0}, {-500}, {8000}, {-LocalDate.now().getYear()}
        };
        List<Object[]> list = List.of(data);
        return list.iterator();
    }

    @DataProvider(name = "dataBadForLeapYear")
    public static Iterator<Object[]> iteratorBadForLeap() {
        Object[][] data = new Object[][]{
                {1}, {100}, {1500}, {2003}
        };
        List<Object[]> list = List.of(data);
        return list.iterator();
    }

    @DataProvider(name = "dataGoodForMonth")
    public static Object[][] dataGoodForMonth() {
        return new Object[][]{
                {1}, {5}, {CalendarValidator.MONTH_IN_YEAR}
        };
    }

    @DataProvider(name = "dataBadForMonth")
    public static Object[][] dataBadForMonth() {
        return new Object[][]{
                {0}, {13}, {-CalendarValidator.MONTH_IN_YEAR}, {50}
        };
    }

    @DataProvider(name = "dataGoodSeconds")
    public static Object[][] dataGoodSeconds() {
        return new Object[][]{
                {10}, {6500}, {CalendarValidator.SECONDS_IN_DAY}, {CalendarValidator.SECONDS_IN_MINUTE}, {CalendarValidator.SECONDS_IN_HOUR}
        };
    }

    @DataProvider(name = "dataBadSeconds")
    public static Object[][] dataBadSeconds() {
        return new Object[][]{
                {0}, {-100}, {-CalendarValidator.SECONDS_IN_DAY}, {90000000}
        };
    }

}
