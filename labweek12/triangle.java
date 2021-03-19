public class triangle extends Shape {
    private double base, height;
    public triangle()
    {
        this.base = 1;
        this.height = 1;
    }
    public triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public double getArea()
    {
        return 0.5* base * height;
    }
}
