package Shape;

/**
 * Created by Admin on 20.06.2017.
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getDist(Point b) {
        return Math.sqrt((this.x - b.getX()) * (this.x - b.getX())
                + (this.y - b.getY()) * (this.y - b.getY()));
    }
}
