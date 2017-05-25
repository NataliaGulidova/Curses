package Courses2;

/**
 * Created by Admin on 25.05.2017.
 */
//Вычислить сумму всех парных значений массива.
import java.util.Arrays;
import  java.util.Random;
public class HomeWork24 {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 76, 3, 4, 6, 6, 3, 4, 2, 43, 234, 342, 2, 3, 45, 23, 46};
        int sum = 0;
        int n = 0;

        System.out.println("четные элементы:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                ++n;
                sum += array[i];
                System.out.print(" " + array[i]);
            }
        }
        System.out.println();
        System.out.println("Всего четных элементов " + n);
        System.out.println("Их сумма равна " + sum);
    }
}


