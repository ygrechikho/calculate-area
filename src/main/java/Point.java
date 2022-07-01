public class Point {
    protected double x;
    protected double y;

    public Point(double a, double b) {
        this.x = a;
        this.y = b;
    }

    public double distance(Point other) {
        return Math.sqrt((Math.pow((x - other.x), 2) + (Math.pow((y - other.y), 2))));
    }
}
