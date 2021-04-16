package utility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeightTest {
    @Test
    void testIf1GramIsEqualTo1Gram() {
       Assertions.assertTrue(new Weight(1,"g").equals(new Weight(1,"g")));
    }

    @Test
    void testIf0_1KilogramIsEqualTo100Grams() {
        Assertions.assertTrue(new Weight(0.1,"kg").equals(new Weight(100,"g")));
    }
}
