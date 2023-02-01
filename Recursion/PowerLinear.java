package Recursion;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = find(x,n);
        System.out.println(ans);
    }

    private static int find(int x, int n) {
        if(n == 0){
            return 1;
        }
        int ans = x * find(x,n-1);
        return ans;
    }
}
