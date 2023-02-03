import java.util.Scanner;
public class ExerciseNine
{
    public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    boolean keepLooping = true;
    int n = 0;
    while(keepLooping){
        System.out.println("Enter a positive integer under 10: ");
        n = kb.nextInt();
        if(n >= 10 || n < 0){
            System.out.println("This number does not meet the requirements");
            System.out.println("Please try again:");
        }else{
            keepLooping = false;
        }
    }
    int sum = 0;
    for(int x = 1; x <= n;){
        System.out.print(x);
        sum += x;
        if(x < n){
            System.out.print(" + ");
        }
        x++;
    }
    System.out.print(" = " + sum);
    }
}
