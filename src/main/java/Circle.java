public class Circle extends Figure implements ICalculableArea {
    private final Point a;
    private final Point b;
    private double Area = 0;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;

        calculateArea();
    }

    public double calculateArea() {
        double r = a.distance(b);
        var area = Math.PI * Math.pow(r, 2);
        if (area == 0) {
            System.out.println("Area invalid, please re-check figure.");
        } else {
            Area = area;
        }

        return Area;
    }

    public double getArea() {
        return Area;
    }

    @Override
    public void printArea() {
        System.out.println("Circle area: " + Area);
    }
}