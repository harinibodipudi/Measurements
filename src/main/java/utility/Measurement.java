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
        else if(measure.units.equals("m") && this.units.equals("cm"))
            return measure.value == 100*this.value;
        else
            return 100000*measure.value == this.value;
    }


}
