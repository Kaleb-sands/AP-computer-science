import java.util.Scanner;

public class PrintHello
{
    public static void printName(String name)
    {
        System.out.println("Hello, my name is " + name);
        
        //Scanner kb = new Scanner(System.in);

        //System.out.println("Enter your name");
        //String name = "Kaleb Sands";
        //System.out.println("Hello, my name is " + name );
        //kb.close();
    }
    public static void printOut()
    {
        System.out.println("Hello World");
    }
    
    public static void main(String[] args)
    {
        printOut();
        printName();
    }
}