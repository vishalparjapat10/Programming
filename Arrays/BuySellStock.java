import java.util.*;;
public class BuySellStock {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < a.length;i++){
            a[i] = scn.nextInt();
        }
        print(a);
        int pro = find(a);
        System.out.println("Profit = "+pro);
    }

    private static int find(int prices[]){
        // int min = a[0];
        // int minIdx = 0;
        // for(int i = 0;i < a.length;i++){
        //     if(a[i] < min){
        //         min = a[i];
        //         minIdx = i;
        //     }
        // }

        // if(minIdx == a.length-1){
        //     return 0;
        // }

        // int pro = a[minIdx+1];
        // for(int i = minIdx+1;i < a.length;i++){
        //     if(a[i] > pro){
        //         pro = a[i];
        //     }
        // }

        // return pro - a[minIdx];

        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
    private static void print(int a[]){
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
