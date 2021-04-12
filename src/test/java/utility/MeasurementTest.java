package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class MeasurementTest {
    @Test
    void testIf1cmIsEqualTo1cm() {
        Measurement centimeter1 = new Measurement(1,"cm");
        Measurement centimeter2 = new Measurement(1,"cm");

        assertTrue(centimeter1.equals(centimeter2));
    }

    @Test
    void testIf1meterIsEqualsTo100Centimeter() {
        Measurement meter = new Measurement(1,"m");
        Measurement centimeter = new Measurement(100,"cm");

        assertTrue(meter.equals(centimeter));
    }


}
