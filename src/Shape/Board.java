package Shape;

/**
 * Created by Admin on 20.06.2017.
 */
public class Board {
    Shape[] figure = new Shape[4];

    public Board() {
        super();
    }


    public void inShape(Shape a, int i) {
        if (this.figure[i - 1] == null) {
            this.figure[i - 1] = a;
            System.out.println("Sector " + i + " full with " + a.getClass().getName().split("[.]")[1]);
        } else {
            System.out.println("Sector is full!");
        }
    }

    public void outShape(int i) {
        if (this.figure[i - 1] == null) {
            System.out.println("Sector " + i + " is null");
        } else {
            this.figure[i - 1] = null;
            System.out.println("Sector " + i + " clean!");
        }
    }

        public void printInfo() {
            double p = 0;
            for (int i = 0; i < figure.length; i++){
                if(figure[i]!=null){
                    p += figure[i].getArea();
                    System.out.println("Sector № " + (i+1) + " is figure " + figure[i]);
                }
                else System.out.println("Part of the board № " + (i+1) + " Empty ");
            }
            System.out.println();
            System.out.println("SumArea " + p);
        }
}
