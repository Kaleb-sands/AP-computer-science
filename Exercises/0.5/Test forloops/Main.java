public class Main{
public static void main(String[] args){
    int currentRow;
    for(currentRow = 1; currentRow <= 7; currentRow++){
        String line = "";
        for(; line.length() < currentRow;){
            line = line + currentRow;
        }
        System.out.println(line);
    }
}
}