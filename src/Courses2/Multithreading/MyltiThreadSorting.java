package Courses2.Multithreading;

/**
 * Created by Admin on 07.07.2017.
 */
import java.util.Arrays;

public class MyltiThreadSorting {
    static void sorting(int array[], int threadNumber) {
        ThreadSorting[] ts = new ThreadSorting[threadNumber];
        for (int i = 0; i < ts.length; i++) {
            int size = array.length / threadNumber;
            int begin = size * i;
            int end = ((i + 1) * size);
            if ((ts.length - end) < size) {
                end = ts.length;
            }
            ts[i] = new ThreadSorting(array, begin, end);
        }
        for (int i = 0; i < ts.length; i++) {
            try {
                ts[i].getThr().join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.arraycopy((mergeArrays(array, ts)), 0, array, 0, array.length);
    }
    static int[] mergeArrays (int [] array, ThreadSorting [] ts){
        int [] arr = new int [array.length];
        for (int i = 0; i < arr.length ; i++) {
            int min = Integer.MAX_VALUE;
            int k = -1;
            for (int j = 0; j < ts.length ; j++) {
                if (!ts[j].isStop() && min > ts[j].peekElement()) {
                    min = ts[j].peekElement();
                    k = j;
                }
            }
            if (k != -1) {
                arr[i] = ts[k].poolElement();
            }
        }

        return arr;

    }
}


