public class Rectangle extends Figure implements ICalculableArea {
    private Point a;
    private Point b;
    private Point c;
    private double Area = 0;

    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
        this.c = new Point(a.x, b.y);

        calculateArea();
    }

    public double calculateArea() {
        double ab = (a.distance(b));
        double bc = (b.distance(c));
        var area = ab * bc;
        if(area == 0)
        {
            System.out.println("Area invalid, please re-check figure.");
        }
        else{
            Area = area;
        }

        return Area;
    }

    public double getArea(){
        return Area;
    }

    @Override
    public void printArea() {
        System.out.println("Rectangle area: " + Area);
    }
}