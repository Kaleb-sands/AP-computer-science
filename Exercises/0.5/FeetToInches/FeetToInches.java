/*
 * This class converts feet and inches to inches
 */
public class FeetToInches
{
  public static int toInches(int feet, int inches)
  {
    int totalInches = feet * 12 + inches ;
    return totalInches;
  }
}
