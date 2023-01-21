package Conversions;
import java.util.*;

public class AnybaseSubtraction {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        int ans = anybaseSubtraction(n1,n2,b);
        System.out.println(ans);
    }

    private static int anybaseSubtraction(int n1, int n2, int b) {
        int tp = 1;
        int c = 0;
        int res = 0;
        while(n2 > 0){
            int d1 = n1%10;
            n1 = n1/10;

            int d2 = n2%10;
            n2 = n2/10;

            int d = d2 - c - d1;
            if(d < 0){
                d = d + b;
                c = 1;
            }
            else{
                c = 0;
            }
            res = res + (d * tp);
            tp = tp * 10;
        }
        return res;
    }
}
