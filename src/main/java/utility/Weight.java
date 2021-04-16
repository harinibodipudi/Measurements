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
        else if(measure.units.equals("kg") && this.units.equals("g")) {
            return this.value == kilogramToGram(measure.value);
        } else
            return this.value == gramToKilogram(measure.value);

    }

    public double gramToKilogram(double value) {

        return value/1000;
    }

    public double kilogramToGram(double value) {

        return (value)*1000;
    }

    public Weight add(Weight measure, String expectedMetric) {
        return new Weight(kilogramToGram(measure.value)+this.value,expectedMetric);
    }

    public Weight subtract(Weight measure, String expectedMetric) {
        return new Weight(this.value-gramToKilogram(measure.value),expectedMetric);
    }

}
