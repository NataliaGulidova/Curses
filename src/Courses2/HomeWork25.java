package Courses2;

/**
 * Created by Admin on 26.05.2017.
 */
//Написать программу которая определяет является ли введенная строка палиндромом
public class HomeWork25 {
    public static void main(String[] args) {
        String input ="civic";
        boolean isPalindrom= true;
        for(int i=0, k=input.length()-1; i<=k; i++, k--){
            if (input.charAt(i)!=input.charAt(k)){
                isPalindrom=false;
                break;
            }
        }
        System.out.println(isPalindrom ? "Palindrom": "Nepalindrom");
    }
}

