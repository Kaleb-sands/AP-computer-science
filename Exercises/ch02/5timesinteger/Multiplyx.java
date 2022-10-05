//this project multiplies a integer by 2
import java.util.Scanner;

public class Multiplyx
{
    public static void main(String[]args)
    {
        Scanner kb  = new Scanner(System.in);

        System.out.println("Enter an integer:");
        String a = kb.nextLine();

        int x = Integer.parseInt(a);
        int y = x * 2;

        System.out.println("2 * " + a + " = " + y);
        kb.close();
    }
        
}