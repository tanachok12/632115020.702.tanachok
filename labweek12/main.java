public class main {
    public static void main(String[] args) {
        double base = 6, height = 9;
        Shape ttriangle = new triangle(base, height);
        System.out.print("The triangle base is: " + base);
        System.out.print("The height is: " + height);
        System.out.println("The area is: " + ttriangle.getArea());

        double width = 13, length = 9;
        Shape rectangle = new Rectangle(widthh, length);
        System.out.print("The rectangle width is: " + width);
        System.out.print("The length is: " + length);
        System.out.println("The area is: " + rectangle.getArea());


        double radius = 3;
        Shape ccircle = new circle(radius);
        System.out.print("The radius of the circle is: " + radius);
        System.out.println("The area is: " + ccircle.getArea());
    }
}