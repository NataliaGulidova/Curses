package OOP;

/**
 * Created by Admin on 13.06.2017.
 */
//Описать класс «Vector3d» (т.е. он должен описывать вектор в 3-х мерной,
// декартовой системе координат). В качестве свойств этого класса возьмите
// координаты вектора. Для этого класса реализовать методы сложения, скалярного и
// векторного произведения векторов. Создайте несколько объектов этого класса и протестируйте их.
public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public Vector3d() {
        super();
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public static Vector3d vectSum(Vector3d a, Vector3d b) {
        Vector3d sum = new Vector3d();
        sum.setX(a.getX() + b.getX());
        sum.setY(a.getY() + b.getY());
        sum.setZ(a.getZ() + b.getZ());
        return sum;
    }

    public static double scalar(Vector3d a, Vector3d b) {
        double scal = a.getX() * b.getX() + a.getY() * b.getY() + a.getZ() * b.getZ();
        return scal;
    }

    public static Vector3d vectProizv(Vector3d a, Vector3d b) {
        Vector3d proizv = new Vector3d();
        proizv.setX(a.getY() * b.getZ() - a.getZ() * b.getY());
        proizv.setY(a.getX() * b.getZ() - a.getZ() * b.getX());
        proizv.setZ(a.getX() * b.getY() - a.getY() * b.getX());
        return proizv;
    }
}
