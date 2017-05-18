package Courses2;

/**
 * Created by Admin on 18.05.2017.
 *///Создать массив из char символов разменостью 16.
        //Отсортировать данный массив. Далее создать из массива
       // строку, из получившейся строки удалить половину. Все символы
      //  новой строки сделать заглавными, вывести на консоль хеш-код
      //  строки. Заменить все символы строки ‘n’ на ‘r’.
    import java.util.Arrays;
public class Homework10 {
    public static void main(String args[]){
        char[] mas={'a','s','p','f','g','h','c','t','u','i','o','c','c','b','n','q'};
        Arrays.sort(mas);
        String mas1= new String(mas);
String mas2= mas1.substring(8);
String mas3=mas2.toUpperCase();
String mas4=mas2.replace('n','r');
        System.out.println(mas1);
System.out.println(mas3);
System.out.println(mas3.hashCode());
        System.out.println(mas4);


    }
}
