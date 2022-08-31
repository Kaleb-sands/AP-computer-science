/**
 * Class Hello:
 *
 * Hello-world program to demonstrate BlueJ.
 */
class Hello
{
    /**
     * Method that does the work 
     */
    public void go()
    {
        System.out.println("Hello, world");
        // I added this line to the program
        System.out.println("What are you doing today?");
    }
    
    /**
     *  main method for testing outside BlueJ 
     */
    public static void main(String[] args)
    {
        Hello hi = new Hello();
        hi.go();
    }
}
