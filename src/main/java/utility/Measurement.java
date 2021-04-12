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
        return measure.units == this.units && measure.value == this.value;
    }


}
