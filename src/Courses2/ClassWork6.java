package Courses2;

import java.util.Arrays;

/**
 * Created by Admin on 27.05.2017.
 */
//Нужно получить новый массив который будет зеркальным отражением относительно вертикали

public class ClassWork6 {
    public static void main(String[] args) {
        int[][] array = {
                {1},
                {4, 6},
                {5, 4, 2},
                {9, 5, 4, 7},
                {0, 4, 3, 4, 3},
                {4, 2, 1, 5, 6, 7},
                {5, 7, 8, 4, 2, 2, 3}
        };

        for (int i = 0; i < array.length; i++) {
            int[] mass = array[i];
            if (mass.length == 1 || mass.length == 0){
                continue;
            }
            for (int j = 0; j <mass.length/2 ; j++) {
                int a = mass[j];
                mass[j] = mass[mass.length-j-1];
                mass [mass.length - j -1] = a;

            }
        }
    }
}
