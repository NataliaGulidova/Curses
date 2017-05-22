package Courses2;

/**
 * Created by Admin on 20.05.2017.
 */
public class Classwork3 {
    public static void main(String[] args) {
       int size=3;
        int[][] matrix={{3,5,6},{7,8,9},{7,4,6}};
       int indexLR=1;
       int indexRL=size-1;
       int resultLR= matrix[0][0];
       int resuktRL=matrix[0][size-1];
        for (int i = 1; i < matrix.length; i++, indexLR++, indexRL--) {
            resultLR*= matrix[i][indexLR];
            resuktRL*=matrix[indexLR][size-i-1];
        }
        System.out.println(resuktRL);
        System.out.println(resultLR);
        }

    }

