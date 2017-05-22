package Courses2;

/**
 * Created by Admin on 20.05.2017.
 */
public class ClassWork {
    public static void main(String args[]){
        int[] array1={1,3,4,5,6,7};
        int [] array2={7,8,9,6,5,2};
        int[] resultMultiP=new int [6];
        for (int i = 0; i <array1.length; i++) {
            resultMultiP [i]= array1[i]*array2[i];
        }
        int summ=0;
        for (int Value : resultMultiP) {
            summ+=Value;

        }
        System.out.println(Math.sqrt(summ));
    }
}
