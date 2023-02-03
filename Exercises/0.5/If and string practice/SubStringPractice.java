public class SubStringPractice{
    public static void main(String []args){
        String str = "quick brown fox jumps over the lazy dog";
        String insert = "cat";
        System.out.println(str.substring(15));
        System.out.println(str.substring(11,20));
        System.out.println(str.substring(0,12) + insert + str.substring(15));
        
    }
}