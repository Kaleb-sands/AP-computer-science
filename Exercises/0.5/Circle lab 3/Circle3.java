import java.awt.Color;
public class Circle3{
    private double xCenter;
    private double yCenter;
    private double radius;
    private Color fillColor;

    public Circle3(){

    }
    public Circle3(double x, double y, double r){
        xCenter = x;
        yCenter = y;
        radius = r;
    }
    public Circle3(double radius, Color fillColor){
        this.radius = radius;
        this.fillColor = fillColor;
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
    public void setColor(Color circleColor){
        fillColor = circleColor;
    }
    public Color getColor(){
        return fillColor;
    }
    public double calculateArea(){
        return Math.PI * (radius * radius);
    }
    public String toString(){
        return "-Radius: "
        + this.radius + "\n-Color: "
        + this.fillColor + "\n-Area: "
        + calculateArea()
        + "\n";
    }
}
