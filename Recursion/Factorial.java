package Recursion;
import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }

    private static int factorial(int n) {
        if(n == 0){
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;
    }
}
