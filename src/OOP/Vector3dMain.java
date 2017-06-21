package OOP;

/**
 * Created by Admin on 13.06.2017.
 */
public class Vector3dMain {
    public static void main(String[] args) {
        Vector3d first = new Vector3d();
        first.setX(12);
        first.setY(15);
        first.setZ(21);

        Vector3d second =new Vector3d(3.1, 8, 11.5);


        Vector3d sum =Vector3d.vectSum(first, second);
        double scal=Vector3d.scalar(first, second);
        Vector3d proizv = Vector3d.vectProizv(first, second);

        System.out.println("Koordinaty vectorov: ");
        System.out.println("Sum: " + sum);
        System.out.println("Scalar:" + scal);
        System.out.println("Proizv:" + proizv);
    }
}
