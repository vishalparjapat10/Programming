package Strings;
import java.util.*;
public class PrintAllPallindromes {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printAllPallindromes(str);
    }

    private static void printAllPallindromes(String str) {
        for(int i = 0;i < str.length();i++){
            int k = i + 1;
            while(k < str.length()+1){
                boolean isPallindrome = IsPallindrome(str.substring(i, k));
                if(isPallindrome){
                    System.out.println(str.substring(i, k));
                }
                k++;
            }
        }
    }

    private static boolean IsPallindrome(String str) {
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    
}
