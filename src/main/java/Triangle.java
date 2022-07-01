public class Triangle extends Figure implements ICalculableArea {
    private Point a;
    private Point b;
    private Point c;
    private double Area = 0;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

        calculateArea();
    }

    @Override
    public double calculateArea() {
        double ab = (a.distance(b));
        double bc = (b.distance(c));
        double ca = (c.distance(a));
        double sp = 0.5 * (ab + bc + ca);
        var area = Math.sqrt(sp * (sp - ab) * (sp - bc) * (sp - ca));
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
        System.out.println("Triangle area: " + Area);
    }
}