package utility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeightTest {
    @Test
    void testIfGenericClassWorks() {
        Measurement<Weight> weight = new Measurement<>(new Weight(2,"g"), new Weight(1,"kg"));
        Weight expectedValue = new Weight(2,"g").add(new Weight(1,"kg"),"kg");
        Weight actualValue = weight.add("m");

        Assertions.assertTrue(expectedValue.equals(actualValue));
    }
}
