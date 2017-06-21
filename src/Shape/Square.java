package Shape;

/**
 * Created by Admin on 20.06.2017.
 */
public class Square extends Shape {
    private Point a;

    public Square(Point a) {
        super();
        this.a = a;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    @Override
    public double getPerimetr() {
        return a.getDist(a)*4;
    }

    @Override
    public double getArea() {
        return Math.pow(a.getDist(a),2);
    }
}
