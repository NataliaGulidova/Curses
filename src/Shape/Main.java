package Shape;

/**
 * Created by Admin on 20.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Triangl triangl = new Triangl(new Point(2,3), new Point(8,6), new Point(7,9));
        Circle carcle = new Circle(new Point(9,7), new Point(5, 3));
        Square square = new Square(new Point(4,4));
        Board board = new Board();

        board.inShape(carcle, 1);
        board.inShape(carcle, 2);
        board.inShape(triangl, 3);
        board.inShape(square, 4);

        board.printInfo();
        board.printAll();
        board.inShape(triangl, 3);
        board.printInfo();
        board.outShape(3);
        board.printAll();


    }
}
