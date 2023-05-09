import java.util.Scanner;
public class piglatinTranslator{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        boolean keepLooping = true;
        while(keepLooping){
            System.out.println("Enter a word to translate: ");
            String word = kb.nextLine();
            char first = word.charAt(0);
            String output;

            if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'){
                output = word + "yay";
                System.out.println(word + " is " + output + " in piglatin");
            }else{
                output = word.substring(1,word.length()) + word.substring(0,1) + "ay";
                System.out.println(word + " is " + output + " in piglatin");
            }
            System.out.println("Would you like to translate another word? (Y/N):");
            String choice = kb.nextLine();
            if(choice.equalsIgnoreCase("y")){
                keepLooping = true;
            }else if(choice.equalsIgnoreCase("n")){
                keepLooping = false;
            }
        }
    }
}