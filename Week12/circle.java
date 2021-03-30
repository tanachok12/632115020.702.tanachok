package Week12;


public class circle extends shape
{
    private double radius;
    private double pi = Math.PI;

    public circle()
    {
        this.radius = 1;
    }

    public circle(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {

        return (pi * Math.pow(radius, 2));
    }


}
