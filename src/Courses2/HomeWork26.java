package Courses2;

/**
 * Created by Admin on 26.05.2017.
 */
//Найти сколько раз символ 'a' встречается в данной строке.
public class HomeWork26 {
    public static void main(String[] args) {
        String str = "The Java programming language is strongly and statically typed";
        char[] symb = str.toCharArray();
        int count = 0;
        for(int i = 0; i < symb.length; ++i)
            if(symb[i] == 'a')
                ++count;
        System.out.println(count);
    }
}
