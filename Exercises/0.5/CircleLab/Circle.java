public class Circle{
    private double xCenter;
    private double yCenter;
    private double radius;
    public Circle(){

    }
    public Circle(double x, double y, double r){
        xCenter = x;
        yCenter = y;
        radius = r;
    }
    public void seXCenter(double xCoord){
        xCenter = xCoord;
    }
    public void setYCenter(double yCoord){
        yCenter = yCoord;
    }
    public double getXCenter(){
        return xCenter;
    }
    public double getYCenter(){
        return yCenter;
    }
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    public double getRadius(){
        return radius;
    }
    public double calculateArea(){
        return Math.PI * (radius * radius);
    }
}
