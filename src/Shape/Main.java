package Shape;

/**
 * Created by Admin on 20.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape triangl = new Triangl(new Point(0, 0), new Point(0, 4), new Point(3, 0));
        System.out.println(triangl);
        System.out.println("triangl perimetr:" + triangl.getArea());
        System.out.println("triangl area:" + triangl.getPerimetr());

        Board board = new Board();
        board.inShape(triangl, 1);
        System.out.println();

        Shape circle = new Circle(new Point(0,1), new Point(0,6));
        System.out.println(circle);
        System.out.println("circle perimetr:" + circle.getArea());
        System.out.println("circle area:" + circle.getPerimetr());
        board.inShape(circle, 2);
        System.out.println();

        Shape rectangle = new Rectangle(new Point(0,4), new Point(4,0), new Point(0,4), new Point(4,0));
        System.out.println(rectangle);
        System.out.println("rectangle perimetr:" + rectangle.getPerimetr());
        System.out.println("rectangle area:" + rectangle.getArea());
        board.inShape(rectangle, 3);

        System.out.println();
        board.printInfo();




    }
}

