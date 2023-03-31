public class Box{
    private int height;
    private int depth;
    private int width;

    public Box(int height, int depth, int width){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public Box(){
        width = 0;
        depth = 0;
        height = 0;
    }
    public int getWidth(){
        return width;
    }
    public int getDepth(){
        return depth;
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setDepth(int depth){
        this.depth = depth;
    }
    public void setHeight(int height){
        this.height = height;
    }
}