package Shape;

/**
 * Created by Admin on 20.06.2017.
 */
public class Board {
    Shape[] figure = new Shape[4];
    public Board() {
        super();
    }

    public Board(Shape[] figure) {
        this.figure = figure;
    }
    public void inShape(Shape a, int i) {
        if (this.figure[i - 1] == null) {
            this.figure[i - 1] = a;
            System.out.println("Sector "+i+" full with "+ a.getClass().getName().split("[.]")[1]);
        } else {
            System.out.println("Sector is full!");
        }
    }

    public void outShape(int i) {
        if (this.figure[i - 1] == null) {
            System.out.println("Sector " + i + " is null");
        } else {
            this.figure[i-1] = null;
            System.out.println("Sector " + i + " clean!");
        }
    }

    public  void printInfo() {
        int i = 1;
        System.out.println();
        for (Shape a : figure) {
            if (a == null) {
                System.out.println("Sector "+ i +" " );
            } else {
                System.out.println("Sector "+ i+" " + a.getClass().getName().split("[.]")[1]+" "+ a.getArea());
            }
            i++;
        }
    }

    public  void printAll() {
        double totalArea = 0;
        for (Shape a : figure) {
            totalArea +=  a.getArea();
        }
        System.out.println("Total Area: "+ totalArea);
    }
}

