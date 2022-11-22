/*
 * input for the TextWriter class
 */
import java.util.Scanner;

public class TextInput{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("What text would you like to display?");
        String inputText = kb.nextLine();
        System.out.println("Printing your text...");
        
        TextWriter TextLine1 = new TextWriter();
        TextLine1.setInputText(inputText);
        TextLine1.displayInputText();
        kb.close();
    }
}