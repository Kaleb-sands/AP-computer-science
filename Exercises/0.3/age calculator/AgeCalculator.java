import java.util.Scanner;

public class AgeCalculator
{
    public static int monthToYear(int ageY)
    {
        int ageM = ageY * 12;
        return ageM;
    }
    
    public static void main(String[] args)
    {
        int ageY,ageM;
        
        Scanner kb = new Scanner(System.in);
        System.out.println("What is your age in years?");
        ageY = kb.nextInt();
        
        ageM = monthToYear(ageY);
        System.out.println("Your age in months is " + ageM);
    }
}