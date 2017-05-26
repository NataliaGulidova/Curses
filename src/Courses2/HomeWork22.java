package Courses2;

/**
 * Created by Admin on 24.05.2017.
 */
//Результатом должен быть массив который будет содержать все элементы приведенных выше двух массивов,
// фактически массивы нужно объеденить ("склеить")
import java.util.Arrays;
public class HomeWork22 {
    public  static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 16 };
        int[] b = { 6, 7, 8, 9, 10, 11, 12 };

        int[] rezult = merge(a, b);
        System.out.println(Arrays.toString(rezult));
    }
}

