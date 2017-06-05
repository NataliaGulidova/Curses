package Courses2;

/**
 * Created by Admin on 23.05.2017.
 */
//Вывести в консоль все его элементы в обратном порядке;
import  java.util.Arrays;
public class HomeWork17 {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 7, 34, 2, 12};

        for ( int i = 0, j = array.length - 1; i < j; ++i, --j ) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        for ( int i : array )
            System.out.print(i + " ");

        System.out.println();
    }
}



