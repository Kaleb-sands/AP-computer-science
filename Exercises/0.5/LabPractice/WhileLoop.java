import java.util.Scanner;
public class WhileLoop{
    public static void main(String []args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Please input the number to be halved");
        int input = kb.nextInt();
        while(input > 0){
            System.out.println(input);
            input = input / 2;  
        }
        kb.close();
    }
}