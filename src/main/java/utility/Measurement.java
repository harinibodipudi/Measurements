package utility;

public class Measurement<T> {
    private T measurement1, measurement2;
    public Measurement(T obj1 , T obj2 ){
        this.measurement1=obj1;
        this.measurement2=obj2;
    }

    public <T extends Length, U extends Weight> U add(String expectedMetric){
           if(measurement1.getClass()==Length.class && measurement2.getClass()==Length.class){
               return (U)measurement1;
           }else{
               return (U)((U)measurement1).add((Weight) measurement2,expectedMetric);
           }
       }
}
