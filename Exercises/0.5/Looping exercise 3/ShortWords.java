public class ShortWords{
public static void printShortWords(String str, int maxLength){
    int length = str.length();
    int start = 0;
    int end = 0;
    while(str.length() > start){
        end = str.indexOf(" ", start);
        String temp = str.substring(start, end);
        if(temp.length() <= maxLength){
            System.out.print(temp + " ");
        }
        start = end + 1;
    }
}
}