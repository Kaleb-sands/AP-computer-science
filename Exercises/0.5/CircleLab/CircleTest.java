import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        
        Circle circleRegular = new Circle(5, 5, radius);
        Circle circleDouble = new Circle(5, 5, radius/2);
        Circle circleHalf = new Circle(5, 5, radius*2);
     
       double areaRegular = circleRegular.calculateArea();
       double areaDouble = circleDouble.calculateArea();
       double areaHalf = circleHalf.calculateArea();
        
       System.out.println("The area of a circle with that radius is " + areaRegular);
       System.out.println("The area of a circle with double that radius is " + areaDouble);
       System.out.println("The area of a circle with half that radius is " + areaHalf);
       input.close();
  }
}
