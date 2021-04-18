package utility;

public class Measurement<T extends Measurement> {

    public boolean equals(T measurement1, T measurement2){
        if(measurement1.getClass()== Length.class && measurement2.getClass()==Length.class){
            return ((Length)measurement1).equals((Length) measurement2);
        }else if(measurement1.getClass()==Weight.class && measurement2.getClass()==Weight.class){
            return ((Weight)measurement1).equals((Weight) measurement2);
        }else{
            return  ((Temperature)measurement1).equals((Temperature)measurement2);
        }

    }


    public T add(T measurement1, T measurement2,String expectedMetric){
           if(measurement1.getClass()== Length.class && measurement2.getClass()==Length.class){
               return (T)((Length)measurement1).add((Length) measurement2,expectedMetric);
           }else{
               return (T)((Weight)measurement1).add((Weight) measurement2,expectedMetric);
           }
       }

    public T subtract(T measurement1, T measurement2,String expectedMetric){
        if(measurement1.getClass()== Length.class && measurement2.getClass()==Length.class){
            return (T)((Length)measurement1).subtract((Length) measurement2,expectedMetric);
        }else{
            return (T)((Weight)measurement1).subtract((Weight) measurement2,expectedMetric);
        }
    }

}
