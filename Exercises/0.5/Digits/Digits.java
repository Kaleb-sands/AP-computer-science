import java.util.ArrayList;
public class Digits{

    private ArrayList<Integer> digitList;

    public Digits(int num){
        digitList = new ArrayList<>();
        if(num == 0)
            digitList.add(0);
        while(num > 0){
            digitList.add(0, num % 10);
            num = num / 10;
        }
    }

    public boolean isStriclyIncreasing(){
        for(int x = 1; x < digitList.size(); x++){
            if(digitList.get(x) <= digitList.get(x - 1))
                return false;
        }
        return true;
    }
}