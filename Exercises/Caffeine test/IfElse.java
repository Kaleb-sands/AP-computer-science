/**
 * Displays a "Hello World!" message on the screen 
 */
import java.time.LocalTime;
public class IfElse
{    
  public static void main(String[] args)
  { 
    LocalTime theTime = LocalTime.now();
    int theHour = theTime.getHour();
    if (theHour < 7) {
        outputCoffee();
    }
    else {
        outputPlate();
    }
  }
  private static void outputCoffee()
  {
    System.out.println("             d");
    System.out.println("      o     l");
    System.out.println("     l     r");
    System.out.println("      l     o");
    System.out.println("     e     w");
    System.out.println("    H");
    System.out.println("*****************");
    System.out.println("*            *   *");
    System.out.println("*    Java    *   *");
    System.out.println("*            ****");
    System.out.println("*   Is Hot   *");
    System.out.println("*            *");
    System.out.println("*            *");
    System.out.println("**************");
  }
  private static void outputPlate()
  {
    System.out.println("    Good Afternoon");
    System.out.println("                **");
    System.out.println("       * * *    **");
    System.out.println("       * * *    **");
    System.out.println("       * * *    **");
    System.out.println("        ***     **");
    System.out.println("         *      *");
    System.out.println("         *      *");
    System.out.println("         *      *");
    System.out.println("*        *      *      *");
    System.out.println(" *                    *");
    System.out.println("  ********************");
  }
}
