package utility;

public class Measurement<T> {


       public <T extends Length> T add(T obj1,T obj2 ,String expectedMetric){
           if(obj1.getClass()==Length.class && obj2.getClass()==Length.class){
               return (T)obj1.add(obj2,expectedMetric);
           }else{
               return obj1;
           }
       }
}
