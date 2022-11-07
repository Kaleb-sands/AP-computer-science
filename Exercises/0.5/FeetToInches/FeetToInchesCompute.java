/*
 * This computes the class FeetToInches
 */
import java.util.Scanner;

public class FeetToInchesCompute
{
    public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);

    System.out.print("Feet: ");
    int feet = kboard.nextInt();

    System.out.print("Inches: ");
    int inches = kboard.nextInt();

    kboard.close();

    int totalInches = FeetToInches.toInches(feet, inches);

    System.out.println(feet + " feet and " + inches + " inches = " + totalInches + " inches");
  }
}