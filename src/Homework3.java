/**
 * Created by Admin on 13.05.2017.
 */

import java.util.Scanner;
public class Homework3 {
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пятизначное число:");

        int a=sc.nextInt();
        int b=a/10000;
        int c= a% 10000/1000;
        int d=a% 1000/100;
        int e=a% 100/10;
        int f=a% 10;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);


    }
}
