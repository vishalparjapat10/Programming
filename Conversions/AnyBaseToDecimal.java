package Conversions;
import java.util.*;
public class AnyBaseToDecimal {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        long ans = convert(n,b);
        System.out.println(ans);
    }

    private static long convert(int n, int b) {
        long ans = 0;
        int p = 0;
        while(n > 0){
            int d = n%10;
            ans = ans + ((long)(Math.pow(b, p)) * d);
            p++;
            n = n/10;
        }
        return ans;
    }
}
