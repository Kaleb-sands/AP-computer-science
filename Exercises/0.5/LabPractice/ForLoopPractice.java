import java.util.Scanner;

public class ForLoopPractice{
    public static void main(String []args){
        Scanner kb = new Scanner(System.in);

        System.out.println("Please input the number(Table to be calculated)");
        int input = kb.nextInt();
        for(int x = 0; x <= input; x++ ){
            System.out.print(input + " x " + x + " = " + input*x + "\n");
        }
        kb.close();
    }
}