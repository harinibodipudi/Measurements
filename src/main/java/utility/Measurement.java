package utility;

public class Measurement {

    double value;
    String units;

//    public String getExpectedMetric() {
//        return expectedMetric;
//    }
//
//    public void setExpectedMetric(String expectedMetric) {
//        this.expectedMetric = expectedMetric;
//    }
//
//    private String expectedMetric;

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

    public Measurement add(Measurement measure1, String expectedMetric) {
        if(expectedMetric.equals("m") && measure1.units.equals("cm")){
            return new Measurement(convertCentimeterToMeter(measure1.value)+this.value,expectedMetric);
        }
        return new Measurement(convertKilometerToCentimeter(measure1.value)+this.value,expectedMetric);
    }

    private double convertKilometerToCentimeter(double value) {
        return 100000*value;
    }

    private double convertCentimeterToMeter(double value) {
        return (value)/100;
    }
}
