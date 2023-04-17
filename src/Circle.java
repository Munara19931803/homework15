public class Circle {
    private static final double PI=3.14;
    private static int radius;

    public Circle(int radius) {
        Circle.radius=radius;
    }

    public static void area() {
        System.out.println("area:" +( PI * (radius * radius)));

    }

    public static void circumference() {
        System.out.println("circumference: " +PI * 2 * radius );
    }

    public static int getRadius() {
        return radius;
    }

    public static void setRadius(int radius) {
        Circle.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                '}';
    }
}
