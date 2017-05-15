/**
 * Created by Admin on 13.05.2017.
 */
public class Homework4 {
public static void main(String args[]){
    double var1, var2, var3;
    double S;
    double P;
    var1=10;
    var2=14;
    var3=15;
    P=(var1+var2+var3)/2;
    S=Math.sqrt(P*(P-var1)*(P-var2)*(P-var3));
    System.out.println("Периметр="+P);
    System.out.println("Площадь="+S);
}
}
