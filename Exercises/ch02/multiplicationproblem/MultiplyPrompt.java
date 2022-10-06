//this project multiplies a integer by 2
import java.util.Scanner;

public class MultiplyPrompt
{
    public static void main(String[]args)
    {
        Scanner kb  = new Scanner(System.in);

        System.out.println("Enter first number:");
        String firstNumber = kb.nextLine();

        System.out.println("Enter second number;");
        String secondNumber = kb.nextLine();
        
        System.out.println("Enter second number;");
        

        int x = Integer.parseInt(firstNumber);
        int y = Integer.parseInt(secondNumber);
        int z = x * y;

        System.out.println(x + " * " + y + " = " + z);
        kb.close();
    }
        
}