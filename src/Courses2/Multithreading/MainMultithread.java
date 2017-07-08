package Courses2.Multithreading;

import java.util.Random;
import java.util.Arrays;

import static java.util.Arrays.sort;

/**
 * Created by Admin on 07.07.2017.
 */
public class MainMultithread {
    public static void main(String[] args) {
       int [] array = new int[200000];
        Random rn = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(10);
        }
        int[] array2 = array.clone();
        int[] array3 = array.clone();
        long tstart = System.currentTimeMillis();
        sort(array);
        long tend = System.currentTimeMillis();
        System.out.println((tend - tstart) + " ms" + "- Static method sort");
        tstart = System.currentTimeMillis();
        ThreadSorting.sort(array2, 3);
        tend = System.currentTimeMillis();
        System.out.println((tend - tstart) + " ms" + " - MultiThread sort");
        tstart = System.currentTimeMillis();
        sort(array3);
        tend = System.currentTimeMillis();
        System.out.println((tend - tstart) + " ms" + " - Array sort");
    }
}
