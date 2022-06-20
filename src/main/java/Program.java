public class Program {
    public static void main(String[] args) {
        Figure triangle = new Triangle(new Point(1, 1), new Point(15, 15), new Point(1, 5));
        Figure circle = new Circle(new Point(1, 1), new Point(2, 2));
        Figure rectangle = new Rectangle(new Point(1, 5), new Point(3, 1));

        triangle.print(triangle.getArea());
        circle.print(circle.getArea());
        rectangle.print(rectangle.getArea());
    }
}
