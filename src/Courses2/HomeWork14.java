package Courses2;

/**
 * Created by Admin on 22.05.2017.
 */
//Задана строка, каждый символ в строке преобразовать в ASCII код (десятиричный), и получить суму все этих кодов.
public class HomeWork14 {
    public static void main(String[] args) {
        String name = "My name is Natalia";
        int nameLenght = name.length();
        int ascii;
        char character;
        for (int i = 0; i < nameLenght; i++) {
            character = name.charAt(i);
            ascii = (int) character;
            System.out.println(character + " = " + ascii);
        }
        int allnums =0;
        for (int i = 0; i < nameLenght; i++) {
           allnums += name.charAt(i);

            }
        System.out.println(allnums);
        }
    }

