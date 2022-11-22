import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        
        Circle circleRegular = new Circle();
        Circle circleDouble = new Circle();
        Circle circleHalf = new Circle();
  
        circleRegular.setRadius(radius);
        circleDouble.setRadius(radius*2);
        circleHalf.setRadius(radius/2);
     
       double areaRegular = circleRegular.calculateArea();
       double areaDouble = circleDouble.calculateArea();
       double areaHalf = circleHalf.calculateArea();
        
       System.out.println("The area of a circle with that radius is " + areaRegular);
       System.out.println("The area of a circle with double that radius is " + areaDouble);
       System.out.println("The area of a circle with half that radius is " + areaHalf);
       input.close();
  }
}
