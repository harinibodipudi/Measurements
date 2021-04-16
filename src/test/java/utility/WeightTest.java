package utility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeightTest {
    @Test
    void testIf1GramIsEqualTo1Gram() {
       Measurement<Weight> weight = new Measurement<Weight>();
       Assertions.assertTrue(weight.equals(new Weight(1,"g"),new Weight(1,"g"))
       );
    }

    @Test
    void testIf0_1KilogramIsEqualTo100Grams() {
        Measurement<Weight> weight = new Measurement<Weight>();
        Assertions.assertTrue(weight.equals(new Weight(0.1,"kg"),new Weight(100,"g"))
        );
    }



    @Test
    void testIf10GramsPlus1KiloGramIsEqualTo1010Grams() {
        Measurement<Weight> weight = new Measurement<Weight>();
        Weight expectedValue = new Weight(10,"g").add(new Weight(1,"kg"),"kg");
        Weight actualValue = weight.add(new Weight(10,"g"),new Weight(1,"kg"),"kg");

        Assertions.assertTrue(expectedValue.equals(actualValue));
    }

    @Test
    void testIf1_5KiloGramsMinus500GramsIsEqualTo1KiloGrams() {
        Measurement<Weight> weight = new Measurement<Weight>();
        Weight expectedValue = new Weight(1.5,"kg").subtract(new Weight(500,"g"),"kg");
        Weight actualValue = weight.subtract(new Weight(1.5,"kg"),new Weight(500,"g"),"kg");

        Assertions.assertTrue(expectedValue.equals(actualValue));
    }
}
