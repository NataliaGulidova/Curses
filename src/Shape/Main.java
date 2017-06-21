package Shape;

/**
 * Created by Admin on 20.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape triangl = new Triangl(new Point(0, 0), new Point(0, 4), new Point(3, 0));
        System.out.println(triangl);
        System.out.println(triangl.getArea());
        System.out.println(triangl.getPerimetr());

        Board board = new Board();
        board.inShape(triangl, 1);


        Shape circle = new Circle(new Point(0,1), new Point(0,6));
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimetr());
        board.inShape(circle, 2);



        Shape square = new Square(new Point(0,4), new Point(0,4), new Point(0,4), new Point(0,4));
        System.out.println(square);
        System.out.println(square.getPerimetr());
        System.out.println(square.getArea());
        board.inShape(square, 3);

        System.out.println();
        board.printInfo();




    }
}

