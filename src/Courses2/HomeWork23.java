package Courses2;

import java.util.Arrays;
import java.util.Formatter;
/**
 * Created by Admin on 25.05.2017.
 */
//Получить массив double[] на основе входного к элементам которого будет применена операция корня квадратного,
// результат каждого элемента округлить до 3-го знака после запятой
public class HomeWork23 {
    public static void main(String[] args) {
        int[] array = {4, 5, 456, 24, 23, 231, 231, 2314 ,123, 44, 21, 4};
        double [] result= new double[array.length];
        for (int i = 0; i < array.length ; i++)
        {
            result[i] = Math.sqrt(array[i]);

        }
        for (int i = 0; i <result.length; i++)
        {
            result [i]= Math.rint(1000.0 * result [i]) / 1000.0;

        }
        System.out.println(Arrays.toString (result));

    }
}
