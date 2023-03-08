import java.util.Scanner;
public class StringUtilities{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = kb.nextLine();
        boolean isPalendrome = isPalendrome(str);
        System.out.println("It is " + isPalendrome + " that the word is a palendrome");
        String convertedName = convertName(str);
        System.out.println("The converted name = " + convertedName);
    }
    public static boolean isPalendrome(String word){
        boolean isPalendrome;
        String reverseWord = "";
        char ch;
        for (int i = 0; i < word.length(); i++)
        {
            ch = word.charAt(i);
            reverseWord = ch + reverseWord;
        }
        if(reverseWord.equals(word)){
            isPalendrome = true;
        }else{
            isPalendrome = false;
        }
        return isPalendrome;
    }
    public static String convertName(String str){
        String convertedName = "";
        int comma = str.indexOf(",");
        String firstName = str.substring(comma + 1);
        convertedName = firstName.trim();
        convertedName += " " + str.substring(0,comma);
        System.out.println(convertedName);
        return convertedName;
    }
}