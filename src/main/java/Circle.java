public class Circle extends Figure implements ICalculableArea {
    public Point a;
    public Point b;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        double r = a.distance(b);
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public void print(double area) {
        System.out.println("Circle area: " + area);
    }
}