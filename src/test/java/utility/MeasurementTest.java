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

    @Test
    void testIf100meterIsEqualsTo0_1Kilometer() {
        Measurement meter = new Measurement(100,"m");
        Measurement kilometer = new Measurement(0.1,"km");

        assertTrue(meter.equals(kilometer));
    }

    @Test
    void testIf1meterPlus100CentimeterIsEqualTo2meter() {
        Measurement meter = new Measurement(1,"m");
        Measurement centimeter = new Measurement(100,"cm");
        Measurement expectedResult = new Measurement(2.0,"m");
        String expectedMetric = "m";

        Measurement result = meter.add(centimeter,expectedMetric);

        assertTrue(result.equals(expectedResult));
    }

    @Test

    void testIf200centimeterPlus1kilometerIsEqualTo100200Centimeter() {
        Measurement centimeter = new Measurement(200,"cm");
        Measurement kilometer = new Measurement(1,"km");
        Measurement expectedResult = new Measurement(100200,"cm");
        String expectedMetric = "cm";

        Measurement result = centimeter.add(kilometer,expectedMetric);

        assertTrue(result.equals(expectedResult));
    }

    @Test
    void testIf1meterMinus50centimeterIsEqualTo0_5meter() {
        Measurement meter = new Measurement(1,"m");
        Measurement centimeter = new Measurement(50,"cm");
        Measurement expectedResult = new Measurement(0.5,"m");
        String expectedMetric = "m";

        Measurement result = meter.subtract(centimeter,expectedMetric);

        assertTrue(result.equals(expectedResult));
    }


}
