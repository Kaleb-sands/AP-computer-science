public class ConsecutiveCharacter{
    public static void longestStreak(String str){
        int count = 0;
        int length = str.length();
        String result = "";

        for(int x = 0; x < length; x++){
            int tempCount = 1;
            for(int i = x + 1; i < length; i++){
                if(str.charAt(x) != str.charAt(i)){
                    break;
                }
                tempCount++;
                if(tempCount > count){
                    count = tempCount;
                    char a = str.charAt(x);
                    result = "" + a;
                }
            }
        }
        result += " " + count;
        System.out.println(result);
    }
}