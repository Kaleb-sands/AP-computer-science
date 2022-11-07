//this project multiplies a integer by 2
import java.util.Scanner;

public class Multiplyx
{
    public static void main(String[]args)
    {
        Scanner kboard  = new Scanner(System.in);

        System.out.println("Enter an integer:"); // Asks for integer
        String a = kboard.nextLine();

        
        System.out.println("What is your first name?"); // Asks for first name
        String firstName = kboard.nextLine();
        //firstName = kboard.nextLine();

        System.out.println("What is your last name?"); // Asks for last name
        String lastName = kboard.nextLine();

        int x = Integer.valueOf(a);
        int y = x * 2; // Does input integer times 2

        System.out.println("Hello " + firstName + " " + lastName + ", The answer is 2 * " + a + " = " + y); // Output message
        kboard.close();
    }
        
}