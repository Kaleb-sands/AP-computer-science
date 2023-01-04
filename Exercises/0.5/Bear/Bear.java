public class Bear{
    public static int totalHugs = 0;
    private String name;
    private int hugs;

    public Bear(String name){
        this.name = name;
    }

    public static int getTotalHugs(){
        return totalHugs;
    }
    public void addHugs(int hugAmt){
        this.hugs += hugAmt;
        totalHugs += hugAmt;
    }
    public int getHugs(){
        return this.hugs;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return "Bear name: " + name
        + "\nBear Hugs: " + hugs + "\n";
    }
}