import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your Sentence: ");
        String input = kb.nextLine();
        System.out.println("Your Translated Sentence is: " + sentenceTranslator.translate(input));
    }
}