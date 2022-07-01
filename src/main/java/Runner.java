public class Runner {
    public static void main(String[] args) {
        Figure triangle = new Triangle(new Point(1, 1), new Point(3, 4), new Point(1, 4));
        Figure circle = new Circle(new Point(1, 1), new Point(10, 10));
        Figure rectangle = new Rectangle(new Point(1, 1), new Point(5, 5));

        triangle.printArea();
        circle.printArea();
        rectangle.printArea();
    }
}