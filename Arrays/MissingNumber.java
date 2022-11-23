import java.util.*;
public class MissingNumber {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < a.length;i++){
            a[i] = scn.nextInt();
        }
        print(a);
        int ans = find(a);
        System.out.println(ans);
    }

    private static int find(int[] nums){
        Arrays.sort(nums);
        int idx = 0;
        if(nums[nums.length-1] != nums.length){
            return nums.length;
        }
        for(int i = 1;i < nums.length;i++){
            if(nums[i] - nums[i-1] > 1){
                idx = i;
                break;
            }
        }

        return idx;

    }
    private static void print(int a[]){
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
