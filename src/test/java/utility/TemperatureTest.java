package utility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureTest {
    @Test
    void testIf0CelsiusIsEqualsTo32Fahrenheit() {
        Measurement<Temperature> temperature = new Measurement<Temperature>();
        Assertions.assertTrue(temperature.equals(new Temperature(0,"celsius"),new Temperature(32,"fahrenheit"))
        );
    }

    @Test
    void testIfMinus273CelsiusIsEqualsTo0Kelvin() {
        Measurement<Temperature> temperature = new Measurement<Temperature>();
        Assertions.assertTrue(temperature.equals(new Temperature(0,"kelvin"),new Temperature(-273,"celsius"))
        );
    }
}
