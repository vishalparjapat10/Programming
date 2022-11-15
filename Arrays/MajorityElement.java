import java.util.*;
public class MajorityElement {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < a.length;i++){
            a[i] = scn.nextInt();
        }
        print(a);
        int elem = find(a);
        System.out.println("Majority Element = "+elem);
    }

    private static int find(int nums[]){
        int max = nums.length/2;
        int majorityElem = nums[0];
        for(int i = 0;i < nums.length;i++){
            int count = 0;
            for(int j = 0;j < nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > max){
                majorityElem = nums[i];
            }
        }
        return majorityElem;
    }
    private static void print(int a[]){
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
