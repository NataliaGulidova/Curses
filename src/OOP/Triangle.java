package OOP;

/**
 * Created by Admin on 12.06.2017.
 */
//Описать класс «Triangle». В качестве свойств возьмите длины сторон
// треугольника. Реализуйте метод, который будет возвращать площадь этого
// треугольника. Создайте несколько объектов этого класса и протестируйте их.
public class Triangle {
   private double sideA;
   private double sideB;
   private double sideC;
   private double perimeter;
   private double area;
    public Triangle(){

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    public Triangle(double sideA, double sideB, double sideC, double perimeter, double area) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.perimeter = perimeter;
        this.area = area;
    }
    public void  perimetr(){
        perimeter =(sideA+sideB+sideC)/2;
        System.out.println("Perimetr: " + perimeter);

    }

    public void area(){
        area = Math.sqrt(perimeter*(perimeter-sideA)*(perimeter-sideB)*(perimeter-sideC));
        System.out.println("Area:" + area);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }


    public void  print(){
    System.out.println("SideA:" + sideA);
    System.out.println("SideB:" + sideB);
    System.out.println("SideC:" + sideC);

}
}
