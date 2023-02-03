import java.util.Scanner;

public class PositiveOrNegative{
    public static void main(String []args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = kb.nextInt();

        if(num<0){
            System.out.println("Your number is negative");
        } else{
            System.out.println("Your number is positive");
        }
        kb.close();
    }
}