import java.util.Scanner;

public class GreatestNumber{
    public static void main(String []args){
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = kb.nextInt();
        System.out.println("Enter second number: ");
        int num2 = kb.nextInt();
        System.out.println("Enter third number: ");
        int num3 = kb.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("The greatest number is: " + num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println("The greatest number is: " + num2);
        }else if (num3 > num2 && num3 > num1){
            System.out.println("The greatest number is: " + num3);
        }else{
            System.out.println("At least two of the numbers are the same");
        }
        kb.close();
    }
}