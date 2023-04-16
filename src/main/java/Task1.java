import static java.lang.Math.pow;

public class Task1 {
    interface Shape{
        void calculateArea( double input);
        void calculatePerimeter(double input);

    }
     class Circle implements Shape{


         @Override
         public void calculateArea(double input) {
             double area=Math.PI*pow(input,2);
         }

         @Override
         public void calculatePerimeter(double input) {
             double area=Math.PI*pow(input,2);
         }

     }
     class Square implements Shape{

         @Override
         public void calculateArea(double input) {
             double area;
         }

         @Override
         public void calculatePerimeter(double input) {

         }
     }

}
