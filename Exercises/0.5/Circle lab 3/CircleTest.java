import java.util.Scanner;
import java.awt.Color;

public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        
        Circle3 circleRegular = new Circle3(radius, Color.blue);
        Circle3 circleDouble = new Circle3(radius*2, Color.green);
        Circle3 circleHalf = new Circle3(radius/2, Color.orange);

        System.out.println("Before color change:\n");

       System.out.println(circleRegular.toString());
       System.out.println(circleDouble.toString());
       System.out.println(circleHalf.toString());

       circleDouble.setColor(Color.blue);
       circleHalf.setColor(Color.red);

       System.out.println("After color change:\n");

       System.out.println(circleRegular.toString());
       System.out.println(circleDouble.toString());
       System.out.println(circleHalf.toString());

       input.close();
  }
}
