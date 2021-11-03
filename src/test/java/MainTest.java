import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTest {
    @ParameterizedTest
    @ValueSource (ints = {2000,1556,1240,116})
    public void isLeapYearTrue(int arguments){
        assertTrue(IsLeapYear.isLeapYear(arguments));

    }
    @ParameterizedTest
    @ValueSource (ints = {2000,1556,1240,116})
    public void leapYearIsDivisibleByFour(int arguments){
        assertTrue(IsLeapYear.isLeapYear(arguments));

    }
    @ParameterizedTest
    @ValueSource (ints = {2000,1556,1240,116})
    public void leapYearIsDivisibleByFourAndNotHoundred(int arguments){
        assertTrue(IsLeapYear.isLeapYear(arguments));

    }
    @ParameterizedTest
    @ValueSource (ints = {2000,1556,1240,116})
    public void leapYearIsDivisibleBy4Houndred(int arguments){
        assertTrue(IsLeapYear.isLeapYear(arguments));

    }
    @ParameterizedTest
    @ValueSource (ints = {2000,1556,1240,116})
    public void leapYearIsDivisibleByHundredNot400(int arguments){
        assertFalse(IsLeapYear.isLeapYear(arguments));

    }


    @ParameterizedTest
    @ValueSource(ints = {1700,1800,1900,1883, 2009,1557,1239,111})
    public void isLeapYearFalse(int arguments){
        assertFalse(IsLeapYear.isLeapYear(arguments));

    }



















}
