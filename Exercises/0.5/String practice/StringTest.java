public class StringTest
{
   public static void findIndexOfString(String str1, String sub){
       int index = str1.indexOf(sub);
       if(index < 0){
           System.out.println("This substring does not exist in the string");
       }else{
           System.out.println("The starting index of " + sub + " is: " + index);
       }
   }
   public static void compareStrings(String str1, String str2){
       int n = str1.compareTo(str2);
       if(n == 0){
           System.out.println("The two strings are the same");
       }else if (n > 0){
           System.out.println("The strings in Lexical order are " + str2 + " " + str1);
       }else{
           System.out.println("The strings in Lexical order are " + str1 + " " + str2);
       }
   }
}
