package Courses2;

/**
 * Created by Admin on 18.05.2017.
 */
//Создать массив из 10 строк, и инициализировать его.“Склеить” (конкатенировать) все строки массива в одну, начало
        //новой строки должно начинаться с последнего элемента массива
       // (т.е. в обратном порядке). Из получившейся новой строки удать 3
       // символа с начала строки и 5 символов с конца строки. Далее
       // удалить все пробелы в начале и в конце строки, если таковые
       // будут. Проверить начинается ли новая строка с символа ’s’ и
      //  заканчивается ли символом ‘m’. Сдеать все символы строки
      //  загравными.
import java.util.Arrays;
public class Homework9 {
    public static void main(String args[]){
        String mas[]={"hello","cat","dog","bird","pig","cow","elephant","spider","piton","crocodile"};
       String mas2= mas[9]+mas[8]+mas[7]+mas[6]+mas[5]+mas[4]+mas[3]+mas[2]+mas[1]+mas[0];
       String mas3=mas2.substring(4,mas2.length()-5);
       System.out.println(mas2);
        System.out.println(mas3);
      String mas4=mas3.toUpperCase();
        System.out.println(mas4);

    }

}
