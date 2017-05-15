/**
 * Created by Admin on 13.05.2017.
 */
import java.util.Scanner;
public class Homework2 {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Введите значение радиуса r=");
       double p;
       double r;
       r=sc.nextDouble();
       p=2*3.1415*r;
       System.out.println("Длинна окружности равна="+ p);
    }
}
