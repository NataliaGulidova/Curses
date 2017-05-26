package Courses2;

import java.util.Scanner;

/**
 * Created by Admin on 22.05.2017.
 */
//Вычислить площадь круга. Данные дожны вводиться из консоли, пользователю должно предлагаться два варианта на выбор.
// Либо ввод радиуса круга либо диаметра.
//
public class HomeWork15 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Введите значения радиуса =0 или диаметра=1:");
        int number= sc.nextInt();
        if (number == 0){
            System.out.println("Введите значение радиуса:");
            double r=sc.nextDouble();
            double s =Math.PI*Math.sqrt(r);
            System.out.println("Площадь круга:" + s);
        }
        if (number ==1){
            System.out.println("Введите значение диаметра:");
            double d= sc.nextDouble();
            double s1=(Math.PI/4)*Math.sqrt(d);
            System.out.println("Площадь круга:" + s1);
        }
    }
}
