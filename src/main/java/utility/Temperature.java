package utility;

public class Temperature extends Measurement{
    double value;
    String unit;

    public Temperature(double value, String unit) {
        super();
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        Temperature temperature = (Temperature) obj;
        if(this.unit=="celsius" && temperature.unit=="fahrenheit"){
            return temperature.value == (this.value*9/5)+32;
        }else{
            return this.value == 273+temperature.value;
        }
    }
}
