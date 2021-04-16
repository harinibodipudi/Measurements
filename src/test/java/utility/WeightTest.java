package utility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeightTest {
    @Test
    void testIf1GramIsEqualTo1Gram() {
       Assertions.assertTrue(new Weight(1,"g").equals(new Weight(1,"g")));
    }
}
