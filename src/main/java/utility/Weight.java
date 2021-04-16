package utility;

public class Weight extends Measurement {

    double value;
    String units;

    public Weight(double value, String units) {
        super();
        this.value = value;
        this.units = units;
    }

    @Override
    public boolean equals(Object obj) {
        Weight measure = (Weight) obj;
        if(measure.units == this.units)
            return measure.value == this.value;
        else if(measure.units.equals("g") && this.units.equals("kg")) {
            return this.value == kilogramToGram(measure.value);
        } else
            return this.value == gramToKilogram(measure.value);

    }

    public double gramToKilogram(double value) {

        return 1000 * value;
    }

    public double kilogramToGram(double value) {

        return (value)/1000;
    }


}
