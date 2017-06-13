package OOP.Triangle;

/**
 * Created by Admin on 12.06.2017.
 */
public class MainTriangle {
    public static void main(String[] args) {
        Triangle Triangle1 = new Triangle();
        Triangle1.setSideA(14);
        Triangle1.setSideB(15);
        Triangle1.setSideC(18);
        Triangle1.perimetr();
        Triangle1.area();

        Triangle1.print();

        Triangle Triangle2 = new Triangle(25, 41, 46);
        Triangle2.perimetr();
        Triangle2.area();
        Triangle2.print();
    }
}
