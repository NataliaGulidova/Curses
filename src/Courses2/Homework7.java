package Courses2;

/**
 * Created by Admin on 17.05.2017.
 */
//Создать массив целых чисел типа byte, найти максимальное и
//минимальное значения в данном массиве, результат вывести наэкран.

import java.util.Arrays;
public class Homework7 {
    public static void main(String args[]) {
        byte x[] = {2, 3, 4, 6, 5};
        Arrays.sort(x);
        byte min, max;
        min = x[0];
        max = x[x.length - 1];

        System.out.println("отсортированный массив:"+Arrays.toString(x));
        System.out.println("min i max:" + min + "..." + max);
    }
}