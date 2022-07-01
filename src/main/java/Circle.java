public class Circle extends Figure implements ICalculableArea {
    private Point a;
    private Point b;
    private double Area = 0;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;

        CalculateArea();
    }

    public double CalculateArea() {
        double r = a.distance(b);
        Area = Math.PI * Math.pow(r, 2);

        return Area;
    }
    @Override
    public void printArea() {
        System.out.println("Circle area: " + Area);
    }
}