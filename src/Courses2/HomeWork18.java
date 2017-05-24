package Courses2;

/**
 * Created by Admin on 23.05.2017.
 */
//Найти наименьшее по модулю значение
    import java.lang.reflect.Array;
    import  java.util.Arrays;
public class HomeWork18 {
    public static void main(String[] args) {
        short[] array= {4, 5, -23, -1234, 456, 7, -44, -1, 45, 23, 23, 1, 2};
        System.out.println(Arrays.toString(array));
int modyl;
int minZnah;
Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length ; i++) {
            modyl= Math.abs(array[i]);
            System.out.println(Math.abs(array[i]));

        }
    }
}
