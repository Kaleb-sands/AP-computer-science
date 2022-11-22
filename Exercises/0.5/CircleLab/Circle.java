public class Circle
{
    private double radius;

    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double calculateArea()
    {
        return Math.PI * (radius * radius);
    }
}
