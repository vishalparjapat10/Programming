package Recursion;
import java.util.Scanner;
public class PowerLog {
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
        int ans = find(x,n/2) * find(x,n/2);
        if(n%2 == 1){
            ans = ans * x;
        }

        return ans;
    }
}
