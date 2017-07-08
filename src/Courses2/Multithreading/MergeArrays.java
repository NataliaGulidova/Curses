package Courses2.Multithreading;

/**
 * Created by Admin on 07.07.2017.
 */
public class MergeArrays {
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



