package Conversions;
import java.util.*;
public class AnybaseToAnybase {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        long ans = convert(n,b1,b2);
        System.out.println(ans);
    }

    private static long convert(int n, int b1,int b2) {
        long decimal = AnyBaseToDecimal(n,b1);
        long ans = DecimalToAnyBase(decimal,b2);
        return ans;
    }

    private static long DecimalToAnyBase(long n, int b) {
        long ans = 0;
        int p = 0;
        n = (int)n;
        while(n > 0){
            int d = (int) (n%b);
            ans = ans + ((long)(Math.pow(10, p)) * d);
            p++;
            n =n/b;
        }

        return ans;
    }

    private static long AnyBaseToDecimal(int n, int b) {
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
