import java.util.Scanner;
public class sentenceTranslator{

    public static String translate(String input){
        String output = "";
        Scanner kb = new Scanner(System.in);
        boolean keepLooping = true;
        String sentence = input;

        String arr[] = input.split(" ");

        for(int x = 0; x < arr.length; x++){
            output += translateWord(arr[x]) + " ";
            
        }
        kb.close();
        return output;
    }
    public static String translateWord(String word){
        char first = word.charAt(0);
            String output;

            if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'){
                output = word + "yay";
            }else{
                output = word.substring(1,word.length()) + word.substring(0,1) + "ay";
            }
            return output;
    }
}