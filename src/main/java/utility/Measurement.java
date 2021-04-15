package utility;

public class Measurement<T extends Measurement> {


    public T add(T measurement1, T measurement2,String expectedMetric){
           if(measurement1.getClass()== Length.class && measurement2.getClass()==Length.class){
               return (T)((Length)measurement1).add((Length) measurement2,expectedMetric);
           }else{
               return (T)((Weight)measurement1).add((Weight) measurement2,expectedMetric);
           }
       }
}
