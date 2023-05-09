import java.util.ArrayList;
public class RepeatElements
{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>(3);
        list.add("Chuck");
        list.add("is");
        list.add("fat");
        System.out.println(repeatElements(3,list));
    }
    public static ArrayList<String> repeatElements(int numRepeats, ArrayList<String> list){
        ArrayList<String> arr = new ArrayList<String>(list.size());
        for(int word = 0; word < list.size(); word++){
            for(int val = 0; val < numRepeats; val++){
                arr.add(list.get(word));
            }
        }
        return arr;
    }
}