import java.util.Scanner;

public class NumbersInput{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Press 1 for average or 2 for surface area:");
        int choice = kb.nextInt();
        
        System.out.print("What is the first number:");
        int num1 = kb.nextInt();
        System.out.print("What is the second number:");
        int num2 = kb.nextInt();
        System.out.print("what is the third number:");
        int num3 = kb.nextInt();
        
        if (choice == 1){
            double average = Numbers3.averageCalc(num1,num2,num3);
            System.out.println("Your average number is " + average);
        }
        if (choice == 2){
            int surfaceArea = Numbers3.surfaceArea(num1,num2,num3);
            System.out.println("The surface area is " + surfaceArea);
        }
    }
}