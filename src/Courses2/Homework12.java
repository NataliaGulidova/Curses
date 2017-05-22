package Courses2;

import java.util.Scanner;

/**
 * Created by Admin on 19.05.2017.
 */
public class Homework12 {
    static int IndexStart = 3;
    static int IndexEnd=3;
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
String vvedennayaStroka;

        while (true) {
             vvedennayaStroka= sc.nextLine();
            if (vvedennayaStroka.length()<=10){
                System.out.println("В строке недостаточно символов" + ""+"введите строку заново");
            }
            else
                break;
            }
        System.out.println(vvedennayaStroka);
            String newStroka=vvedennayaStroka.substring(IndexStart,vvedennayaStroka.length()-IndexEnd-1);
        System.out.println(newStroka);
        }
    }
