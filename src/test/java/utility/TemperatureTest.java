package utility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureTest {
    @Test
    void testIf0CelciusIsEqualsTo32Fahrenheit() {
        Measurement<Temperature> temperature = new Measurement<Temperature>();
        Assertions.assertTrue(temperature.equals(new Temperature(0,"celcius"),new Temperature(32,"fahrenheit"))
        );
    }
}
