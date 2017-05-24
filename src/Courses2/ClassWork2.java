package Courses2;

/**
 * Created by Admin on 20.05.2017.
 */
public class ClassWork2{
    public static void main(String[] args) {
        String input ="1234321";
        boolean isPalindrom= true;
        for(int i=0, k=input.length()-1; i<=k; i++, k--){
            if (input.charAt(i)!=input.charAt(k)){
                isPalindrom=false;
                break;
            }

        }
        System.out.println(isPalindrom ? "Palindrom":"Nepalindrom");
    }
}
