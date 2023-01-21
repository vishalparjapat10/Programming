package Conversions;
import java.util.*;

public class AnybaseMultiplication {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        int ans = anybaseMultiplication(n1,n2,b);
        System.out.println(ans);
    }

    private static int anybaseMultiplication(int n1, int n2, int b) {
        int tp = 1;
        int ans = 0;
        while(n2 > 0){
            int d2 = n2%10;
            n2 = n2/10;
            int psd = getProuctOfSingleDigit(b,n1,d2);
            ans = getSum(b,ans,psd*tp);
            tp = tp * 10;
        }

        return ans;
    }

    private static int getSum(int b, int m1, int m2) {
        int sum = 0;
		int c = 0;
		int p = 1;
		while(m1 > 0 || m2 > 0 || c > 0) {
			int d1 = m1%10;
			int d2 = m2%10;
			
			int d = d1 + d2 + c;
			c = d/b;
			d = d%b;
			
			sum = sum + d*p;
			p = p*10;
			m1 = m1/10;
			m2 = m2/10;
		}
		return sum;
    }

    private static int getProuctOfSingleDigit(int b, int n1, int d2) {
		int c = 0;
		int pr = 0;
		int p = 1;
		while(n1 > 0 || c > 0) {
			int d1 = n1%10;
			n1 = n1/10;
			
			int d = d2 * d1 + c;
			c = d/b;
			d = d%b;
			
			pr = pr + d * p;
			p = p * 10;
		}
		
		return pr;
	}
}
