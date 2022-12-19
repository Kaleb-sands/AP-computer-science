public class B extends A {
    public B(){
        super(22);
        System.out.println("B No args Constructor");
    }
    public B(int x){
        this();
        System.out.println("B single args Constructor with value" +  x);
    }
}