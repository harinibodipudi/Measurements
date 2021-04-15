package utility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LengthTest {
    @Test
    void testIf1cmIsEqualTo1cm() {
        Length centimeter1 = new Length(1,"cm");
        Length centimeter2 = new Length(1,"cm");

        assertTrue(centimeter1.equals(centimeter2));
    }

    @Test
    void testIf1meterIsEqualsTo100Centimeter() {
        Length meter = new Length(1,"m");
        Length centimeter = new Length(100,"cm");

        assertTrue(meter.equals(centimeter));
    }

    @Test
    void testIf100meterIsEqualsTo0_1Kilometer() {
        Length meter = new Length(100,"m");
        Length kilometer = new Length(0.1,"km");

        assertTrue(meter.equals(kilometer));
    }

    @Test
    void testIf1meterPlus100CentimeterIsEqualTo2meter() {
        Length meter = new Length(1,"m");
        Length centimeter = new Length(100,"cm");
        Length expectedResult = new Length(2.0,"m");
        String expectedMetric = "m";

        Length result = meter.add(centimeter,expectedMetric);

        assertTrue(result.equals(expectedResult));
    }

    @Test

    void testIf200centimeterPlus1kilometerIsEqualTo100200Centimeter() {
        Length centimeter = new Length(200,"cm");
        Length kilometer = new Length(1,"km");
        Length expectedResult = new Length(100200,"cm");
        String expectedMetric = "cm";

        Length result = centimeter.add(kilometer,expectedMetric);

        assertTrue(result.equals(expectedResult));
    }

    @Test
    void testIf1meterMinus50centimeterIsEqualTo0_5meter() {
        Length meter = new Length(1,"m");
        Length centimeter = new Length(50,"cm");
        Length expectedResult = new Length(0.5,"m");
        String expectedMetric = "m";

        Length result = meter.subtract(centimeter,expectedMetric);

        assertTrue(result.equals(expectedResult));
    }

    @Test
    void testIf2000centimeterMinus1meterIsEqualTo1900centimeter() {
        Length centimeter = new Length(2000,"cm");
        Length meter = new Length(1,"m");
        Length expectedResult = new Length(1900,"cm");
        String expectedMetric = "cm";

        Length result = centimeter.subtract(meter,expectedMetric);

        assertTrue(result.equals(expectedResult));
    }
    @Test
    public void testIfGenericClassIsWorking(){
        Measurement<Length> length = new Measurement<Length>();
        Length expectedValue = new Length(2,"cm").add(new Length(1,"km"),"cm");
        Length actualValue = length.add( new Length(2,"cm"),new Length(1,"km"),"cm");

        Assertions.assertTrue(expectedValue.equals(actualValue));
    }
}
