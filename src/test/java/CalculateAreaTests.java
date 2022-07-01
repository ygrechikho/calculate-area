import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class CalculateAreaTests {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void TrianglePointsValidAreaIsCalculated() {
        Figure triangle = new Triangle(new Point(1, 1), new Point(3, 4), new Point(1, 4));

        Assert.assertEquals(3, triangle.getArea(), 0.1);
    }

    @Test
    public void TrianglePointsInvalidAreaErrorDisplayed() {
        var expectedMessage = "Area invalid, please re-check figure.";
        Figure triangle = new Triangle(new Point(0, 0), new Point(0, 0), new Point(0, 0));

        Assert.assertEquals(expectedMessage, systemOutRule.getLog().trim());

        systemOutRule.clearLog();
    }

    @Test
    public void RectanglePointsValidAreaIsCalculated() {
        Figure rectangle = new Rectangle(new Point(1, 1), new Point(5, 5));

        Assert.assertEquals(22.6, rectangle.getArea(), 0.1);
    }

    @Test
    public void RectanglePointsInvalidAreaErrorDisplayed() {
        var expectedMessage = "Area invalid, please re-check figure.";
        Figure rectangle = new Rectangle(new Point(0, 0), new Point(0, 0));

        Assert.assertEquals(expectedMessage, systemOutRule.getLog().trim());

        systemOutRule.clearLog();
    }

    @Test
    public void CirclePointsValidAreaIsCalculated() {
        Figure circle = new Circle(new Point(1, 1), new Point(10, 10));

        Assert.assertEquals(508.9, circle.getArea(), 0.1);
    }

    @Test
    public void CirclePointsInvalidAreaErrorDisplayed() {
        var expectedMessage = "Area invalid, please re-check figure.";
        Figure circle = new Circle(new Point(0, 0), new Point(0, 0));

        Assert.assertEquals(expectedMessage, systemOutRule.getLog().trim());

        systemOutRule.clearLog();
    }
}