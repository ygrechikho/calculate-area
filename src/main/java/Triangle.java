public class Triangle extends Figure implements ICalculableArea {
    public Point a;
    public Point b;
    public Point c;
    private double Area = 0;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

        CalculateArea();
    }

    @Override
    public double CalculateArea() {
        double ab = (a.distance(b));
        double bc = (b.distance(c));
        double ca = (c.distance(a));
        double sp = 0.5 * (ab + bc + ca);
        Area = Math.sqrt(sp * (sp - ab) * (sp - bc) * (sp - ca));

        return Area;
    }

    @Override
    public void printArea() {
        System.out.println("Triangle area: " + Area);
    }
}
