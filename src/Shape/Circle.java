package Shape;

/**
 * Created by Admin on 20.06.2017.
 */
public class Circle extends Shape {
    private Point center;
    private Point radius;

    public Circle(Point center) {
        super();
        this.center = center;
        this.radius = radius;
    }

    public Circle(Point point, Point point1) {
        super();
    }

    public Point getCenter() {
        return null;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getRadius() {
        return radius;
    }

    public void setRadius(Point radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI * center.getDist(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * center.getDist(radius)*center.getDist(radius);
    }
}
