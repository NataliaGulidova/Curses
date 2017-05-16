package Courses2;

/**
 * Created by Admin on 16.05.2017.
 */
import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

import java.util.Scanner;
public class Homework5 {
   public static void main(String arg[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Введите 1 число:");
       Double a = sc.nextDouble();
       System.out.println("Введите 2 число:");
       Double b = sc.nextDouble();
       System.out.println("Введите знак операции +,-,*,/");
       String op = sc.next();
       if (op.equals("+")){
           System.out.println(a + b);
       }
       if (op.equals("-")){
           System.out.println(a-b);
       }
       if (op.equals("*")){
           System.out.println(a*b);
       }
       if (op.equals("/")){
           System.out.println(a/b);
       }
   }

}
