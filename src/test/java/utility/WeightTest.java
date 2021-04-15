package utility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeightTest {
    @Test
    void testIfGenericClassWorks() {
        Measurement<Weight> weight = new Measurement<Weight>();
        Weight expectedValue = new Weight(2,"kg").add(new Weight(1,"kg"),"kg");
        Weight actualValue = weight.add(new Weight(2,"kg"),new Weight(1,"kg"),"kg");

        Assertions.assertTrue(expectedValue.equals(actualValue));
    }
}
