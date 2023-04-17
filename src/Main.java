public class Main {
    public static void main(String[] args) {
        new Circle(33);
        System.out.println("radius: " +Circle.getRadius());
        Circle.area();
        Circle.circumference();
    }
}