import java.util.Scanner;
public class HeaderTestCase{
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Please input HTML Line: ");
        String input = kb.nextLine();
        String output = removeTag(input);
        System.out.println("your parsed HTML code comes out to : \n" + output);
        kb.close();
    }

    public static String removeTag(String input){
        String firstTag = input.substring(1, input.indexOf(">"));
        String secondTag = input.substring(input.lastIndexOf("/") + 1, input.lastIndexOf(">"));
        //<h><b>test<\b><\h>
        String temp = input.substring(input.indexOf('>') + 1);
        temp = temp.substring(0, temp.lastIndexOf("<"));
        if(temp.charAt(0) == '<'){
            temp = temp.substring(temp.indexOf('>') + 1);
            temp = temp.substring(0, temp.lastIndexOf("<"));
        }
        if(firstTag.equals(secondTag)){
            String output;
            if(firstTag.equals("h")){
                output = "\t" + temp;
            }else{
                output = temp;
            }
            return output;
        }else{
            return input;
        }
    }

}