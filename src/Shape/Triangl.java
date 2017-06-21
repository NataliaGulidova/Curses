package Shape;

/**
 * Created by Admin on 20.06.2017.
 */
public class Triangl extends Shape{
   private Point a;
   private Point b;
    private Point c;

    public Triangl(Point a, Point b, Point c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangl{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public double getPerimetr() {
       double perimetr =  Point.getDist(a,b) + Point.getDist(b,c) + Point.getDist(c,a) ;
        return perimetr;

    }

    @Override
    public double getArea() {
        double polPerimetr = this.getPerimetr()/2;
        return Math.sqrt(polPerimetr*(polPerimetr- Point.getDist(a,b))*(polPerimetr-Point.getDist(b,c))*(
                polPerimetr-Point.getDist(c,a)));
    }
}
