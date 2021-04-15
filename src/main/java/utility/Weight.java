package utility;

public class Weight {

    double value;
    String units;

    public Weight(double value, String units) {
        this.value = value;
        this.units = units;
    }

    @Override
    public boolean equals(Object obj) {
        Weight quantity = (Weight) obj;
        if(quantity.units == this.units)
            return quantity.value == this.value;
        else if(quantity.units.equals("g") && this.units.equals("kg")) {
            return this.value == convertCentimeterToMeter(quantity.value);
        } else
            return this.value == convertMeterToKiloMeter(quantity.value);

    }

    private double convertMeterToKiloMeter(double value) {
        return 1000 * value;
    }

    public Weight add(Weight measure, String expectedMetric) {
        System.out.println("weight class");
        if(expectedMetric.equals("kg") && measure.units.equals("g")){
            return new Weight(convertCentimeterToMeter(measure.value)+this.value,expectedMetric);
        }
        return new Weight(convertKilometerToCentimeter(measure.value)+this.value,expectedMetric);
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


    public Weight subtract(Weight measure, String expectedMetric) {
        if(expectedMetric.equals("m") && measure.units.equals("cm")){
            return new Weight(this.value-convertCentimeterToMeter(measure.value),expectedMetric);
        }
        return new Weight(this.value-convertMeterToCentimeter(measure.value),expectedMetric);
    }


}
