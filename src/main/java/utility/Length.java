package utility;

public class Length{

    double value;
    String units;

    public Length(double value, String units) {
        this.value = value;
        this.units = units;
    }

    @Override
    public boolean equals(Object obj) {
        Length measure = (Length) obj;
        if(measure.units == this.units)
            return measure.value == this.value;
        else if(measure.units.equals("cm") && this.units.equals("m")) {
            return this.value == convertCentimeterToMeter(measure.value);
        } else
            return this.value == convertMeterToKiloMeter(measure.value);

    }

    private double convertMeterToKiloMeter(double value) {
        return 1000 * value;
    }

    public Length add(Length measure, String expectedMetric) {
        if(expectedMetric.equals("m") && measure.units.equals("cm")){
            return new Length(convertCentimeterToMeter(measure.value)+this.value,expectedMetric);
        }
        return new Length(convertKilometerToCentimeter(measure.value)+this.value,expectedMetric);
    }

    private double convertKilometerToCentimeter(double value) {
        return 100000*value;
    }

    private double convertCentimeterToMeter(double value) {
        return (value)/100;
    }

    private double convertMeterToCentimeter(double value) {
        return value*100;
    }


    public Length subtract(Length measure, String expectedMetric) {
        if(expectedMetric.equals("m") && measure.units.equals("cm")){
            return new Length(this.value-convertCentimeterToMeter(measure.value),expectedMetric);
        }
        return new Length(this.value-convertMeterToCentimeter(measure.value),expectedMetric);
    }


}
