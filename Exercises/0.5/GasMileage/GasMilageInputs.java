/*
 * This class gives inputs for the GasMileage class
 */
import java.util.Scanner;
public class GasMilageInputs
{
   public static void main(String[] args)
   {
        Scanner kb = new Scanner(System.in);  
        System.out.println("Press 1 to calculate MPG or press 2 to calculate Gallons used or 3 to stop");
        int choice = kb.nextInt();
       
        if (choice == 1){
            mileagePrompt(kb);
        }
        else if (choice == 2){
            gallonPrompt(kb);
        }
       kb.close();
   }
   private static void mileagePrompt(Scanner kb)
   {
        System.out.println("How many miles did you travel:");
        int milesTravled = kb.nextInt();
    
        System.out.println("How many gallons did you use:");
        double gallonsUsed = kb.nextInt();
    
        double milesPerGallon = GasMileage.mileageCalculator(milesTravled, gallonsUsed);
        System.out.println("You went " + milesTravled + " miles, and spent " + gallonsUsed + " gallons, so your gas mileage is " + milesPerGallon);
   }
   private static void gallonPrompt(Scanner kb)
   {
        System.out.println("How many Miles did you travel:");
        int milesWent = kb.nextInt();

        System.out.println("What is your MPG:");
        double milesPerGallon = kb.nextDouble();

        double gasSpent = GasMileage.gallonCalculator(milesWent, milesPerGallon);
        System.out.println("You went " + milesWent + " miles, and your MPG is " + milesPerGallon + ", so you used " + gasSpent + " gallons");
   }
}