package utility;

public class Measurement {

    int value;
    String units;

    public Measurement(int value,String units) {
        this.value = value;
        this.units = units;
    }

    @Override
    public boolean equals(Object obj) {
        Measurement measure = (Measurement) obj;
        if(measure.units == this.units)
            return measure.value == this.value;
        else
            return measure.value == 100*this.value;

    }


}
