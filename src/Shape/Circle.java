package Shape;

/**
 * Created by Admin on 20.06.2017.
 */
public class Circle extends Shape {
    private Point center;
    private Point radius;

    public Circle(Point center, Point radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
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
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI * Point.getDist(center,radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Point.getDist(center,radius)*Point.getDist(center,radius);
    }
}
