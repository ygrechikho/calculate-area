public class Rectangle extends Figure implements ICalculableArea {
    private Point a;
    private Point b;
    private Point c;
    private double Area = 0;

    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
        this.c = new Point(a.x, b.y);

        CalculateArea();
    }

    public double CalculateArea() {
        double ab = (a.distance(b));
        double bc = (b.distance(c));
        Area = ab * bc;

        return Area;
    }

    @Override
    public void printArea() {
        System.out.println("Rectangle area: " + Area);
    }
}

