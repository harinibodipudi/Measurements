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

    @Test
    void testIf10GramsPlus1KiloGramIsEqualTo1010Grams() {
        Assertions.assertTrue((new Weight(10,"g")
                        .add(new Weight(1,"kg"),"g"))
                .equals(new Weight(1010,"g")));
    }

    @Test
    void testIf1_5KiloGramsMinus500GramsIsEqualTo1KiloGrams() {
        Assertions.assertTrue((new Weight(1.5,"kg")
                .subtract(new Weight(500,"g"),"kg"))
                .equals(new Weight(1,"kg")));
    }
}
