import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Please input HTML Line: ");
        String input = kb.nextLine();
        String output = removeTag(input);
        System.out.println("your parsed HTML code comes out to : \n" + output);
        kb.close();
    }

    public static String removeTag(String input){
        //int secondBracket = input.indexOf(">");
        //int thirdBracket = input.indexOf("\\", secondBracket);
        //int lastBracket = input.indexOf(">", thirdBracket);
        String firstTag = input.substring(1, input.indexOf(">"));
        String secondTag = input.substring(input.indexOf("\\", input.indexOf(">")) + 1, input.indexOf(">", input.indexOf("\\", input.indexOf(">"))));
        if(firstTag.equals(secondTag)){
            String output = input.substring(input.indexOf('>') + 1);
            output = output.substring(0, output.indexOf("<"));
            return output;
        }else{
            return input;
        }
    }
}