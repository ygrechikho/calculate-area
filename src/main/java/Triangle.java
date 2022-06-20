public class Triangle extends Figure implements ICalculableArea {
    public Point a;
    public Point b;
    public Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double ab = (a.distance(b));
        double bc = (b.distance(c));
        double ca = (c.distance(a));
        double sp = 0.5 * (ab + bc + ca);

        return Math.sqrt(sp * (sp - ab) * (sp - bc) * (sp - ca));
    }

    @Override
    public void print(double area) {
        System.out.println("Triangle area: " + area);
    }
}
