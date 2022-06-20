public class Rectangle extends Figure implements ICalculableArea {
    public Point a;
    public Point b;
    public Point c;

    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
        this.c = new Point(a.x, b.y);
    }

    public double getArea() {
        double ab = (a.distance(b));
        double bc = (b.distance(c));

        return ab * bc;
    }

    @Override
    public void print(double area) {
        System.out.println("Rectangle area: " + area);
    }
}

