import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class ValidateNumberTest {
    @ParameterizedTest
    @ValueSource(strings = {"2000","1880","4003"})
    public void validateStringIsYear(String arguments){
        assertTrue(ValidateNumber.validateNumber(arguments));

    }
    @ParameterizedTest
    @ValueSource(strings = {"year","test","bluuuue"})
    public void validateStringIsNotYear(String arguments){
        assertFalse(ValidateNumber.validateNumber(arguments));

    }
}