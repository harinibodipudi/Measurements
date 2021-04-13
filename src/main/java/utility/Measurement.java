package utility;

public class Measurement {

    double value;
    String units;

    public Measurement(double value, String units) {
        this.value = value;
        this.units = units;
    }

    @Override
    public boolean equals(Object obj) {
        Measurement measure = (Measurement) obj;
        if(measure.units == this.units)
            return measure.value == this.value;
        else if(measure.units.equals("cm") && this.units.equals("m")) {
            return this.value == convertCentimeterToMeter(measure.value);
        } else
            return this.value == convertMetertoKiloMeter(measure.value);

    }

    private double convertMetertoKiloMeter(double value) {
        return 1000 * value;
    }

    public Measurement add(Measurement measure, String expectedMetric) {
        if(expectedMetric.equals("m") && measure.units.equals("cm")){
            return new Measurement(convertCentimeterToMeter(measure.value)+this.value,expectedMetric);
        }
        return new Measurement(convertKilometerToCentimeter(measure.value)+this.value,expectedMetric);
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


    public Measurement subtract(Measurement measure, String expectedMetric) {
        if(expectedMetric.equals("m") && measure.units.equals("cm")){
            return new Measurement(this.value-convertCentimeterToMeter(measure.value),expectedMetric);
        }
        return new Measurement(this.value-convertMeterToCentimeter(measure.value),expectedMetric);
    }


}
