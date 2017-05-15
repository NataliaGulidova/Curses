package Courses2;

import java.util.Scanner;

/**
 * Created by Admin on 15.05.2017.
 */
import java.util.Scanner;
public class LessonScanner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");
        String a = sc.nextLine();
        System.out.println("Введите фамилию:");
        String b = sc.nextLine();
        System.out.println("Введите дату рождения:");
        Double c = sc.nextDouble();
        System.out.println("hello " + a + b);
    }
}
