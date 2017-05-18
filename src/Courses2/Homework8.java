package Courses2;

/**
 * Created by Admin on 18.05.2017.
 */
//Создать массив размерностью10 элементов (тип данныхэлементов на выбор), инициализировать все элементы.
// Вывести на консоль:
// • значения первого и последнего элемента
// • среднее арифметическое первого и последнего элемента
// • сумму всех элементов
import java.util.Arrays;
public class Homework8 {
    public static void main(String args[]){
        int nums[]={12,547,558,66,512,47,569,45,78,86};
        Arrays.sort(nums);
       int  nums1=nums[nums.length-1];
        System.out.println("Первый и последний элемент массива: "+nums[0]+"..."+nums1);
        int nums2=(nums[0]+nums1)/2;
        int allnums;
        allnums=0;
        for (int i=0; i<nums.length; i++ ){
            allnums +=nums[i];
        }

        System.out.println("Среднее арифметическое первого и последнего элемента массива:"+nums2);
        System.out.println("Сума всех элементов массива:"+ allnums);
    }
}
