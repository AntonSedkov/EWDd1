package test.epam.sedkov.day1.parser;

import by.epam.sedkov.day1.exception.CheckedException;
import by.epam.sedkov.day1.parser.StringParser;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class StringParserTest {

    StringParser stringParser;

    @BeforeClass
    public void setUp() {
        stringParser = new StringParser();
    }

    @Test(dataProvider = "dataStringParser")
    public void testParseLastDigit(String in, int out) {
        try {
            int actual = stringParser.parseLastDigit(in);
            Assert.assertEquals(actual, out);
        } catch (
                CheckedException e) {
            fail();
        }
    }

    @Test(expectedExceptions = CheckedException.class, expectedExceptionsMessageRegExp = "Wrong input data: not a number")
    public void testExceptionParseLastDigit() throws CheckedException {
        int actual = stringParser.parseLastDigit("Hello Java 111");
    }

    @DataProvider(name = "dataStringParser")
    public Object[][] dataStringParser() {
        return new Object[][]{{"1234", 4}, {" 567", 7}, {"890 ", 0}, {" 25123456789012345678908 ", 8}};
    }
}