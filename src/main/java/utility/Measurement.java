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
        if(measure.units.equals("cm") && this.units.equals("m")) {
            return measure.value == 100 * this.value;
        } else if(measure.units == this.units)
            return measure.value == this.value;
        else
            return 1000*measure.value == this.value;
    }


}
