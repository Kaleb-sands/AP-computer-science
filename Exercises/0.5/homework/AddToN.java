
public class AddToN
{
public int addOdds(int n){
    int count = 0;
	for(int x = 1; x <= n;){
        	count += x;
        	x=x+2;
    }
    return count;
}
}
